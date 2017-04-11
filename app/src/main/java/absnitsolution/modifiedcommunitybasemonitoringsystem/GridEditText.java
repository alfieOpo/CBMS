package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.TextView;

public class GridEditText extends CursorAdapter {
    TextView textView4;
    String _display_member;

    public GridEditText(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    public void DisplayMember(String __display_key) {
        this._display_member = __display_key;
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {


        final Cursor c = cursor;

        textView4 = (TextView) view.findViewById(R.id.textView4);

        String text = cursor.getString(cursor.getColumnIndex("_id"));
        String aa = this._display_member;
        String name = cursor.getString(cursor.getColumnIndex(this._display_member));
        if (name.equals("")) {
            textView4.setText(text);
        } else {
            textView4.setText(name);
        }

        /*textView4.setTag(cursor.getString(cursor.getColumnIndexOrThrow("_id")));
        try{
            textView4.setText(cursor.getString(cursor.getColumnIndexOrThrow("_1st_001")));
        }
        catch (Exception xx){
            textView4.setText(cursor.getString(cursor.getColumnIndexOrThrow("_id")));
        }*/

    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.activity_grid_edit_text, parent, false);

        return view;


    }
}
