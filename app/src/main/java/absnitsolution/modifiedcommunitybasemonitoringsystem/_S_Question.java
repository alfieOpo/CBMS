package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.CheckBox;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class _S_Question extends Fragment {

    c_params cpar;

    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;

    MaterialBetterSpinner cbo_s_142, cbo_r_144;

    CheckBox chk_s_141_8, chk_r_143_5 ;

    EditText txt_s_141_8, txt_s_ibapa_142, txt_r_143_5, txt_s_ibapa_144;


    public _S_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment___s__question, container, false);

        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);


        chk_s_141_8 = (CheckBox) view.findViewById(R.id.chk_s_141_8);
        txt_s_141_8 = (EditText) view.findViewById(R.id.txt_s_141_8);

        cbo_s_142 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_s_142);
        txt_s_ibapa_142 = (EditText) view.findViewById(R.id.txt_s_ibapa_142);

        chk_r_143_5 = (CheckBox) view.findViewById(R.id.chk_r_143_5);
        txt_r_143_5 = (EditText) view.findViewById(R.id.txt_r_143_5);

        cbo_r_144 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_r_144);
        txt_s_ibapa_144 = (EditText) view.findViewById(R.id.txt_s_ibapa_144);



        this.cpar = new c_params(Config.ID, container, view);


        this.cpar.setDropdown(R.id.cbo_s_142, R.array.s_sinokumokolekta, "MENRO");
        this.cpar.setDropdown(R.id.cbo_r_144, R.array.s_gaanokadalas_pagkolekta, "Isang beses sa isang linggo");


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
        this.cpar.setEditText(R.id.txt_s_ibapa_142);
        this.cpar.setEditText(R.id.txt_s_ibapa_144);



        txt_s_141_8.setVisibility(View.INVISIBLE);
        txt_s_ibapa_142.setVisibility(View.INVISIBLE);
        txt_r_143_5.setVisibility(View.INVISIBLE);
        txt_s_ibapa_144.setVisibility(View.INVISIBLE);

        if (!txt_s_141_8.getText().toString().equals(""))
        {
            txt_s_141_8.setVisibility(View.VISIBLE);
        }

        ////
        if (!txt_s_ibapa_142.getText().toString().equals(""))
        {
            txt_s_ibapa_142.setVisibility(View.VISIBLE);
        }

        ////
        if (!txt_r_143_5.getText().toString().equals(""))
        {
            txt_r_143_5.setVisibility(View.VISIBLE);
        }

        ////
        if (!txt_s_ibapa_144.getText().toString().equals(""))
        {
            txt_s_ibapa_144.setVisibility(View.VISIBLE);
        }
        ////


        chk_s_141_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_s_141_8.isChecked())
                {
                    txt_s_141_8.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt_s_141_8.setVisibility(View.INVISIBLE);
                    txt_s_141_8.setText("");

                }
            }
        });


        cbo_s_142.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 3 ) {

                    txt_s_ibapa_142.setVisibility(View.VISIBLE);

                } else {
                    txt_s_ibapa_142.setVisibility(View.INVISIBLE);
                    txt_s_ibapa_142.setText("");

                }
            }
        });


        chk_r_143_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_r_143_5.isChecked())
                {
                    txt_r_143_5.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt_r_143_5.setVisibility(View.INVISIBLE);
                    txt_r_143_5.setText("");
                }
            }
        });


        cbo_r_144.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 4 ) {

                    txt_s_ibapa_144.setVisibility(View.VISIBLE);

                } else {
                    txt_s_ibapa_144.setVisibility(View.INVISIBLE);
                    txt_s_ibapa_144.setText("");

                }
            }
        });








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
        this.cpar.putEditText(R.id.txt_s_ibapa_142);
        this.cpar.putEditText(R.id.txt_s_ibapa_144);

        da.c_Update(cpar);
        super.onDestroy();
    }
}

