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

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class _P_Question extends Fragment {

    c_params cpar;

    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;
    MaterialBetterSpinner cbo_converter;
EditText txt_equals,txt_p_121;
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

        cbo_converter=(MaterialBetterSpinner)view.findViewById(R.id.cbo_converter);
        txt_equals=(EditText) view.findViewById(R.id.txt_equals);
        txt_p_121=(EditText) view.findViewById(R.id.txt_p_121);
        this.cpar.setDropdown(R.id.cbo_p_120, R.array.p_katayuan_sinasaka, "N/A");
        this.cpar.setDropdown(R.id.cbo_converter, R.array.area, "square meter");
        this.cpar.setEditText(R.id.txt_p_120);
        this.cpar.setEditText(R.id.txt_equals);
        this.cpar.setEditText(R.id.txt_p_121_1);
        this.cpar.setEditText(R.id.txt_p_123_1);
        this.cpar.setEditText(R.id.txt_p_123_4);
        this.cpar.setEditText(R.id.txt_p_123_5);
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
                    txt_equals.setText(Config.toCurrency(mainvalue));
                }

                else if(position ==1){
                    double value=(mainvalue * 10000);
                    txt_equals.setText(Config.toCurrency(value));
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
                Fragment fragment = null;
                try {
                    fragment = _X_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "Q. CROP FARMING/PAGSASAKA").commit();
            }
        });
        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putDropdown(R.id.cbo_p_120);
        this.cpar.putEditText(R.id.txt_p_120);
        this.cpar.putEditText(R.id.txt_p_121_1);
        this.cpar.putEditText(R.id.txt_p_123_1);
        this.cpar.putEditText(R.id.txt_p_123_4);
        this.cpar.putEditText(R.id.txt_p_123_5);
        this.cpar.putDropdown(R.id.cbo_converter);
        this.cpar.putEditText(R.id.txt_equals);
        da.c_Update(cpar);
        super.onDestroy();
    }
}

