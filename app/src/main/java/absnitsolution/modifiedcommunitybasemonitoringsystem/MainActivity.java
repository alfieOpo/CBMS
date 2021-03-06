package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.Manifest;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.telephony.TelephonyManager;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, LocationListener {
    int counter = 0;
    MainDataBaseHandler da;
    private LocationManager locationManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        locationManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(getApplicationContext(), Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
        }
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 2000, 1, this);
        da = new MainDataBaseHandler(MainActivity.this);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        String ts = Context.TELEPHONY_SERVICE;

        TelephonyManager mTelephonyMgr = (TelephonyManager) getSystemService(ts);
        String IMSI = mTelephonyMgr.getSubscriberId();
        String IMEI = mTelephonyMgr.getDeviceId();
        String AndroidID = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
        if(da.UserCount()==0){
            ContentValues v=new ContentValues();
            v.put("first_name","System");
            v.put("middle_name","Admin");
            v.put("last_name","Account");
            v.put("id_number","0");
            v.put("barangay","0");
            v.put("IMEI", IMEI);
            v.put("IMSI", IMSI);
            v.put("AndroidID", AndroidID);
            da.CREATEUSER(v);
        }

        da.getUserInfo();
        if (Config.NewOPen == 0) {

            switcher switcher = new switcher();
            LoadFrame(switcher, "Home");
            Config.NewOPen = 1;
        }
        if(Config.usersinfo.barangay.equals("")){


            register register=new register();
            LoadFrame(register,"User Account");

        }
        if(Config.usersinfo.barangay.equals("0")){


            register register=new register();
            LoadFrame(register,"User Account");

        }


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        /*
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        if(Config.ISLOGIN){

        if (id == R.id.nav_list) {
            Config.EDIT=false;
            ListofPerson list=new ListofPerson();
            LoadFrame(list,"List");
            NextAndBack(false,false);
        } else if (id == R.id.nav_gallery) {
            Config.EDIT=false;
            Gallery gallery=new Gallery();
            LoadFrame(gallery,"Gallery");
            NextAndBack(false,false);
        }  else if (id == R.id.nav_settings) {
            Config.EDIT=false;
            mySettings settings=new mySettings();
            LoadFrame(settings,"Settings");
            NextAndBack(false,false);
        }
        else if (id == R.id.nav_new) {
            Config.EDIT=false;
            Config.ID = "0";
            Config.STATUS="";
            Config.ImageName="";
            New _new=new New();
            LoadFrame(_new,"New");
            NextAndBack(true,false);
            counter=0;
        }
        else if (id == R.id.nav_upload) {

            UploadData upload=new UploadData();
            LoadFrame(upload,"Upload");
            NextAndBack(false,false);
        }
        else if (id == R.id.nav_logout) {
            UsersDatabase UD=new UsersDatabase(getApplicationContext());
            UD.Logout();
            Intent startmainactivity=new Intent(getApplicationContext(),FlashScreen.class);
            startActivity(startmainactivity);
            finish();
        }
}
else if (id == R.id.nav_register) {

    register register=new register();
    LoadFrame(register,"Register");
    NextAndBack(false,false);
}*/
        int id = item.getItemId();


        if (id == R.id.nav_list) {
            Config.EDIT = false;
            ListofPerson list = new ListofPerson();
            LoadFrame(list, "List");

        } else if (id == R.id.nav_gallery) {
            Config.EDIT = false;
            Gallery gallery = new Gallery();
            LoadFrame(gallery, "Gallery");

        } else if (id == R.id.nav_settings) {
            Config.EDIT = false;
            mySettings settings = new mySettings();
            LoadFrame(settings, "Settings");

        }
        else if (id == R.id.nav_upload) {

            UploadData upload = new UploadData();
            LoadFrame(upload, "Upload");
            /**     Intent startmainactivity=new Intent(getApplicationContext(),Upload.class);
             startActivity(startmainactivity);**/

        } else if (id == R.id.nav_about_us) {
            AboutUs aboutUs = new AboutUs();
            LoadFrame(aboutUs, "About Us.");

        } else if (id == R.id.nav_callBack) {
            CallbackList callbackList = new CallbackList();
            LoadFrame(callbackList, "Callback");

        }
        else if (id == R.id.nav_register) {

            register register=new register();
            LoadFrame(register,"User Account");

        }

        else if (id == R.id.nav_home) {

            switcher switcher=new switcher();
            LoadFrame(switcher,"Home");

        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    private void LoadFrame(Fragment fragment, String Title) {
        setTitle(Title);
        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragment, Title);
        fragmentTransaction.commit();


    }


    @Override
    public void onLocationChanged(Location location) {
        da = new MainDataBaseHandler(MainActivity.this);
        try {
            Config.Latitude = String.valueOf(location.getLatitude());
            Config.Longitude = String.valueOf(location.getLongitude());

        /*if(da.getLongitude(Config.ID).equals("none")||da.getLongitude(Config.ID).equals("none")){
            String AndroidID= Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
            ContentValues cvv=new ContentValues();
            cvv.put("latitude",String.valueOf(location.getLatitude()));
            cvv.put("longitude",String.valueOf(location.getLongitude()));
            da.UpdateLocation(cvv,Config.ID,AndroidID);
            showStatus("Current Location Saved.");
        }*/
        } catch (Exception xx) {
            Toast.makeText(this, xx.getMessage(), Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {
        Toast.makeText(getApplicationContext(), "Gps is turned on!! ",
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onProviderDisabled(String provider) {
        Intent intent = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
        startActivity(intent);
        Toast.makeText(getApplicationContext(), "Gps is turned off!! ",
                Toast.LENGTH_SHORT).show();
    }

    public void CreateNew() {
        showStatus("MCBMS");
        new Thread() {

            public void run() {
                try {

                    String ts = Context.TELEPHONY_SERVICE;

                    TelephonyManager mTelephonyMgr = (TelephonyManager) getSystemService(ts);

                    String IMSI = mTelephonyMgr.getSubscriberId();
                    String IMEI = mTelephonyMgr.getDeviceId();
                    String AndroidID = Settings.Secure.getString(getContentResolver(), Settings.Secure.ANDROID_ID);
                    for (int i = 0; i < 40; i++) {

                        ContentValues values = new ContentValues();
                        values.put("_1st_001", "N/A");
                        values.put("M_ID", Config.ID);
                        values.put("IMEI", IMEI);
                        values.put("IMSI", IMSI);
                        values.put("AndroidID", AndroidID);
                        da.CreateGA_1st_Row(values);
                    }
                    for (int i = 0; i < 40; i++) {
                        ContentValues values = new ContentValues();
                        values.put("_2nd_001", "N/A");
                        values.put("M_ID", Config.ID);
                        values.put("IMEI", IMEI);
                        values.put("IMSI", IMSI);
                        values.put("AndroidID", AndroidID);
                        da.CreateGA_2nd_Row(values);
                    }
                    for (int i = 0; i < 40; i++) {

                        ContentValues values = new ContentValues();
                        values.put("_3rd_001", "N/A");
                        values.put("M_ID", Config.ID);
                        values.put("IMEI", IMEI);
                        values.put("IMSI", IMSI);
                        values.put("AndroidID", AndroidID);
                        da.CreateGA_3rd_Row(values);
                    }
                    for (int i = 0; i < 40; i++) {
                        ContentValues values = new ContentValues();
                        values.put("_4th_001", "N/A");
                        values.put("M_ID", Config.ID);
                        values.put("IMEI", IMEI);
                        values.put("IMSI", IMSI);
                        values.put("AndroidID", AndroidID);
                        da.CreateGA_4th_Row(values);

                    }
                    for (int i = 0; i < 40; i++) {
                        ContentValues values = new ContentValues();
                        values.put("_5th_001", "N/A");
                        values.put("M_ID", Config.ID);
                        values.put("IMEI", IMEI);
                        values.put("IMSI", IMSI);
                        values.put("AndroidID", AndroidID);
                        da.CreateGA_5th_Row(values);
                    }
                    for (int i = 0; i < 40; i++) {
                        ContentValues values = new ContentValues();
                        values.put("_6th_001", "N/A");
                        values.put("M_ID", Config.ID);
                        values.put("IMEI", IMEI);
                        values.put("IMSI", IMSI);
                        values.put("AndroidID", AndroidID);
                        da.CreateGA_6th_Row(values);
                    }
                    for (int i = 0; i < 40; i++) {
                        ContentValues values = new ContentValues();
                        values.put("_8th_001", "N/A");
                        values.put("M_ID", Config.ID);
                        values.put("IMEI", IMEI);
                        values.put("IMSI", IMSI);
                        values.put("AndroidID", AndroidID);
                        da.CreateGA_8th_Row(values);
                    }
                    for (int i = 0; i < 40; i++) {
                        ContentValues values = new ContentValues();
                        values.put("_9th_001", "N/A");
                        values.put("M_ID", Config.ID);
                        values.put("IMEI", IMEI);
                        values.put("IMSI", IMSI);
                        values.put("AndroidID", AndroidID);
                        da.CreateGA_9th_Row(values);
                    }
                    for (int i = 0; i < 40; i++) {
                        ContentValues values = new ContentValues();
                        values.put("_10th_001", "N/A");
                        values.put("M_ID", Config.ID);
                        values.put("IMEI", IMEI);
                        values.put("IMSI", IMSI);
                        values.put("AndroidID", AndroidID);
                        da.CreateGA_10th_Row(values);
                    }
                    for (int i = 0; i < 40; i++) {
                        ContentValues values = new ContentValues();
                        values.put("o_001", "N/A");
                        values.put("M_ID", Config.ID);
                        values.put("IMEI", IMEI);
                        values.put("IMSI", IMSI);
                        values.put("AndroidID", AndroidID);
                        da.CreateGO_1st_Row(values);
                    }

                    showStatus("FINISH");
                } catch (Exception e) {
                }//


            }

        }.start();
    }

    public void showStatus(String message) {
        Snackbar snackbar = Snackbar
                .make(getCurrentFocus(), message, Snackbar.LENGTH_SHORT);

        snackbar.show();

    }
}
