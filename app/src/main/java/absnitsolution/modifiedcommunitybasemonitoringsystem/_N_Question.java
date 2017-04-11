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
public class _N_Question extends Fragment {

    c_params cpar;
    ImageButton btn_back, btn_next;
    MainDataBaseHandler da;
    MaterialBetterSpinner cbo_n_85, cbo_n_87, cbo_o_nakatirik;

    public _N_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment___n__question, container, false);


        this.cpar = new c_params(Config.ID, container, view);

        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);
        cbo_n_85 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_n_85);
        cbo_n_87 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_n_87);
        cbo_o_nakatirik = (MaterialBetterSpinner) view.findViewById(R.id.cbo_o_nakatirik);

        this.cpar.setDropdown(R.id.cbo_n_85, R.array.n_katayuan, "Select One");
        this.cpar.setDropdown(R.id.cbo_n_87, R.array.meron_wala, "Select One");
        this.cpar.setDropdown(R.id.cbo_n_88, R.array.n_saangaling_kuryente, "Select One");
        this.cpar.setDropdown(R.id.cbo_o_nakatirik, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_oo_nakatirik, R.array.n_kungnakatirik, "Select One");


        this.cpar.setEditText(R.id.txt_n_ibapa_85);
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
        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putDropdown(R.id.cbo_n_85);
        this.cpar.putEditText(R.id.txt_n_ibapa_85);
        this.cpar.putEditText(R.id.txt_n_86);
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
}
