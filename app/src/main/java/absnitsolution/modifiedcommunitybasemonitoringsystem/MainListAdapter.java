package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MainListAdapter extends CursorAdapter {
    ImageView image;
    TextView lbl_person_name, lbl_address, lbl_date, lbl_id;

    public MainListAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    // The newView method is used to inflate a new view and return it,
    // you don't bind any data to the view at this point.
    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.mainlist, parent, false);
    }

    @Override
    public void bindView(View CustomView, Context context, Cursor cursor) {
        // Find fields to populate in inflated template

        int count = cursor.getCount();
        image = (ImageView) CustomView.findViewById(R.id.img);
        lbl_person_name = (TextView) CustomView.findViewById(R.id.lbl_person_name);
        lbl_id = (TextView) CustomView.findViewById(R.id.lbl_id);
        lbl_address = (TextView) CustomView.findViewById(R.id.lbl_address);
        lbl_date = (TextView) CustomView.findViewById(R.id.lbl_date);

        lbl_person_name.setText(cursor.getString(cursor.getColumnIndexOrThrow("D_001")));
        String lalawigan = cursor.getString(cursor.getColumnIndexOrThrow("D_002"));
        String lungsod_bayan = cursor.getString(cursor.getColumnIndexOrThrow("D_003"));
        String barangay = cursor.getString(cursor.getColumnIndexOrThrow("D_004"));
        lbl_date.setText(cursor.getString(cursor.getColumnIndexOrThrow("D_009")));
        lbl_address.setText(lalawigan + " " + lungsod_bayan + " " + barangay);
        lbl_id.setText(cursor.getString(cursor.getColumnIndexOrThrow("_id")));
        try {

            byte[] byteArray = cursor.getBlob(cursor.getColumnIndexOrThrow("person_image"));

            Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            image.setImageBitmap(bmp);
        } catch (Exception xx) {


        }
    }


}
