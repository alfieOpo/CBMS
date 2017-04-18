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
    LinearLayout layout,layout130;
    MaterialBetterSpinner cbo_x_127,cbo_x_128,cbo_127_1,cbo_x_129_1,cbo_x_129_2;
    EditText txt_x_127_1,txt_x_127_2,txt_x_126_8,txt_x_132_16,txt_x_130_3;
    CheckBox chk_x_126_8,chk_x_132_16,chk_x_130_3;
    boolean falseall=false;
    public _X_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment___x__question, container, false);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        layout130=(LinearLayout)view.findViewById(R.id.layout130);
        layout=(LinearLayout)view.findViewById(R.id.layout);
        cbo_x_127=(MaterialBetterSpinner)view.findViewById(R.id.cbo_x_127);
        cbo_127_1=(MaterialBetterSpinner)view.findViewById(R.id.cbo_127_1);
        cbo_x_128=(MaterialBetterSpinner)view.findViewById(R.id.cbo_x_128);
        cbo_x_129_1=(MaterialBetterSpinner)view.findViewById(R.id.cbo_x_128);
        cbo_x_129_2=(MaterialBetterSpinner)view.findViewById(R.id.cbo_x_128);
        chk_x_132_16=(CheckBox)view.findViewById(R.id.chk_x_132_16);
        chk_x_126_8=(CheckBox)view.findViewById(R.id.chk_x_126_8);
        chk_x_130_3=(CheckBox)view.findViewById(R.id.chk_x_130_3);

        txt_x_126_8=(EditText)view.findViewById(R.id.txt_x_126_8);
        txt_x_132_16=(EditText)view.findViewById(R.id.txt_x_132_16);
        txt_x_130_3=(EditText)view.findViewById(R.id.txt_x_130_3);
        da=new MainDataBaseHandler(getActivity());
        if(da._120OO(Config.ID)){
            layout.setVisibility(View.VISIBLE);
        }
        else {
            layout.setVisibility(View.INVISIBLE);

        }
        this.cpar = new c_params(Config.ID, container, view);


        this.cpar.setEditText(R.id.txt_x_124);
        this.cpar.setDropdown(R.id.cbo_x_125, R.array.x_kumpara, "Select One");
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
                        cbo_x_128.setText("Hindi");
                        cbo_x_128.setVisibility(View.INVISIBLE);
                        break;
                }
            }
        });

        cbo_x_129_1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:

                        falseall=true;
                        break;
                    case 1:
                        falseall=false;
                        break;
                }
            }
        });
        cbo_x_129_2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:

                        falseall=true;
                        break;
                    case 1:
                        falseall=false;
                        break;
                }
                layout130.setVisibility(View.VISIBLE);
                if(falseall){
                    layout130.setVisibility(View.INVISIBLE);
                }
            }
        });

        falseall=cbo_x_129_2.getText().toString().equals("Hindi")&&cbo_x_129_1.getText().toString().equals("Hindi");
        layout130.setVisibility(View.VISIBLE);
        if(falseall){
            layout130.setVisibility(View.INVISIBLE);
        }

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
}

