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
    private static final String KEY_ID_NUMBER = "id_number";
    private static final String KEY_BARANGAY= "barangay";
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
                KEY_ID_NUMBER + " TEXT," +
                KEY_BARANGAY + " TEXT" + ")";
        db.execSQL(CREATE_SERVER_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SERVER);

        // Create tables again
        onCreate(db);
    }

    void addUser() {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(KEY_FIRST_NAME, "System");
        values.put(KEY_MIDDLE_NAME, "Admin");
        values.put(KEY_LAST_NAME, "Account");
        values.put(KEY_ID_NUMBER, "0");
        values.put(KEY_BARANGAY, "0");
        db.insert(TABLE_SERVER, null, values);
        SetUserInfo();
        db.close();
    }
    void UpdateUser(UsersInfo users) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_FIRST_NAME, users.get_first_name());
        values.put(KEY_MIDDLE_NAME, users.get_middle_name());
        values.put(KEY_LAST_NAME, users.get_last_name());
        values.put(KEY_ID_NUMBER, users.get_id_number());
        values.put(KEY_BARANGAY, users.get_barangay());
        db.update(TABLE_SERVER,values,"", null);

        db.close();
    }
    public  String GetBaragay(){
        String countQuery = "select  "+KEY_BARANGAY+"  from " + TABLE_SERVER ;
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery(countQuery, null);
        if(cursor.moveToFirst()){
            return  cursor.getString(0);
        }
        return "";
    }

    public void SetUserInfo() {
        try {
            String countQuery = "select * from " + TABLE_SERVER ;
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.rawQuery(countQuery, null);
            cursor.moveToFirst();
            Config.usersinfo.first_name = cursor.getString(cursor.getColumnIndexOrThrow(KEY_FIRST_NAME));
            Config.usersinfo.middle_name = cursor.getString(cursor.getColumnIndexOrThrow(KEY_MIDDLE_NAME));
            Config.usersinfo.last_name = cursor.getString(cursor.getColumnIndexOrThrow(KEY_LAST_NAME));
            Config.usersinfo.barangay = cursor.getString(cursor.getColumnIndexOrThrow(KEY_BARANGAY));
            Config.usersinfo.id_number = cursor.getString(cursor.getColumnIndexOrThrow(KEY_ID_NUMBER));
            Config.Tagapanayam=Config.usersinfo.first_name+" "+Config.usersinfo.middle_name+" "+Config.usersinfo.last_name;

            cursor.close();
        } catch (Exception xx) {

        }

    }

}

