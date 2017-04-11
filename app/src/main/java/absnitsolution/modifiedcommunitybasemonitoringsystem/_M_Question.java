package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class _M_Question extends Fragment {


    c_params cpar;
    MaterialBetterSpinner cbo_m_82, cbo_m_83, cbo_m_84;
    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;

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

        this.cpar.setDropdown(R.id.cbo_m_82, R.array.m_tubig, "Select One");
        this.cpar.setDropdown(R.id.cbo_m_83, R.array.m_gaanokalayo, "Select One");
        this.cpar.setDropdown(R.id.cbo_m_84, R.array.m_uripalikuran, "Select One");
        this.cpar.setEditText(R.id.txt_m_ibapa_82);
        this.cpar.setEditText(R.id.txt_m_ibapa_84);

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
}
