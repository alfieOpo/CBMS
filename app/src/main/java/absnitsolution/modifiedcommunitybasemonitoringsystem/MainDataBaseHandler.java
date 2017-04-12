package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

public class MainDataBaseHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "mcbms_db";
    private static final String TABLE_SERVER = "mcbms";
    private static final String TABLE_GA_1ST = "ga_1st";
    private static final String TABLE_GA_2ND = "ga_2nd";
    private static final String TABLE_GA_3RD = "ga_3rd";
    private static final String TABLE_GA_4TH = "ga_4th";
    private static final String TABLE_GA_5TH = "ga_5th";
    private static final String TABLE_GA_6TH = "ga_6th";
    private static final String TABLE_GA_8TH = "ga_8th";
    private static final String TABLE_GA_9TH = "ga_9th";
    private static final String TABLE_GA_10TH = "ga_10th";
    private static final String TABLE_GO_1st = "go_1st";


    public MainDataBaseHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(MAINTABLE());
        } catch (Exception xx) {
        }//create maintable
        try {
            db.execSQL(GA_1ST());
        } catch (Exception xx) {
        }//create ga 1st
        try {
            db.execSQL(GA_2ND());
        } catch (Exception xx) {
        }//create ga 1st
        try {
            db.execSQL(GA_3RD());
        } catch (Exception xx) {
        }//create ga 1st
        try {
            db.execSQL(GA_4TH());
        } catch (Exception xx) {
        }//create ga 1st
        try {
            db.execSQL(GA_5TH());
        } catch (Exception xx) {
        }//create ga 1st
        try {
            db.execSQL(GA_6TH());
        } catch (Exception xx) {
        }//create ga 1st
        try {
            db.execSQL(GA_8TH());
        } catch (Exception xx) {
        }//create ga 1st
        try {
            db.execSQL(GA_9TH());
        } catch (Exception xx) {
        }//create ga 1st
        try {
            db.execSQL(GA_10TH());
        } catch (Exception xx) {
        }//create ga 1st
        try {
            db.execSQL(GO_1ST());
        } catch (Exception xx) {
        }//create ga 1st
        try {
            db.execSQL(ImageTable());
        } catch (Exception xx) {
        }//create ga 1st

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SERVER);
        // Create tables again
        onCreate(db);
    }

    public void c_Update(c_params par) {
        try {
            SQLiteDatabase db = this.getWritableDatabase();
            int i = db.update(TABLE_SERVER, par.get_values(), par.get_key(), null);
            System.out.print(i);
            db.close();
        } catch (Exception xx) {

        }
    }

    public void c_Update(c_params par, String table) {
        try {
            SQLiteDatabase db = this.getWritableDatabase();
            String key = par.get_key();

            int i = db.update(table, par.get_values(), par.get_key(), null);
            System.out.print(i);
            db.close();
        } catch (Exception xx) {
        }
    }

    public void CreateNewRow(ContentValues v) {

        SQLiteDatabase db = this.getWritableDatabase();

        long rowInserted = db.insert(TABLE_SERVER, null, v);
        if (rowInserted != -1) {
            Log.i("1st INSERT", "SUCCESS");
        } else {
            Log.i("1st INSERT", "FAILED");
        }
        db.close();
    }

    public void CreateImageRow(ContentValues v) {
        SQLiteDatabase db = this.getWritableDatabase();

        long rowInserted = db.insert("images", null, v);
        if (rowInserted != -1) {
            Log.i("1st INSERT", "SUCCESS");
        } else {
            Log.i("1st INSERT", "FAILED");
        }
        db.close();
    }

    public void CreateGA_1st_Row(ContentValues v) {
        SQLiteDatabase db = this.getWritableDatabase();

        long rowInserted = db.insert(TABLE_GA_1ST, null, v);
        if (rowInserted != -1) {
            Log.i("1st INSERT", "SUCCESS");
        } else {
            Log.i("1st INSERT", "FAILED");
        }
        db.close();
    }

    public void CreateGA_2nd_Row(ContentValues v) {
        SQLiteDatabase db = this.getWritableDatabase();

        long rowInserted = db.insert(TABLE_GA_2ND, null, v);
        if (rowInserted != -1) {
            Log.i("2nd INSERT", "SUCCESS");
        } else {
            Log.i("2nd INSERT", "FAILED");
        }
        db.close();
    }

    public void CreateGA_3rd_Row(ContentValues v) {
        SQLiteDatabase db = this.getWritableDatabase();

        long rowInserted = db.insert(TABLE_GA_3RD, null, v);
        if (rowInserted != -1) {
            Log.i("3rd INSERT", "SUCCESS");
        } else {
            Log.i("3rd INSERT", "FAILED");
        }
        db.close();
    }

    public void CreateGA_4th_Row(ContentValues v) {
        SQLiteDatabase db = this.getWritableDatabase();

        long rowInserted = db.insert(TABLE_GA_4TH, null, v);
        if (rowInserted != -1) {
            Log.i("4th INSERT", "SUCCESS");
        } else {
            Log.i("4th INSERT", "FAILED");
        }
        db.close();
    }

    public void CreateGA_5th_Row(ContentValues v) {
        SQLiteDatabase db = this.getWritableDatabase();

        long rowInserted = db.insert(TABLE_GA_5TH, null, v);
        if (rowInserted != -1) {
            Log.i("5th INSERT", "SUCCESS");
        } else {
            Log.i("5th INSERT", "FAILED");
        }
        db.close();
    }

    public void CreateGA_6th_Row(ContentValues v) {
        SQLiteDatabase db = this.getWritableDatabase();

        long rowInserted = db.insert(TABLE_GA_6TH, null, v);
        if (rowInserted != -1) {
            Log.i("6th INSERT", "SUCCESS");
        } else {
            Log.i("6th INSERT", "FAILED");
        }
        db.close();
    }

    public void CreateGA_8th_Row(ContentValues v) {
        SQLiteDatabase db = this.getWritableDatabase();

        long rowInserted = db.insert(TABLE_GA_8TH, null, v);
        if (rowInserted != -1) {
            Log.i("8th INSERT", "SUCCESS");
        } else {
            Log.i("8th INSERT", "FAILED");
        }
        db.close();
    }

    public void CreateGA_9th_Row(ContentValues v) {
        SQLiteDatabase db = this.getWritableDatabase();

        long rowInserted = db.insert(TABLE_GA_9TH, null, v);
        if (rowInserted != -1) {
            Log.i("9th INSERT", "SUCCESS");
        } else {
            Log.i("9th INSERT", "FAILED");
        }
        db.close();
    }

    public void CreateGA_10th_Row(ContentValues v) {
        SQLiteDatabase db = this.getWritableDatabase();

        long rowInserted = db.insert(TABLE_GA_10TH, null, v);
        if (rowInserted != -1) {
            Log.i("10th INSERT", "SUCCESS");
        } else {
            Log.i("10th INSERT", "FAILED");
        }
        db.close();
    }

    public void CreateGO_1st_Row(ContentValues v) {
        SQLiteDatabase db = this.getWritableDatabase();

        long rowInserted = db.insert(TABLE_GO_1st, null, v);
        if (rowInserted != -1) {
            Log.i("INSERT", "SUCCESS");
        } else {
            Log.i("INSERT", "FAILED");
        }
        db.close();
    }

    public String GetData(String tag) {

        String query = "SELECT " + tag + " FROM " + TABLE_SERVER + "  WHERE _id=" + Config.ID;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }
        String data = cursor.getString(0);
        return data;
    }

    public String GetData(String tag, String table, String id) {
        String query = "SELECT " + tag + " FROM " + table + "  WHERE " + id;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }
        String data = cursor.getString(0);
        return data;
    }

    public String GetDataCheck(String tag) {
        String query = "SELECT " + tag + " FROM " + TABLE_SERVER + "  WHERE _id=" + Config.ID;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }
        String data = "0";
        try {
            data = cursor.getString(0);
            if (data.equals(null)) {
                data = "0";
            }
        } catch (Exception xx) {
            data = "0";
        }
        return data;
    }

    public String GetDataCheck(String tag, String table, String id) {
        String query = "SELECT " + tag + " FROM " + table + "  WHERE " + id;
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery(query, null);

        if (cursor != null) {
            cursor.moveToFirst();
        }
        String data = cursor.getString(0);
        try {
            if (data.equals(null)) {
                data = "0";
            }
        } catch (Exception xx) {
            data = "0";
        }
        return data;
    }


    public void setMaxID() {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select max(_id) from mcbms", null);
        if (cursor != null) {
            cursor.moveToFirst();
            Config.ID = cursor.getString(0);
        } else {
            Config.ID = "0";
        }
    }

    public void Delete() {
        SQLiteDatabase db = this.getReadableDatabase();
        String id = Config.ID;
        Cursor cursor = db.rawQuery("delete from mcbms where _id =" + Config.ID, null);
        if (cursor != null) {
            cursor.moveToFirst();

        } else {

        }
    }


    public Cursor getList() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from mcbms m left join images i on i.M_ID=m._id  where m.D_034 <> 1 ", null);
        return cursor;

    }

    public Cursor getListAll() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from mcbms m left join images i on i.M_ID=m._id  ", null);
        return cursor;

    }


    public Cursor getListCallBack() {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from mcbms m left join images i on i.M_ID=m._id  where m.D_034 = 1 ", null);
        return cursor;
    }

    public Cursor getList(String table) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from " + table, null);
        return cursor;

    }

    public Cursor getCount(String table) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select count(*) as  cnt from " + table, null);
        return cursor;

    }

    public Cursor getMyembroList(String M_ID, String AndroidID, String Mainfield) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select _id, _1st_001," + Mainfield + " from ga_1st where M_ID=" + M_ID + " and AndroidID='" + AndroidID + "' and _1st_001 <> 'N/A'", null);
        return cursor;

    }

    public String getLatitude(String M_ID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "select latitude from mcbms where _id=" + M_ID;
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor.moveToFirst()) {
            return cursor.getString(0);
        }
        return "";

    }

    public String getLongitude(String M_ID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String sql = "select longitude from mcbms where _id=" + M_ID;
        Cursor cursor = db.rawQuery(sql, null);
        if (cursor.moveToFirst()) {
            return cursor.getString(0);
        }
        return "";

    }

    public Cursor getList(String Table, String MID, String AID, int count) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select * from " + Table + " where M_ID=" + MID + " and AndroidID='" + AID + "' order by _id limit " + count, null);

        if (!(cursor.moveToFirst()) || cursor.getCount() == 0) {
            Log.e("Alfie", "No Data");
        }

        return cursor;
    }

    public int getMyembrocount(String M_ID, String AndroidID, String Mainfield) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select count(_id) cnt from ga_1st where M_ID=" + M_ID + " and AndroidID='" + AndroidID + "' and _1st_001 <> 'N/A' and " + Mainfield + "='1'", null);
        if (cursor.moveToFirst()) {
            return Integer.valueOf(cursor.getString(0));
        }
        return 0;

    }

    public int getSUMGO_1ST(String M_ID, String AndroidID, String Maidfield) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select sum(" + Maidfield + ") total from go_1st where M_ID=" + M_ID + " and AndroidID='" + AndroidID + "'", null);
        if (cursor.moveToFirst()) {
            return Integer.valueOf(cursor.getString(0));
        }
        return 0;

    }

    public int getGA_1ST89(String M_ID) {
        SQLiteDatabase db = this.getReadableDatabase();
        String Sql = "select D_095 from mcbms where _id=" + M_ID;
        Cursor cursor = db.rawQuery(Sql, null);
        try {
            if (cursor.moveToFirst()) {
                return Integer.valueOf(cursor.getString(0));
            }
        } catch (Exception xx) {
            return 0;
        }
        return 0;

    }


    public void DeleteUnUseDData() {
        try {

            SQLiteDatabase db = this.getReadableDatabase();
            try{
            db.execSQL("delete from ga_1st where M_ID in (Select _id from mcbms where (D_001 is null or D_001 = ''))"); }catch (Exception xx) {
                    System.out.print(xx.getMessage());
                }
            db.execSQL("delete from ga_2nd where M_ID in (Select _id from mcbms where (D_001 is null or D_001 = ''))");
            db.execSQL("delete from ga_3rd where M_ID in (Select _id from mcbms where (D_001 is null or D_001 = ''))");
            db.execSQL("delete from ga_4th where M_ID in (Select _id from mcbms where (D_001 is null or D_001 = ''))");
            db.execSQL("delete from ga_5th where M_ID in (Select _id from mcbms where (D_001 is null or D_001 = ''))");
            db.execSQL("delete from ga_6th where M_ID in (Select _id from mcbms where (D_001 is null or D_001 = ''))");
            db.execSQL("delete from ga_8th where M_ID in (Select _id from mcbms where (D_001 is null or D_001 = ''))");
            db.execSQL("delete from ga_9th where M_ID in (Select _id from mcbms where (D_001 is null or D_001 = ''))");
            db.execSQL("delete from ga_10th where M_ID in (Select _id from mcbms where (D_001 is null or D_001 = ''))");
            db.execSQL("delete from go_1st where M_ID in (Select _id from mcbms where (D_001 is null or D_001 = ''))");
            db.execSQL("delete from mcbms where (D_001 is null or D_001 = '') ");

        } catch (Exception xx) {
            String Error=xx.getMessage();
            System.out.print(xx.getMessage());
        }
    }

    private String MAINTABLE() {

        String CREATE_MCBMS_TABLE = "CREATE TABLE " + TABLE_SERVER + "( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "latitude TEXT default('')," +
                "longitude TEXT default('')," +
                "D_001 TEXT default('')," +
                "D_002 TEXT default('')," +
                "D_003 TEXT default('')," +
                "D_004 TEXT default('')," +
                "D_005 TEXT default('')," +
                "D_006 TEXT default('')," +
                "D_007 TEXT default('')," +
                "D_008 TEXT default('')," +
                "D_009 TEXT default('')," +
                "D_010 TEXT default('')," +
                "D_011 TEXT default('')," +
                "D_012 TEXT default('')," +
                "D_013 TEXT default('')," +
                "D_014 TEXT default('')," +
                "D_015 TEXT default('')," +
                "D_016 TEXT default('')," +
                "D_017 TEXT default('')," +
                "D_018 TEXT default('')," +
                "D_019 TEXT default('')," +
                "D_020 TEXT default('')," +
                "D_021 TEXT default('')," +
                "D_022 TEXT default('')," +
                "D_023 TEXT default('')," +
                "D_024 TEXT default('')," +
                "D_025 TEXT default('')," +
                "D_026 TEXT default('')," +
                "D_027 TEXT default('')," +
                "D_028 TEXT default('')," +
                "D_029 TEXT default('')," +
                "D_030 TEXT default('')," +
                "D_031 TEXT default('')," +
                "D_032 TEXT default('')," +
                "D_033 TEXT default('')," +
                "D_034 TEXT default('')," +
                "D_035 TEXT default('')," +
                "D_036 TEXT default('')," +
                "D_037 TEXT default('')," +
                "D_038 TEXT default('')," +
                "D_039 TEXT default('')," +
                "D_040 TEXT default('')," +
                "D_041 TEXT default('')," +
                "D_042 TEXT default('')," +
                "D_043 TEXT default('')," +
                "D_044 TEXT default('')," +
                "D_045 TEXT default('')," +
                "D_046 TEXT default('')," +
                "D_047 TEXT default('')," +
                "D_048 TEXT default('')," +
                "D_049 TEXT default('')," +
                "D_050 TEXT default('')," +
                "D_051 TEXT default('')," +
                "D_052 TEXT default('')," +
                "D_053 TEXT default('')," +
                "D_054 TEXT default('')," +
                "D_055 TEXT default('')," +
                "D_056 TEXT default('')," +
                "D_057 TEXT default('')," +
                "D_058 TEXT default('')," +
                "D_059 TEXT default('')," +
                "D_060 TEXT default('')," +
                "D_061 TEXT default('')," +
                "D_062 TEXT default('')," +
                "D_063 TEXT default('')," +
                "D_064 TEXT default('')," +
                "D_065 TEXT default('')," +
                "D_066 TEXT default('')," +
                "D_067 TEXT default('')," +
                "D_068 TEXT default('')," +
                "D_069 TEXT default('')," +
                "D_070 TEXT default('')," +
                "D_071 TEXT default('')," +
                "D_072 TEXT default('')," +
                "D_073 TEXT default('')," +
                "D_074 TEXT default('')," +
                "D_075 TEXT default('')," +
                "D_076 TEXT default('')," +
                "D_077 TEXT default('')," +
                "D_078 TEXT default('')," +
                "D_079 TEXT default('')," +
                "D_080 TEXT default('')," +
                "D_081 TEXT default('')," +
                "D_082 TEXT default('')," +
                "D_083 TEXT default('')," +
                "D_084 TEXT default('')," +
                "D_085 TEXT default('')," +
                "D_086 TEXT default('')," +
                "D_087 TEXT default('')," +
                "D_088 TEXT default('')," +
                "D_089 TEXT default('')," +
                "D_090 TEXT default('')," +
                "D_091 TEXT default('')," +
                "D_092 TEXT default('')," +
                "D_093 TEXT default('')," +
                "D_094 TEXT default('')," +
                "D_095 TEXT default('')," +
                "D_096 TEXT default('')," +
                "D_097 TEXT default('')," +
                "D_098 TEXT default('')," +
                "D_099 TEXT default('')," +
                "D_100 TEXT default('')," +
                "D_101 TEXT default('')," +
                "D_102 TEXT default('')," +
                "D_103 TEXT default('')," +
                "D_104 TEXT default('')," +
                "D_105 TEXT default('')," +
                "D_106 TEXT default('')," +
                "D_107 TEXT default('')," +
                "D_108 TEXT default('')," +
                "D_109 TEXT default('')," +
                "D_110 TEXT default('')," +
                "D_111 TEXT default('')," +
                "D_112 TEXT default('')," +
                "D_113 TEXT default('')," +
                "D_114 TEXT default('')," +
                "D_115 TEXT default('')," +
                "D_116 TEXT default('')," +
                "D_117 TEXT default('')," +
                "D_118 TEXT default('')," +
                "D_119 TEXT default('')," +
                "D_120 TEXT default('')," +
                "D_121 TEXT default('')," +
                "D_122 TEXT default('')," +
                "D_123 TEXT default('')," +
                "D_124 TEXT default('')," +
                "D_125 TEXT default('')," +
                "D_126 TEXT default('')," +
                "D_127 TEXT default('')," +
                "D_128 TEXT default('')," +
                "D_129 TEXT default('')," +
                "D_130 TEXT default('')," +
                "D_131 TEXT default('')," +
                "D_132 TEXT default('')," +
                "D_133 TEXT default('')," +
                "D_134 TEXT default('')," +
                "D_135 TEXT default('')," +
                "D_136 TEXT default('')," +
                "D_137 TEXT default('')," +
                "D_138 TEXT default('')," +
                "D_139 TEXT default('')," +
                "D_140 TEXT default('')," +
                "D_141 TEXT default('')," +
                "D_142 TEXT default('')," +
                "D_143 TEXT default('')," +
                "D_144 TEXT default('')," +
                "D_145 TEXT default('')," +
                "D_146 TEXT default('')," +
                "D_147 TEXT default('')," +
                "D_148 TEXT default('')," +
                "D_149 TEXT default('')," +
                "D_150 TEXT default('')," +
                "D_151 TEXT default('')," +
                "D_152 TEXT default('')," +
                "D_153 TEXT default('')," +
                "D_154 TEXT default('')," +
                "D_155 TEXT default('')," +
                "D_156 TEXT default('')," +
                "D_157 TEXT default('')," +
                "D_158 TEXT default('')," +
                "D_159 TEXT default('')," +
                "D_160 TEXT default('')," +
                "D_161 TEXT default('')," +
                "D_162 TEXT default('')," +
                "D_163 TEXT default('')," +
                "D_164 TEXT default('')," +
                "D_165 TEXT default('')," +
                "D_166 TEXT default('')," +
                "D_167 TEXT default('')," +
                "D_168 TEXT default('')," +
                "D_169 TEXT default('')," +
                "D_170 TEXT default('')," +
                "D_171 TEXT default('')," +
                "D_172 TEXT default('')," +
                "D_173 TEXT default('')," +
                "D_174 TEXT default('')," +
                "D_175 TEXT default('')," +
                "D_176 TEXT default('')," +
                "D_177 TEXT default('')," +
                "D_178 TEXT default('')," +
                "D_179 TEXT default('')," +
                "D_180 TEXT default('')," +
                "D_181 TEXT default('')," +
                "D_182 TEXT default('')," +
                "D_183 TEXT default('')," +
                "D_184 TEXT default('')," +
                "D_185 TEXT default('')," +
                "D_186 TEXT default('')," +
                "D_187 TEXT default('')," +
                "D_188 TEXT default('')," +
                "D_189 TEXT default('')," +
                "D_190 TEXT default('')," +
                "D_191 TEXT default('')," +
                "D_192 TEXT default('')," +
                "D_193 TEXT default('')," +
                "D_194 TEXT default('')," +
                "D_195 TEXT default('')," +
                "D_196 TEXT default('')," +
                "D_197 TEXT default('')," +
                "D_198 TEXT default('')," +
                "D_199 TEXT default('')," +
                "D_200 TEXT default('')," +
                "D_201 TEXT default('')," +
                "D_202 TEXT default('')," +
                "D_203 TEXT default('')," +
                "D_204 TEXT default('')," +
                "D_205 TEXT default('')," +
                "D_206 TEXT default('')," +
                "D_207 TEXT default('')," +
                "D_208 TEXT default('')," +
                "D_209 TEXT default('')," +
                "D_210 TEXT default('')," +
                "D_211 TEXT default('')," +
                "D_212 TEXT default('')," +
                "D_213 TEXT default('')," +
                "D_214 TEXT default('')," +
                "D_215 TEXT default('')," +
                "D_216 TEXT default('')," +
                "D_217 TEXT default('')," +
                "D_218 TEXT default('')," +
                "D_219 TEXT default('')," +
                "D_220 TEXT default('')," +
                "D_221 TEXT default('')," +
                "D_222 TEXT default('')," +
                "D_223 TEXT default('')," +
                "D_224 TEXT default('')," +
                "D_225 TEXT default('')," +
                "D_226 TEXT default('')," +
                "D_227 TEXT default('')," +
                "D_228 TEXT default('')," +
                "D_229 TEXT default('')," +
                "D_230 TEXT default('')," +
                "D_231 TEXT default('')," +
                "D_232 TEXT default('')," +
                "D_233 TEXT default('')," +
                "D_234 TEXT default('')," +
                "D_235 TEXT default('')," +
                "D_236 TEXT default('')," +
                "D_237 TEXT default('')," +
                "D_238 TEXT default('')," +
                "D_239 TEXT default('')," +
                "D_240 TEXT default('')," +
                "D_241 TEXT default('')," +
                "D_242 TEXT default('')," +
                "D_243 TEXT default('')," +
                "D_244 TEXT default('')," +
                "D_245 TEXT default('')," +
                "D_246 TEXT default('')," +
                "D_247 TEXT default('')," +
                "D_248 TEXT default('')," +
                "D_249 TEXT default('')," +
                "D_250 TEXT default('')," +
                "D_251 TEXT default('')," +
                "D_252 TEXT default('')," +
                "D_253 TEXT default('')," +
                "D_254 TEXT default('')," +
                "D_255 TEXT default('')," +
                "D_256 TEXT default('')," +
                "D_257 TEXT default('')," +
                "D_258 TEXT default('')," +
                "D_259 TEXT default('')," +
                "D_260 TEXT default('')," +
                "D_261 TEXT default('')," +
                "D_262 TEXT default('')," +
                "D_263 TEXT default('')," +
                "D_264 TEXT default('')," +
                "D_265 TEXT default('')," +
                "D_266 TEXT default('')," +
                "D_267 TEXT default('')," +
                "D_268 TEXT default('')," +
                "D_269 TEXT default('')," +
                "D_270 TEXT default('')," +
                "D_271 TEXT default('')," +
                "D_272 TEXT default('')," +
                "D_273 TEXT default('')," +
                "D_274 TEXT default('')," +
                "D_275 TEXT default('')," +
                "D_276 TEXT default('')," +
                "D_277 TEXT default('')," +
                "D_278 TEXT default('')," +
                "D_279 TEXT default('')," +
                "D_280 TEXT default('')," +
                "D_281 TEXT default('')," +
                "D_282 TEXT default('')," +
                "D_283 TEXT default('')," +
                "D_284 TEXT default('')," +
                "D_285 TEXT default('')," +
                "D_286 TEXT default('')," +
                "D_287 TEXT default('')," +
                "D_288 TEXT default('')," +
                "D_289 TEXT default('')," +
                "D_290 TEXT default('')," +
                "D_291 TEXT default('')," +
                "D_292 TEXT default('')," +
                "D_293 TEXT default('')," +
                "D_294 TEXT default('')," +
                "D_295 TEXT default('')," +
                "D_296 TEXT default('')," +
                "D_297 TEXT default('')," +
                "D_298 TEXT default('')," +
                "D_299 TEXT default('')," +
                "D_300 TEXT default('')," +
                "D_301 TEXT default('')," +
                "D_302 TEXT default('')," +
                "D_303 TEXT default('')," +
                "D_304 TEXT default('')," +
                "D_305 TEXT default('')," +
                "D_306 TEXT default('')," +
                "D_307 TEXT default('')," +
                "D_308 TEXT default('')," +
                "D_309 TEXT default('')," +
                "D_310 TEXT default('')," +
                "D_311 TEXT default('')," +
                "D_312 TEXT default('')," +
                "D_313 TEXT default('')," +
                "D_314 TEXT default('')," +
                "D_315 TEXT default('')," +
                "D_316 TEXT default('')," +
                "D_317 TEXT default('')," +
                "D_318 TEXT default('')," +
                "D_319 TEXT default('')," +
                "D_320 TEXT default('')," +
                "D_321 TEXT default('')," +
                "D_322 TEXT default('')," +
                "D_323 TEXT default('')," +
                "D_324 TEXT default('')," +
                "D_325 TEXT default('')," +
                "D_326 TEXT default('')," +
                "D_327 TEXT default('')," +
                "D_328 TEXT default('')," +
                "D_329 TEXT default('')," +
                "D_330 TEXT default('')," +
                "D_331 TEXT default('')," +
                "D_332 TEXT default('')," +
                "D_333 TEXT default('')," +
                "D_334 TEXT default('')," +
                "D_335 TEXT default('')," +
                "D_336 TEXT default('')," +
                "D_337 TEXT default('')," +
                "D_338 TEXT default('')," +
                "D_339 TEXT default('')," +
                "D_340 TEXT default('')," +
                "D_341 TEXT default('')," +
                "D_342 TEXT default('')," +
                "D_343 TEXT default('')," +
                "D_344 TEXT default('')," +
                "D_345 TEXT default('')," +
                "D_346 TEXT default('')," +
                "D_347 TEXT default('')," +
                "D_348 TEXT default('')," +
                "D_349 TEXT default('')," +
                "D_350 TEXT default('')," +
                "D_351 TEXT default('')," +
                "D_352 TEXT default('')," +
                "D_353 TEXT default('')," +
                "D_354 TEXT default('')," +
                "D_355 TEXT default('')," +
                "D_356 TEXT default('')," +
                "D_357 TEXT default('')," +
                "D_358 TEXT default('')," +
                "D_359 TEXT default('')," +
                "D_360 TEXT default('')," +
                "D_361 TEXT default('')," +
                "D_362 TEXT default('')," +
                "D_363 TEXT default('')," +
                "D_364 TEXT default('')," +
                "D_365 TEXT default('')," +
                "D_366 TEXT default('')," +
                "D_367 TEXT default('')," +
                "D_368 TEXT default('')," +
                "D_369 TEXT default('')," +
                "D_370 TEXT default('')," +
                "D_371 TEXT default('')," +
                "D_372 TEXT default('')," +
                "D_373 TEXT default('')," +
                "D_374 TEXT default('')," +
                "D_375 TEXT default('')," +
                "D_376 TEXT default('')," +
                "D_377 TEXT default('')," +
                "D_378 TEXT default('')," +
                "D_379 TEXT default('')," +
                "D_380 TEXT default('')," +
                "D_381 TEXT default('')," +
                "D_382 TEXT default('')," +
                "D_383 TEXT default('')," +
                "D_384 TEXT default('')," +
                "D_385 TEXT default('')," +
                "D_386 TEXT default('')," +
                "D_387 TEXT default('')," +
                "D_388 TEXT default('')," +
                "D_389 TEXT default('')," +
                "D_390 TEXT default('')," +
                "D_391 TEXT default('')," +
                "D_392 TEXT default('')," +
                "D_393 TEXT default('')," +
                "D_394 TEXT default('')," +
                "D_395 TEXT default('')," +
                "D_396 TEXT default('')," +
                "D_397 TEXT default('')," +
                "D_398 TEXT default('')," +
                "D_399 TEXT default('')," +
                "D_400 TEXT default('')," +
                "D_401 TEXT default('')," +
                "D_402 TEXT default('')," +
                "D_403 TEXT default('')," +
                "D_404 TEXT default('')," +
                "D_405 TEXT default('')," +
                "D_406 TEXT default('')," +
                "D_407 TEXT default('')," +
                "D_408 TEXT default('')," +
                "D_409 TEXT default('')," +
                "D_410 TEXT default('')," +
                "D_411 TEXT default('')," +
                "D_412 TEXT default('')," +
                "D_413 TEXT default('')," +
                "D_414 TEXT default('')," +
                "D_415 TEXT default('')," +
                "D_416 TEXT default('')," +
                "D_417 TEXT default('')," +
                "D_418 TEXT default('')," +
                "D_419 TEXT default('')," +
                "D_420 TEXT default('')," +
                "D_421 TEXT default('')," +
                "D_422 TEXT default('')," +
                "D_423 TEXT default('')," +
                "D_424 TEXT default('')," +
                "D_425 TEXT default('')," +
                "D_426 TEXT default('')," +
                "D_427 TEXT default('')," +
                "D_428 TEXT default('')," +
                "D_429 TEXT default('')," +
                "D_430 TEXT default('')," +
                "D_431 TEXT default('')," +
                "D_432 TEXT default('')," +
                "D_433 TEXT default('')," +
                "D_434 TEXT default('')," +
                "D_435 TEXT default('')," +
                "D_436 TEXT default('')," +
                "D_437 TEXT default('')," +
                "D_438 TEXT default('')," +
                "D_439 TEXT default('')," +
                "D_440 TEXT default('')," +
                "D_441 TEXT default('')," +
                "D_442 TEXT default('')," +
                "D_443 TEXT default('')," +
                "D_444 TEXT default('')," +
                "D_445 TEXT default('')," +
                "D_446 TEXT default('')," +
                "D_447 TEXT default('')," +
                "D_448 TEXT default('')," +
                "D_449 TEXT default('')," +
                "D_450 TEXT default('')," +
                "D_451 TEXT default('')," +
                "D_452 TEXT default('')," +
                "D_453 TEXT default('')," +
                "D_454 TEXT default('')," +
                "D_455 TEXT default('')," +
                "D_456 TEXT default('')," +
                "D_457 TEXT default('')," +
                "D_458 TEXT default('')," +
                "D_459 TEXT default('')," +
                "D_460 TEXT default('')," +
                "D_461 TEXT default('')," +
                "D_462 TEXT default('')," +
                "D_463 TEXT default('')," +
                "D_464 TEXT default('')," +
                "D_465 TEXT default('')," +
                "D_466 TEXT default('')," +
                "D_467 TEXT default('')," +
                "D_468 TEXT default('')," +
                "D_469 TEXT default('')," +
                "D_470 TEXT default('')," +
                "D_471 TEXT default('')," +
                "D_472 TEXT default('')," +
                "D_473 TEXT default('')," +
                "D_474 TEXT default('')," +
                "D_475 TEXT default('')," +
                "D_476 TEXT default('')," +
                "D_477 TEXT default('')," +
                "D_478 TEXT default('')," +
                "D_479 TEXT default('')," +
                "D_480 TEXT default('')," +
                "D_481 TEXT default('')," +
                "D_482 TEXT default('')," +
                "D_483 TEXT default('')," +
                "D_484 TEXT default('')," +
                "D_485 TEXT default('')," +
                "D_486 TEXT default('')," +
                "D_487 TEXT default('')," +
                "D_488 TEXT default('')," +
                "D_489 TEXT default('')," +
                "D_490 TEXT default('')," +
                "D_491 TEXT default('')," +
                "D_492 TEXT default('')," +
                "D_493 TEXT default('')," +
                "D_494 TEXT default('')," +
                "D_495 TEXT default('')," +
                "D_496 TEXT default('')," +
                "D_497 TEXT default('')," +
                "D_498 TEXT default('')," +
                "D_499 TEXT default('')," +
                "D_500 TEXT default('')," +
                "D_501 TEXT default('')," +
                "D_502 TEXT default('')," +
                "D_503 TEXT default('')," +
                "D_504 TEXT default('')," +
                "D_505 TEXT default('')," +
                "D_506 TEXT default('')," +
                "D_507 TEXT default('')," +
                "D_508 TEXT default('')," +
                "D_509 TEXT default('')," +
                "D_510 TEXT default('')," +
                "D_511 TEXT default('')," +
                "D_512 TEXT default('')," +
                "D_513 TEXT default('')," +
                "D_514 TEXT default('')," +
                "D_515 TEXT default('')," +
                "D_516 TEXT default('')," +
                "D_517 TEXT default('')," +
                "D_518 TEXT default('')," +
                "D_519 TEXT default('')," +
                "D_520 TEXT default('')," +
                "D_521 TEXT default('')," +
                "D_522 TEXT default('')," +
                "D_523 TEXT default('')," +
                "D_524 TEXT default('')," +
                "D_525 TEXT default('')," +
                "D_526 TEXT default('')," +
                "D_527 TEXT default('')," +
                "D_528 TEXT default('')," +
                "D_529 TEXT default('')," +
                "D_530 TEXT default('')," +
                "D_531 TEXT default('')," +
                "D_532 TEXT default('')," +
                "D_533 TEXT default('')," +
                "D_534 TEXT default('')," +
                "D_535 TEXT default('')," +
                "D_536 TEXT default('')," +
                "D_537 TEXT default('')," +
                "D_538 TEXT default('')," +
                "D_539 TEXT default('')," +
                "D_540 TEXT default('')," +
                "D_541 TEXT default('')," +
                "D_542 TEXT default('')," +
                "D_543 TEXT default('')," +
                "D_544 TEXT default('')," +
                "D_545 TEXT default('')," +
                "D_546 TEXT default('')," +
                "D_547 TEXT default('')," +
                "D_548 TEXT default('')," +
                "D_549 TEXT default('')," +
                "D_550 TEXT default('')," +
                "D_551 TEXT default('')," +
                "D_552 TEXT default('')," +
                "D_553 TEXT default('')," +
                "D_554 TEXT default('')," +
                "D_555 TEXT default('')," +
                "D_556 TEXT default('')," +
                "D_557 TEXT default('')," +
                "D_558 TEXT default('')," +
                "D_559 TEXT default('')," +
                "D_560 TEXT default('')," +
                "IMEI TEXT," +
                "IMSI TEXT," +
                "AndroidID TEXT)";

        return CREATE_MCBMS_TABLE;
    }

    private String GA_1ST() {

        String CREATE_MCBMS_TABLE = "CREATE TABLE " + TABLE_GA_1ST + "( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "_1st_001 TEXT," +
                "_1st_002 TEXT," +
                "_1st_003 TEXT," +
                "_1st_004 TEXT," +
                "_1st_005 TEXT," +
                "_1st_006 TEXT," +
                "_1st_007 TEXT," +
                "_1st_008 TEXT," +
                "_1st_009 TEXT," +
                "_1st_010 TEXT," +
                "_1st_011 TEXT," +
                "_1st_012 TEXT," +
                "_1st_013 TEXT," +
                "_1st_014 TEXT," +
                "_1st_015 TEXT," +
                "_1st_016 TEXT," +
                "_1st_017 TEXT," +
                "_1st_018 TEXT," +
                "_1st_019 TEXT," +
                "_1st_020 TEXT," +
                "_1st_021 TEXT," +
                "_1st_022 TEXT," +
                "_1st_023 TEXT," +
                "_1st_024 TEXT," +
                "_1st_025 TEXT," +
                "_1st_026 TEXT," +
                "_1st_027 TEXT," +
                "_1st_028 TEXT," +
                "_1st_029 TEXT," +
                "_1st_030 TEXT," +
                "_1st_031 TEXT," +
                "_1st_032 TEXT," +
                "_1st_033 TEXT," +
                "_1st_034 TEXT," +
                "_1st_035 TEXT," +
                "_1st_036 TEXT," +
                "_1st_037 TEXT," +
                "_1st_038 TEXT," +
                "_1st_039 TEXT," +
                "_1st_040 TEXT," +
                "_1st_041 TEXT," +
                "_1st_042 TEXT," +
                "_1st_043 TEXT," +
                "_1st_044 TEXT," +
                "_1st_045 TEXT," +
                "_1st_046 TEXT," +
                "_1st_047 TEXT," +
                "_1st_048 TEXT," +
                "_1st_049 TEXT," +
                "_1st_050 TEXT," +
                "_1st_051 TEXT," +
                "_1st_052 TEXT," +
                "_1st_053 TEXT," +
                "_1st_054 TEXT," +
                "_1st_055 TEXT," +
                "_1st_056 TEXT," +
                "_1st_057 TEXT," +
                "_1st_058 TEXT," +
                "_1st_059 TEXT," +
                "_1st_060 TEXT," +
                "_1st_061 TEXT," +
                "_1st_062 TEXT," +
                "_1st_063 TEXT," +
                "_1st_064 TEXT," +
                "_1st_065 TEXT," +
                "_1st_066 TEXT," +
                "_1st_067 TEXT," +
                "_1st_068 TEXT," +
                "_1st_069 TEXT," +
                "_1st_070 TEXT," +
                "_1st_071 TEXT," +
                "_1st_072 TEXT," +
                "_1st_073 TEXT," +
                "IMEI TEXT," +
                "IMSI TEXT," +
                "AndroidID TEXT," +
                "M_ID INT )";


        return CREATE_MCBMS_TABLE;

    }

    private String GA_2ND() {

        String CREATE_MCBMS_TABLE = "CREATE TABLE " + TABLE_GA_2ND + "( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "_2nd_001 TEXT," +
                "_2nd_002 TEXT," +
                "_2nd_003 TEXT," +
                "_2nd_004 TEXT," +
                "_2nd_005 TEXT," +
                "_2nd_006 TEXT," +
                "_2nd_007 TEXT," +
                "IMEI TEXT," +
                "IMSI TEXT," +
                "AndroidID TEXT," +
                "M_ID INT )";
        return CREATE_MCBMS_TABLE;
    }

    private String GA_3RD() {

        String CREATE_MCBMS_TABLE = "CREATE TABLE " + TABLE_GA_3RD + "( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "_3rd_001 TEXT," +
                "_3rd_002 TEXT," +
                "_3rd_003 TEXT," +
                "_3rd_004 TEXT," +
                "IMEI TEXT," +
                "IMSI TEXT," +
                "AndroidID TEXT," +
                "M_ID INT )";
        return CREATE_MCBMS_TABLE;
    }

    private String GA_4TH() {

        String CREATE_MCBMS_TABLE = "CREATE TABLE " + TABLE_GA_4TH + "( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "_4th_001 TEXT," +
                "_4th_002 TEXT," +
                "_4th_003 TEXT," +
                "IMEI TEXT," +
                "IMSI TEXT," +
                "AndroidID TEXT," +
                "M_ID INT )";
        return CREATE_MCBMS_TABLE;
    }

    private String GA_5TH() {

        String CREATE_MCBMS_TABLE = "CREATE TABLE " + TABLE_GA_5TH + "( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "_5th_001 TEXT," +
                "_5th_002 TEXT," +
                "_5th_003 TEXT," +
                "_5th_004 TEXT," +
                "_5th_005 TEXT," +
                "_5th_006 TEXT," +
                "_5th_007 TEXT," +
                "_5th_008 TEXT," +
                "_5th_009 TEXT," +
                "_5th_010 TEXT," +
                "_5th_011 TEXT," +
                "_5th_012 TEXT," +
                "_5th_013 TEXT," +
                "_5th_014 TEXT," +
                "_5th_015 TEXT," +
                "_5th_016 TEXT," +
                "_5th_017 TEXT," +
                "_5th_018 TEXT," +
                "_5th_019 TEXT," +
                "_5th_020 TEXT," +
                "_5th_021 TEXT," +
                "_5th_022 TEXT," +
                "_5th_023 TEXT," +
                "_5th_024 TEXT," +
                "_5th_025 TEXT," +
                "_5th_026 TEXT," +
                "IMEI TEXT," +
                "IMSI TEXT," +
                "AndroidID TEXT," +
                "M_ID INT )";
        return CREATE_MCBMS_TABLE;
    }

    private String GA_6TH() {

        String CREATE_MCBMS_TABLE = "CREATE TABLE " + TABLE_GA_6TH + "( _id INTEGER PRIMARY KEY  AUTOINCREMENT," +
                "_6th_001 TEXT," +
                "_6th_002 TEXT," +
                "_6th_003 TEXT," +
                "_6th_004 TEXT," +
                "IMEI TEXT," +
                "IMSI TEXT," +
                "AndroidID TEXT," +
                "M_ID INT )";
        return CREATE_MCBMS_TABLE;
    }

    private String GA_8TH() {

        String CREATE_MCBMS_TABLE = "CREATE TABLE " + TABLE_GA_8TH + "( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "_8th_001 TEXT," +
                "_8th_002 TEXT," +
                "IMEI TEXT," +
                "IMSI TEXT," +
                "AndroidID TEXT," +
                "M_ID INT )";
        return CREATE_MCBMS_TABLE;
    }

    private String GA_9TH() {

        String CREATE_MCBMS_TABLE = "CREATE TABLE " + TABLE_GA_9TH + "( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "_9th_001 TEXT," +
                "_9th_002 TEXT," +
                "_9th_003 TEXT," +
                "_9th_004 TEXT," +
                "_9th_005 TEXT," +
                "_9th_006 TEXT," +
                "_9th_007 TEXT," +
                "_9th_008 TEXT," +
                "_9th_009 TEXT," +
                "_9th_010 TEXT," +
                "_9th_011 TEXT," +
                "_9th_012 TEXT," +
                "_9th_013 TEXT," +
                "IMEI TEXT," +
                "IMSI TEXT," +
                "AndroidID TEXT," +
                "M_ID INT )";
        return CREATE_MCBMS_TABLE;
    }

    private String GA_10TH() {

        String CREATE_MCBMS_TABLE = "CREATE TABLE " + TABLE_GA_10TH + "( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "_10th_001 TEXT," +
                "_10th_002 TEXT," +
                "_10th_003 TEXT," +
                "_10th_004 TEXT," +
                "IMEI TEXT," +
                "IMSI TEXT," +
                "AndroidID TEXT," +
                "M_ID INT )";
        return CREATE_MCBMS_TABLE;
    }

    private String GO_1ST() {

        String CREATE_MCBMS_TABLE = "CREATE TABLE " + TABLE_GO_1st + "( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "o_001 TEXT," +
                "o_002 TEXT," +
                "o_003 TEXT," +
                "IMEI TEXT," +
                "IMSI TEXT," +
                "AndroidID TEXT," +
                "M_ID INT )";
        return CREATE_MCBMS_TABLE;
    }


    private String ImageTable() {

        String CREATE_MCBMS_TABLE = "CREATE TABLE images ( _id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "person_image blob," +
                "house_image blob," +
                "IMEI TEXT," +
                "IMSI TEXT," +
                "AndroidID TEXT," +
                "M_ID INT )";
        return CREATE_MCBMS_TABLE;
    }

    public void UpdateGridData(String MainField, String id, String M_ID, String value) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("update ga_1st set " + MainField + "='" + value + "' where _id=" + id + " and M_ID=" + M_ID);
    }

    public void UpdateImage(ContentValues cv, String id, String AndroidID) {
        SQLiteDatabase db = this.getWritableDatabase();
        int i = db.update("images", cv, " AndroidID='" + AndroidID + "' and  M_ID=" + id, null);
        if (i != 0) {
            Log.i("Update Image", "Success");
        } else {
            Log.i("Update Image", "failed");
        }
        db.close();
    }

    public void UpdateLocation(ContentValues cv, String id, String AndroidID) {
        SQLiteDatabase db = this.getWritableDatabase();
        int i = db.update("mcbms", cv, " AndroidID='" + AndroidID + "' and  _id=" + id, null);
        if (i != 0) {
            Log.i("Update Location", "Success");
        } else {
            Log.i("Update Location", "failed");
        }
        db.close();
    }

    public byte[] ByteImage(String AndroidID, String id, String field) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select " + field + " from images where AndroidID='" + AndroidID + "' and  M_ID=" + id, null);
        if (cursor.moveToFirst()) {

            byte[] byteimage = cursor.getBlob(0);
            return byteimage;
        }
        return null;

    }

    public void DeleteAll() {
        SQLiteDatabase db = this.getWritableDatabase();
        db.execSQL("delete from ga_1st where M_ID in (Select _id from mcbms where D_034 <> 1)");
        db.execSQL("delete from ga_2nd where M_ID in (Select _id from mcbms where D_034 <> 1)");
        db.execSQL("delete from ga_3rd where M_ID in (Select _id from mcbms where D_034 <> 1)");
        db.execSQL("delete from ga_4th where M_ID in (Select _id from mcbms where D_034 <> 1)");
        db.execSQL("delete from ga_5th where M_ID in (Select _id from mcbms where D_034 <> 1)");
        db.execSQL("delete from ga_6th where M_ID in (Select _id from mcbms where D_034 <> 1)");
        db.execSQL("delete from ga_8th where M_ID in (Select _id from mcbms where D_034 <> 1)");
        db.execSQL("delete from ga_9th where M_ID in (Select _id from mcbms where D_034 <> 1)");
        db.execSQL("delete from ga_10th where M_ID in (Select _id from mcbms where D_034 <> 1)");
        db.execSQL("delete from go_1st where M_ID in (Select _id from mcbms where D_034 <> 1)");
        db.execSQL("delete from mcbms where D_034 <> 1");
    }


}
