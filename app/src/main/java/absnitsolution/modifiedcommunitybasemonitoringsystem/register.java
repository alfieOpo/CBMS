package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.content.ContentValues;
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
    MainDataBaseHandler da;
    c_params cpar;
    public register() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_register, container, false);

        da=new MainDataBaseHandler(getActivity());
        da.getUserInfo();

        this.cpar = new c_params(Config.ID, container, view);
        btn_save = (Button) view.findViewById(R.id.btn_save);
        this.cpar.set_table("users");
        this.cpar.set_key("1");
        cbo_barangay=(MaterialBetterSpinner) view.findViewById(R.id.cbo_barangay);
        this.cpar.setEditText(R.id.txt_id_number);
        this.cpar.setEditText(R.id.txt_last_name);
        this.cpar.setEditText(R.id.txt_first_name);
        this.cpar.setEditText(R.id.txt_middle_name);
        this.cpar.setDropdown(R.id.cbo_barangay,R.array.Barangay,"");



          cbo_barangay.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Config.Barangay_code = getResources().getStringArray(R.array.Barangay_values)[position];
            }
        });


         btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                cpar.putEditText(R.id.txt_middle_name);
                cpar.putEditText(R.id.txt_first_name);
                cpar.putEditText(R.id.txt_last_name);
                cpar.putEditText(R.id.txt_id_number);
                cpar.putDropdown(R.id.cbo_barangay);
                cpar.set_key("1");
                da.c_Update(cpar,"users");
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame, new switcher()).commit();

            }
        });
        return view;
    }
    public ArrayAdapter<String> Adapter(int arr) {
        ArrayAdapter<String> lungsod_adapter = new ArrayAdapter<String>(this.getContext().getApplicationContext(), R.layout.dropdown_layout, this.getResources().getStringArray(arr));
        return lungsod_adapter;
    }
}
