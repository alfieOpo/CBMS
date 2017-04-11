package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class _S_Question extends Fragment {

    c_params cpar;

    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;

    public _S_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment___s__question, container, false);

        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        this.cpar = new c_params(Config.ID, container, view);


        this.cpar.setDropdown(R.id.cbo_s_142, R.array.s_sinokumokolekta, "Select One");
        this.cpar.setDropdown(R.id.cbo_r_144, R.array.s_gaanokadalas_pagkolekta, "Select One");


        this.cpar.setCheckBox(R.id.chk_s_141_1);
        this.cpar.setCheckBox(R.id.chk_s_141_2);
        this.cpar.setCheckBox(R.id.chk_s_141_3);
        this.cpar.setCheckBox(R.id.chk_s_141_4);
        this.cpar.setCheckBox(R.id.chk_s_141_5);
        this.cpar.setCheckBox(R.id.chk_s_141_6);
        this.cpar.setCheckBox(R.id.chk_s_141_7);
        this.cpar.setCheckBox(R.id.chk_s_141_8);
        this.cpar.setEditText(R.id.txt_s_141_8);

        this.cpar.setCheckBox(R.id.chk_r_143_1);
        this.cpar.setCheckBox(R.id.chk_r_143_2);
        this.cpar.setCheckBox(R.id.chk_r_143_3);
        this.cpar.setCheckBox(R.id.chk_r_143_4);
        this.cpar.setCheckBox(R.id.chk_r_143_5);
        this.cpar.setEditText(R.id.txt_r_143_5);


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _R_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "S. PANGINGISDA").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _T_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "U. MGA KALAMIDAD").commit();
            }
        });

        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putCheckBox(R.id.chk_s_141_1);
        this.cpar.putCheckBox(R.id.chk_s_141_2);
        this.cpar.putCheckBox(R.id.chk_s_141_3);
        this.cpar.putCheckBox(R.id.chk_s_141_4);
        this.cpar.putCheckBox(R.id.chk_s_141_5);
        this.cpar.putCheckBox(R.id.chk_s_141_6);
        this.cpar.putCheckBox(R.id.chk_s_141_7);
        this.cpar.putCheckBox(R.id.chk_s_141_8);
        this.cpar.putEditText(R.id.txt_s_141_8);
        this.cpar.putDropdown(R.id.cbo_s_142);
        this.cpar.putCheckBox(R.id.chk_r_143_1);
        this.cpar.putCheckBox(R.id.chk_r_143_2);
        this.cpar.putCheckBox(R.id.chk_r_143_3);
        this.cpar.putCheckBox(R.id.chk_r_143_4);
        this.cpar.putCheckBox(R.id.chk_r_143_5);
        this.cpar.putEditText(R.id.txt_r_143_5);
        this.cpar.putDropdown(R.id.cbo_r_144);
        da.c_Update(cpar);
        super.onDestroy();
    }
}

