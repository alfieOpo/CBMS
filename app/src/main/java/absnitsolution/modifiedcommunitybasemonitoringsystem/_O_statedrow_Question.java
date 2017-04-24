package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class _O_statedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    EditText txt_o_b_pangalan,txt_o_b_106a,txt_o_b_106b;
    MainDataBaseHandler da;

    public _O_statedrow_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this._key = getArguments().getString("_id");
        View view = inflater.inflate(R.layout.fragment___o_statedrow__question, container, false);
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.set_table("go_1st");
        this.cpar.set_key(this._key);
        this.cpar.setEditText(R.id.txt_o_b_pangalan);
        this.cpar.setEditText(R.id.txt_o_b_106a);
        this.cpar.setEditText(R.id.txt_o_b_106b);
        txt_o_b_pangalan=(EditText)view.findViewById(R.id.txt_o_b_pangalan);
        txt_o_b_106a=(EditText)view.findViewById(R.id.txt_o_b_106a);
        txt_o_b_106b=(EditText)view.findViewById(R.id.txt_o_b_106b);
        txt_o_b_pangalan.setSelectAllOnFocus(true);

        if(!txt_o_b_106a.getText().toString().equals("")){
            try{
                double value=Double.valueOf(txt_o_b_106a.getText().toString());
                txt_o_b_106a.setText(Config.toCurrency(value));
            }catch (Exception xx)
            {
            }
        }
        else{
            txt_o_b_106a.setText("0.00");
        }

        if(!txt_o_b_106b.getText().toString().equals("")){
            try{
                double value=Double.valueOf(txt_o_b_106b.getText().toString());
                txt_o_b_106b.setText(Config.toCurrency(value));
            }catch (Exception xx)
            {
            }
        }

        return view;

    }

    public ArrayAdapter<String> Adapter(String[] items) {
        ArrayAdapter<String> lungsod_adapter = new ArrayAdapter<String>(getActivity().getApplicationContext(), R.layout.dropdown_layout, items);
        return lungsod_adapter;
    }

    @Override
    public void onDestroy() {

        da = new MainDataBaseHandler(getActivity());
        this.cpar.putEditText(R.id.txt_o_b_pangalan);
        this.cpar.putEditText(R.id.txt_o_b_106a);
        this.cpar.putEditText(R.id.txt_o_b_106b);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "go_1st");
        super.onDestroy();
    }
}

