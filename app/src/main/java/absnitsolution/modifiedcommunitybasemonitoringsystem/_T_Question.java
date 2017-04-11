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
public class _T_Question extends Fragment {

    c_params cpar;

    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;

    public _T_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment___t__question, container, false);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);

        this.cpar = new c_params(Config.ID, container, view);


        this.cpar.setDropdown(R.id.cbo_t_145, R.array.oo_hindi, "Select One");

        this.cpar.setDropdown(R.id.cbo_w_156, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_w_157, R.array.w_saangaling_angtulong, "Select One");
        this.cpar.setCheckBox(R.id.chk_t_146_1);
        this.cpar.setCheckBox(R.id.chk_t_146_2);
        this.cpar.setCheckBox(R.id.chk_t_146_3);
        this.cpar.setCheckBox(R.id.chk_t_146_4);
        this.cpar.setCheckBox(R.id.chk_t_146_5);
        this.cpar.setCheckBox(R.id.chk_t_146_6);
        this.cpar.setEditText(R.id.txt_t_146_6);

        btn_back.setOnClickListener(new View.OnClickListener() {
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
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _V_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "V. PROGRAMA").commit();
            }
        });

        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putDropdown(R.id.cbo_t_145);
        this.cpar.putCheckBox(R.id.chk_t_146_1);
        this.cpar.putCheckBox(R.id.chk_t_146_2);
        this.cpar.putCheckBox(R.id.chk_t_146_3);
        this.cpar.putCheckBox(R.id.chk_t_146_4);
        this.cpar.putCheckBox(R.id.chk_t_146_5);
        this.cpar.putCheckBox(R.id.chk_t_146_6);
        this.cpar.putEditText(R.id.txt_t_146_6);
        this.cpar.putDropdown(R.id.cbo_w_156);
        this.cpar.putDropdown(R.id.cbo_w_157);
        da.c_Update(cpar);
        super.onDestroy();
    }
}

