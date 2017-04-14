package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;
import android.widget.CompoundButton;
import android.widget.LinearLayout;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class _L_Question extends Fragment {

    c_params cpar;
    MaterialBetterSpinner cbo_l_78_1;
    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;
    Button btn_compute;
    //first row
    EditText txt_l_80_1, txt_l_80_2, txt_l_80_3, txt_l_80_4, txt_l_80_5, txt_l_80_6;
    //sencond row
    EditText txt_l_81_1, txt_l_81_2, txt_l_81_3, txt_l_81_4, txt_l_81_5, txt_l_81_6;
    //
    EditText txt_l_78_6, txt_l_79_1, txt_l_79_2, txt_l_79_3, txt_l_79_4, txt_l_79_5, txt_l_79_6;

    CheckBox  chk_l_78_1, chk_l_78_2, chk_l_78_3, chk_l_78_4 ,chk_l_78_5   ;

    LinearLayout layout;

    public _L_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment___l__question, container, false);

        this.cpar = new c_params(Config.ID, container, view);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        btn_compute = (Button) view.findViewById(R.id.btn_compute);
        cbo_l_78_1 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_l_78);

        txt_l_79_1 = (EditText) view.findViewById(R.id.txt_l_79_1);
        txt_l_79_2 = (EditText) view.findViewById(R.id.txt_l_79_2);
        txt_l_79_3 = (EditText) view.findViewById(R.id.txt_l_79_3);
        txt_l_79_4 = (EditText) view.findViewById(R.id.txt_l_79_4);
        txt_l_79_5 = (EditText) view.findViewById(R.id.txt_l_79_5);
        txt_l_79_6 = (EditText) view.findViewById(R.id.txt_l_79_6);

        txt_l_80_1 = (EditText) view.findViewById(R.id.txt_l_80_1);
        txt_l_80_2 = (EditText) view.findViewById(R.id.txt_l_80_2);
        txt_l_80_3 = (EditText) view.findViewById(R.id.txt_l_80_3);
        txt_l_80_4 = (EditText) view.findViewById(R.id.txt_l_80_4);
        txt_l_80_5 = (EditText) view.findViewById(R.id.txt_l_80_5);
        txt_l_80_6 = (EditText) view.findViewById(R.id.txt_l_80_6);

        txt_l_81_1 = (EditText) view.findViewById(R.id.txt_l_81_1);
        txt_l_81_2 = (EditText) view.findViewById(R.id.txt_l_81_2);
        txt_l_81_3 = (EditText) view.findViewById(R.id.txt_l_81_3);
        txt_l_81_4 = (EditText) view.findViewById(R.id.txt_l_81_4);
        txt_l_81_5 = (EditText) view.findViewById(R.id.txt_l_81_5);
        txt_l_81_6 = (EditText) view.findViewById(R.id.txt_l_81_6);

        txt_l_78_6 = (EditText) view.findViewById(R.id.txt_l_78_6);


        //checkboxes
        chk_l_78_1 = (CheckBox) view.findViewById(R.id.chk_l_78_1);
        chk_l_78_2 = (CheckBox) view.findViewById(R.id.chk_l_78_2);
        chk_l_78_3 = (CheckBox) view.findViewById(R.id.chk_l_78_3);
        chk_l_78_4 = (CheckBox) view.findViewById(R.id.chk_l_78_4);
        chk_l_78_5 = (CheckBox) view.findViewById(R.id.chk_l_78_5);

        layout = (LinearLayout) view.findViewById(R.id.layout);


        // disable editext


        txt_l_79_1.setEnabled(false);
        txt_l_79_2.setEnabled(false);
        txt_l_79_3.setEnabled(false);
        txt_l_79_4.setEnabled(false);
        txt_l_79_5.setEnabled(false);

        txt_l_80_1.setEnabled(false);
        txt_l_80_2.setEnabled(false);
        txt_l_80_3.setEnabled(false);
        txt_l_80_4.setEnabled(false);
        txt_l_80_5.setEnabled(false);

        txt_l_81_1.setEnabled(false);
        txt_l_81_2.setEnabled(false);
        txt_l_81_3.setEnabled(false);
        txt_l_81_4.setEnabled(false);
        txt_l_81_5.setEnabled(false);

        this.cpar.setDropdown(R.id.cbo_l_78, R.array.oo_hindi, "Oo");
     
        this.cpar.setEditText(R.id.txt_l_80_1);
        this.cpar.setEditText(R.id.txt_l_81_1);
        this.cpar.setEditText(R.id.txt_l_79_1);
        this.cpar.setEditText(R.id.txt_l_80_2);
        this.cpar.setEditText(R.id.txt_l_81_2);
        this.cpar.setEditText(R.id.txt_l_79_2);
        this.cpar.setEditText(R.id.txt_l_80_3);
        this.cpar.setEditText(R.id.txt_l_81_3);
        this.cpar.setEditText(R.id.txt_l_79_3);
        this.cpar.setEditText(R.id.txt_l_80_4);
        this.cpar.setEditText(R.id.txt_l_81_4);
        this.cpar.setEditText(R.id.txt_l_79_4);
        this.cpar.setEditText(R.id.txt_l_80_5);
        this.cpar.setEditText(R.id.txt_l_81_5);
        this.cpar.setEditText(R.id.txt_l_79_5);
        this.cpar.setEditText(R.id.txt_l_78_6);
        this.cpar.setEditText(R.id.txt_l_80_6);
        this.cpar.setEditText(R.id.txt_l_81_6);
        this.cpar.setEditText(R.id.txt_l_79_6);

        this.cpar.setCheckBox(R.id.chk_l_78_1);
        this.cpar.setCheckBox(R.id.chk_l_78_2);
        this.cpar.setCheckBox(R.id.chk_l_78_3);
        this.cpar.setCheckBox(R.id.chk_l_78_4);
        this.cpar.setCheckBox(R.id.chk_l_78_5);





        cbo_l_78_1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 1) {

                    layout.setVisibility(View.INVISIBLE);
                    cleartxt();

                } else {
                    layout.setVisibility(View.VISIBLE);
                }
            }
        });



          chk_l_78_1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_l_78_1.isChecked())
                {
                    txt_l_80_1.setEnabled(true);
                    txt_l_81_1.setEnabled(true);
                    txt_l_79_1.setEnabled(true);

                }
                else
                {
                    txt_l_80_1.setEnabled(false);
                    txt_l_81_1.setEnabled(false);
                    txt_l_79_1.setEnabled(false);
                }
            }
        });


          chk_l_78_2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_l_78_2.isChecked())
                {
                    txt_l_80_2.setEnabled(true);
                    txt_l_81_2.setEnabled(true);
                    txt_l_79_2.setEnabled(true);

                }
                else
                {
                    txt_l_80_2.setEnabled(false);
                    txt_l_81_2.setEnabled(false);
                    txt_l_79_2.setEnabled(false);
                }
            }
        });



          chk_l_78_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_l_78_3.isChecked())
                {
                    txt_l_80_3.setEnabled(true);
                    txt_l_81_3.setEnabled(true);
                    txt_l_79_3.setEnabled(true);

                }
                else
                {
                    txt_l_80_3.setEnabled(false);
                    txt_l_81_3.setEnabled(false);
                    txt_l_79_3.setEnabled(false);
                }
            }
        });


          chk_l_78_4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_l_78_4.isChecked())
                {
                    txt_l_80_4.setEnabled(true);
                    txt_l_81_4.setEnabled(true);
                    txt_l_79_4.setEnabled(true);

                }
                else
                {
                    txt_l_80_4.setEnabled(false);
                    txt_l_81_4.setEnabled(false);
                    txt_l_79_4.setEnabled(false);
                }
            }
        });



          chk_l_78_5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk_l_78_5.isChecked())
                {
                    txt_l_80_5.setEnabled(true);
                    txt_l_81_5.setEnabled(true);
                    txt_l_79_5.setEnabled(true);

                }
                else
                {
                    txt_l_80_5.setEnabled(false);
                    txt_l_81_5.setEnabled(false);
                    txt_l_79_5.setEnabled(false);
                }
            }
        });










        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _J_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "J. KALUSUGAN").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!cbo_l_78_1.getText().equals("Select One") || !cbo_l_78_1.getText().equals("")) {
                    Fragment fragment = null;
                    try {
                        fragment = _M_Question.class.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // Insert the fragment by replacing any existing fragment
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.frame, fragment, "M. TUBIG AT KALIKASAN").commit();
                } else {
                    Toast.makeText(getActivity(), "Fill up all important fields.", Toast.LENGTH_SHORT).show();
                }

            }
        });
        btn_compute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Sum sum = new Sum();
                sum.Add(txt_l_80_1);
                sum.Add(txt_l_81_1);
                txt_l_79_1.setText(String.valueOf(sum.getTotal()));
                sum.Reset();

                sum.Add(txt_l_80_2);
                sum.Add(txt_l_81_2);
                txt_l_79_2.setText(String.valueOf(sum.getTotal()));
                sum.Reset();

                sum.Add(txt_l_80_3);
                sum.Add(txt_l_81_3);
                txt_l_79_3.setText(String.valueOf(sum.getTotal()));
                sum.Reset();

                sum.Add(txt_l_80_4);
                sum.Add(txt_l_81_4);
                txt_l_79_4.setText(String.valueOf(sum.getTotal()));
                sum.Reset();

                sum.Add(txt_l_80_5);
                sum.Add(txt_l_81_5);
                txt_l_79_5.setText(String.valueOf(sum.getTotal()));
                sum.Reset();

                sum.Add(txt_l_80_6);
                sum.Add(txt_l_81_6);
                txt_l_79_6.setText(String.valueOf(sum.getTotal()));
                sum.Reset();
            }
        });
        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putEditText(R.id.txt_l_80_1);
        this.cpar.putEditText(R.id.txt_l_81_1);
        this.cpar.putEditText(R.id.txt_l_79_1);
        this.cpar.putEditText(R.id.txt_l_80_2);
        this.cpar.putEditText(R.id.txt_l_81_2);
        this.cpar.putEditText(R.id.txt_l_79_2);
        this.cpar.putEditText(R.id.txt_l_80_3);
        this.cpar.putEditText(R.id.txt_l_81_3);
        this.cpar.putEditText(R.id.txt_l_79_3);
        this.cpar.putEditText(R.id.txt_l_80_4);
        this.cpar.putEditText(R.id.txt_l_81_4);
        this.cpar.putEditText(R.id.txt_l_79_4);
        this.cpar.putEditText(R.id.txt_l_80_5);
        this.cpar.putEditText(R.id.txt_l_81_5);
        this.cpar.putEditText(R.id.txt_l_79_5);
        this.cpar.putEditText(R.id.txt_l_78_6);

        this.cpar.putEditText(R.id.txt_l_80_6);
        this.cpar.putEditText(R.id.txt_l_81_6);
        this.cpar.putEditText(R.id.txt_l_79_6);
        this.cpar.putDropdown(R.id.cbo_l_78);

        this.cpar.putCheckBox(R.id.chk_l_78_1);
        this.cpar.putCheckBox(R.id.chk_l_78_2);
        this.cpar.putCheckBox(R.id.chk_l_78_3);
        this.cpar.putCheckBox(R.id.chk_l_78_4);
        this.cpar.putCheckBox(R.id.chk_l_78_5);

        
        da.c_Update(cpar);
        super.onDestroy();
    }

    public void cleartxt()
    {
        chk_l_78_1.setChecked(false);
        chk_l_78_2.setChecked(false);
        chk_l_78_3.setChecked(false);
        chk_l_78_4.setChecked(false);
        chk_l_78_5.setChecked(false);
        txt_l_79_1.setText("");
        txt_l_79_2.setText("");
        txt_l_79_3.setText("");
        txt_l_79_4.setText("");
        txt_l_79_5.setText("");
        txt_l_79_6.setText("");

        txt_l_80_1.setText("");
        txt_l_80_2.setText("");
        txt_l_80_3.setText("");
        txt_l_80_4.setText("");
        txt_l_80_5.setText("");
        txt_l_80_6.setText("");

        txt_l_81_1.setText("");
        txt_l_81_2.setText("");
        txt_l_81_3.setText("");
        txt_l_81_4.setText("");
        txt_l_81_5.setText("");
        txt_l_81_6.setText("");

        txt_l_78_6.setText("");

    }





    public class Sum {
        List<String> list = new ArrayList<String>();
        int total = 0;

        public void Add(EditText txt) {
            list.add(txt.getText().toString());
        }

        public void Add(int txt) {
            list.add(String.valueOf(txt));
        }

        public void Reset() {
            total = 0;
            list.clear();
        }

        public int getTotal() {

            for (String val : list) {
                int value = 0;
                try {
                    value = Integer.valueOf(val);
                    total += value;
                } catch (Exception xx) {
                    total += value;
                }
            }

            return total;
        }
    }
}
