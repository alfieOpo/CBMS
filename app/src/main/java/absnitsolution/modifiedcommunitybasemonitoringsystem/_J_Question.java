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
import android.widget.Toast;

import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;


/**
 * A simple {@link Fragment} subclass.
 */
public class _J_Question extends Fragment {


    c_params cpar;
    ImageButton btn_back, btn_next;
    MaterialBetterSpinner cbo_a_miyembro_nagpagamot, cbo_a_ilan_nagpagamot, cbo_j_66, cbo_j_67;
    EditText txt_j_ibapa_66;
    MainDataBaseHandler da;


    public _J_Question() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.fragment___j__question, container, false);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        cbo_a_miyembro_nagpagamot = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_miyembro_nagpagamot);
        cbo_a_ilan_nagpagamot = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_ilan_nagpagamot);
        cbo_j_66 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_j_66);
        cbo_j_67 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_j_67);
        txt_j_ibapa_66 = (EditText) view.findViewById(R.id.txt_j_ibapa_66);


        cbo_a_miyembro_nagpagamot = (MaterialBetterSpinner) view.findViewById(R.id.cbo_a_miyembro_nagpagamot);
        this.cpar = new c_params(Config.ID, container, view);
        this.cpar.setDropdown(R.id.cbo_j_66, R.array.j_saan_nagpagamot, "Select One");
        this.cpar.setDropdown(R.id.cbo_j_67, R.array.j_sumasailalim, "Select One");
        this.cpar.setDropdown(R.id.cbo_a_miyembro_nagpagamot, R.array.meron_wala, "Select One");
        this.cpar.setDropdown(R.id.cbo_a_ilan_nagpagamot, R.array.ilan, "Select One");
        this.cpar.setEditText(R.id.txt_j_ibapa_66);

        cbo_a_miyembro_nagpagamot.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 1) {
                    cbo_a_ilan_nagpagamot.setVisibility(View.INVISIBLE);
                    cbo_j_66.setVisibility(View.INVISIBLE);
                    txt_j_ibapa_66.setVisibility(View.INVISIBLE);
                    cbo_j_67.setVisibility(View.INVISIBLE);
                } else {
                    cbo_a_ilan_nagpagamot.setVisibility(View.VISIBLE);
                    cbo_j_66.setVisibility(View.VISIBLE);
                    txt_j_ibapa_66.setVisibility(View.VISIBLE);
                    cbo_j_67.setVisibility(View.VISIBLE);
                }
            }
        });
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _U_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "I-E. DALAS NG PAGKAIN").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!cbo_a_miyembro_nagpagamot.getText().equals("Select One") || !cbo_a_miyembro_nagpagamot.getText().equals("")) {
                    Fragment fragment = null;
                    try {
                        fragment = _L_Question.class.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // Insert the fragment by replacing any existing fragment
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    fragmentManager.beginTransaction().replace(R.id.frame, fragment, "L. BIKTIMA NG KRIMEN").commit();
                } else {
                    Toast.makeText(getActivity(), "Fill up all important fields.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplication());
        this.cpar.putDropdown(R.id.cbo_j_66);
        this.cpar.putDropdown(R.id.cbo_j_67);
        this.cpar.putEditText(R.id.txt_j_ibapa_66);
        this.cpar.putDropdown(R.id.cbo_a_miyembro_nagpagamot);
        this.cpar.putDropdown(R.id.cbo_a_ilan_nagpagamot);

        da.c_Update(cpar);
        super.onDestroy();
    }
}
