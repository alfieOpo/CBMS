package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class _5thstatedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    MainDataBaseHandler da;

    public _5thstatedrow_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this._key = getArguments().getString("_id");
        View view = inflater.inflate(R.layout.fragment___5thstatedrow__question, container, false);
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.set_table("ga_5th");
        this.cpar.set_key(this._key);
        this.cpar.setEditText(R.id.txt_5th_pangalan_maykapansanan);
        this.cpar.setCheckBox(R.id.chk_5h_totalblindness);
        this.cpar.setCheckBox(R.id.chk_5th_partialblindness);
        this.cpar.setCheckBox(R.id.chk_5th_lowvision);
        this.cpar.setCheckBox(R.id.chk_5th_totallydeaf);
        this.cpar.setCheckBox(R.id.chk_5th_partiallydeaf);
        this.cpar.setCheckBox(R.id.chk_5th_hardofhearing);
        this.cpar.setCheckBox(R.id.chk_5th_oraldefect);
        this.cpar.setCheckBox(R.id.chk_5th_onehand);
        this.cpar.setCheckBox(R.id.chk_5th_nohands);
        this.cpar.setCheckBox(R.id.chk_5th_oneleg);
        this.cpar.setCheckBox(R.id.chk_5th_nolegs);
        this.cpar.setCheckBox(R.id.chk_5th_mildcelebralpalsy);
        this.cpar.setCheckBox(R.id.chk_5th_severecelebralpalsy);
        this.cpar.setCheckBox(R.id.chk_5th_regularlyintellectuallyimpaired);
        this.cpar.setCheckBox(R.id.chk_5th_severelyintellectuallyimpaired);
        this.cpar.setCheckBox(R.id.chk_5th_regularlyimpairedmentalillnes);
        this.cpar.setCheckBox(R.id.chk_5th_severelyimpairedmentalillnes);
        this.cpar.setCheckBox(R.id.chk_5th_regularlymultipledimpaired);
        this.cpar.setCheckBox(R.id.chk_5th_harelip);
        this.cpar.setCheckBox(R.id.chk_5th_clubfoot);
        this.cpar.setEditText(R.id.txt_5th_ibapa_kapansanan);
        this.cpar.setDropdown(R.id.cbo_5th_sanhi_kapansanan, R.array._5th_sanhi_kapansanan, "Select One");
        this.cpar.setEditText(R.id.txt_5th_tulongnatanggap);
        this.cpar.setDropdown(R.id.cbo_5th_saangalingtulong, R.array._5th_saangaling_tulong, "Select One");
        this.cpar.setEditText(R.id.txt_5th_ibapa_saangaling);
        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity());
        this.cpar.putEditText(R.id.txt_5th_pangalan_maykapansanan);
        this.cpar.putCheckBox(R.id.chk_5h_totalblindness);
        this.cpar.putCheckBox(R.id.chk_5th_partialblindness);
        this.cpar.putCheckBox(R.id.chk_5th_lowvision);
        this.cpar.putCheckBox(R.id.chk_5th_totallydeaf);
        this.cpar.putCheckBox(R.id.chk_5th_partiallydeaf);
        this.cpar.putCheckBox(R.id.chk_5th_hardofhearing);
        this.cpar.putCheckBox(R.id.chk_5th_oraldefect);
        this.cpar.putCheckBox(R.id.chk_5th_onehand);
        this.cpar.putCheckBox(R.id.chk_5th_nohands);
        this.cpar.putCheckBox(R.id.chk_5th_oneleg);
        this.cpar.putCheckBox(R.id.chk_5th_nolegs);
        this.cpar.putCheckBox(R.id.chk_5th_mildcelebralpalsy);
        this.cpar.putCheckBox(R.id.chk_5th_severecelebralpalsy);
        this.cpar.putCheckBox(R.id.chk_5th_regularlyintellectuallyimpaired);
        this.cpar.putCheckBox(R.id.chk_5th_severelyintellectuallyimpaired);
        this.cpar.putCheckBox(R.id.chk_5th_regularlyimpairedmentalillnes);
        this.cpar.putCheckBox(R.id.chk_5th_severelyimpairedmentalillnes);
        this.cpar.putCheckBox(R.id.chk_5th_regularlymultipledimpaired);
        this.cpar.putCheckBox(R.id.chk_5th_harelip);
        this.cpar.putCheckBox(R.id.chk_5th_clubfoot);
        this.cpar.putEditText(R.id.txt_5th_ibapa_kapansanan);
        this.cpar.putDropdown(R.id.cbo_5th_sanhi_kapansanan);
        this.cpar.putEditText(R.id.txt_5th_tulongnatanggap);
        this.cpar.putDropdown(R.id.cbo_5th_saangalingtulong);
        this.cpar.putEditText(R.id.txt_5th_ibapa_saangaling);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "ga_5th");
        super.onDestroy();
    }
}

