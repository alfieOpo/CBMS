package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.app.Activity;
import android.app.Dialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

/**
 * Created by Arlene on 24/03/2017.
 */

public class EditDeleteDiaglog extends Dialog {
    Activity activity;
    ImageView img;
    Bitmap _image;

    public EditDeleteDiaglog(Activity a, Bitmap image) {
        super(a);
        activity = a;
        _image = null;
        _image = image;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.popupinformationdialog);
        img = (ImageView) findViewById(R.id.imageView7);
        img.setImageBitmap(null);
        img.setImageDrawable(null);
        img.setImageBitmap(_image);
    }
}
