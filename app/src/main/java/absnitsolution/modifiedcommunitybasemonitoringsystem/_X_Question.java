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
import android.widget.ScrollView;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class _X_Question extends Fragment {

    c_params cpar;

    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;
    LinearLayout layout,layout130,layout126,layout30,layout131,layout132;
    MaterialBetterSpinner cbo_x_127,cbo_x_128,cbo_127_1,cbo_x_129_1,cbo_x_129_2,cbo_x_125;
    EditText txt_x_127_1,txt_x_127_2,txt_x_126_8,txt_x_132_16,txt_x_130_3,txt_x_124;
    CheckBox chk_x_126_8,chk_x_132_16,chk_x_130_3;
    boolean falseall=false;
    View view;
    public _X_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment___x__question, container, false);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        this.cpar = new c_params(Config.ID, container, view);

        cbo_x_127=(MaterialBetterSpinner)view.findViewById(R.id.cbo_x_127);
        cbo_127_1=(MaterialBetterSpinner)view.findViewById(R.id.cbo_127_1);

        cbo_x_128=(MaterialBetterSpinner)view.findViewById(R.id.cbo_x_128);
        cbo_x_129_1=(MaterialBetterSpinner)view.findViewById(R.id.cbo_x_129_1);
        cbo_x_129_2=(MaterialBetterSpinner)view.findViewById(R.id.cbo_x_129_2);
        chk_x_132_16=(CheckBox)view.findViewById(R.id.chk_x_132_16);
        chk_x_126_8=(CheckBox)view.findViewById(R.id.chk_x_126_8);
        chk_x_130_3=(CheckBox)view.findViewById(R.id.chk_x_130_3);
        cbo_x_125=(MaterialBetterSpinner)view.findViewById(R.id.cbo_x_125);
        txt_x_126_8=(EditText)view.findViewById(R.id.txt_x_126_8);
        txt_x_132_16=(EditText)view.findViewById(R.id.txt_x_132_16);
        txt_x_130_3=(EditText)view.findViewById(R.id.txt_x_130_3);
        txt_x_124=(EditText)view.findViewById(R.id.txt_x_124);
        layout=(LinearLayout)view.findViewById(R.id.layout);
        layout130=(LinearLayout)view.findViewById(R.id.layout130);
        layout132=(LinearLayout)view.findViewById(R.id.layout132);
        layout131=(LinearLayout)view.findViewById(R.id.layout131);
        layout126=(LinearLayout)view.findViewById(R.id.layout126);

        da=new MainDataBaseHandler(getActivity());
        if(da._120OO(Config.ID)){
            cbo_x_128.setVisibility(View.VISIBLE);
            cbo_x_127.setVisibility(View.VISIBLE);
            cbo_x_129_1.setVisibility(View.VISIBLE);
            cbo_x_129_2.setVisibility(View.VISIBLE);
            cbo_127_1.setVisibility(View.VISIBLE);
            txt_x_124.setVisibility(View.VISIBLE);
             cbo_x_125.setVisibility(View.VISIBLE);
            layout130.setVisibility(View.VISIBLE);
            layout126.setVisibility(View.VISIBLE);
            layout131.setVisibility(View.VISIBLE);
            layout132.setVisibility(View.VISIBLE);
        }
        else {
            cbo_x_128.setVisibility(View.INVISIBLE);
            cbo_x_127.setVisibility(View.INVISIBLE);
            cbo_x_129_1.setVisibility(View.INVISIBLE);
            cbo_x_129_2.setVisibility(View.INVISIBLE);
            cbo_127_1.setVisibility(View.INVISIBLE);
            txt_x_124.setVisibility(View.INVISIBLE);
            cbo_x_125.setVisibility(View.INVISIBLE);
            layout130.setVisibility(View.INVISIBLE);
            layout126.setVisibility(View.INVISIBLE);
            layout131.setVisibility(View.INVISIBLE);
            layout132.setVisibility(View.INVISIBLE);
        }
        cbo_x_125.setText("nabawasan");
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.setEditText(R.id.txt_x_124);
        this.cpar.setDropdown(R.id.cbo_x_125, R.array.x_kumpara, "");
        this.cpar.setDropdown(R.id.cbo_127_1, R.array.oo_hindi, "Hindi");
        this.cpar.setDropdown(R.id.cbo_x_127, R.array.oo_hindi, "Hindi");
        this.cpar.setDropdown(R.id.cbo_x_128, R.array.x_128, "Ang dating binhi ay mataas ang halaga");
        this.cpar.setDropdown(R.id.cbo_x_129_1, R.array.oo_hindi, "Hindi");
        this.cpar.setDropdown(R.id.cbo_x_129_2, R.array.oo_hindi, "Hindi");
        this.cpar.setCheckBox(R.id.chk_x_126_1);
        this.cpar.setCheckBox(R.id.chk_x_126_2);
        this.cpar.setCheckBox(R.id.chk_x_126_3);
        this.cpar.setCheckBox(R.id.chk_x_126_4);
        this.cpar.setCheckBox(R.id.chk_x_126_5);
        this.cpar.setCheckBox(R.id.chk_x_126_6);
        this.cpar.setCheckBox(R.id.chk_x_126_7);
        this.cpar.setCheckBox(R.id.chk_x_126_8);
        this.cpar.setEditText(R.id.txt_x_126_8);
        this.cpar.setEditText(R.id.txt_x_ibapa_131_16);
        this.cpar.setCheckBox(R.id.chk_x_130_1);
        this.cpar.setCheckBox(R.id.chk_x_130_2);
        this.cpar.setCheckBox(R.id.chk_x_130_3);
        this.cpar.setEditText(R.id.txt_x_130_3);
        this.cpar.setEditText(R.id.txt_x_131_1);
        this.cpar.setEditText(R.id.txt_x_131_2);
        this.cpar.setEditText(R.id.txt_x_131_3);
        this.cpar.setEditText(R.id.txt_x_131_4);
        this.cpar.setEditText(R.id.txt_x_131_5);
        this.cpar.setEditText(R.id.txt_x_131_6);
        this.cpar.setEditText(R.id.txt_x_131_7);
        this.cpar.setEditText(R.id.txt_x_131_8);
        this.cpar.setEditText(R.id.txt_x_131_9);
        this.cpar.setEditText(R.id.txt_x_131_10);
        this.cpar.setEditText(R.id.txt_x_131_11);
        this.cpar.setEditText(R.id.txt_x_131_12);
        this.cpar.setEditText(R.id.txt_x_131_12);
        this.cpar.setEditText(R.id.txt_x_131_14);
        this.cpar.setEditText(R.id.txt_x_131_15);
        this.cpar.setEditText(R.id.txt_x_131_15_1);
        this.cpar.setEditText(R.id.txt_x_131_15_2);
        this.cpar.setEditText(R.id.txt_x_131_15_3);
        this.cpar.setEditText(R.id.txt_x_131_16);
        this.cpar.setCheckBox(R.id.chk_x_132_1);
        this.cpar.setCheckBox(R.id.chk_x_132_2);
        this.cpar.setCheckBox(R.id.chk_x_132_3);
        this.cpar.setCheckBox(R.id.chk_x_132_4);
        this.cpar.setCheckBox(R.id.chk_x_132_5);
        this.cpar.setCheckBox(R.id.chk_x_132_6);
        this.cpar.setCheckBox(R.id.chk_x_132_7);
        this.cpar.setCheckBox(R.id.chk_x_132_8);
        this.cpar.setCheckBox(R.id.chk_x_132_9);
        this.cpar.setCheckBox(R.id.chk_x_132_10);
        this.cpar.setCheckBox(R.id.chk_x_132_11);
        this.cpar.setCheckBox(R.id.chk_x_132_12);
        this.cpar.setCheckBox(R.id.chk_x_132_13);
        this.cpar.setCheckBox(R.id.chk_x_132_14);
        this.cpar.setCheckBox(R.id.chk_x_132_15);
        this.cpar.setCheckBox(R.id.chk_x_132_15_1);
        this.cpar.setCheckBox(R.id.chk_x_132_15_2);
        this.cpar.setCheckBox(R.id.chk_x_132_15_3);
        this.cpar.setCheckBox(R.id.chk_x_132_16);
        this.cpar.setEditText(R.id.txt_x_132_16);



        cbo_127_1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        cbo_x_128.setVisibility(View.VISIBLE);
                        break;
                    case 1:
                        
                        cbo_x_128.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });
        if(chk_x_126_8.isChecked()){
            txt_x_126_8.setVisibility(View.VISIBLE);
        }
        else{
            txt_x_126_8.setText("");
            txt_x_126_8.setVisibility(View.INVISIBLE);
        }
        chk_x_126_8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    txt_x_126_8.setVisibility( View.VISIBLE);
                    txt_x_126_8.setText("");
                }
                else{
                    txt_x_126_8.setVisibility( View.INVISIBLE);
                }
            }
        });
        if(chk_x_130_3.isChecked()){
            txt_x_130_3.setVisibility(View.VISIBLE);
        }
        else{
            txt_x_130_3.setVisibility(View.INVISIBLE);
            txt_x_130_3.setText("");
        }
        chk_x_130_3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    txt_x_130_3.setVisibility(View.VISIBLE);
                }
                else{
                    txt_x_130_3.setVisibility(View.INVISIBLE);
                    txt_x_130_3.setText("");
                }
            }
        });

        if(chk_x_132_16.isChecked()){
            txt_x_132_16.setVisibility(View.VISIBLE);
        }
        else{
            txt_x_132_16.setText("");
            txt_x_132_16.setVisibility(View.INVISIBLE);
        }
        chk_x_132_16.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if(isChecked){
                    txt_x_132_16.setVisibility(View.VISIBLE);
                }
                else{
                    txt_x_132_16.setText("");
                    txt_x_132_16.setVisibility(View.INVISIBLE);
                }

            }
        });
        cbo_x_125.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position!=0){
                    layout126.setVisibility(View.INVISIBLE);
                    Clearthis(R.id.chk_x_126_1);
                    Clearthis(R.id.chk_x_126_2);
                    Clearthis(R.id.chk_x_126_3);
                    Clearthis(R.id.chk_x_126_4);
                    Clearthis(R.id.chk_x_126_5);
                    Clearthis(R.id.chk_x_126_6);
                    Clearthis(R.id.chk_x_126_7);
                    Clearthis(R.id.chk_x_126_8);

                }
                else{
                    layout126.setVisibility(View.VISIBLE);
                }
            }
        });
        if(!cbo_x_125.getText().toString().equals("nabawasan")){
            layout126.setVisibility(View.INVISIBLE);
            Clearthis(R.id.chk_x_126_1);
            Clearthis(R.id.chk_x_126_2);
            Clearthis(R.id.chk_x_126_3);
            Clearthis(R.id.chk_x_126_4);
            Clearthis(R.id.chk_x_126_5);
            Clearthis(R.id.chk_x_126_6);
            Clearthis(R.id.chk_x_126_7);
            Clearthis(R.id.chk_x_126_8);

        }
        else{
            layout126.setVisibility(View.VISIBLE);
        }
///------------------------------------------------------------
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _P_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "P. AGRIKULTURA").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
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
        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putEditText(R.id.txt_x_124);
        this.cpar.putDropdown(R.id.cbo_x_125);
        this.cpar.putDropdown(R.id.cbo_127_1);
        this.cpar.putCheckBox(R.id.chk_x_126_1);
        this.cpar.putCheckBox(R.id.chk_x_126_2);
        this.cpar.putCheckBox(R.id.chk_x_126_3);
        this.cpar.putCheckBox(R.id.chk_x_126_4);
        this.cpar.putCheckBox(R.id.chk_x_126_5);
        this.cpar.putCheckBox(R.id.chk_x_126_6);
        this.cpar.putCheckBox(R.id.chk_x_126_7);
        this.cpar.putCheckBox(R.id.chk_x_126_8);
        this.cpar.putEditText(R.id.txt_x_126_8);
        this.cpar.putDropdown(R.id.cbo_x_127);

        this.cpar.putEditText(R.id.txt_x_ibapa_131_16);
        this.cpar.putDropdown(R.id.cbo_x_128);
        this.cpar.putDropdown(R.id.cbo_x_129_1);
        this.cpar.putDropdown(R.id.cbo_x_129_2);
        this.cpar.putCheckBox(R.id.chk_x_130_1);
        this.cpar.putCheckBox(R.id.chk_x_130_2);
        this.cpar.putCheckBox(R.id.chk_x_130_3);
        this.cpar.putEditText(R.id.txt_x_130_3);
        this.cpar.putEditText(R.id.txt_x_131_1);
        this.cpar.putEditText(R.id.txt_x_131_2);
        this.cpar.putEditText(R.id.txt_x_131_3);
        this.cpar.putEditText(R.id.txt_x_131_4);
        this.cpar.putEditText(R.id.txt_x_131_5);
        this.cpar.putEditText(R.id.txt_x_131_6);
        this.cpar.putEditText(R.id.txt_x_131_7);
        this.cpar.putEditText(R.id.txt_x_131_8);
        this.cpar.putEditText(R.id.txt_x_131_9);
        this.cpar.putEditText(R.id.txt_x_131_10);
        this.cpar.putEditText(R.id.txt_x_131_11);
        this.cpar.putEditText(R.id.txt_x_131_12);
        this.cpar.putEditText(R.id.txt_x_131_12);
        this.cpar.putEditText(R.id.txt_x_131_14);
        this.cpar.putEditText(R.id.txt_x_131_15);
        this.cpar.putEditText(R.id.txt_x_131_15_1);
        this.cpar.putEditText(R.id.txt_x_131_15_2);
        this.cpar.putEditText(R.id.txt_x_131_15_3);
        this.cpar.putEditText(R.id.txt_x_131_16);
        this.cpar.putCheckBox(R.id.chk_x_132_1);
        this.cpar.putCheckBox(R.id.chk_x_132_2);
        this.cpar.putCheckBox(R.id.chk_x_132_3);
        this.cpar.putCheckBox(R.id.chk_x_132_4);
        this.cpar.putCheckBox(R.id.chk_x_132_5);
        this.cpar.putCheckBox(R.id.chk_x_132_6);
        this.cpar.putCheckBox(R.id.chk_x_132_7);
        this.cpar.putCheckBox(R.id.chk_x_132_8);
        this.cpar.putCheckBox(R.id.chk_x_132_9);
        this.cpar.putCheckBox(R.id.chk_x_132_10);
        this.cpar.putCheckBox(R.id.chk_x_132_11);
        this.cpar.putCheckBox(R.id.chk_x_132_12);
        this.cpar.putCheckBox(R.id.chk_x_132_13);
        this.cpar.putCheckBox(R.id.chk_x_132_14);
        this.cpar.putCheckBox(R.id.chk_x_132_15);
        this.cpar.putCheckBox(R.id.chk_x_132_15_1);
        this.cpar.putCheckBox(R.id.chk_x_132_15_2);
        this.cpar.putCheckBox(R.id.chk_x_132_15_3);
        this.cpar.putCheckBox(R.id.chk_x_132_16);
        this.cpar.putEditText(R.id.txt_x_132_16);
        da.c_Update(cpar);
        super.onDestroy();
    }

    public void Clearthis(int R){


        try{CheckBox box=(CheckBox)view.findViewById(R); box.setChecked(false);}catch (Exception xx){}
        try{EditText text=(EditText)view.findViewById(R); text.setText("");}catch (Exception xx){}

    }
private void asdfwef(){
    falseall=cbo_x_129_2.getText().toString().equals("Hindi")&&cbo_x_129_1.getText().toString().equals("Hindi");
    layout130.setVisibility(View.VISIBLE);
    if(falseall){
        layout130.setVisibility(View.INVISIBLE);
    }
}
}

