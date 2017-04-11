package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class _3rdstatedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    MainDataBaseHandler da;

    public _3rdstatedrow_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this._key = getArguments().getString("_id");
        View view = inflater.inflate(R.layout.fragment___3rdstatedrow__question, container, false);
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.set_table("ga_3rd");
        this.cpar.set_key(this._key);
        this.cpar.setEditText(R.id.txt_3rd_pangalan);
        this.cpar.setDropdown(R.id.cbo_3rd_relasyon, R.array._1st_relasyon, "Select One");
        this.cpar.setEditText(R.id.txt_3rd_saangbansa);
        this.cpar.setEditText(R.id.txt_3rd_hanapbuhay);
        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity());
        this.cpar.putEditText(R.id.txt_3rd_pangalan);
        this.cpar.putDropdown(R.id.cbo_3rd_relasyon);
        this.cpar.putEditText(R.id.txt_3rd_saangbansa);
        this.cpar.putEditText(R.id.txt_3rd_hanapbuhay);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "ga_3rd");
        super.onDestroy();
    }
}

