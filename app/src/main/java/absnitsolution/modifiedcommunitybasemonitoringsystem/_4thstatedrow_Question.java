package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class _4thstatedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    MainDataBaseHandler da;

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

