package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class _8thstatedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    MainDataBaseHandler da;
EditText  txt_8th_63;
    MaterialBetterSpinner cbo_8_month,cbo_8_year;

    //
    public _8thstatedrow_Question() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this._key = getArguments().getString("_id");
        View view = inflater.inflate(R.layout.fragment___8thstatedrow__question, container, false);
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.set_table("ga_8th");
        this.cpar.set_key(this._key);
        this.cpar.setEditText(R.id.txt_8th_63);
        this.cpar.setEditText(R.id.txt_8th_64);
        this.cpar.setDropdown(R.id.cbo_8_month,R.array.month,"N/A");
        this.cpar.setDropdown(R.id.cbo_8_year,R.array.year,"N/A");
        txt_8th_63=(EditText)view.findViewById(R.id.txt_8th_63);
        txt_8th_63.setSelectAllOnFocus(true);
        return view;

    }
    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity());
        this.cpar.putEditText(R.id.txt_8th_63);
        this.cpar.putEditText(R.id.txt_8th_64);
        this.cpar.putDropdown(R.id.cbo_8_year);
        this.cpar.putDropdown(R.id.cbo_8_month);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "ga_8th");
        super.onDestroy();
    }
}

