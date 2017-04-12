package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class register extends Fragment {

    Button btn_save;
    EditText txt_first_name, txt_middle_name, txt_last_name,   txt_id_number;
  MaterialBetterSpinner cbo_barangay;

    public register() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_register, container, false);
        UsersDatabase ud=new UsersDatabase(getActivity());
        ud.SetUserInfo();
        btn_save = (Button) view.findViewById(R.id.btn_save);
        cbo_barangay = (MaterialBetterSpinner) view.findViewById(R.id.cbo_barangay);
        txt_id_number = (EditText) view.findViewById(R.id.txt_id_number);
        txt_last_name = (EditText) view.findViewById(R.id.txt_last_name);
        txt_middle_name = (EditText) view.findViewById(R.id.txt_middle_name);
        txt_first_name = (EditText) view.findViewById(R.id.txt_first_name);
        cbo_barangay.setAdapter(Adapter(R.array.Barangay));
        txt_first_name.setText(Config.usersinfo.first_name);
        txt_middle_name.setText(Config.usersinfo.middle_name);
        txt_last_name.setText(Config.usersinfo.last_name);
        txt_id_number.setText(Config.usersinfo.id_number);
        cbo_barangay.setText(Config.usersinfo.barangay);

        cbo_barangay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Config.Barangay_code = getResources().getStringArray(R.array.Barangay_values)[position];
            }
        });


         btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             UsersDatabase UD=new UsersDatabase(getActivity());
                UD.UpdateUser(new UsersInfo(
                        txt_first_name.getText().toString(),
                        txt_middle_name.getText().toString(),
                        txt_last_name.getText().toString(),
                        txt_id_number.getText().toString(),
                        cbo_barangay.getText().toString()) );
                Config.usersinfo.barangay=cbo_barangay.getText().toString();

                Fragment fragment = null;
                try {
                    fragment = ListofPerson.class.newInstance();
                    //fragment = (Fragment) PictureOfThePlace.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                getActivity().setTitle("List");
                fragmentManager.beginTransaction().replace(R.id.frame, fragment).commit();

            }
        });
        return view;
    }
    public ArrayAdapter<String> Adapter(int arr) {
        ArrayAdapter<String> lungsod_adapter = new ArrayAdapter<String>(this.getContext().getApplicationContext(), R.layout.dropdown_layout, this.getResources().getStringArray(arr));
        return lungsod_adapter;
    }
}
