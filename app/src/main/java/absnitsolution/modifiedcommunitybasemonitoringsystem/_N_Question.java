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
import android.widget.TextView;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class _N_Question extends Fragment {

    c_params cpar;
    ImageButton btn_back, btn_next;
    MainDataBaseHandler da;
    MaterialBetterSpinner cbo_n_85, cbo_n_87, cbo_o_nakatirik,cbo_n_88,cbo_oo_nakatirik;
    EditText txt_n_86,txt_n_89,txt_n_ibapa_88,txt_n_ibapa_94,txt_n_ibapa_gamit,txt_n_ibapa_85;
    TextView textView27,textView24,textView26;
    CheckBox chk_n_ibapa_gamit;
    LinearLayout layout90;
    View view;
    public _N_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
          view = inflater.inflate(R.layout.fragment___n__question, container, false);


        this.cpar = new c_params(Config.ID, container, view);

        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        cbo_n_85 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_n_85);
        cbo_n_87 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_n_87);
        cbo_o_nakatirik = (MaterialBetterSpinner) view.findViewById(R.id.cbo_o_nakatirik);
        //-----
        cbo_n_88= (MaterialBetterSpinner) view.findViewById(R.id.cbo_n_88);
        txt_n_89= (EditText) view.findViewById(R.id.txt_n_89);
        txt_n_ibapa_88= (EditText) view.findViewById(R.id.txt_n_ibapa_88);
        textView27 =(TextView)view.findViewById(R.id.textView27);
        textView24=(TextView)view.findViewById(R.id.textView24);
        layout90=(LinearLayout)view.findViewById(R.id.layout90);
        textView26 =(TextView)view.findViewById(R.id.textView26);
        //---------------------------
        cbo_oo_nakatirik = (MaterialBetterSpinner) view.findViewById(R.id.cbo_oo_nakatirik);
        txt_n_ibapa_94 = (EditText) view.findViewById(R.id.txt_n_ibapa_94);
        //-----------------
        txt_n_ibapa_gamit= (EditText) view.findViewById(R.id.txt_n_ibapa_gamit);
        chk_n_ibapa_gamit=(CheckBox)view.findViewById(R.id.chk_n_ibapa_gamit);
        //-----------------------------------
        txt_n_ibapa_85= (EditText) view.findViewById(R.id.txt_n_ibapa_85);
        txt_n_86 = (EditText) view.findViewById(R.id.txt_n_86);
        this.cpar.setDropdown(R.id.cbo_n_85, R.array.n_katayuan, "Pag-aari ang bahay at lupa");
        this.cpar.setDropdown(R.id.cbo_n_87, R.array.meron_wala, "Mayroon");
        this.cpar.setDropdown(R.id.cbo_n_88, R.array.n_saangaling_kuryente, "Meralco - Sarili");
        this.cpar.setDropdown(R.id.cbo_o_nakatirik, R.array.oo_hindi, "Oo");
        this.cpar.setDropdown(R.id.cbo_oo_nakatirik, R.array.n_kungnakatirik, "Binabahang lugar");
        if(cbo_oo_nakatirik.getText().toString().equals("Iba pa, Itala ___")){
            txt_n_ibapa_94.setVisibility(View.INVISIBLE);
            txt_n_ibapa_94.setText("");
        }
        this.cpar.setEditText(R.id.txt_n_ibapa_85);
        this.cpar.setEditText(R.id.txt_n_ibapa_88);
        this.cpar.setEditText(R.id.txt_n_86);
        this.cpar.setEditText(R.id.txt_n_89);
        this.cpar.setCheckBox(R.id.chk_n_radio);
        this.cpar.setCheckBox(R.id.chk_n_telebisyon);
        this.cpar.setCheckBox(R.id.chk_n_cd);
        this.cpar.setCheckBox(R.id.chk_n_stereo);
        this.cpar.setCheckBox(R.id.chk_n_karaoke);
        this.cpar.setCheckBox(R.id.chk_n_refrigerator);
        this.cpar.setCheckBox(R.id.chk_n_electricfan);
        this.cpar.setCheckBox(R.id.chk_n_electriciron);
        this.cpar.setCheckBox(R.id.chk_n_lpg);
        this.cpar.setCheckBox(R.id.chk_n_washing);
        this.cpar.setCheckBox(R.id.chk_n_microwave);
        this.cpar.setCheckBox(R.id.chk_n_computer);
        this.cpar.setCheckBox(R.id.chk_n_mobilephone);
        this.cpar.setCheckBox(R.id.chk_n_landline);
        this.cpar.setCheckBox(R.id.chk_n_aircon);
        this.cpar.setCheckBox(R.id.chk_n_sewing);
        this.cpar.setCheckBox(R.id.chk_n_car);
        this.cpar.setCheckBox(R.id.chk_n_ibapa_gamit);
        this.cpar.setEditText(R.id.txt_n_ibapa_gamit);
        this.cpar.setCheckBox(R.id.chk_n_91_1);
        this.cpar.setCheckBox(R.id.chk_n_91_2);
        this.cpar.setCheckBox(R.id.chk_n_91_3);
        this.cpar.setCheckBox(R.id.chk_n_91_4);
        this.cpar.setCheckBox(R.id.chk_n_91_5);
        this.cpar.setCheckBox(R.id.chk_n_91_6);
        this.cpar.setCheckBox(R.id.chk_n_92_1);
        this.cpar.setCheckBox(R.id.chk_n_92_2);
        this.cpar.setCheckBox(R.id.chk_n_92_3);
        this.cpar.setCheckBox(R.id.chk_n_92_4);
        this.cpar.setCheckBox(R.id.chk_n_92_5);
        this.cpar.setCheckBox(R.id.chk_n_92_6);
        this.cpar.setEditText(R.id.txt_n_ibapa_94);

        if(!txt_n_86.getText().toString().equals("")){
            try{

                double value=Double.parseDouble(txt_n_86.getText().toString());
                txt_n_86.setText(Config.toCurrency(value));

            }catch (Exception xx){

            }
        }
        if(!txt_n_89.getText().toString().equals("")){
            try{

                double value=Double.parseDouble(txt_n_89.getText().toString());
                txt_n_89.setText(Config.toCurrency(value));

            }catch (Exception xx){

            }
        }

        if(cbo_n_88.getText().toString().equals("Iba pa, itala")){

            txt_n_ibapa_88.setVisibility(View.VISIBLE);
        }
        else{

            txt_n_ibapa_88.setText("");
            txt_n_ibapa_88.setVisibility(View.INVISIBLE);
        }
        cbo_n_88.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==5){
                    txt_n_ibapa_88.setVisibility(View.VISIBLE);
                }
                else {
                    txt_n_ibapa_88.setText("");
                    txt_n_ibapa_88.setVisibility(View.INVISIBLE);
                }
            }
        });



        if(cbo_n_85.getText().toString().equals("Iba pa, (itala)")){

            txt_n_ibapa_85.setVisibility(View.VISIBLE);
            txt_n_86.setVisibility(View.VISIBLE);
        }
        else{

            txt_n_ibapa_85.setText("");
            txt_n_ibapa_85.setVisibility(View.INVISIBLE);

        }

        cbo_n_85.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==1){
                    txt_n_86.setVisibility(View.INVISIBLE);
                    txt_n_86.setText("");
                    textView24.setVisibility(View.INVISIBLE);

                    txt_n_ibapa_85.setVisibility(View.INVISIBLE);
                    txt_n_ibapa_85.setText("");
                }
                else if(position ==7){
                    txt_n_ibapa_85.setVisibility(View.VISIBLE);
                }
                else{
                    txt_n_ibapa_85.setVisibility(View.INVISIBLE);
                    txt_n_ibapa_85.setText("");

                    textView24.setVisibility(View.VISIBLE);
                    txt_n_86.setVisibility(View.VISIBLE);
                }
            }
        });




        cbo_n_87.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==1){
                    cbo_n_88.setVisibility(View.INVISIBLE);
                    cbo_n_88.setText("Select One");
                    txt_n_89.setVisibility(View.INVISIBLE);
                    txt_n_89.setText("");
                    txt_n_ibapa_88.setVisibility(View.INVISIBLE);
                    txt_n_ibapa_88.setText("");
                    textView27.setVisibility(View.INVISIBLE);
                    textView26.setVisibility(View.INVISIBLE);

                    layout90.setVisibility(View.INVISIBLE);

                    Clearthis(R.id.chk_n_radio);
                    Clearthis(R.id.chk_n_telebisyon);
                    Clearthis(R.id.chk_n_cd);
                    Clearthis(R.id.chk_n_stereo);
                    Clearthis(R.id.chk_n_karaoke);
                    Clearthis(R.id.chk_n_refrigerator);
                    Clearthis(R.id.chk_n_electricfan);
                    Clearthis(R.id.chk_n_electriciron);
                    Clearthis(R.id.chk_n_lpg);
                    Clearthis(R.id.chk_n_washing);
                    Clearthis(R.id.chk_n_microwave);
                    Clearthis(R.id.chk_n_computer);
                    Clearthis(R.id.chk_n_mobilephone);
                    Clearthis(R.id.chk_n_landline);
                    Clearthis(R.id.chk_n_aircon);
                    Clearthis(R.id.chk_n_sewing);
                    Clearthis(R.id.chk_n_car);
                    Clearthis(R.id.chk_n_ibapa_gamit);
                    Clearthis(R.id.txt_n_ibapa_gamit);
                }
                else{
                    textView26.setVisibility(View.VISIBLE);
                    cbo_n_88.setVisibility(View.VISIBLE);
                    txt_n_89.setVisibility(View.VISIBLE);
                    txt_n_ibapa_88.setVisibility(View.VISIBLE);
                    textView27.setVisibility(View.VISIBLE);
                    layout90.setVisibility(View.VISIBLE);





                }

            }
        });




        if(cbo_o_nakatirik.getText().toString().equals("Oo")){

            cbo_oo_nakatirik.setVisibility(View.VISIBLE);
            txt_n_ibapa_94.setVisibility(View.VISIBLE);

        }
        else{

            cbo_oo_nakatirik.setVisibility(View.INVISIBLE);
            txt_n_ibapa_94.setVisibility(View.INVISIBLE);
            txt_n_ibapa_94.setText("");
        }
        cbo_o_nakatirik.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==1){
                    cbo_oo_nakatirik.setVisibility(View.INVISIBLE);
                    txt_n_ibapa_94.setVisibility(View.INVISIBLE);
                    txt_n_ibapa_94.setText("");
                }
                else
                {
                    cbo_oo_nakatirik.setVisibility(View.VISIBLE);
                    txt_n_ibapa_94.setVisibility(View.VISIBLE);
                }
            }
        });

        if(chk_n_ibapa_gamit.isChecked()){
            txt_n_ibapa_gamit.setVisibility(View.VISIBLE);
        }
        else{
            txt_n_ibapa_gamit.setVisibility(View.INVISIBLE);
            txt_n_ibapa_gamit.setText("");
        }
        chk_n_ibapa_gamit.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    txt_n_ibapa_gamit.setVisibility(View.VISIBLE);
                }
                else{
                    txt_n_ibapa_gamit.setVisibility(View.INVISIBLE);
                    txt_n_ibapa_gamit.setText("");
                }
            }
        });
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _M_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "M. TUBIG AT KALINISAN").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!cbo_n_85.getText().equals("Select One") || !cbo_n_85.getText().equals("") && !cbo_n_87.getText().equals("Select One") || !cbo_n_87.getText().equals("") && !cbo_o_nakatirik.getText().equals("Select One") || !cbo_o_nakatirik.getText().equals("")) {
                    Fragment fragment = null;
                    try {
                        fragment = _O_Question.class.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // Insert the fragment by replacing any existing fragment
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.frame, fragment, "O. PINAGKUKUNAN NG KITA NG PAMILYA").commit();
                } else {
                    Toast.makeText(getActivity(), "Fill up all important fields.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        cbo_oo_nakatirik.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==3){
                    txt_n_ibapa_94.setVisibility(View.VISIBLE);
                }
                else{
                    txt_n_ibapa_94.setVisibility(View.INVISIBLE);
                    txt_n_ibapa_94.setText("");
                }
            }
        });

        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putDropdown(R.id.cbo_n_85);
        this.cpar.putEditText(R.id.txt_n_ibapa_85);
        this.cpar.putEditText(R.id.txt_n_86);
        this.cpar.putEditText(R.id.txt_n_ibapa_88);
        this.cpar.putDropdown(R.id.cbo_n_87);
        this.cpar.putDropdown(R.id.cbo_n_88);
        this.cpar.putEditText(R.id.txt_n_89);
        this.cpar.putCheckBox(R.id.chk_n_radio);
        this.cpar.putCheckBox(R.id.chk_n_telebisyon);
        this.cpar.putCheckBox(R.id.chk_n_cd);
        this.cpar.putCheckBox(R.id.chk_n_stereo);
        this.cpar.putCheckBox(R.id.chk_n_karaoke);
        this.cpar.putCheckBox(R.id.chk_n_refrigerator);
        this.cpar.putCheckBox(R.id.chk_n_electricfan);
        this.cpar.putCheckBox(R.id.chk_n_electriciron);
        this.cpar.putCheckBox(R.id.chk_n_lpg);
        this.cpar.putCheckBox(R.id.chk_n_washing);
        this.cpar.putCheckBox(R.id.chk_n_microwave);
        this.cpar.putCheckBox(R.id.chk_n_computer);
        this.cpar.putCheckBox(R.id.chk_n_mobilephone);
        this.cpar.putCheckBox(R.id.chk_n_landline);
        this.cpar.putCheckBox(R.id.chk_n_aircon);
        this.cpar.putCheckBox(R.id.chk_n_sewing);
        this.cpar.putCheckBox(R.id.chk_n_car);
        this.cpar.putCheckBox(R.id.chk_n_ibapa_gamit);
        this.cpar.putEditText(R.id.txt_n_ibapa_gamit);
        this.cpar.putCheckBox(R.id.chk_n_91_1);
        this.cpar.putCheckBox(R.id.chk_n_91_2);
        this.cpar.putCheckBox(R.id.chk_n_91_3);
        this.cpar.putCheckBox(R.id.chk_n_91_4);
        this.cpar.putCheckBox(R.id.chk_n_91_5);
        this.cpar.putCheckBox(R.id.chk_n_91_6);
        this.cpar.putCheckBox(R.id.chk_n_92_1);
        this.cpar.putCheckBox(R.id.chk_n_92_2);
        this.cpar.putCheckBox(R.id.chk_n_92_3);
        this.cpar.putCheckBox(R.id.chk_n_92_4);
        this.cpar.putCheckBox(R.id.chk_n_92_5);
        this.cpar.putCheckBox(R.id.chk_n_92_6);
        this.cpar.putDropdown(R.id.cbo_o_nakatirik);
        this.cpar.putDropdown(R.id.cbo_oo_nakatirik);
        this.cpar.putEditText(R.id.txt_n_ibapa_94);
        da.c_Update(cpar);
        super.onDestroy();
    }

    public void Clearthis(int R){


        try{CheckBox box=(CheckBox)view.findViewById(R); box.setChecked(false);}catch (Exception xx){}
        try{EditText text=(EditText)view.findViewById(R); text.setText("");}catch (Exception xx){}

    }
}
