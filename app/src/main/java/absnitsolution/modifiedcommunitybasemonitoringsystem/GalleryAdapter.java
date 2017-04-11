package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CursorAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

public class GalleryAdapter extends CursorAdapter {
    ImageView personimage, houseimage;
    TextView lbl_person_name;
    TextView lbl_address;

    LinearLayout layout;
    Random r;

    public GalleryAdapter(Context context, Cursor cursor) {
        super(context, cursor, 0);
    }

    @Override
    public View newView(Context context, Cursor cursor, ViewGroup parent) {
        return LayoutInflater.from(context).inflate(R.layout.activity_gallery_adapter, parent, false);
    }

    @Override
    public void bindView(View view, Context context, Cursor cursor) {

        personimage = (ImageView) view.findViewById(R.id.personimage);
        houseimage = (ImageView) view.findViewById(R.id.houseimage);
        lbl_address = (TextView) view.findViewById(R.id.lbl_address);
        lbl_person_name = (TextView) view.findViewById(R.id.lbl_person_name);
        layout = (LinearLayout) view.findViewById(R.id.layout);
        try {
            layout.setBackgroundColor(Color.rgb(r.nextInt(256), r.nextInt(256), r.nextInt(256)));
        } catch (Exception xx) {
        }
        String lalawigan = cursor.getString(cursor.getColumnIndexOrThrow("D_002"));
        String lungsod_bayan = cursor.getString(cursor.getColumnIndexOrThrow("D_003"));
        String barangay = cursor.getString(cursor.getColumnIndexOrThrow("D_004"));
        lbl_person_name.setText(cursor.getString(cursor.getColumnIndexOrThrow("D_001")));
        lbl_address.setText(lalawigan + " " + lungsod_bayan + " " + barangay);
        personimage.setImageBitmap(Image("person_image", cursor));
        houseimage.setImageBitmap(Image("house_image", cursor));
    }

    private Bitmap Image(String imagename, Cursor cursor) {
        byte[] byteArray = cursor.getBlob(cursor.getColumnIndexOrThrow(imagename));
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        return bmp;
    }
}
