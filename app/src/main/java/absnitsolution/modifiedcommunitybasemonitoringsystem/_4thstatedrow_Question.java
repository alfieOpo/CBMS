package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class _4thstatedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    EditText txt_4th_pangalan,txt_4th_ibapa_dahilan;
    MainDataBaseHandler da;
    MaterialBetterSpinner cbo_4th_dahilan;
    public _4thstatedrow_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this._key = getArguments().getString("_id");
        View view = inflater.inflate(R.layout.fragment___4thstatedrow__question, container, false);
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.set_table("ga_4th");
        this.cpar.set_key(this._key);
        this.cpar.setEditText(R.id.txt_4th_pangalan);
        this.cpar.setDropdown(R.id.cbo_4th_dahilan, R.array._4th_soloparent, "Select One");
        this.cpar.setEditText(R.id.txt_4th_ibapa_dahilan);
        txt_4th_pangalan=(EditText)view.findViewById(R.id.txt_4th_pangalan);
        txt_4th_ibapa_dahilan=(EditText)view.findViewById(R.id.txt_4th_ibapa_dahilan);
        cbo_4th_dahilan =(MaterialBetterSpinner)view.findViewById(R.id.cbo_4th_dahilan);
        txt_4th_pangalan.setSelectAllOnFocus(true);


        if(cbo_4th_dahilan.getText().toString().equals("Iba pa, Itala")){
            txt_4th_ibapa_dahilan.setVisibility(View.VISIBLE);
        }
        else{
            txt_4th_ibapa_dahilan.setText("");
            txt_4th_ibapa_dahilan.setVisibility(View.INVISIBLE);
        }
        cbo_4th_dahilan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 8){

                    txt_4th_ibapa_dahilan.setVisibility(View.VISIBLE);
                }
                else{
                    txt_4th_ibapa_dahilan.setText("");
                    txt_4th_ibapa_dahilan.setVisibility(View.INVISIBLE);
                }
            }
        });
        return view;

    }


    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity());
        this.cpar.putEditText(R.id.txt_4th_pangalan);
        this.cpar.putDropdown(R.id.cbo_4th_dahilan);
        this.cpar.putEditText(R.id.txt_4th_ibapa_dahilan);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "ga_4th");
        super.onDestroy();
    }
}

