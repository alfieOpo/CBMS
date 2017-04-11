package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class UsersDatabase extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "Users";
    private static final String TABLE_SERVER = "users";
    private static final String KEY_ID = "_id";
    private static final String KEY_FIRST_NAME = "first_name";
    private static final String KEY_MIDDLE_NAME = "middle_name";
    private static final String KEY_LAST_NAME = "last_name";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_ISLOGIN = "islogin";

    public UsersDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_SERVER_TABLE = "CREATE TABLE " + TABLE_SERVER + "("
                + KEY_ID + " INTEGER PRIMARY KEY," +
                KEY_FIRST_NAME + " TEXT," +
                KEY_MIDDLE_NAME + " TEXT," +
                KEY_LAST_NAME + " TEXT," +
                KEY_USERNAME + " TEXT," +
                KEY_PASSWORD + " TEXT," +
                KEY_ISLOGIN + " TEXT" + ")";
        db.execSQL(CREATE_SERVER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SERVER);

        // Create tables again
        onCreate(db);
    }

    void addUser(UsersInfo users) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_FIRST_NAME, users.get_first_name());
        values.put(KEY_MIDDLE_NAME, users.get_middle_name());
        values.put(KEY_LAST_NAME, users.get_last_name());
        values.put(KEY_USERNAME, users.get_username());
        values.put(KEY_PASSWORD, users.get_password());
        values.put("islogin", users.get_islogin());
        db.insert(TABLE_SERVER, null, values);

        db.close();
    }

    public boolean isRegisterd(String username, String password) {

        String countQuery = "select _id  from " + TABLE_SERVER + " where username='" + username + "'  and password='" + password + "'";
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);

        try {
            cursor.moveToFirst();


            int id = cursor.getCount();
            int asdfasdfasdf = cursor.getCount();
            Loadinfo(id);
            return true;

        } catch (Exception xx) {
            return false;
        }
    }


    public void IsLogin() {
        try {
            String countQuery = "select * from " + TABLE_SERVER + " where islogin=1";
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.rawQuery(countQuery, null);
            cursor.moveToFirst();
            Config.usersinfo.first_name = cursor.getString(cursor.getColumnIndexOrThrow(KEY_FIRST_NAME));
            Config.usersinfo.middle_name = cursor.getString(cursor.getColumnIndexOrThrow(KEY_MIDDLE_NAME));
            Config.usersinfo.last_name = cursor.getString(cursor.getColumnIndexOrThrow(KEY_LAST_NAME));
            Config.usersinfo.username = cursor.getString(cursor.getColumnIndexOrThrow(KEY_USERNAME));
            Config.usersinfo.password = cursor.getString(cursor.getColumnIndexOrThrow(KEY_PASSWORD));
            Config.usersinfo.ISLOGIN = cursor.getString(cursor.getColumnIndexOrThrow("islogin"));
            cursor.close();
        } catch (Exception xx) {
            Config.usersinfo.ISLOGIN = "0";
        }

    }

    private void Loadinfo(int id) {
        String countQuery = "Update " + TABLE_SERVER + " set islogin=1 where _id=" + id;
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL(countQuery);
        IsLogin();
    }

    public void Logout() {

        String countQuery = "Update " + TABLE_SERVER + " set islogin=null";
        SQLiteDatabase db = this.getReadableDatabase();
        db.execSQL(countQuery);

    }

}

