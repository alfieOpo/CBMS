package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.app.ProgressDialog;
import android.database.Cursor;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;

public class gridbody extends AppCompatActivity {

    LinearLayout listlayout;
    LinearLayout verticallayout;
    ListView list_name;
    MainDataBaseHandler da;
    Fragment fragmentform = null;

    String title;
    String fragment;
    String table;
    String f_field;
    String AndroidID;
    GridEditText listAdapter2;
    ProgressDialog progressDialog;
    Cursor cursor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridbody);

        Bundle bundle = getIntent().getBundleExtra("values");
        this.fragment = bundle.getString("fragment");
        this.title = bundle.getString("title");
        this.table = bundle.getString("table");
        this.f_field = bundle.getString("f_field");
        Config.F_field = f_field;
        Config.Table = this.table;

        list_name = (ListView) findViewById(R.id.list_name);
        da = new MainDataBaseHandler(getApplicationContext());
        AndroidID = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
        Config.AndroidID = AndroidID;
        final Cursor c = da.getList(this.table, Config.ID, AndroidID, Config.Count);
        cursor = c;


        GridEditText listAdapter = new GridEditText(gridbody.this, da.getList(this.table, Config.ID, Config.AndroidID, Config.Count));
        listAdapter._display_member = this.f_field;
        listAdapter2 = listAdapter;
        list_name.setAdapter(listAdapter);
        list_name.setOnItemClickListener(new itemlist());

        String text = "0";
        if (c.moveToFirst()) {
            text = c.getString(c.getColumnIndex("_id"));
        }
        LoadFrame(text);

    }

    private void LoadList() {
        try {
            GridEditText listAdapter = new GridEditText(gridbody.this, da.getList(this.table, Config.ID, this.AndroidID, Config.Count));
            listAdapter._display_member = this.f_field;
            list_name.setAdapter(listAdapter);
            list_name.setOnItemClickListener(new itemlist());
        } catch (Exception xx) {
        }
    }

    private void LoadFrame(final String id) {
        progressDialog = ProgressDialog.show(gridbody.this, "", "Collecting Data...");

        new Thread() {
            public void run() {
                try {
                    sleep(1000);
                    Bundle bundle;
                    switch (fragment) {
                        case "1":
                            Config.fragmentform = new _1ststatedrow_Question();
                            bundle = new Bundle();
                            bundle.putString("_id", id);
                            Config.fragmentform.setArguments(bundle);
                            break;
                        case "2":
                            Config.fragmentform = new _2ndstatedrow_Question();
                            bundle = new Bundle();
                            bundle.putString("_id", id);
                            Config.fragmentform.setArguments(bundle);
                            break;
                        case "3":
                            Config.fragmentform = new _3rdstatedrow_Question();
                            bundle = new Bundle();
                            bundle.putString("_id", id);
                            Config.fragmentform.setArguments(bundle);
                            break;
                        case "4":
                            Config.fragmentform = new _4thstatedrow_Question();
                            bundle = new Bundle();
                            bundle.putString("_id", id);
                            Config.fragmentform.setArguments(bundle);
                            break;
                        case "5":
                            Config.fragmentform = new _5thstatedrow_Question();
                            bundle = new Bundle();
                            bundle.putString("_id", id);
                            Config.fragmentform.setArguments(bundle);
                            break;
                        case "6":
                            Config.fragmentform = new _6thstatedrow_Question();
                            bundle = new Bundle();
                            bundle.putString("_id", id);
                            Config.fragmentform.setArguments(bundle);
                            break;
                        case "8":
                            Config.fragmentform = new _8thstatedrow_Question();
                            bundle = new Bundle();
                            bundle.putString("_id", id);
                            Config.fragmentform.setArguments(bundle);
                            break;
                        case "9":
                            Config.fragmentform = new _9thstatedrow_Question();
                            bundle = new Bundle();
                            bundle.putString("_id", id);
                            Config.fragmentform.setArguments(bundle);
                            break;
                        case "10":
                            Config.fragmentform = new _10thstatedrow_Question();
                            bundle = new Bundle();
                            bundle.putString("_id", id);
                            Config.fragmentform.setArguments(bundle);
                            break;
                        case "11":
                            Config.fragmentform = new _O_statedrow_Question();
                            bundle = new Bundle();
                            bundle.putString("_id", id);
                            Config.fragmentform.setArguments(bundle);
                            break;
                    }

                    android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
                    fragmentTransaction.replace(R.id.grid_frame, Config.fragmentform, Config.Title);
                    fragmentTransaction.commit();

                } catch (Exception e) {

                }

//
                progressDialog.dismiss();

            }

        }.start();
    }

    @Override
    protected void onDestroy() {
        Config.EDIT = true;
        Config.STATUS = "B";
        super.onDestroy();
    }

    class itemlist extends gridbody implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            this.da = new MainDataBaseHandler(gridbody.this);

            final Cursor c = da.getList(Config.Table, Config.ID, Config.AndroidID, Config.Count);
            c.moveToFirst();
            c.move(position);
            String text = c.getString(c.getColumnIndex("_id"));
            LoadFrame(text);

            LoadList();

        }
    }
}
