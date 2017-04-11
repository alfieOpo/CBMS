package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.StrictMode;
import android.provider.Settings;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Upload extends AppCompatActivity {
    MainDataBaseHandler db;
    View view;
    TextView lbl_internetmessage;
    private ProgressDialog pd;

    public static boolean hasActiveInternetConnection(Context contex, TextView txt) {
        if (isNetworkAvailable(contex)) {
            try {
                HttpURLConnection urlc = (HttpURLConnection) (new URL("http://google.com/generate_204").openConnection());
                urlc.setRequestProperty("User-Agent", "Test");
                urlc.setRequestProperty("Connection", "close");
                urlc.setConnectTimeout(1500);
                urlc.connect();
                txt.setVisibility(View.INVISIBLE);
                return (urlc.getResponseCode() == 204 && urlc.getContentLength() == 0);
            } catch (IOException e) {
                txt.setVisibility(View.VISIBLE);
                Log.e("INTERNET ERROR ", "Error checking internet connection", e);
                txt.setText("Error checking internet connection");
                Toast.makeText(contex, e.getMessage(), Toast.LENGTH_LONG).show();
            }
        } else {
            txt.setVisibility(View.VISIBLE);
            txt.setText("No network available!");
            Log.d("INTERNET ERROR ", "No network available!");
        }
        return false;
    }

    private static boolean isNetworkAvailable(Context contex) {
        ConnectivityManager connectivityManager = (ConnectivityManager) contex.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload);

        final Button btn_upload = (Button) view.findViewById(R.id.btn_upload);
        lbl_internetmessage = (TextView) view.findViewById(R.id.lbl_internetmessage);

        //  if(hasActiveInternetConnection(getActivity().getApplicationContext(), lbl_internetmessage)){
        Reset();
        btn_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_upload.setVisibility(View.INVISIBLE);
                // Establish the connection.
                final Thread t = new Thread() {
                    @Override
                    public void run() {
                        Uploading();
                        Connection con = null;

                        try {
                            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                            StrictMode.setThreadPolicy(policy);
                            // Create a variable for the connection string.
                            String connectionUrl = "jdbc:jtds:sqlserver://192.168.1.170:1433;DatabaseName=stamariamcbms";
                            // Declare the JDBC objects.
                            ProgressBar pm = (ProgressBar) view.findViewById(R.id.pb_main);

                            pm.setMax(12);
                            pm.setProgress(0);

                            db = new MainDataBaseHandler(Upload.this);
                            Class.forName("net.sourceforge.jtds.jdbc.Driver");
                            con = DriverManager.getConnection(connectionUrl, "sa", "abc123!@#");
                            pm.setProgress(1);
                            setMainText("1");
                            sleep(400);
                            insertIt(db, con, "INSERT_RAW_MASTER", "mcbms");
                            pm.setProgress(1);
                            setMainText("2");
                            sleep(400);
                            insertIt(db, con, "INSERT_RAW_GA_1ST", "ga_1st");
                            pm.setProgress(2);
                            setMainText("3");
                            sleep(400);
                            insertIt(db, con, "INSERT_RAW_GA_2ND", "ga_2nd");
                            pm.setProgress(3);
                            setMainText("4");
                            sleep(400);
                            insertIt(db, con, "INSERT_RAW_GA_3RD", "ga_3rd");
                            pm.setProgress(4);
                            setMainText("5");
                            sleep(400);
                            insertIt(db, con, "INSERT_RAW_GA_4TH", "ga_4th");
                            pm.setProgress(5);
                            setMainText("6");
                            sleep(400);
                            insertIt(db, con, "INSERT_RAW_GA_5TH", "ga_5th");
                            pm.setProgress(6);
                            setMainText("7");
                            sleep(400);
                            insertIt(db, con, "INSERT_RAW_GA_6TH", "ga_6th");
                            pm.setProgress(7);
                            setMainText("8");
                            sleep(400);
                            insertIt(db, con, "INSERT_RAW_GA_8TH", "ga_8th");
                            pm.setProgress(8);
                            setMainText("9");
                            sleep(400);
                            insertIt(db, con, "INSERT_RAW_GA_9TH", "ga_9th");
                            pm.setProgress(9);
                            setMainText("10");
                            sleep(400);
                            insertIt(db, con, "INSERT_RAW_GA_10TH", "ga_10th");
                            pm.setProgress(10);
                            setMainText("11");
                            sleep(400);
                            insertIt(db, con, "INSERT_RAW_GO_1ST", "go_1st");
                            insertImage(db, con, "INSERT_RAW_images", "images");
                            pm.setProgress(12);
                            setMainText("12");
                            sleep(400);
                            //
                        } catch (Exception ie) {
                            ie.printStackTrace();
                        } finally {

                            if (con != null) try {
                                con.close();
                            } catch (Exception e) {
                            }
                        }
                        AlertDialog.Builder builder2 = new AlertDialog.Builder(Upload.this);
                        builder2.setIcon(R.drawable.edit_file);
                        builder2.setMessage("Do you want to delete all uploaded data.?");
                        builder2.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                db.DeleteAll();
                            }
                        });
                        builder2.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {

                            }
                        });
                        AlertDialog dialog2 = builder2.create();
                        dialog2.show();
                        Reset();

                    }
                };
                t.start();

                btn_upload.setVisibility(View.VISIBLE);


            }
        });  // }
    }

    private void setMainText(final String pos) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                TextView tvm = (TextView) view.findViewById(R.id.tv_main);
                tvm.setText(pos + " of 12");
            }
        });
    }

    private void setDetailsText(final String cnt, final String pos) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                TextView tvd = (TextView) view.findViewById(R.id.tv_details);
                tvd.setText(pos + " of " + cnt);
            }
        });
    }

    private void Uploading() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Button btn_upload = (Button) view.findViewById(R.id.btn_upload);
                TextView tvm = (TextView) view.findViewById(R.id.tv_main);
                TextView tvd = (TextView) view.findViewById(R.id.tv_details);
                ProgressBar pm = (ProgressBar) view.findViewById(R.id.pb_main);
                ProgressBar pd = (ProgressBar) view.findViewById(R.id.pb_details);

                btn_upload.setVisibility(View.INVISIBLE);
                tvm.setVisibility(View.VISIBLE);
                tvd.setVisibility(View.VISIBLE);
                pm.setVisibility(View.VISIBLE);
                pd.setVisibility(View.VISIBLE);

            }
        });
    }

    private void Reset() {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Button btn_upload = (Button) view.findViewById(R.id.btn_upload);
                TextView tvm = (TextView) view.findViewById(R.id.tv_main);
                TextView tvd = (TextView) view.findViewById(R.id.tv_details);
                ProgressBar pm = (ProgressBar) view.findViewById(R.id.pb_main);
                ProgressBar pd = (ProgressBar) view.findViewById(R.id.pb_details);

                btn_upload.setVisibility(View.VISIBLE);
                tvm.setVisibility(View.INVISIBLE);
                tvd.setVisibility(View.INVISIBLE);
                pm.setVisibility(View.INVISIBLE);
                pd.setVisibility(View.INVISIBLE);

            }
        });
    }

    private void insertIt(MainDataBaseHandler db, Connection con, String sp_name, String table) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Cursor cnt = db.getCount(table);
            cnt.moveToFirst();
            final int c = cnt.getInt(0);

            ProgressBar pd = (ProgressBar) view.findViewById(R.id.pb_details);

            pd.setMax(c);
            pd.setProgress(0);
            setDetailsText(String.valueOf(c), "0");

            String sql = "exec " + sp_name + " ?";
            Cursor cs = db.getList(table);
            cs.moveToFirst();

            int colcount = cs.getColumnCount() - 1;

            for (int i = 0; i < colcount; i++) {
                sql += ",?";
            }

            int position = 0;
            if (cs.moveToFirst()) {
                while (cs.isAfterLast() == false) {
                    pd.setProgress(pd.getProgress() + 1);
                    setDetailsText(String.valueOf(c), String.valueOf(pd.getProgress()));
                    stmt = con.prepareStatement(sql);
                    for (int i = 0; i < cs.getColumnCount(); i++) {
                        stmt.setString(i + 1, cs.getString(i));
                    }
                    stmt.executeUpdate();
                    cs.moveToNext();
                }
            }

            //ResultSet rss = stmt.executeQuery();

        } catch (Exception ex) {

        }

    }

    private void insertImage(MainDataBaseHandler db, Connection con, String sp_name, String table) {

        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {

            Cursor cnt = db.getCount(table);
            cnt.moveToFirst();
            final int c = cnt.getInt(0);

            ProgressBar pd = (ProgressBar) view.findViewById(R.id.pb_details);

            pd.setMax(c);
            pd.setProgress(0);
            setDetailsText(String.valueOf(c), "0");

            String sql = "exec " + sp_name + " ?";

            Cursor cs = db.getList(table);
            cs.moveToFirst();

            int colcount = cs.getColumnCount() - 1;
            for (int i = 0; i < colcount; i++) {
                sql += ",?";
            }


            if (cs.moveToFirst()) {
                while (cs.isAfterLast() == false) {

                    pd.setProgress(pd.getProgress() + 1);
                    setDetailsText(String.valueOf(c), String.valueOf(pd.getProgress()));

                    stmt = con.prepareStatement(sql);

                    String AndroidID = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
                    for (int i = 0; i < cs.getColumnCount(); i++) {

                        if (i == 1 || i == 2) {
                            byte[] b = cs.getBlob(i); // db.ByteImage(AndroidID, cs.getString(cs.getColumnIndexOrThrow("person_image")), "person_image");
                            String value = Base64.encodeToString(b, Base64.NO_WRAP);
                            stmt.setString(i + 1, value);
                        } else {
                            stmt.setString(i + 1, cs.getString(i));
                        }
                    }
                    stmt.executeUpdate();
                    cs.moveToNext();
                }
            }
        } catch (Exception ex) {
            String a = ex.getMessage();
            Log.i("ALFIE", ex.getMessage());
        }
    }
}
