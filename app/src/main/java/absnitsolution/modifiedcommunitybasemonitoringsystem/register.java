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


/**
 * A simple {@link Fragment} subclass.
 */
public class register extends Fragment {

    Button btn_save;
    EditText txt_first_name, txt_middle_name, txt_last_name, txt_username, txt_password, txt_confirmpassword;
    TextView lbl_validation;

    public register() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_register, container, false);

        btn_save = (Button) view.findViewById(R.id.btn_save);
        txt_confirmpassword = (EditText) view.findViewById(R.id.txt_confirmpassword);
        txt_password = (EditText) view.findViewById(R.id.txt_password);
        txt_username = (EditText) view.findViewById(R.id.txt_username);
        txt_last_name = (EditText) view.findViewById(R.id.txt_last_name);
        txt_middle_name = (EditText) view.findViewById(R.id.txt_middle_name);
        txt_first_name = (EditText) view.findViewById(R.id.txt_first_name);


        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txt_confirmpassword.getText().toString().equals(txt_password.getText().toString())) {
                    Toast.makeText(getActivity(), "Password not Match", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getActivity(), "Password Match", Toast.LENGTH_SHORT).show();
                    UsersDatabase UD = new UsersDatabase(getActivity().getApplicationContext());
                    UD.addUser(new UsersInfo(txt_first_name.getText().toString(),
                            txt_middle_name.getText().toString(),
                            txt_last_name.getText().toString(),
                            txt_password.getText().toString(),
                            txt_username.getText().toString(), "1"));
                    Intent i = getActivity().getBaseContext().getPackageManager()
                            .getLaunchIntentForPackage(getActivity().getBaseContext().getPackageName());
                    i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(i);


                }
            }
        });
        return view;
    }

}
