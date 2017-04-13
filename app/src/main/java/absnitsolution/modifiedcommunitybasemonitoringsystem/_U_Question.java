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


/**
 * A simple {@link Fragment} subclass.
 */
public class _U_Question extends Fragment {


    c_params cpar;

    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;
    MaterialBetterSpinner cbo_7th_58;
    LinearLayout layout;
MaterialBetterSpinner cbo_7th_59_1_buwan,cbo_7th_59_2_buwan,cbo_7th_59_3_buwan;
    EditText txt_7th_61_1_bilangaraw,txt_7th_61_2_bilangaraw,txt_7th_61_3_bilangaraw;
    public _U_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment___u__question, container, false);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        cbo_7th_58 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_7th_58);
        layout = (LinearLayout) view.findViewById(R.id.layout);
        layout.setEnabled(false);
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.setDropdown(R.id.cbo_7th_58, R.array.oo_hindi, "Hindi");
        this.cpar.setDropdown(R.id.cbo_7th_59_1_buwan, R.array.month, "N/A");
        this.cpar.setDropdown(R.id.cbo_7th_59_2_buwan, R.array.month, "N/A");
        this.cpar.setDropdown(R.id.cbo_7th_59_3_buwan, R.array.month, "N/A");
        this.cpar.setEditText(R.id.txt_7th_61_1_bilangaraw);
        this.cpar.setEditText(R.id.txt_7th_61_2_bilangaraw);
        this.cpar.setEditText(R.id.txt_7th_61_3_bilangaraw);
        cbo_7th_59_1_buwan=(MaterialBetterSpinner)view.findViewById(R.id.cbo_7th_59_1_buwan) ;
        cbo_7th_59_2_buwan=(MaterialBetterSpinner)view.findViewById(R.id.cbo_7th_59_2_buwan) ;
        cbo_7th_59_3_buwan=(MaterialBetterSpinner)view.findViewById(R.id.cbo_7th_59_3_buwan) ;
        txt_7th_61_1_bilangaraw=(EditText)view.findViewById(R.id.txt_7th_61_1_bilangaraw) ;
        txt_7th_61_2_bilangaraw=(EditText)view.findViewById(R.id.txt_7th_61_2_bilangaraw) ;
        txt_7th_61_3_bilangaraw=(EditText)view.findViewById(R.id.txt_7th_61_3_bilangaraw) ;
        txt_7th_61_1_bilangaraw.setEnabled(txt_7th_61_1_bilangaraw.getText().toString().equals("N/A"));
        txt_7th_61_2_bilangaraw.setEnabled(txt_7th_61_2_bilangaraw.getText().toString().equals("N/A"));
        txt_7th_61_3_bilangaraw.setEnabled(txt_7th_61_3_bilangaraw.getText().toString().equals("N/A"));
        if(cbo_7th_58.getText().toString().equals("Hindi")){

            layout.setVisibility(View.INVISIBLE);
        }
        else{
            layout.setVisibility(View.VISIBLE);
        }
        cbo_7th_59_1_buwan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    txt_7th_61_1_bilangaraw.setText("");

                }
                else{
                    txt_7th_61_1_bilangaraw.setEnabled(true);

                }


            }
        });

        cbo_7th_59_2_buwan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                txt_7th_61_2_bilangaraw.setEnabled(!txt_7th_61_2_bilangaraw.getText().toString().equals("N/A"));
                if(position==0){
                    txt_7th_61_2_bilangaraw.setText("");

                }
                else{
                    txt_7th_61_2_bilangaraw.setEnabled(true);

                }
            }
        });

        cbo_7th_59_3_buwan.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if(position==0){
                    txt_7th_61_3_bilangaraw.setText("");

                }
                else{
                    txt_7th_61_3_bilangaraw.setEnabled(true);

                }
            }
        });


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _A_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "A. PAGKAKAKILANLAN").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!cbo_7th_58.getText().toString().equals("Select One") || !cbo_7th_58.getText().toString().equals("")) {
                    Fragment fragment = null;
                    try {
                        fragment = _J_Question.class.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // Insert the fragment by replacing any existing fragment
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.frame, fragment, "J. KALUSUGAN").commit();
                } else {
                    Toast.makeText(getActivity(), "Fill up all important fields.", Toast.LENGTH_SHORT).show();
                }
            }

        });
        cbo_7th_58.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (cbo_7th_58.getText().toString().equals("Oo")) {
                    layout.setEnabled(true);
                    layout.setVisibility(View.VISIBLE);
                } else if (cbo_7th_58.getText().toString().equals("Hindi")) {
                    layout.setEnabled(false);
                    layout.setVisibility(View.INVISIBLE);
                }
            }
        });
        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putDropdown(R.id.cbo_7th_58);
        this.cpar.putDropdown(R.id.cbo_7th_59_1_buwan);
        this.cpar.putEditText(R.id.txt_7th_61_1_bilangaraw);
        this.cpar.putDropdown(R.id.cbo_7th_59_2_buwan);
        this.cpar.putEditText(R.id.txt_7th_61_2_bilangaraw);
        this.cpar.putDropdown(R.id.cbo_7th_59_3_buwan);
        this.cpar.putEditText(R.id.txt_7th_61_3_bilangaraw);
        da.c_Update(cpar);
        super.onDestroy();
    }
}

