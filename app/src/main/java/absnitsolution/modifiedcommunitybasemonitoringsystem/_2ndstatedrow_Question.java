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
public class _2ndstatedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    MainDataBaseHandler da;
    MaterialBetterSpinner cbo_2nd_relasyon,cbo_2nd_dahilan_wala ;
    EditText txt_2nd_ibapa_relasyon,txt_2nd_ibapa_dahilan,txt_2nd_pangalan;
    public _2ndstatedrow_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this._key = getArguments().getString("_id");
        View view = inflater.inflate(R.layout.fragment___2ndstatedrow__question, container, false);

        cbo_2nd_relasyon=(MaterialBetterSpinner)view.findViewById(R.id.cbo_2nd_relasyon);
        cbo_2nd_dahilan_wala=(MaterialBetterSpinner)view.findViewById(R.id.cbo_2nd_dahilan_wala);
        txt_2nd_ibapa_relasyon=(EditText)view.findViewById(R.id.txt_2nd_ibapa_relasyon);
        txt_2nd_ibapa_dahilan=(EditText)view.findViewById(R.id.txt_2nd_ibapa_dahilan);
        txt_2nd_pangalan=(EditText)view.findViewById(R.id.txt_2nd_pangalan);
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.set_table("ga_2nd");
        this.cpar.set_key(this._key);
        this.cpar.setEditText(R.id.txt_2nd_pangalan);
        this.cpar.setEditText(R.id.txt_2nd_edad);
        this.cpar.setDropdown(R.id.cbo_2nd_kasarian, R.array._1st_kasarian, "Select One");
        this.cpar.setDropdown(R.id.cbo_2nd_relasyon, R.array._2nd_relasyon, "Select One");
        this.cpar.setEditText(R.id.txt_2nd_ibapa_relasyon);
        this.cpar.setDropdown(R.id.cbo_2nd_dahilan_wala, R.array._2nd_dahilan, "Select One");
        this.cpar.setEditText(R.id.txt_2nd_ibapa_dahilan);

        txt_2nd_pangalan.setSelectAllOnFocus(true);
        cbo_2nd_relasyon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position>5){

                    txt_2nd_ibapa_relasyon.setVisibility(View.VISIBLE);


                }
                else{
                    txt_2nd_ibapa_relasyon.setText("");
                    txt_2nd_ibapa_relasyon.setVisibility(View.INVISIBLE);
                }
            }
        });



        cbo_2nd_dahilan_wala.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position>1){


                    txt_2nd_ibapa_dahilan.setVisibility(View.VISIBLE);


                }
                else{
                    txt_2nd_ibapa_dahilan.setText("");
                    txt_2nd_ibapa_dahilan.setVisibility(View.INVISIBLE);
                }
            }
        });

        return view;

    }

    @Override
    public void onDestroy() {

        da = new MainDataBaseHandler(getActivity());
        this.cpar.putEditText(R.id.txt_2nd_pangalan);
        this.cpar.putEditText(R.id.txt_2nd_edad);
        this.cpar.putDropdown(R.id.cbo_2nd_kasarian);
        this.cpar.putDropdown(R.id.cbo_2nd_relasyon);
        this.cpar.putEditText(R.id.txt_2nd_ibapa_relasyon);
        this.cpar.putDropdown(R.id.cbo_2nd_dahilan_wala);
        this.cpar.putEditText(R.id.txt_2nd_ibapa_dahilan);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "ga_2nd");

        super.onDestroy();

    }
}

