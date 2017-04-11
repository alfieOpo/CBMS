package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.support.v4.app.Fragment;

import java.text.DecimalFormat;
import java.text.NumberFormat;

/**
 * Created by Arlene on 09/02/2017.
 */
public class Config {
    public static String action = "list";
    public static String Latitude = "";
    public static String Longitude = "";
    public static String ImageName = "";
    public static String ID = "0";
    public static String STATUS = "";
    public static Boolean EDIT = false;
    public static int Count = 0;
    public static String Form = "";
    public static Fragment fragmentform = null;
    public static String Title = "";
    public static String Grid_ID = "0";
    public static String Stated = "";
    public static String AndroidID = "";
    public static String Table = "";
    public static String F_field = "";
    public static boolean CallbackIsCheck = false;
    public static String Sitio = "";
    public static String Barangay_code = "";
    public static int ItemID = 0;
    public static boolean ISLOGIN = usersinfo.ISLOGIN.equals("1");
    public static int NewOPen = 0;

    public static String getImagePath() {
        return "sdcard/ModifiedCommunityBasemonitoringSystem/" + ImageName + Config.ID + ".jpg";
    }

    private static String zeroPad(String value, String Many) {
        int val = 0;
        try {
            val = Integer.valueOf(value);
        } catch (Exception xx) {

        }
        NumberFormat formatter = new DecimalFormat(Many);
        return formatter.format(val);
    }

    public static String PersonCode() {
        return Config.Barangay_code + "-" + zeroPad(Config.Sitio, "00") + "-" + zeroPad(Config.ID, "0000");
    }

    public static class usersinfo {
        public static String username = "";
        public static String password = "";
        public static String first_name = "";
        public static String middle_name = "";
        public static String last_name = "";
        public static String ISLOGIN = "";
    }
}


