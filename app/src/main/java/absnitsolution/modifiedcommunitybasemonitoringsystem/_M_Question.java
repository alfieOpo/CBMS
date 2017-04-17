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
import android.widget.LinearLayout;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;

import java.util.ArrayList;
import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class _M_Question extends Fragment {

    List<String> list;
    c_params cpar;
    MaterialBetterSpinner cbo_m_82, cbo_m_83, cbo_m_84;
    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;
    EditText txt_m_ibapa_82,txt_m_ibapa_84;
    LinearLayout layout_83;
    public _M_Question() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment___m__question, container, false);

        this.cpar = new c_params(Config.ID, container, view);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        cbo_m_82 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_m_82);
        cbo_m_83 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_m_83);
        cbo_m_84 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_m_84);
        txt_m_ibapa_82=(EditText)view.findViewById(R.id.txt_m_ibapa_82);
        txt_m_ibapa_84=(EditText)view.findViewById(R.id.txt_m_ibapa_84);
        this.cpar.setDropdown(R.id.cbo_m_82, R.array.m_tubig, "Water District - Sariling Gamit");
        this.cpar.setDropdown(R.id.cbo_m_83, R.array.m_gaanokalayo, "Sa loob lang ng pamamahay/bakuran");
        this.cpar.setDropdown(R.id.cbo_m_84, R.array.m_uripalikuran, "Water sealed flush to sewerage system/ septic tank - sariling gamit");
        this.cpar.setEditText(R.id.txt_m_ibapa_82);
        this.cpar.setEditText(R.id.txt_m_ibapa_84);
        layout_83=(LinearLayout)view.findViewById(R.id.layout_83);
        if(cbo_m_82.getText().toString().equals("Water District - Sariling Gamit")||cbo_m_82.getText().toString().equals("Posong De Motor - Sariling Gamit")){
            layout_83.setVisibility(View.INVISIBLE);
            txt_m_ibapa_82.setVisibility(View.INVISIBLE);
            txt_m_ibapa_82.setText("");
        }
         else{
            layout_83.setVisibility(View.VISIBLE);

            txt_m_ibapa_82.setVisibility(View.VISIBLE);
        }




        cbo_m_82.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position ==4||position ==0){
                    layout_83.setVisibility(View.INVISIBLE);//hide 83
                    txt_m_ibapa_82.setVisibility(View.INVISIBLE);
                    txt_m_ibapa_82.setText("");
                }

                else if(position==10){
                    layout_83.setVisibility(View.VISIBLE);
                    txt_m_ibapa_82.setVisibility(View.VISIBLE);
                }

                else if(position<10){
                    layout_83.setVisibility(View.VISIBLE);
                    txt_m_ibapa_82.setVisibility(View.INVISIBLE);
                    txt_m_ibapa_82.setText("");
                }

                else{
                    layout_83.setVisibility(View.VISIBLE);
                }
            }
        });


        if(cbo_m_84.getText().toString().equals("Iba pa, itala")){

            txt_m_ibapa_84.setVisibility(View.VISIBLE);
        }
        else{
            layout_83.setVisibility(View.VISIBLE);
            txt_m_ibapa_84.setText("");
            txt_m_ibapa_84.setVisibility(View.INVISIBLE);
        }
        cbo_m_84.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if(position==5){
                    txt_m_ibapa_84.setVisibility(View.VISIBLE);
                }
                else {
                    txt_m_ibapa_84.setVisibility(View.INVISIBLE);
                    txt_m_ibapa_84.setText("");
                }


            }
        });
//------------------------------------------------------------------------------------------------------------------------------------
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _L_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "L. BIKTIMA NG KRIMEN").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                list=new ArrayList<String>();
                addField(cbo_m_82.getText().toString());
                addField(cbo_m_84.getText().toString());
                if(!Valid()){
                    Toast.makeText(getActivity(), "Fill out all important field!", Toast.LENGTH_SHORT).show();
                    return;
                }
                Config.ColorTheVIEW(cbo_m_82);
                Config.ColorTheVIEW(cbo_m_82);


                if (!cbo_m_82.getText().equals("Select One") || !cbo_m_82.getText().equals("") && !cbo_m_83.getText().equals("Select One") || !cbo_m_83.getText().equals("") && !cbo_m_84.getText().equals("Select One") || !cbo_m_84.getText().equals("")) {
                    Fragment fragment = null;
                    try {
                        fragment = _N_Question.class.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // Insert the fragment by replacing any existing fragment
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.frame, fragment, "N. TIRAHAN").commit();
                } else {
                    Toast.makeText(getActivity(), "Fill up all important fields.", Toast.LENGTH_SHORT).show();
                }

            }
        });

        return view;

    }


    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putDropdown(R.id.cbo_m_82);
        this.cpar.putEditText(R.id.txt_m_ibapa_82);
        this.cpar.putDropdown(R.id.cbo_m_83);
        this.cpar.putDropdown(R.id.cbo_m_84);
        this.cpar.putEditText(R.id.txt_m_ibapa_84);
        da.c_Update(cpar);
        super.onDestroy();
    }
    private void addField(String value) {
        list.add(value);
    }

    private boolean Valid() {

        for (String value : list) {
            if (value.equals("Select One") || value.equals("")) {
                return false;
            }
        }
        return true;
    }
}
