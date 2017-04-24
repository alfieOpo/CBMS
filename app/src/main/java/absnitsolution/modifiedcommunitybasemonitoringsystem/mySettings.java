package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
public class mySettings extends Fragment {
    EditText txt_local_address, txt_internet_address;
    Button btn_save;
    DataBaseHandler db;

    public mySettings() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_settings, container, false);
        db = new DataBaseHandler(getActivity().getApplicationContext());
        if (db.getConnectionCOUNT() < 1) {
            db.addConnection(new ServerConnection("192.168.57.1", "stamariabulacan.gov.ph"));
        }
        txt_internet_address = (EditText) view.findViewById(R.id.txt_internet_address);
        txt_local_address = (EditText) view.findViewById(R.id.txt_local_address);
        btn_save = (Button) view.findViewById(R.id.btn_save);
        DisPlayConnection();
        btn_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.updateCONNECTION(new ServerConnection(txt_local_address.getText().toString(), txt_internet_address.getText().toString()));
                DisPlayConnection();
            }
        });
        return view;
    }

    private void DisPlayConnection() {

        ServerConnection Sc = db.getCONNECTIONNAME(1);
        txt_internet_address.setText(Sc.get_internetaddress());
        txt_local_address.setText(Sc.get_localaddress());

    }


}
