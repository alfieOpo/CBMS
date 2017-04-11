package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class _6thstatedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    MainDataBaseHandler da;

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
        this.cpar.set_table("ga_6th");
        this.cpar.set_key(this._key);
        this.cpar.setDropdown(R.id.cbo_6th_mayseniorid, R.array.meron_wala, "Select One");
        this.cpar.setEditText(R.id.txt_6th_saannagagamitangid);
        this.cpar.setDropdown(R.id.cbo_6th_mayphilhealth, R.array.meron_wala, "Select One");


        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity());
        this.cpar.putDropdown(R.id.cbo_6th_mayseniorid);
        this.cpar.putEditText(R.id.txt_6th_saannagagamitangid);
        this.cpar.putDropdown(R.id.cbo_6th_mayphilhealth);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "ga_6th");
        super.onDestroy();
    }
}

