package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.app.Activity;
import android.app.TimePickerDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TimePicker;

import java.io.ByteArrayOutputStream;
import java.text.DateFormat;
import java.util.Calendar;


/**
 * A simple {@link Fragment} subclass.
 */
public class PictureOfThePlace extends Fragment {

    private static final int CAMERA_REQUEST = 1888;
    Button btn_save_capture;
    ImageView img_Fromcam;
    ImageButton btn_back, btn_next;
    c_params cpar;
    MainDataBaseHandler da;
    EditText txt_oras_nag_simula, txt_puna;
    DateFormat formatDateTime = DateFormat.getDateTimeInstance();
    Calendar dateTime = Calendar.getInstance();
    TimePickerDialog.OnTimeSetListener t = new TimePickerDialog.OnTimeSetListener() {
        @Override
        public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
            dateTime.set(Calendar.HOUR_OF_DAY, hourOfDay);
            dateTime.set(Calendar.MINUTE, minute);
            txt_oras_nag_simula.setText(formatDateTime.format(dateTime.getTime()));
        }
    };


    public PictureOfThePlace() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_picture_of_the_place, container, false);
        this.cpar = new c_params(Config.ID, container, view);
        btn_save_capture = (Button) view.findViewById(R.id.btn_save_capture);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        txt_oras_nag_simula = (EditText) view.findViewById(R.id.txt_oras_nag_simula);
        txt_puna = (EditText) view.findViewById(R.id.txt_puna);
        this.cpar.setEditText(R.id.txt_oras_nag_simula);
        this.cpar.setEditText(R.id.txt_puna);
        img_Fromcam = (ImageView) view.findViewById(R.id.img_Fromcam);
        try {
            LoadImage();
        } catch (Exception xx) {
        }
        btn_save_capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _V_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame,new _V_Question()).commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
if(Config.CallbackIsCheck){
    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
    fragmentManager.beginTransaction().replace(R.id.frame, new New()).commit();
}
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, new switcher()).commit();
            }
        });
        if (txt_oras_nag_simula.getText().toString().equals("")) {
            txt_oras_nag_simula.setOnTouchListener(new View.OnTouchListener() {
                @Override
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    updateTime();
                    return false;
                }
            });
            updateTime();
        }
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            img_Fromcam.setImageBitmap(photo);

            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            photo.compress(Bitmap.CompressFormat.PNG, 100, stream);
            byte[] byteArray = stream.toByteArray();
            MainDataBaseHandler da = new MainDataBaseHandler(getActivity());
            ContentValues cv = new ContentValues();
            cv.put("house_image", byteArray);
            String AndroidID = Settings.Secure.getString(getActivity().getContentResolver(), Settings.Secure.ANDROID_ID);
            da.UpdateImage(cv, Config.ID, AndroidID);
        }
    }

    private void LoadImage() {

        try {
            MainDataBaseHandler da = new MainDataBaseHandler(getActivity());
            String AndroidID = Settings.Secure.getString(getActivity().getContentResolver(), Settings.Secure.ANDROID_ID);
            byte[] byteArray = da.ByteImage(AndroidID, Config.ID, "house_image");
            Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
            img_Fromcam.setImageBitmap(bmp);

        } catch (Exception xx) {
        }
    }

    private void updateTime() {
        TimePickerDialog time = new TimePickerDialog(getContext(), t, dateTime.get(Calendar.HOUR_OF_DAY), dateTime.get(Calendar.MINUTE), false);
        time.setTitle("Oras Natapos");
        time.show();
    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity());

        this.cpar.putEditText(R.id.txt_oras_nag_simula);
        this.cpar.putEditText(R.id.txt_puna);
        da.c_Update(cpar);
        super.onDestroy();
    }
}
