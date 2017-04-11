package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.app.Activity;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;

/**
 * Created by Arlene on 09/04/2017.
 */

public class myembrodialog extends DialogFragment implements Button.OnClickListener {
    Activity ctx;
    MainDataBaseHandler da;
    LinearLayout layout;
    String MainField = "";
    Button btn_save;


    public myembrodialog(Activity act, String mainField) {

        ctx = act;
        this.MainField = mainField;
    }

    /* public myembrodialog(Activity act,String mainField) {
        super(act);
        ctx=act;
        this.MainField=mainField;
    }*/

    /*@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.myembrodialog);
        layout=(LinearLayout)findViewById(R.id.layout);
        final Dialog dialog = new Dialog(ctx);
        btn_save=(Button)findViewById(R.id.btn_save);
        String AndroidID= Settings.Secure.getString(ctx.getContentResolver(), Settings.Secure.ANDROID_ID);

        da=new MainDataBaseHandler(ctx);
        Cursor cursor=da.getMyembroList(Config.ID,AndroidID,MainField);
        cursor.moveToFirst();
        for(int i=0;i<cursor.getCount();i++){
            try{
                CheckBox chk=new CheckBox(ctx);
                chk.setTag(cursor.getString(0));
                chk.setText(cursor.getString(1));
                if(cursor.getString(2).equals("1")){
                    chk.setChecked(true);
                }
                layout.addView(chk);
                cursor.moveToNext();}catch (Exception xx){}
        }
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               for(int i=0;i<layout.getChildCount();i++){
                    View childAt=layout.getChildAt(i);
                    da.UpdateGridData(MainField,childAt.getTag().toString(),Config.ID);

               }
                dismiss();
            }
        });

    }
*/

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.myembrodialog, container);

        getDialog().setTitle("Hello");

        // Show soft keyboard automatically

        getDialog().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_VISIBLE);
        btn_save.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        //update dito
        VButton_DialogListener activity = (VButton_DialogListener) getActivity();
        activity.onFinishEditDialog("philhealth", "1");
        //close dito
    }

    public interface VButton_DialogListener {
        void onFinishEditDialog(String from, String inputText);
    }


}
