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
public class _6thstatedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    MainDataBaseHandler da;
MaterialBetterSpinner cbo_6th_mayseniorid,cbo_6th_mayphilhealth;
    EditText txt_6th_saannagagamitangid,txt_pangalan_ng_senior_citizen;
    public _6thstatedrow_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this._key = getArguments().getString("_id");
        View view = inflater.inflate(R.layout.fragment___6thstatedrow__question, container, false);
        this.cpar = new c_params(Config.ID, container, view);
        cbo_6th_mayseniorid=(MaterialBetterSpinner)view.findViewById(R.id.cbo_6th_mayseniorid);
        cbo_6th_mayphilhealth=(MaterialBetterSpinner)view.findViewById(R.id.cbo_6th_mayphilhealth);
        txt_6th_saannagagamitangid=(EditText)view.findViewById(R.id.txt_6th_saannagagamitangid);
        txt_pangalan_ng_senior_citizen=(EditText)view.findViewById(R.id.txt_pangalan_ng_senior_citizen);
        this.cpar.set_table("ga_6th");
        this.cpar.set_key(this._key);
        this.cpar.setDropdown(R.id.cbo_6th_mayseniorid, R.array.meron_wala, "Mayroon");
        this.cpar.setEditText(R.id.txt_6th_saannagagamitangid);
        this.cpar.setEditText(R.id.txt_pangalan_ng_senior_citizen);
        this.cpar.setDropdown(R.id.cbo_6th_mayphilhealth, R.array.meron_wala, "Mayroon");

        if(cbo_6th_mayphilhealth.getText().toString().equals("")){
            cbo_6th_mayphilhealth.setText("Mayroon");
        }
        txt_pangalan_ng_senior_citizen.setSelectAllOnFocus(true);



        if(cbo_6th_mayseniorid.getText().toString().equals("Mayroon")){
            txt_6th_saannagagamitangid.setVisibility(View.VISIBLE);
        }
        else{
            txt_6th_saannagagamitangid.setText("");
            txt_6th_saannagagamitangid.setVisibility(View.INVISIBLE);
        }
        cbo_6th_mayseniorid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if(position==1){
                    txt_6th_saannagagamitangid.setText("");
                    txt_6th_saannagagamitangid.setVisibility(View.INVISIBLE);
                }
                else{


                    txt_6th_saannagagamitangid.setVisibility(View.VISIBLE);
                }
            }
        });

        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity());
        this.cpar.putDropdown(R.id.cbo_6th_mayseniorid);
        this.cpar.putEditText(R.id.txt_6th_saannagagamitangid);
        this.cpar.putDropdown(R.id.cbo_6th_mayphilhealth);
        this.cpar.putEditText(R.id.txt_pangalan_ng_senior_citizen);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "ga_6th");
        super.onDestroy();
    }
}

