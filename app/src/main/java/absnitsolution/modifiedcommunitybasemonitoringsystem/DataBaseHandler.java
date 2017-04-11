package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DataBaseHandler extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "ServerConnection";
    private static final String TABLE_SERVER = "serverconnection";
    private static final String KEY_ID = "id";
    private static final String KEY_LOCAL_ADDRESS = "localaddress";
    private static final String KEY_INTERNET_ADDRESS = "internetaddress";

    public DataBaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_SERVER_TABLE = "CREATE TABLE " + TABLE_SERVER + "("
                + KEY_ID + " INTEGER PRIMARY KEY," + KEY_LOCAL_ADDRESS + " TEXT,"
                + KEY_INTERNET_ADDRESS + " TEXT" + ")";
        db.execSQL(CREATE_SERVER_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
// Drop older table if existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SERVER);

        // Create tables again
        onCreate(db);
    }

    void addConnection(ServerConnection SC) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_LOCAL_ADDRESS, SC.get_internetaddress());
        values.put(KEY_INTERNET_ADDRESS, SC.get_internetaddress());
        db.insert(TABLE_SERVER, null, values);

        db.close();
    }

    ServerConnection getCONNECTIONNAME(int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(TABLE_SERVER, new String[]{KEY_ID,
                        KEY_LOCAL_ADDRESS, KEY_INTERNET_ADDRESS}, KEY_ID + "=?",
                new String[]{String.valueOf(id)}, null, null, null, null);
        if (cursor != null)
            cursor.moveToFirst();

        ServerConnection SC = new ServerConnection(Integer.parseInt(cursor.getString(0)),
                cursor.getString(1), cursor.getString(2));

        return SC;
    }

    public int updateCONNECTION(ServerConnection SC) {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(KEY_LOCAL_ADDRESS, SC.get_localaddress());
        values.put(KEY_INTERNET_ADDRESS, SC.get_internetaddress());

        // updating row
        return db.update(TABLE_SERVER, values, KEY_ID + " = ?",
                new String[]{String.valueOf(SC.get_id())});
    }

    public void deleteCONNECTION(ServerConnection SC) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_SERVER, KEY_ID + " = ?",
                new String[]{String.valueOf(SC.get_id())});
        db.close();
    }

    public int getConnectionCOUNT() {
        try {
            String countQuery = "SELECT  * FROM " + TABLE_SERVER;
            SQLiteDatabase db = this.getReadableDatabase();
            Cursor cursor = db.rawQuery(countQuery, null);
            cursor.close();

            // return count
            return cursor.getCount();
        } catch (Exception xx) {
            return 0;
        }
    }

}
