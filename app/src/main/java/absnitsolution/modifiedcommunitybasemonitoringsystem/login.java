package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class login extends Fragment {
    Button btn_save;
    EditText txt_username, txt_password;

    UsersDatabase UD;

    public login() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        UD = new UsersDatabase(getActivity().getApplicationContext());
        btn_save = (Button) view.findViewById(R.id.btn_save);
        txt_password = (EditText) view.findViewById(R.id.txt_password);
        txt_username = (EditText) view.findViewById(R.id.txt_username);


        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (UD.isRegisterd(txt_username.getText().toString(), txt_password.getText().toString())) {

                    Intent startmainactivity = new Intent(getActivity(), MainActivity.class);
                    startActivity(startmainactivity);

                } else {
                    Toast.makeText(getActivity(), "Invalid User!", Toast.LENGTH_SHORT).show();
                }
            }
        });


        return view;
    }

}
