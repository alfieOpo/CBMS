package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class _5thstatedrow_Question extends Fragment {
    c_params cpar;
    String _key = "";
    MainDataBaseHandler da;
    CheckBox chk_ibapa;
    MaterialBetterSpinner cbo_5th_saangalingtulong,cbo_5th_sanhi_kapansanan;
    EditText txt_5th_ibapa_kapansanan,txt_5th_ibapa_saangaling,txt_iba_itala,txt_5th_pangalan_maykapansanan;
    public _5thstatedrow_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        this._key = getArguments().getString("_id");
        View view = inflater.inflate(R.layout.fragment___5thstatedrow__question, container, false);
        chk_ibapa=(CheckBox)view.findViewById(R.id.chk_ibapa);
        txt_5th_ibapa_kapansanan=(EditText)view.findViewById(R.id.txt_5th_ibapa_kapansanan);
        txt_5th_ibapa_saangaling=(EditText)view.findViewById(R.id.txt_5th_ibapa_saangaling);
        txt_5th_pangalan_maykapansanan=(EditText)view.findViewById(R.id.txt_5th_pangalan_maykapansanan);
        cbo_5th_saangalingtulong=(MaterialBetterSpinner)view.findViewById(R.id.cbo_5th_saangalingtulong);
        cbo_5th_sanhi_kapansanan=(MaterialBetterSpinner)view.findViewById(R.id.cbo_5th_sanhi_kapansanan);

        txt_5th_pangalan_maykapansanan.setSelectAllOnFocus(true);
        txt_iba_itala=(EditText)view.findViewById(R.id.txt_iba_itala);
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
        this.cpar.setCheckBox(R.id.chk_ibapa);
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
        this.cpar.setEditText(R.id.txt_iba_itala);
        this.cpar.setDropdown(R.id.cbo_5th_sanhi_kapansanan, R.array._5th_sanhi_kapansanan, "Select One");
        this.cpar.setEditText(R.id.txt_5th_tulongnatanggap);
        this.cpar.setDropdown(R.id.cbo_5th_saangalingtulong, R.array._5th_saangaling_tulong, "Select One");
        this.cpar.setEditText(R.id.txt_5th_ibapa_saangaling);


        if(chk_ibapa.isChecked()){
            txt_5th_ibapa_kapansanan.setVisibility(View.VISIBLE);
        }
        else{
            txt_5th_ibapa_kapansanan.setText("");
            txt_5th_ibapa_kapansanan.setVisibility(View.INVISIBLE);
        }

        chk_ibapa.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    txt_5th_ibapa_kapansanan.setVisibility( View.VISIBLE);
                }
                else{
                    txt_5th_ibapa_kapansanan.setText("");
                    txt_5th_ibapa_kapansanan.setVisibility( View.INVISIBLE);
                }

            }
        });


        if(cbo_5th_saangalingtulong.getText().toString().equals("Iba pa, itala")){
            txt_5th_ibapa_saangaling.setVisibility(View.VISIBLE);
        }
        else{
            txt_5th_ibapa_saangaling.setText("");
            txt_5th_ibapa_saangaling.setVisibility(View.INVISIBLE);
        }


        cbo_5th_saangalingtulong.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==5){
                    txt_5th_ibapa_saangaling.setVisibility( View.VISIBLE);
                }
                else{
                    txt_5th_ibapa_saangaling.setText("");
                    txt_5th_ibapa_saangaling.setVisibility( View.INVISIBLE);
                }
            }
        });
        if(cbo_5th_sanhi_kapansanan.getText().toString().equals("Iba pa, itala")){
            txt_iba_itala.setVisibility(View.VISIBLE);
        }
        else{
            txt_iba_itala.setText("");
            txt_iba_itala.setVisibility(View.INVISIBLE);
        }
        cbo_5th_sanhi_kapansanan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==4){
                    txt_iba_itala.setVisibility( View.VISIBLE);
                }
                else{
                    txt_iba_itala.setText("");
                    txt_iba_itala.setVisibility( View.INVISIBLE);
                }
            }
        });
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
        this.cpar.putCheckBox(R.id.chk_ibapa);
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
        this.cpar.putEditText(R.id.txt_iba_itala);
        this.cpar.putDropdown(R.id.cbo_5th_saangalingtulong);
        this.cpar.putEditText(R.id.txt_5th_ibapa_saangaling);
        this.cpar.set_key(this._key);
        da.c_Update(this.cpar, "ga_5th");
        super.onDestroy();
    }
}

