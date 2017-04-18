package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.icu.text.NumberFormat;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class _P_Question extends Fragment {

    c_params cpar;

    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;
    MaterialBetterSpinner cbo_converter,cbo_nag_sasaka,cbo_p_120;
    EditText txt_equals,txt_p_121,txt_p_120;
    LinearLayout layout;
    public _P_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment___p__question, container, false);

        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        this.cpar = new c_params(Config.ID, container, view);
        layout=(LinearLayout)view.findViewById(R.id.layout);
        cbo_converter=(MaterialBetterSpinner)view.findViewById(R.id.cbo_converter);
        cbo_nag_sasaka=(MaterialBetterSpinner)view.findViewById(R.id.cbo_nag_sasaka);
        cbo_p_120=(MaterialBetterSpinner)view.findViewById(R.id.cbo_p_120);
        txt_equals=(EditText) view.findViewById(R.id.txt_equals);
        txt_p_121=(EditText) view.findViewById(R.id.txt_p_121);
        txt_p_120=(EditText) view.findViewById(R.id.txt_p_120);
        this.cpar.setDropdown(R.id.cbo_p_120, R.array.p_katayuan_sinasaka, "N/A");
        this.cpar.setDropdown(R.id.cbo_converter, R.array.area, "Select One");
        this.cpar.setDropdown(R.id.cbo_nag_sasaka, R.array.oo_hindi, "Oo");
        this.cpar.setEditText(R.id.txt_p_120);
        this.cpar.setEditText(R.id.txt_equals);
        this.cpar.setEditText(R.id.txt_p_121_1);
        this.cpar.setEditText(R.id.txt_p_123_1);
        this.cpar.setEditText(R.id.txt_p_123_2);
        this.cpar.setEditText(R.id.txt_p_123_3);
        this.cpar.setEditText(R.id.txt_p_ibapa_123_5);
        this.cpar.setEditText(R.id.txt_p_123_4);
        this.cpar.setEditText(R.id.txt_p_123_5);
        txt_equals.setEnabled(false);

        cbo_converter.setOnItemClickListener(new AdapterView.OnItemClickListener()  {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                double mainvalue=0;

                try {
                    mainvalue=Double.valueOf(txt_p_121.getText().toString());
                }
                catch (Exception xx){

                }
                if(position==0){
                    txt_equals.setText(Config.toCurrency(mainvalue).replace(".00","")+" sq.m");
                }

                else if(position ==1){
                    double value=(mainvalue * 10000);
                    txt_equals.setText(Config.toCurrency(value).replace(".00","")+" sq.m");
                }
            }
        });

        cbo_nag_sasaka.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==1){
                    layout.setVisibility(View.INVISIBLE);
                }
                else {
                    layout.setVisibility(View.VISIBLE);
                }
            }
        });
        if(cbo_p_120.getText().toString().equals("Iba pa, itala")){


            txt_p_120.setVisibility(View.VISIBLE);

        }
        else{


            txt_p_120.setVisibility(View.INVISIBLE);
            txt_p_120.setText("");
        }
        cbo_p_120.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==5){
                    txt_p_120.setVisibility(View.VISIBLE);

                }
                else{
                    txt_p_120.setVisibility(View.INVISIBLE);
                    txt_p_120.setText("");
                }
            }
        });

        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _O_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "O. PINAGMUMULAN NG KITA NG PAMILYA").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                da = new MainDataBaseHandler(getActivity().getApplicationContext());
                cpar.putDropdown(R.id.cbo_p_120);
                cpar.putEditText(R.id.txt_p_120);
                cpar.putEditText(R.id.txt_p_121_1);
                cpar.putEditText(R.id.txt_p_123_1);
                cpar.putEditText(R.id.txt_p_123_3);
                cpar.putEditText(R.id.txt_p_123_4);
                cpar.putEditText(R.id.txt_p_123_5);
                cpar.putEditText(R.id.txt_p_ibapa_123_5);
                cpar.putDropdown(R.id.cbo_converter);
                cpar.putEditText(R.id.txt_equals);
                cpar.putEditText(R.id.txt_p_123_2);
                cpar.putDropdown(R.id.cbo_nag_sasaka);
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame,new  _X_Question(), "Q. CROP FARMING/PAGSASAKA").commit();
            }
        });
        return view;

    }

    @Override
    public void onDestroy() {

        da.c_Update(cpar);
        super.onDestroy();
    }
}

