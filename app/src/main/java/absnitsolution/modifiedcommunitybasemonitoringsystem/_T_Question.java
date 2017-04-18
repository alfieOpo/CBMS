package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;
import android.widget.AdapterView;
import android.widget.CompoundButton;
import android.widget.CheckBox;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class _T_Question extends Fragment {

    c_params cpar;

    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;

    MaterialBetterSpinner cbo_t_145, cbo_w_157, cbo_w_156;
    LinearLayout layout1, layout2;

    EditText txt_w_155_1, txt_w_155_2, txt_w_155_3,  txt_w_155_4, txt_w_155_6, txt_t_146_6, txt_w_155_7, txt_w_ibapa_157;

    CheckBox  chk_t_146_1, chk_t_146_2, chk_t_146_3, chk_t_146_4, chk_t_146_5, chk_t_146_6;

    public _T_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment___t__question, container, false);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);

        cbo_t_145 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_t_145);
        cbo_w_157 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_w_157);
        cbo_w_156 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_w_156);

        layout1 = (LinearLayout) view.findViewById(R.id.layout1);
        layout2 = (LinearLayout) view.findViewById(R.id.layout2);


        chk_t_146_1 = (CheckBox) view.findViewById(R.id.chk_t_146_1);
        chk_t_146_2 = (CheckBox) view.findViewById(R.id.chk_t_146_2);
        chk_t_146_3 = (CheckBox) view.findViewById(R.id.chk_t_146_3);
        chk_t_146_4 = (CheckBox) view.findViewById(R.id.chk_t_146_4);
        chk_t_146_5 = (CheckBox) view.findViewById(R.id.chk_t_146_5);
        chk_t_146_6 = (CheckBox) view.findViewById(R.id.chk_t_146_6);


        txt_w_155_1 = (EditText) view.findViewById(R.id.txt_w_155_1);
        txt_w_155_2 = (EditText) view.findViewById(R.id.txt_w_155_2);
        txt_w_155_3 = (EditText) view.findViewById(R.id.txt_w_155_3);
        txt_w_155_4 = (EditText) view.findViewById(R.id.txt_w_155_4);
        txt_w_155_6 = (EditText) view.findViewById(R.id.txt_w_155_6);
        txt_t_146_6 = (EditText) view.findViewById(R.id.txt_t_146_6);
        txt_w_155_7 = (EditText) view.findViewById(R.id.txt_w_155_7);
        txt_w_ibapa_157 = (EditText) view.findViewById(R.id.txt_w_ibapa_157);


        this.cpar = new c_params(Config.ID, container, view);

        this.cpar.setDropdown(R.id.cbo_t_145, R.array.oo_hindi, "Oo");
        this.cpar.setDropdown(R.id.cbo_w_156, R.array.oo_hindi, "Oo");
        this.cpar.setDropdown(R.id.cbo_w_157, R.array.w_saangaling_angtulong, "Barangay");
        this.cpar.setCheckBox(R.id.chk_t_146_1);
        this.cpar.setCheckBox(R.id.chk_t_146_2);
        this.cpar.setCheckBox(R.id.chk_t_146_3);
        this.cpar.setCheckBox(R.id.chk_t_146_4);
        this.cpar.setCheckBox(R.id.chk_t_146_5);
        this.cpar.setCheckBox(R.id.chk_t_146_6);
        this.cpar.setEditText(R.id.txt_t_146_6);
        this.cpar.setEditText(R.id.txt_w_155_1);
        this.cpar.setEditText(R.id.txt_w_155_2);
        this.cpar.setEditText(R.id.txt_w_155_3);
        this.cpar.setEditText(R.id.txt_w_155_4);
        this.cpar.setEditText(R.id.txt_w_155_6);
        this.cpar.setEditText(R.id.txt_w_155_7);
        this.cpar.setEditText(R.id.txt_w_ibapa_157);



        txt_w_155_1.setVisibility(View.INVISIBLE);
        txt_w_155_2.setVisibility(View.INVISIBLE);
        txt_w_155_3.setVisibility(View.INVISIBLE);
        txt_w_155_4.setVisibility(View.INVISIBLE);
        txt_w_155_6.setVisibility(View.INVISIBLE);
        txt_w_155_7.setVisibility(View.INVISIBLE);
        txt_w_ibapa_157.setVisibility(View.INVISIBLE);
        txt_t_146_6.setVisibility(View.INVISIBLE);


        if (!txt_w_155_1.getText().toString().equals(""))
        {
            txt_w_155_1.setVisibility(View.VISIBLE);
        }

        ////
         if (!txt_w_155_2.getText().toString().equals(""))
        {
            txt_w_155_2.setVisibility(View.VISIBLE);
        }

        ////
         if (!txt_w_155_3.getText().toString().equals(""))
        {
            txt_w_155_3.setVisibility(View.VISIBLE);
        }

        ////
         if (!txt_w_155_4.getText().toString().equals(""))
        {
            txt_w_155_4.setVisibility(View.VISIBLE);
        }


        ////
         if (!txt_w_155_6.getText().toString().equals(""))
        {
            txt_w_155_6.setVisibility(View.VISIBLE);
        }

        ////
         if (!txt_w_155_7.getText().toString().equals(""))
        {
            txt_w_155_7.setVisibility(View.VISIBLE);
        }

        ////
         if (!txt_w_ibapa_157.getText().toString().equals(""))
        {
            txt_w_ibapa_157.setVisibility(View.VISIBLE);
        }
        ////

        ////
         if (!txt_t_146_6.getText().toString().equals(""))
        {
            txt_t_146_6.setVisibility(View.VISIBLE);
        }
        ////


                if (cbo_t_145.getText().toString().equals("Hindi")) // hindi
                {

                    layout1.setVisibility(View.INVISIBLE);
                    layout2.setVisibility(View.INVISIBLE);
                    cleartxt();

                } else {
                    layout1.setVisibility(View.VISIBLE);
                    layout2.setVisibility(View.VISIBLE);

                }


        cbo_t_145.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 1) // hindi
                {

                    layout1.setVisibility(View.INVISIBLE);
                    layout2.setVisibility(View.INVISIBLE);
                    cleartxt();

                } else {
                    layout1.setVisibility(View.VISIBLE);
                    layout2.setVisibility(View.VISIBLE);

                }
            }
        });



        chk_t_146_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_t_146_1.isChecked())
                {
                    txt_w_155_1.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt_w_155_1.setVisibility(View.INVISIBLE);
                    txt_w_155_1.setText("");

                }
            }
        });

        chk_t_146_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_t_146_2.isChecked())
                {
                    txt_w_155_2.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt_w_155_2.setVisibility(View.INVISIBLE);
                    txt_w_155_2.setText("");

                }
            }
        });

        chk_t_146_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_t_146_3.isChecked())
                {
                    txt_w_155_3.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt_w_155_3.setVisibility(View.INVISIBLE);
                    txt_w_155_3.setText("");

                }
            }
        });


        chk_t_146_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_t_146_4.isChecked())
                {
                    txt_w_155_4.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt_w_155_4.setVisibility(View.INVISIBLE);
                    txt_w_155_4.setText("");

                }
            }
        });


        chk_t_146_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_t_146_5.isChecked())
                {
                    txt_w_155_6.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt_w_155_6.setVisibility(View.INVISIBLE);
                    txt_w_155_6.setText("");

                }
            }
        });


        chk_t_146_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_t_146_6.isChecked())
                {
                    txt_t_146_6.setVisibility(View.VISIBLE);
                    txt_w_155_7.setVisibility(View.VISIBLE);

                }
                else
                {
                    txt_t_146_6.setVisibility(View.INVISIBLE);
                    txt_t_146_6.setText("");
                    txt_w_155_7.setVisibility(View.INVISIBLE);
                    txt_w_155_7.setText("");
                }
            }
        });


        cbo_w_157.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 6) // iba pa itala
                {

                    txt_w_ibapa_157.setVisibility(View.VISIBLE);

                } else {
                    txt_w_ibapa_157.setVisibility(View.INVISIBLE);
                    txt_w_ibapa_157.setText("");
                }
            }
        });


        cbo_w_156.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 1) // hindi
                {
                    cbo_w_157.setVisibility(View.INVISIBLE);
                    txt_w_ibapa_157.setVisibility(View.INVISIBLE);
                    cpar.setDropdown(R.id.cbo_w_157, R.array.oo_hindi, "Select One");
                    txt_w_ibapa_157.setText("");

                } else {
                   
                    cbo_w_157.setVisibility(View.VISIBLE);
                    txt_w_ibapa_157.setVisibility(View.INVISIBLE);
                    txt_w_ibapa_157.setText("");

                }
            }
        });


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _S_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "T. PAMAMAHALA SA BASURA").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _V_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "V. PROGRAMA").commit();
            }
        });

        return view;

    }

    private void cleartxt()
    {
        chk_t_146_1.setChecked(false);
        txt_w_155_1.setText("");
        chk_t_146_2.setChecked(false);
        txt_w_155_2.setText("");
        chk_t_146_3.setChecked(false);
        txt_w_155_3.setText("");
        chk_t_146_4.setChecked(false);
        txt_w_155_4.setText("");
        chk_t_146_5.setChecked(false);
        txt_w_155_6.setText("");
        chk_t_146_6.setChecked(false);
        txt_t_146_6.setText("");
        txt_w_155_7.setText("");
        txt_w_ibapa_157.setText("");
        cpar.setDropdown(R.id.cbo_w_156, R.array.oo_hindi, "Select One");
        cpar.setDropdown(R.id.cbo_w_157, R.array.w_saangaling_angtulong, "Select One");
    }




    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putDropdown(R.id.cbo_t_145);
        this.cpar.putCheckBox(R.id.chk_t_146_1);
        this.cpar.putCheckBox(R.id.chk_t_146_2);
        this.cpar.putCheckBox(R.id.chk_t_146_3);
        this.cpar.putCheckBox(R.id.chk_t_146_4);
        this.cpar.putCheckBox(R.id.chk_t_146_5);
        this.cpar.putCheckBox(R.id.chk_t_146_6);
        this.cpar.putEditText(R.id.txt_t_146_6);
        this.cpar.putDropdown(R.id.cbo_w_156);
        this.cpar.putDropdown(R.id.cbo_w_157);
        this.cpar.putEditText(R.id.txt_w_155_1);
        this.cpar.putEditText(R.id.txt_w_155_2);
        this.cpar.putEditText(R.id.txt_w_155_3);
        this.cpar.putEditText(R.id.txt_w_155_4);
        this.cpar.putEditText(R.id.txt_w_155_6);
        this.cpar.putEditText(R.id.txt_w_155_7);
        this.cpar.putEditText(R.id.txt_w_ibapa_157);



        da.c_Update(cpar);
        super.onDestroy();
    }
}

