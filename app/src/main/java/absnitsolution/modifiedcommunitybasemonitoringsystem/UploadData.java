package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.StrictMode;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.text.format.DateFormat;
import android.util.Base64;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class UploadData extends Fragment {
    Thread thread;
    MainDataBaseHandler db;
    View view;
    Button btn_delete,btn_view_uploaded_files;
    TextView lbl_internetmessage;
    private ProgressDialog pd;
    String AndroidID="";
    InetAddress in;
    LinearLayout layout;
    String []_MID;
    ListView list_uploaded_files;
    String connectionUrl = "jdbc:jtds:sqlserver://120.29.121.34:1433;DatabaseName=stamariamcbms";
    // String connectionUrl = "jdbc:jtds:sqlserver://192.168.2.205:1433;DatabaseName=stamariamcbms";
    public UploadData() {
        // Required empty public constructor
    }


    private static boolean isNetworkAvailable(Context contex) {
        ConnectivityManager connectivityManager = (ConnectivityManager) contex.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        return activeNetworkInfo != null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_upload_data, container, false);
        final Button btn_upload = (Button) view.findViewById(R.id.btn_upload);
        lbl_internetmessage = (TextView) view.findViewById(R.id.lbl_internetmessage);
        btn_delete = (Button) view.findViewById(R.id.btn_delete);
        btn_view_uploaded_files= (Button) view.findViewById(R.id.btn_view_uploaded_files);
        layout=(LinearLayout)view.findViewById(R.id.layout);
        layout.setVisibility(View.INVISIBLE);
        //  if(hasActiveInternetConnection(getActivity().getApplicationContext(), lbl_internetmessage)){
        list_uploaded_files  =(ListView)view.findViewById(R.id.list_uploaded_files);
        btn_view_uploaded_files.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    list_uploaded_files.getAdapter().getCount();
                    btn_view_uploaded_files.setEnabled(false);
                    layout.setVisibility(View.VISIBLE);
                    thread.start();
                }catch (Exception xx)
                {
                    btn_view_uploaded_files.setEnabled(false);
                    layout.setVisibility(View.VISIBLE);
                    thread.start();
                }

            }
        });
        AndroidID= Settings.Secure.getString(getActivity().getContentResolver(), Settings.Secure.ANDROID_ID);
        thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Connection con = null;
                    Class.forName("net.sourceforge.jtds.jdbc.Driver");
                    con = DriverManager.getConnection(connectionUrl, "mcbms_android_user", "^93fxa>pCg7#yVFW");
                    //  con = DriverManager.getConnection(connectionUrl, "sa", "abc123!@#");
                    Calendar c = Calendar.getInstance();
                    System.out.println("Current time => " + c.getTime());

                    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                    String formattedDate = df.format(c.getTime());
                    Statement statement = con.createStatement();
                    String sql="SELECT _id,D_001,D_009,D_011 FROM RAW_MASTER WHERE AndroidID='"+AndroidID+"' and  CAST(D_009 as date)  = cast('"+formattedDate+"' as date)";
                    String sql1="SELECT _id,D_001,D_009,D_011 FROM RAW_MASTER WHERE AndroidID='"+AndroidID+"' and  CAST(D_009 as date)  = cast('"+formattedDate+"' as date)";
                    String sql2="SELECT _id,D_001,D_009,D_011 FROM RAW_MASTER WHERE AndroidID='"+AndroidID+"' and  CAST(D_009 as date)  = cast('"+formattedDate+"' as date)";
                    String sql3="SELECT _id,D_001,D_009,D_011 FROM RAW_MASTER WHERE AndroidID='"+AndroidID+"' and  CAST(D_009 as date)  = cast('"+formattedDate+"' as date)";
                    String sql4="SELECT _id,D_001,D_009,D_011 FROM RAW_MASTER WHERE AndroidID='"+AndroidID+"' and  CAST(D_009 as date)  = cast('"+formattedDate+"' as date)";
                    String sql5="SELECT _id,D_001,D_009,D_011 FROM RAW_MASTER WHERE AndroidID='"+AndroidID+"' and  CAST(D_009 as date)  = cast('"+formattedDate+"' as date)";


                    ResultSet rs = statement.executeQuery(sql);
                    List<String>Names=new ArrayList<String>();
                    List<String>ID=new ArrayList<String>();
                    List<String>timestart=new ArrayList<String>();
                    List<String>timeend=new ArrayList<String>();
                    while (rs.next()){
                        Names.add(rs.getString("D_001"));
                        timeend.add(rs.getString("D_009"));
                        timestart.add(rs.getString("D_011"));
                        ID.add(rs.getString("_id"));
                    }
                    String []Name=new String[Names.size()];
                    String []M_ID=new String[ID.size()];
                    String []oras_natapos=new String[timeend.size()];
                    String []oras_nagsimula=new String[timestart.size()];
                    for(int i=0;i<Names.size();i++){

                        Name[i]=Names.get(i);
                        M_ID[i]=ID.get(i);
                        oras_natapos[i]=timeend.get(i);
                        oras_nagsimula[i]=timestart.get(i);
                    }
                    _MID=M_ID;



                    SetList(Name,M_ID,oras_nagsimula,oras_natapos);



                    statement.close();

                    Thread.sleep(1000);
                } catch (Exception e) {
                    System.out.println("Statement error: " + e.getMessage());
                }

            }
        });
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                builder2.setIcon(R.drawable.edit_file);
                builder2.setMessage("Do you want to delete all uploaded data.?");
                builder2.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        try{
                            for(String _id:_MID){
                                db.DeleteAllUploadedfiles(_id);
                                Toast.makeText(getActivity(), "Successfully Deleted All Uploaded Files.", Toast.LENGTH_SHORT).show();
                                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame, new switcher()).commit();
                            }}catch (Exception xx){
                            Toast.makeText(getActivity(), "No data found to delete.", Toast.LENGTH_SHORT).show();
                        }



                    }
                });
                builder2.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                    }
                });
                AlertDialog dialog2 = builder2.create();
                dialog2.show();
            }
        });




        Reset();
        btn_upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                btn_upload.setVisibility(View.INVISIBLE);
                thread.interrupt();
                layout.setVisibility(View.INVISIBLE);
                btn_view_uploaded_files.setVisibility(View.INVISIBLE);
                final Thread t = new Thread() {
                    @Override
                    public void run() {
                        Uploading();
                        Connection con = null;

                        try {
                            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                            StrictMode.setThreadPolicy(policy);
                            // Create a variable for the connection string.

                            // Declare the JDBC objects.
                            ProgressBar pm = (ProgressBar) view.findViewById(R.id.pb_main);

                            pm.setMax(12);
                            pm.setProgress(0);

                            db = new MainDataBaseHandler(getActivity());
                            Class.forName("net.sourceforge.jtds.jdbc.Driver");
                            //   con = DriverManager.getConnection(connectionUrl, "sa", "abc123!@#");
                            con = DriverManager.getConnection(connectionUrl, "mcbms_android_user", "^93fxa>pCg7#yVFW");
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
                            insertIt(db, con, "INSERT_Enumerators", "users");
                            //
                        } catch (Exception ie) {
                            ie.printStackTrace();
                            String error =ie.getMessage();
                            String error4 =ie.getMessage();
                            String error2 =ie.getMessage();
                        } finally {

                            if (con != null) try {
                                con.close();
                                thread.start();
                                layout.setVisibility(View.VISIBLE);
                                btn_view_uploaded_files.setVisibility(View.VISIBLE);
                            } catch (Exception e) {
                                String error =e.getMessage();
                                String error4 =e.getMessage();
                                String error2 =e.getMessage();
                                String error3 =e.getMessage();
                            }
                        }
                        Reset();


                    }
                };
                t.start();

                btn_upload.setVisibility(View.VISIBLE);


            }
        });  // }
        return view;
    }

    private void setMainText(final String pos) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                TextView tvm = (TextView) view.findViewById(R.id.tv_main);
                tvm.setText(pos + " of 12");
            }
        });
    }
    private void SetList(final String []Name,
                         final     String []M_ID,
                         final String []oras_natapos,
                         final String []oras_nagsimula) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Calendar c = Calendar.getInstance();
                System.out.println("Current time => " + c.getTime());

                SimpleDateFormat df = new SimpleDateFormat("EEE, d MMM yyyy");
                String formattedDate = df.format(c.getTime());
                TextView textView86=(TextView)view.findViewById(R.id.textView86);
                textView86.setText("--"+formattedDate+"--");
                Toast.makeText(getActivity(), M_ID.length+" uploaded file/s found", Toast.LENGTH_SHORT).show();
                ArrayAdapter adapter=new UploadedfilesAdapter(getActivity(),Name,M_ID,oras_natapos,oras_nagsimula);
                list_uploaded_files.setAdapter(adapter);   }
        });
    }

    private void setDetailsText(final String cnt, final String pos) {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                TextView tvd = (TextView) view.findViewById(R.id.tv_details);
                tvd.setText(pos + " of " + cnt);
            }
        });
    }

    private void Uploading() {
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Button btn_upload = (Button) view.findViewById(R.id.btn_upload);
                Button btn_view_uploaded_files = (Button) view.findViewById(R.id.btn_view_uploaded_files);
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
        getActivity().runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Button btn_upload = (Button) view.findViewById(R.id.btn_upload);
                Button btn_view_uploaded_files = (Button) view.findViewById(R.id.btn_view_uploaded_files);
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
            String error =ex.getMessage();
            String error4 =ex.getMessage();
            String error2 =ex.getMessage();
            Log.i("ALFIE",ex.getMessage());
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
            String error =ex.getMessage();
            String error4 =ex.getMessage();
            String error2 =ex.getMessage();
            String a = ex.getMessage();
            Log.i("ALFIE", ex.getMessage());
        }
    }
    static public boolean isURLReachable(Context context) {
        ConnectivityManager cm = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo netInfo = cm.getActiveNetworkInfo();
        if (netInfo != null && netInfo.isConnected()) {
            try {
                URL url = new URL("http://http://120.29.121.34");   // Change to "http://google.com" for www  test.
                HttpURLConnection urlc = (HttpURLConnection) url.openConnection();
                urlc.setConnectTimeout(10 * 1000);          // 10 s.
                urlc.connect();
                if (urlc.getResponseCode() == 200) {        // 200 = "OK" code (http connection is fine).
                    Log.wtf("Connection", "Success !");
                    return true;
                } else {
                    return false;
                }
            } catch (MalformedURLException e1) {
                return false;
            } catch (IOException e) {
                String error =e.getMessage();
                String error4 =e.getMessage();
                String error2 =e.getMessage();
                return false;
            }
        }
        return false;
    }
}
