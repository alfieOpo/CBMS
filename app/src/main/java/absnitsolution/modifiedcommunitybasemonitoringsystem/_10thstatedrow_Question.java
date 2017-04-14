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
public class _10thstatedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    MainDataBaseHandler da;
    EditText txt_iba_pa;
    MaterialBetterSpinner cbo_10th_77;
    public _10thstatedrow_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this._key = getArguments().getString("_id");
        View view = inflater.inflate(R.layout.fragment___10thstatedrow__question, container, false);
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.set_table("ga_10th");
        this.cpar.set_key(this._key);
        this.cpar.setEditText(R.id.txt_10th_74);
        this.cpar.setEditText(R.id.txt_10th_76);

        cbo_10th_77=(MaterialBetterSpinner)view.findViewById(R.id.cbo_10th_77);
        txt_iba_pa=(EditText)view.findViewById(R.id.txt_iba_pa);

        this.cpar.setDropdown(R.id.cbo_a_10th_75, R.array._1st_kasarian, "Select One");
        this.cpar.setDropdown(R.id.cbo_10th_77, R.array._10th_sanhingpagkamatay, "Select One");
this.cpar.setEditText(R.id.txt_iba_pa);
        if(cbo_10th_77.getText().toString().equals("Iba pa, itala")){
            txt_iba_pa.setVisibility(View.VISIBLE);
        }
        else{
            txt_iba_pa.setText("");
            txt_iba_pa.setVisibility(View.INVISIBLE);
        }
        cbo_10th_77.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==8){
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
        this.cpar.putEditText(R.id.txt_10th_74);
        this.cpar.putDropdown(R.id.cbo_a_10th_75);
        this.cpar.putEditText(R.id.txt_10th_76);
        this.cpar.putDropdown(R.id.cbo_10th_77);
        this.cpar.putEditText(R.id.txt_iba_pa);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "ga_10th");
        super.onDestroy();
    }
}

