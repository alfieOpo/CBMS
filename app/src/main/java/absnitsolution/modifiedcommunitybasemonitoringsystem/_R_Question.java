package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class _R_Question extends Fragment {

    c_params cpar;
    ImageButton btn_back, btn_next;
    MainDataBaseHandler da;

    public _R_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment___r__question, container, false);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);

        this.cpar = new c_params(Config.ID, container, view);

        this.cpar.setDropdown(R.id.cbo_r_136, R.array.p_gaanokalawak, "Select One");


        this.cpar.setCheckBox(R.id.chk_r_135_1);
        this.cpar.setCheckBox(R.id.chk_r_135_2);
        this.cpar.setCheckBox(R.id.chk_r_135_3);
        this.cpar.setEditText(R.id.txt_r_135_3);
        this.cpar.setCheckBox(R.id.chk_r_137_1);
        this.cpar.setCheckBox(R.id.chk_r_137_2);
        this.cpar.setCheckBox(R.id.chk_r_137_3);
        this.cpar.setCheckBox(R.id.chk_r_137_4);
        this.cpar.setCheckBox(R.id.chk_r_137_4);
        this.cpar.setCheckBox(R.id.chk_r_137_6);
        this.cpar.setEditText(R.id.txt_r_137_6);
        this.cpar.setEditText(R.id.txt_r_138_1);
        this.cpar.setEditText(R.id.txt_r_138_2);
        this.cpar.setEditText(R.id.txt_r_138_3);
        this.cpar.setEditText(R.id.txt_r_138_4);
        this.cpar.setEditText(R.id.txt_r_138_5);
        this.cpar.setEditText(R.id.txt_r_138_6);
        this.cpar.setEditText(R.id.txt_r_138_7);
        this.cpar.setCheckBox(R.id.chk_r_139_1);
        this.cpar.setCheckBox(R.id.chk_r_139_2);
        this.cpar.setCheckBox(R.id.chk_r_139_3);
        this.cpar.setCheckBox(R.id.chk_r_139_4);
        this.cpar.setCheckBox(R.id.chk_r_139_5);
        this.cpar.setCheckBox(R.id.chk_r_139_6);
        this.cpar.setCheckBox(R.id.chk_r_139_7);
        this.cpar.setCheckBox(R.id.chk_r_139_8);
        this.cpar.setEditText(R.id.txt_r_139_8);

        btn_back.setOnClickListener(new View.OnClickListener() {
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
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _S_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "T. PAMAMAHALA SA BASURA").commit();
            }
        });
        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());

        this.cpar.putCheckBox(R.id.chk_r_135_1);
        this.cpar.putCheckBox(R.id.chk_r_135_2);
        this.cpar.putCheckBox(R.id.chk_r_135_3);
        this.cpar.putEditText(R.id.txt_r_135_3);
        this.cpar.putDropdown(R.id.cbo_r_136);
        this.cpar.putCheckBox(R.id.chk_r_137_1);
        this.cpar.putCheckBox(R.id.chk_r_137_2);
        this.cpar.putCheckBox(R.id.chk_r_137_3);
        this.cpar.putCheckBox(R.id.chk_r_137_4);
        this.cpar.putCheckBox(R.id.chk_r_137_4);
        this.cpar.putCheckBox(R.id.chk_r_137_6);
        this.cpar.putEditText(R.id.txt_r_137_6);
        this.cpar.putEditText(R.id.txt_r_138_1);
        this.cpar.putEditText(R.id.txt_r_138_2);
        this.cpar.putEditText(R.id.txt_r_138_3);
        this.cpar.putEditText(R.id.txt_r_138_4);
        this.cpar.putEditText(R.id.txt_r_138_5);
        this.cpar.putEditText(R.id.txt_r_138_6);
        this.cpar.putEditText(R.id.txt_r_138_7);
        this.cpar.putCheckBox(R.id.chk_r_139_1);
        this.cpar.putCheckBox(R.id.chk_r_139_2);
        this.cpar.putCheckBox(R.id.chk_r_139_3);
        this.cpar.putCheckBox(R.id.chk_r_139_4);
        this.cpar.putCheckBox(R.id.chk_r_139_5);
        this.cpar.putCheckBox(R.id.chk_r_139_6);
        this.cpar.putCheckBox(R.id.chk_r_139_7);
        this.cpar.putCheckBox(R.id.chk_r_139_8);
        this.cpar.putEditText(R.id.txt_r_139_8);

        da.c_Update(cpar);
        super.onDestroy();
    }
}

