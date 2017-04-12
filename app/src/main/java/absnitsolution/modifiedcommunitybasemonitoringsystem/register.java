package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    EditText txt_first_name, txt_middle_name, txt_last_name,   txt_id_number, txt_confirmpassword;
  MaterialBetterSpinner cbo_barangay;

    public register() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_register, container, false);

        btn_save = (Button) view.findViewById(R.id.btn_save);
        txt_confirmpassword = (EditText) view.findViewById(R.id.txt_confirmpassword);
        cbo_barangay = (MaterialBetterSpinner) view.findViewById(R.id.cbo_barangay);
        txt_id_number = (EditText) view.findViewById(R.id.txt_id_number);
        txt_last_name = (EditText) view.findViewById(R.id.txt_last_name);
        txt_middle_name = (EditText) view.findViewById(R.id.txt_middle_name);
        txt_first_name = (EditText) view.findViewById(R.id.txt_first_name);


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
            }
        });
        return view;
    }

}
