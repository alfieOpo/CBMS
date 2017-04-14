package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class _J_Question extends Fragment {


    c_params cpar;
    ImageButton btn_back, btn_next;
    MaterialBetterSpinner cbo_a_miyembro_nagpagamot, cbo_a_ilan_nagpagamot, cbo_j_66, cbo_j_67;
    EditText txt_j_ibapa_66,txt_ibapa2;
    MainDataBaseHandler da;
CheckBox chk_ibapa_itala,chk_ibapa2;
LinearLayout layout;
    public _J_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment___j__question, container, false);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        cbo_a_miyembro_nagpagamot = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_miyembro_nagpagamot);
        cbo_a_ilan_nagpagamot = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_ilan_nagpagamot);
        chk_ibapa_itala = (CheckBox) view.findViewById(R.id.chk_ibapa_itala);
        chk_ibapa2 = (CheckBox) view.findViewById(R.id.chk_ibapa2);
        txt_j_ibapa_66 = (EditText) view.findViewById(R.id.txt_j_ibapa_66);
        txt_ibapa2 = (EditText) view.findViewById(R.id.txt_ibapa2);
        layout = (LinearLayout) view.findViewById(R.id.layout);

        cbo_a_miyembro_nagpagamot = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_miyembro_nagpagamot);
        this.cpar = new c_params(Config.ID, container, view);

        this.cpar.setDropdown(R.id.cbo_a_miyembro_nagpagamot, R.array.meron_wala, "Mayroon");

        if(chk_ibapa_itala.isChecked()){
            txt_j_ibapa_66.setVisibility(View.VISIBLE);
        }
        else{
            txt_j_ibapa_66.setText("");
            txt_j_ibapa_66.setVisibility(View.INVISIBLE);}
        if(chk_ibapa2.isChecked()){
            txt_ibapa2.setVisibility(View.VISIBLE);
        }
        else{
            txt_ibapa2.setText("");
            txt_ibapa2.setVisibility(View.INVISIBLE);}

        if(cbo_a_miyembro_nagpagamot.getText().toString().equals("Wala")){

            layout.setVisibility(View.INVISIBLE);
        } else {
            layout.setVisibility(View.VISIBLE);
        }

        cbo_a_miyembro_nagpagamot.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1) {
                    layout.setVisibility(View.INVISIBLE);
                } else {
                    layout.setVisibility(View.VISIBLE);
                }
            }
        });


        chk_ibapa_itala.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    txt_j_ibapa_66.setVisibility(View.VISIBLE);
                }
                else{
                    txt_j_ibapa_66.setText("");
                    txt_j_ibapa_66.setVisibility(View.INVISIBLE);}
            }
        });
        chk_ibapa2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    txt_ibapa2.setVisibility(View.VISIBLE);
                }
                else{
                    txt_ibapa2.setText("");
                    txt_ibapa2.setVisibility(View.INVISIBLE);}
            }
        });

        this.cpar.setDropdown(R.id.cbo_a_ilan_nagpagamot, R.array.ilan, "");
        this.cpar.setEditText(R.id.txt_j_ibapa_66);
        this.cpar.setEditText(R.id.txt_ibapa2);
        this.cpar.setCheckBox(R.id.chk_Brgy_Health_Station_Center);
        this.cpar.setCheckBox(R.id.chk_Public_hospital_Provincial_hospital);
        this.cpar.setCheckBox(R.id.chk_Public_hospital__National);
        this.cpar.setCheckBox(R.id.chk_Private_Hospital_Clinic);
        this.cpar.setCheckBox(R.id.chk_Bulacan_Medical_Center);
        this.cpar.setCheckBox(R.id.chk_Santa_Maria_General__Hospital_RMMH);
        this.cpar.setCheckBox(R.id.chk_Rural_Health_Units);
        this.cpar.setCheckBox(R.id.chk_Brgy_Health_Station_Center);
        this.cpar.setCheckBox(R.id.chk_Non_medical_non_trained_Hilot_Personnel);
        this.cpar.setCheckBox(R.id.chk_ibapa_itala);
        this.cpar.setCheckBox(R.id.chk_Dialysis);
        this.cpar.setCheckBox(R.id.chk_Chemotherapy);
        this.cpar.setCheckBox(R.id.chk_HIV_Treatment);
        this.cpar.setCheckBox(R.id.chk_Pulmonary_Tubercolosis_PTB_Treatment);
        this.cpar.setCheckBox(R.id.chk_ibapa2);


//-----------------------------------------------------------------------------------------------------------------------------------------------
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _U_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "I-E. DALAS NG PAGKAIN").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!cbo_a_miyembro_nagpagamot.getText().equals("Select One") || !cbo_a_miyembro_nagpagamot.getText().equals("")) {
                    Fragment fragment = null;
                    try {
                        fragment = _L_Question.class.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // Insert the fragment by replacing any existing fragment
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.frame, fragment, "L. BIKTIMA NG KRIMEN").commit();
                } else {
                    Toast.makeText(getActivity(), "Fill up all important fields.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplication());
        this.cpar.putEditText(R.id.txt_ibapa2);
        this.cpar.putEditText(R.id.txt_j_ibapa_66);
        this.cpar.putDropdown(R.id.cbo_a_miyembro_nagpagamot);
        this.cpar.putDropdown(R.id.cbo_a_ilan_nagpagamot);
        this.cpar.putCheckBox(R.id.chk_Brgy_Health_Station_Center);
        this.cpar.putCheckBox(R.id.chk_Public_hospital__National);
        this.cpar.putCheckBox(R.id.chk_Private_Hospital_Clinic);
        this.cpar.putCheckBox(R.id.chk_Bulacan_Medical_Center);
        this.cpar.putCheckBox(R.id.chk_Santa_Maria_General__Hospital_RMMH);
        this.cpar.putCheckBox(R.id.chk_Rural_Health_Units);
        this.cpar.putCheckBox(R.id.chk_Brgy_Health_Station_Center);
        this.cpar.putCheckBox(R.id.chk_Non_medical_non_trained_Hilot_Personnel);
        this.cpar.putCheckBox(R.id.chk_ibapa_itala);
        this.cpar.putCheckBox(R.id.chk_Dialysis);
        this.cpar.putCheckBox(R.id.chk_Chemotherapy);
        this.cpar.putCheckBox(R.id.chk_HIV_Treatment);
        this.cpar.putCheckBox(R.id.chk_Public_hospital_Provincial_hospital);
        this.cpar.putCheckBox(R.id.chk_Pulmonary_Tubercolosis_PTB_Treatment);
        this.cpar.putCheckBox(R.id.chk_ibapa2);
        da.c_Update(cpar);
        super.onDestroy();
    }
}
