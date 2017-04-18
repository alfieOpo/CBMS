package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageButton;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.CompoundButton;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class _R_Question extends Fragment {
    View view;
    c_params cpar;
    ImageButton btn_back, btn_next;
    MainDataBaseHandler da;
    MaterialBetterSpinner cbo_r_135;
    LinearLayout layout1, layout2;
    CheckBox chk_r_135_3, chk_r_137_6, chk_r_139_8,
             chk_r_137_1, chk_r_137_2, chk_r_137_3, chk_r_137_4, chk_r_137_5,
             chk_r_135_1, chk_r_135_2,

             chk_r_139_1, chk_r_139_2, chk_r_139_3,
             chk_r_139_4, chk_r_139_5, chk_r_139_6, chk_r_139_7;


    EditText txt_r_135_3, txt_r_137_6, txt_r_139_8,
             txt_r_138_1, txt_r_138_2, txt_r_138_3, txt_r_138_4, txt_r_138_5, 
             txt_r_138_6, txt_r_ibapa_138_6, txt_r_138_7;
Button btn_compute;
    public _R_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
          view = inflater.inflate(R.layout.fragment___r__question, container, false);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);

        cbo_r_135 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_r_135);
        layout1 = (LinearLayout) view.findViewById(R.id.layout1);
        layout2 = (LinearLayout) view.findViewById(R.id.layout2);

        chk_r_135_3 = (CheckBox) view.findViewById(R.id.chk_r_135_3);
        chk_r_137_6 = (CheckBox) view.findViewById(R.id.chk_r_137_6);
        chk_r_139_8 = (CheckBox) view.findViewById(R.id.chk_r_139_8);

        chk_r_137_1 = (CheckBox) view.findViewById(R.id.chk_r_137_1);
        chk_r_137_2 = (CheckBox) view.findViewById(R.id.chk_r_137_2);
        chk_r_137_3 = (CheckBox) view.findViewById(R.id.chk_r_137_3);
        chk_r_137_4 = (CheckBox) view.findViewById(R.id.chk_r_137_4);
        chk_r_137_5 = (CheckBox) view.findViewById(R.id.chk_r_137_5);

        chk_r_135_1 = (CheckBox) view.findViewById(R.id.chk_r_135_1);
        chk_r_135_2 = (CheckBox) view.findViewById(R.id.chk_r_135_2);

        chk_r_139_1 = (CheckBox) view.findViewById(R.id.chk_r_139_1);
        chk_r_139_2 = (CheckBox) view.findViewById(R.id.chk_r_139_2);
        chk_r_139_3 = (CheckBox) view.findViewById(R.id.chk_r_139_3);
        chk_r_139_4 = (CheckBox) view.findViewById(R.id.chk_r_139_4);
        chk_r_139_5 = (CheckBox) view.findViewById(R.id.chk_r_139_5);
        chk_r_139_6 = (CheckBox) view.findViewById(R.id.chk_r_139_6);
        chk_r_139_7 = (CheckBox) view.findViewById(R.id.chk_r_139_7);

        txt_r_138_1 = (EditText) view.findViewById(R.id.txt_r_138_1);
        txt_r_138_2 = (EditText) view.findViewById(R.id.txt_r_138_2);
        txt_r_138_3 = (EditText) view.findViewById(R.id.txt_r_138_3);
        txt_r_138_4 = (EditText) view.findViewById(R.id.txt_r_138_4);
        txt_r_138_5 = (EditText) view.findViewById(R.id.txt_r_138_5);

        txt_r_138_6 = (EditText) view.findViewById(R.id.txt_r_138_6);
        txt_r_ibapa_138_6 = (EditText) view.findViewById(R.id.txt_r_ibapa_138_6);
        txt_r_138_7 = (EditText) view.findViewById(R.id.txt_r_138_7);


        txt_r_135_3 = (EditText) view.findViewById(R.id.txt_r_135_3);
        txt_r_137_6 = (EditText) view.findViewById(R.id.txt_r_137_6);
        txt_r_139_8 = (EditText) view.findViewById(R.id.txt_r_139_8);




        this.cpar = new c_params(Config.ID, container, view);

        this.cpar.setDropdown(R.id.cbo_r_136, R.array.p_gaanokalawak, "Mababa sa 1 hektarya");
        this.cpar.setDropdown(R.id.cbo_r_135, R.array.oo_hindi, "Oo");
        this.cpar.setCheckBox(R.id.chk_r_135_1);
        this.cpar.setCheckBox(R.id.chk_r_135_2);
        this.cpar.setCheckBox(R.id.chk_r_135_3);
        this.cpar.setEditText(R.id.txt_r_135_3);
        this.cpar.setCheckBox(R.id.chk_r_137_1);
        this.cpar.setCheckBox(R.id.chk_r_137_2);
        this.cpar.setCheckBox(R.id.chk_r_137_3);
        this.cpar.setCheckBox(R.id.chk_r_137_4);
        this.cpar.setCheckBox(R.id.chk_r_137_4);
        this.cpar.setCheckBox(R.id.chk_r_137_6);
        this.cpar.setEditText(R.id.txt_r_137_6);
        this.cpar.setEditText(R.id.txt_r_138_1);
        this.cpar.setEditText(R.id.txt_r_138_2);
        this.cpar.setEditText(R.id.txt_r_138_3);
        this.cpar.setEditText(R.id.txt_r_138_4);
        this.cpar.setEditText(R.id.txt_r_138_5);
        this.cpar.setEditText(R.id.txt_r_138_6);
        this.cpar.setEditText(R.id.txt_r_138_7);
        this.cpar.setCheckBox(R.id.chk_r_139_1);
        this.cpar.setCheckBox(R.id.chk_r_139_2);
        this.cpar.setCheckBox(R.id.chk_r_139_3);
        this.cpar.setCheckBox(R.id.chk_r_139_4);
        this.cpar.setCheckBox(R.id.chk_r_139_5);
        this.cpar.setCheckBox(R.id.chk_r_139_6);
        this.cpar.setCheckBox(R.id.chk_r_139_7);
        this.cpar.setCheckBox(R.id.chk_r_139_8);
        this.cpar.setEditText(R.id.txt_r_139_8);
        this.cpar.setCheckBox(R.id.chk_r_137_5);
        this.cpar.setEditText(R.id.txt_r_ibapa_138_6);

        txt_r_138_1.setEnabled(false);
        txt_r_138_2.setEnabled(false);
        txt_r_138_3.setEnabled(false);
        txt_r_138_4.setEnabled(false);
        txt_r_138_5.setEnabled(false);


        txt_r_135_3.setVisibility(View.INVISIBLE);
        txt_r_137_6.setVisibility(View.INVISIBLE);
        txt_r_139_8.setVisibility(View.INVISIBLE);

        if (!txt_r_135_3.getText().toString().equals(""))
        {
            txt_r_135_3.setVisibility(View.VISIBLE);
        }
        ////

        if (!txt_r_137_6.getText().toString().equals(""))
        {
            txt_r_137_6.setVisibility(View.VISIBLE);
        }
        ////

        if (!txt_r_139_8.getText().toString().equals(""))
        {
            txt_r_139_8.setVisibility(View.VISIBLE);
        }
        ////

        cbo_r_135.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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

        chk_r_137_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_r_137_1.isChecked())
                {
                    txt_r_138_1.setEnabled(true);
                }
                else
                {
                    txt_r_138_1.setEnabled(false);
                    txt_r_138_1.setText("");

                }
            }
        });


        chk_r_137_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_r_137_2.isChecked())
                {
                    txt_r_138_2.setEnabled(true);
                }
                else
                {
                    txt_r_138_2.setEnabled(false);
                    txt_r_138_2.setText("");

                }
            }
        });



        chk_r_137_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_r_137_3.isChecked())
                {
                    txt_r_138_3.setEnabled(true);
                }
                else
                {
                    txt_r_138_3.setEnabled(false);
                    txt_r_138_3.setText("");

                }
            }
        });

        chk_r_137_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_r_137_4.isChecked())
                {
                    txt_r_138_4.setEnabled(true);
                }
                else
                {
                    txt_r_138_4.setEnabled(false);
                    txt_r_138_4.setText("");

                }
            }
        });

        chk_r_137_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_r_137_5.isChecked())
                {
                    txt_r_138_5.setEnabled(true);
                }
                else
                {
                    txt_r_138_5.setEnabled(false);
                    txt_r_138_5.setText("");

                }
            }
        });



        chk_r_139_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_r_139_8.isChecked())
                {
                    txt_r_139_8.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt_r_139_8.setVisibility(View.INVISIBLE);
                    txt_r_139_8.setText("");

                }
            }
        });


        chk_r_137_6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_r_137_6.isChecked())
                {
                    txt_r_137_6.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt_r_137_6.setVisibility(View.INVISIBLE);
                    txt_r_137_6.setText("");

                }
            }
        });

        chk_r_135_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_r_135_3.isChecked())
                {
                    txt_r_135_3.setVisibility(View.VISIBLE);
                }
                else
                {
                    txt_r_135_3.setVisibility(View.INVISIBLE);
                    txt_r_135_3.setText("");
                }
            }
        });




        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _Q_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "R. PAGHAHAYUPAN").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
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

        btn_compute=(Button)view.findViewById(R.id.btn_compute);
        btn_compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sum sum=new Sum();
                sum.Add(txt_r_138_1);
                sum.Add(txt_r_138_2);
                sum.Add(txt_r_138_3);
                sum.Add(txt_r_138_4);
                sum.Add(txt_r_138_5);
                sum.Add(txt_r_ibapa_138_6);
                txt_r_138_7=(EditText)view.findViewById(R.id.txt_r_138_7);
                double total= sum.getTotal();
                txt_r_138_7.setText(Config.toCurrency(total).replace(".00","")+" kg ");

            }
        });
        return view;

    }

    private void cleartxt()
    {
        chk_r_135_1.setChecked(false);
        chk_r_135_2.setChecked(false);
        chk_r_135_3.setChecked(false);
        txt_r_135_3.setText("");
        cpar.setDropdown(R.id.cbo_r_136, R.array.p_gaanokalawak, "Select One");
        chk_r_137_1.setChecked(false);
        chk_r_137_2.setChecked(false);
        chk_r_137_3.setChecked(false);
        chk_r_137_4.setChecked(false);
        chk_r_137_5.setChecked(false);
        chk_r_137_6.setChecked(false);
        txt_r_137_6.setText("");
        txt_r_138_1.setText("");
        txt_r_138_2.setText("");
        txt_r_138_3.setText("");
        txt_r_138_4.setText("");
        txt_r_138_5.setText("");
        txt_r_138_6.setText("");
        txt_r_ibapa_138_6.setText("");
        txt_r_138_7.setText("");
        chk_r_139_1.setChecked(false);
        chk_r_139_2.setChecked(false);
        chk_r_139_3.setChecked(false);
        chk_r_139_4.setChecked(false);
        chk_r_139_5.setChecked(false);
        chk_r_139_6.setChecked(false);
        chk_r_139_7.setChecked(false);
        chk_r_139_8.setChecked(false);
        txt_r_139_8.setText("");
    

    }






    @Override
    public void onDestroy() {


        da = new MainDataBaseHandler(getActivity().getApplicationContext());

        this.cpar.putCheckBox(R.id.chk_r_135_1);
        this.cpar.putCheckBox(R.id.chk_r_135_2);
        this.cpar.putCheckBox(R.id.chk_r_135_3);
        this.cpar.putEditText(R.id.txt_r_135_3);
        this.cpar.putDropdown(R.id.cbo_r_136);
        this.cpar.putCheckBox(R.id.chk_r_137_1);
        this.cpar.putCheckBox(R.id.chk_r_137_2);
        this.cpar.putCheckBox(R.id.chk_r_137_3);
        this.cpar.putCheckBox(R.id.chk_r_137_4);
        this.cpar.putCheckBox(R.id.chk_r_137_4);
        this.cpar.putCheckBox(R.id.chk_r_137_6);
        this.cpar.putEditText(R.id.txt_r_137_6);
        this.cpar.putEditText(R.id.txt_r_138_1);
        this.cpar.putEditText(R.id.txt_r_138_2);
        this.cpar.putEditText(R.id.txt_r_138_3);
        this.cpar.putEditText(R.id.txt_r_138_4);
        this.cpar.putEditText(R.id.txt_r_138_5);
        this.cpar.putEditText(R.id.txt_r_138_6);
        this.cpar.putEditText(R.id.txt_r_138_7);
        this.cpar.putCheckBox(R.id.chk_r_139_1);
        this.cpar.putCheckBox(R.id.chk_r_139_2);
        this.cpar.putCheckBox(R.id.chk_r_139_3);
        this.cpar.putCheckBox(R.id.chk_r_139_4);
        this.cpar.putCheckBox(R.id.chk_r_139_5);
        this.cpar.putCheckBox(R.id.chk_r_139_6);
        this.cpar.putCheckBox(R.id.chk_r_139_7);
        this.cpar.putCheckBox(R.id.chk_r_139_8);
        this.cpar.putEditText(R.id.txt_r_139_8);
        this.cpar.putDropdown(R.id.cbo_r_135);
        this.cpar.putCheckBox(R.id.chk_r_137_5);
        this.cpar.putEditText(R.id.txt_r_ibapa_138_6);
        da.c_Update(cpar);
        super.onDestroy();


    }

    public class Sum {
        List<String> list = new ArrayList<String>();
        double total = 0;

        public void Add(EditText txt) {
            list.add(txt.getText().toString().replace(",",""));
        }

        public void Add(int txt) {
            list.add(String.valueOf(txt));
        }

        public double getTotal() {

            for (String val : list) {
                double value = 0;
                try {
                    value = Double.valueOf(val);
                    total += value;
                } catch (Exception xx) {
                    total += value;
                }
            }

            return total;
        }
    }
}

