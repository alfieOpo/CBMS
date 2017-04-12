package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
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
EditText txt_equals;
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
        this.cpar.setDropdown(R.id.cbo_p_120, R.array.p_katayuan_sinasaka, "Select One");
        //this.cpar.setDropdown(R.id.cbo_p_121, R.array.p_gaanokalawak, "Select One");
        this.cpar.setEditText(R.id.txt_p_120);
        this.cpar.setEditText(R.id.txt_p_121_1);
        this.cpar.setEditText(R.id.txt_p_122_1);
        this.cpar.setEditText(R.id.txt_p_122_2);
        this.cpar.setEditText(R.id.txt_p_122_3);
        this.cpar.setEditText(R.id.txt_p_122_4);
        this.cpar.setEditText(R.id.txt_p_122_5);
        this.cpar.setEditText(R.id.txt_p_123_1);
        this.cpar.setEditText(R.id.txt_p_122_2);
        this.cpar.setEditText(R.id.txt_p_122_3);
        this.cpar.setEditText(R.id.txt_p_123_4);
        this.cpar.setEditText(R.id.txt_p_123_5);


        cbo_converter.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

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
        //this.cpar.putDropdown(R.id.cbo_p_121);
        this.cpar.putEditText(R.id.txt_p_121_1);
        this.cpar.putEditText(R.id.txt_p_122_1);
        this.cpar.putEditText(R.id.txt_p_122_2);
        this.cpar.putEditText(R.id.txt_p_122_3);
        this.cpar.putEditText(R.id.txt_p_122_4);
        this.cpar.putEditText(R.id.txt_p_122_5);
        this.cpar.putEditText(R.id.txt_p_123_1);
        this.cpar.putEditText(R.id.txt_p_122_2);
        this.cpar.putEditText(R.id.txt_p_122_3);
        this.cpar.putEditText(R.id.txt_p_123_4);
        this.cpar.putEditText(R.id.txt_p_123_5);
        da.c_Update(cpar);
        super.onDestroy();
    }
}

