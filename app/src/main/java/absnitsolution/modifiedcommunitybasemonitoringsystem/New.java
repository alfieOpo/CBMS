package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.ContentValues;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.io.ByteArrayOutputStream;

/**
 * A simple {@link Fragment} subclass.
 */
public class New extends Fragment {
    private static final int CAMERA_REQUEST = 1888;
    ImageView img_Fromcam;
    Button btn_save_capture;
    TextView tv_latitude;
    TextView tv_longitude;
    EditText txt_name;
    MainDataBaseHandler da;
    EditText txt_f, txt_m, txt_l;
    ImageButton btn_back, btn_next;
    c_params cpar;
    MaterialBetterSpinner cbo_lalawigan, cbo_purok_sitio, cbo_barangay;
    EditText txt_purok_sitio;
    private ProgressDialog progressDialog;

    public New() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new, container, false);
        Config.CallbackIsCheck = false;

        txt_f = (EditText) view.findViewById(R.id.txt_first_name);
        txt_m = (EditText) view.findViewById(R.id.txt_middle_name);
        txt_l = (EditText) view.findViewById(R.id.txt_last_name);
        txt_name = (EditText) view.findViewById(R.id.txt_name);

        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        tv_latitude = (TextView) view.findViewById(R.id.tv_latitude);
        tv_longitude = (TextView) view.findViewById(R.id.tv_longitude);
        btn_save_capture = (Button) view.findViewById(R.id.btn_save_capture);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);

        img_Fromcam = (ImageView) view.findViewById(R.id.img_Fromcam);
        cbo_barangay = (MaterialBetterSpinner) view.findViewById(R.id.cbo_barangay);
        cbo_purok_sitio = (MaterialBetterSpinner) view.findViewById(R.id.cbo_purok_sitio);


        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.setDropdown(R.id.cbo_barangay, R.array.Barangay, "Select One");
        this.cpar.setDropdown(R.id.cbo_lungsod_bayan, R.array.lungsod_bayan, "Santa Maria");
        this.cpar.setDropdown(R.id.cbo_lalawigan, R.array.lalawigan, "Bulacan");
        try {
            LoadSitio(cbo_barangay.getText().toString());
        } catch (Exception xx) {
        }
        this.cpar.setTextView(R.id.tv_latitude);
        this.cpar.setTextView(R.id.tv_longitude);
        this.cpar.setEditText(R.id.txt_name);
        this.cpar.setEditText(R.id.txt_first_name);
        this.cpar.setEditText(R.id.txt_middle_name);
        this.cpar.setEditText(R.id.txt_last_name);


        cbo_barangay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Config.Barangay_code = getResources().getStringArray(R.array.Barangay_values)[position];
                try {
                    LoadSitio(cbo_barangay.getText().toString());
                } catch (Exception xx) {
                }
            }
        });
        if (!cbo_barangay.getText().toString().equals("Select One")) {
            cbo_purok_sitio.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Config.Sitio = String.valueOf(position);
                }
            });
        }
        LoadImage();

        btn_save_capture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    if (!txt_f.getText().toString().equals("")) {
                        Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                        startActivityForResult(cameraIntent, CAMERA_REQUEST);
                    }


                } catch (Exception xx) {
                }
            }
        });


        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Fragment fragment = null;
                try {
                    fragment = _A_Question.class.newInstance();
                    //fragment = (Fragment) PictureOfThePlace.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "A. PAGKAKAKILANLAN").commit();

            }
        });

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    tv_latitude.setText(Config.Latitude);
                    tv_longitude.setText(Config.Longitude);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        th.start();
        return view;
    }

    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            img_Fromcam.setImageBitmap(photo);

            ByteArrayOutputStream stream = new ByteArrayOutputStream();
            photo.compress(Bitmap.CompressFormat.JPEG, 100, stream);
            byte[] byteArray = stream.toByteArray();
            MainDataBaseHandler da = new MainDataBaseHandler(getActivity());
            String AndroidID = Settings.Secure.getString(getActivity().getContentResolver(), Settings.Secure.ANDROID_ID);
            ContentValues cv = new ContentValues();
            cv.put("person_image", byteArray);
            da.UpdateImage(cv, Config.ID, AndroidID);
        }
    }

    private void LoadImage() {
        MainDataBaseHandler da = new MainDataBaseHandler(getActivity());
        String AndroidID = Settings.Secure.getString(getActivity().getContentResolver(), Settings.Secure.ANDROID_ID);
        try {
            byte[] byteArray = da.ByteImage(AndroidID, Config.ID, "person_image");
            Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);

            img_Fromcam.setImageBitmap(bmp);
        } catch (Exception xx) {
        }

    }

    @Override
    public void onDestroy() {

        da = new MainDataBaseHandler(getActivity().getApplicationContext());

        cpar.set_key(Config.ID);
        txt_name.setText(txt_f.getText().toString() + " " + txt_m.getText().toString() + " " + txt_l.getText().toString());
        cpar.putEditText(R.id.txt_name);
        cpar.putEditText(R.id.cbo_purok_sitio);
        cpar.putDropdown(R.id.cbo_barangay);
        cpar.putDropdown(R.id.cbo_lungsod_bayan);
        cpar.putDropdown(R.id.cbo_lalawigan);
        cpar.putTextView(R.id.tv_latitude);
        cpar.putTextView(R.id.tv_longitude);
        cpar.putEditText(R.id.txt_first_name);
        cpar.putEditText(R.id.txt_middle_name);
        cpar.putEditText(R.id.txt_last_name);
        cpar.add("latitude", Config.Latitude);
        cpar.add("longitude", Config.Longitude);

        da.c_Update(cpar);
        super.onDestroy();
    }

    private void LoadSitio(String barangayname) {
        try {
            switch (barangayname) {
                case "Bagbaguin":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Bagbaguin, "Select One");
                    break;
                case "Balasing":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Balasing, "Select One");
                    break;
                case "Buenavista":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Buenavista, "Select One");
                    break;
                case "Bulac":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Bulac, "Select One");
                    break;
                case "Camangyanan":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Camangyanan, "Select One");
                    break;
                case "Catmon":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Catmon, "Select One");
                    break;
                case "Cay Pombo":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Caypombo, "Select One");
                    break;
                case "Caysio":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Caysio, "Select One");
                    break;
                case "Guyong":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Guyong, "Select One");
                    break;
                case "Lalakhan":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Lalakhan, "Select One");
                    break;
                case "Mag-asawang Sapa":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Mag_asawang_Sapa, "Select One");
                    break;
                case "Mahabang Parang":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Mahabang_Parang, "Select One");
                    break;
                case "Manggahan":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Manggahan, "Select One");
                    break;
                case "Parada":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Parada, "Select One");
                    break;
                case "Poblacion":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Poblacion, "Select One");
                    break;
                case "Pulong Buhangin":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Pulong_Buhangin, "Select One");
                    break;
                case "San Gabriel":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.San_Gabriel, "Select One");
                    break;
                case "San Jose Patag":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.San_Jose_Patag, "Select One");
                    break;
                case "San Vicente":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.San_Vicente, "Select One");
                    break;
                case "Sta Clara":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Sta_Clara, "Select One");
                    break;
                case "Sta Cruz":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Sta_Cruz, "Select One");
                    break;
                case "Silangan":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Silangan, "Select One");
                    break;
                case "Sto Tomas":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Sto_Tomas, "Select One");
                    break;
                case "Tumana":
                    cpar.setDropdown(R.id.cbo_purok_sitio, R.array.Tumana, "Select One");
                    break;
            }
        } catch (Exception xx) {

        }
    }

}
