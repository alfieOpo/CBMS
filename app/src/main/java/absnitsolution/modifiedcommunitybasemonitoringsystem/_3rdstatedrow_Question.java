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
public class _3rdstatedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    MainDataBaseHandler da;
    MaterialBetterSpinner cbo_3rd_relasyon;
    EditText txt_iba_pa,txt_3rd_pangalan;
    public _3rdstatedrow_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this._key = getArguments().getString("_id");
        View view = inflater.inflate(R.layout.fragment___3rdstatedrow__question, container, false);
        cbo_3rd_relasyon=(MaterialBetterSpinner)view.findViewById(R.id.cbo_3rd_relasyon);
        txt_iba_pa=(EditText)view.findViewById(R.id.txt_iba_pa);
        txt_3rd_pangalan=(EditText)view.findViewById(R.id.txt_3rd_pangalan);
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.set_table("ga_3rd");
        this.cpar.set_key(this._key);
        this.cpar.setEditText(R.id.txt_3rd_pangalan);
        this.cpar.setDropdown(R.id.cbo_3rd_relasyon, R.array._1st_relasyon, "Select One");
        this.cpar.setEditText(R.id.txt_3rd_saangbansa);
        this.cpar.setEditText(R.id.txt_3rd_hanapbuhay);
        this.cpar.setEditText(R.id.txt_iba_pa);
        txt_3rd_pangalan.setSelectAllOnFocus(true);



        if(cbo_3rd_relasyon.getText().toString().equals("Iba pang hindi kamag-anak, itala")){
            txt_iba_pa.setVisibility(View.VISIBLE);
        }
        else{
            txt_iba_pa.setText("");
            txt_iba_pa.setVisibility(View.INVISIBLE);
        }
        cbo_3rd_relasyon.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position == 8||position == 10){

                    txt_iba_pa.setVisibility(View.VISIBLE);
                }
                else{
                    txt_iba_pa.setText("");
                    txt_iba_pa.setVisibility(View.INVISIBLE);
                }
            }
        });
        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity());
        this.cpar.putEditText(R.id.txt_3rd_pangalan);
        this.cpar.putDropdown(R.id.cbo_3rd_relasyon);
        this.cpar.putEditText(R.id.txt_3rd_saangbansa);
        this.cpar.putEditText(R.id.txt_3rd_hanapbuhay);
        this.cpar.putEditText(R.id.txt_iba_pa);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "ga_3rd");
        super.onDestroy();
    }
}

