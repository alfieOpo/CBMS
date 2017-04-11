package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class _9thstatedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    MainDataBaseHandler da;

    public _9thstatedrow_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this._key = getArguments().getString("_id");
        View view = inflater.inflate(R.layout.fragment___9thstatedrow__question, container, false);
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.set_table("ga_9th");
        this.cpar.set_key(this._key);
        this.cpar.setEditText(R.id.txt_9th_69);
        this.cpar.setDropdown(R.id.cbo_9th_70, R.array.oo_hindi_hindialam, "Select One");
        this.cpar.setDropdown(R.id.cbo_9th_71_1, R.array._9th_publicprivate, "Select One");
        this.cpar.setDropdown(R.id.cbo_9th_71_2, R.array._9th_publicprivate, "Select One");
        this.cpar.setDropdown(R.id.cbo_9th_71_3, R.array._9th_publicprivate, "Select One");
        this.cpar.setDropdown(R.id.cbo_9th_71_4, R.array._9th_publicprivate, "Select One");
        this.cpar.setDropdown(R.id.cbo_9th_71_5, R.array._9th_publicprivate, "Select One");
        this.cpar.setDropdown(R.id.cbo_9th_71_6, R.array._9th_publicprivate, "Select One");
        this.cpar.setDropdown(R.id.cbo_9th_71_7, R.array._9th_publicprivate, "Select One");
        this.cpar.setDropdown(R.id.cbo_9th_71_8, R.array._9th_publicprivate, "Select One");
        this.cpar.setEditText(R.id.txt_9th_71_9);
        this.cpar.setDropdown(R.id.cbo_9th_71_9, R.array._9th_publicprivate, "Select One");
        this.cpar.setDropdown(R.id.cbo_9th_72, R.array.meron_wala, "Select One");


        return view;

    }


    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity());
        this.cpar.putEditText(R.id.txt_9th_69);
        this.cpar.putDropdown(R.id.cbo_9th_70);
        this.cpar.putDropdown(R.id.cbo_9th_71_1);
        this.cpar.putDropdown(R.id.cbo_9th_71_2);
        this.cpar.putDropdown(R.id.cbo_9th_71_3);
        this.cpar.putDropdown(R.id.cbo_9th_71_4);
        this.cpar.putDropdown(R.id.cbo_9th_71_5);
        this.cpar.putDropdown(R.id.cbo_9th_71_6);
        this.cpar.putDropdown(R.id.cbo_9th_71_7);
        this.cpar.putDropdown(R.id.cbo_9th_71_8);
        this.cpar.putEditText(R.id.txt_9th_71_9);
        this.cpar.putDropdown(R.id.cbo_9th_71_9);
        this.cpar.putDropdown(R.id.cbo_9th_72);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "ga_9th");
        super.onDestroy();
    }
}

