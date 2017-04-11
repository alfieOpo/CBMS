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
public class _X_Question extends Fragment {

    c_params cpar;

    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;

    public _X_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment___x__question, container, false);
        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);

        this.cpar = new c_params(Config.ID, container, view);


        this.cpar.setDropdown(R.id.cbo_x_124, R.array.x_ilantaon_nagsasaka, "Select One");
        this.cpar.setDropdown(R.id.cbo_x_125, R.array.x_kumpara, "Select One");
        this.cpar.setDropdown(R.id.cbo_x_127, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_x_128, R.array.x_128, "Select One");
        this.cpar.setDropdown(R.id.cbo_x_129_1, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_x_129_2, R.array.oo_hindi, "Select One");
        this.cpar.setCheckBox(R.id.chk_x_126_1);
        this.cpar.setCheckBox(R.id.chk_x_126_2);
        this.cpar.setCheckBox(R.id.chk_x_126_3);
        this.cpar.setCheckBox(R.id.chk_x_126_4);
        this.cpar.setCheckBox(R.id.chk_x_126_5);
        this.cpar.setCheckBox(R.id.chk_x_126_6);
        this.cpar.setCheckBox(R.id.chk_x_126_7);
        this.cpar.setCheckBox(R.id.chk_x_126_8);
        this.cpar.setEditText(R.id.txt_x_126_8);
        this.cpar.setEditText(R.id.txt_x_127_1);
        this.cpar.setEditText(R.id.txt_x_127_2);
        this.cpar.setCheckBox(R.id.chk_x_130_1);
        this.cpar.setCheckBox(R.id.chk_x_130_2);
        this.cpar.setCheckBox(R.id.chk_x_130_3);
        this.cpar.setEditText(R.id.txt_x_130_3);
        this.cpar.setEditText(R.id.txt_x_131_1);
        this.cpar.setEditText(R.id.txt_x_131_2);
        this.cpar.setEditText(R.id.txt_x_131_3);
        this.cpar.setEditText(R.id.txt_x_131_4);
        this.cpar.setEditText(R.id.txt_x_131_5);
        this.cpar.setEditText(R.id.txt_x_131_6);
        this.cpar.setEditText(R.id.txt_x_131_7);
        this.cpar.setEditText(R.id.txt_x_131_8);
        this.cpar.setEditText(R.id.txt_x_131_9);
        this.cpar.setEditText(R.id.txt_x_131_10);
        this.cpar.setEditText(R.id.txt_x_131_11);
        this.cpar.setEditText(R.id.txt_x_131_12);
        this.cpar.setEditText(R.id.txt_x_131_12);
        this.cpar.setEditText(R.id.txt_x_131_14);
        this.cpar.setEditText(R.id.txt_x_131_15);
        this.cpar.setEditText(R.id.txt_x_131_15_1);
        this.cpar.setEditText(R.id.txt_x_131_15_2);
        this.cpar.setEditText(R.id.txt_x_131_15_3);
        this.cpar.setEditText(R.id.txt_x_131_16);
        this.cpar.setCheckBox(R.id.chk_x_132_1);
        this.cpar.setCheckBox(R.id.chk_x_132_2);
        this.cpar.setCheckBox(R.id.chk_x_132_3);
        this.cpar.setCheckBox(R.id.chk_x_132_4);
        this.cpar.setCheckBox(R.id.chk_x_132_5);
        this.cpar.setCheckBox(R.id.chk_x_132_6);
        this.cpar.setCheckBox(R.id.chk_x_132_7);
        this.cpar.setCheckBox(R.id.chk_x_132_8);
        this.cpar.setCheckBox(R.id.chk_x_132_9);
        this.cpar.setCheckBox(R.id.chk_x_132_10);
        this.cpar.setCheckBox(R.id.chk_x_132_11);
        this.cpar.setCheckBox(R.id.chk_x_132_12);
        this.cpar.setCheckBox(R.id.chk_x_132_13);
        this.cpar.setCheckBox(R.id.chk_x_132_14);
        this.cpar.setCheckBox(R.id.chk_x_132_15);
        this.cpar.setCheckBox(R.id.chk_x_132_15_1);
        this.cpar.setCheckBox(R.id.chk_x_132_15_2);
        this.cpar.setCheckBox(R.id.chk_x_132_15_3);
        this.cpar.setCheckBox(R.id.chk_x_132_16);
        this.cpar.setEditText(R.id.txt_x_132_16);


        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _P_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "P. AGRIKULTURA").commit();
            }
        });
        btn_next.setOnClickListener(new View.OnClickListener() {
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
        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putDropdown(R.id.cbo_x_124);
        this.cpar.putDropdown(R.id.cbo_x_125);
        this.cpar.putCheckBox(R.id.chk_x_126_1);
        this.cpar.putCheckBox(R.id.chk_x_126_2);
        this.cpar.putCheckBox(R.id.chk_x_126_3);
        this.cpar.putCheckBox(R.id.chk_x_126_4);
        this.cpar.putCheckBox(R.id.chk_x_126_5);
        this.cpar.putCheckBox(R.id.chk_x_126_6);
        this.cpar.putCheckBox(R.id.chk_x_126_7);
        this.cpar.putCheckBox(R.id.chk_x_126_8);
        this.cpar.putEditText(R.id.txt_x_126_8);
        this.cpar.putDropdown(R.id.cbo_x_127);
        this.cpar.putEditText(R.id.txt_x_127_1);
        this.cpar.putEditText(R.id.txt_x_127_2);
        this.cpar.putDropdown(R.id.cbo_x_128);
        this.cpar.putDropdown(R.id.cbo_x_129_1);
        this.cpar.putDropdown(R.id.cbo_x_129_2);
        this.cpar.putCheckBox(R.id.chk_x_130_1);
        this.cpar.putCheckBox(R.id.chk_x_130_2);
        this.cpar.putCheckBox(R.id.chk_x_130_3);
        this.cpar.putEditText(R.id.txt_x_130_3);
        this.cpar.putEditText(R.id.txt_x_131_1);
        this.cpar.putEditText(R.id.txt_x_131_2);
        this.cpar.putEditText(R.id.txt_x_131_3);
        this.cpar.putEditText(R.id.txt_x_131_4);
        this.cpar.putEditText(R.id.txt_x_131_5);
        this.cpar.putEditText(R.id.txt_x_131_6);
        this.cpar.putEditText(R.id.txt_x_131_7);
        this.cpar.putEditText(R.id.txt_x_131_8);
        this.cpar.putEditText(R.id.txt_x_131_9);
        this.cpar.putEditText(R.id.txt_x_131_10);
        this.cpar.putEditText(R.id.txt_x_131_11);
        this.cpar.putEditText(R.id.txt_x_131_12);
        this.cpar.putEditText(R.id.txt_x_131_12);
        this.cpar.putEditText(R.id.txt_x_131_14);
        this.cpar.putEditText(R.id.txt_x_131_15);
        this.cpar.putEditText(R.id.txt_x_131_15_1);
        this.cpar.putEditText(R.id.txt_x_131_15_2);
        this.cpar.putEditText(R.id.txt_x_131_15_3);
        this.cpar.putEditText(R.id.txt_x_131_16);
        this.cpar.putCheckBox(R.id.chk_x_132_1);
        this.cpar.putCheckBox(R.id.chk_x_132_2);
        this.cpar.putCheckBox(R.id.chk_x_132_3);
        this.cpar.putCheckBox(R.id.chk_x_132_4);
        this.cpar.putCheckBox(R.id.chk_x_132_5);
        this.cpar.putCheckBox(R.id.chk_x_132_6);
        this.cpar.putCheckBox(R.id.chk_x_132_7);
        this.cpar.putCheckBox(R.id.chk_x_132_8);
        this.cpar.putCheckBox(R.id.chk_x_132_9);
        this.cpar.putCheckBox(R.id.chk_x_132_10);
        this.cpar.putCheckBox(R.id.chk_x_132_11);
        this.cpar.putCheckBox(R.id.chk_x_132_12);
        this.cpar.putCheckBox(R.id.chk_x_132_13);
        this.cpar.putCheckBox(R.id.chk_x_132_14);
        this.cpar.putCheckBox(R.id.chk_x_132_15);
        this.cpar.putCheckBox(R.id.chk_x_132_15_1);
        this.cpar.putCheckBox(R.id.chk_x_132_15_2);
        this.cpar.putCheckBox(R.id.chk_x_132_15_3);
        this.cpar.putCheckBox(R.id.chk_x_132_16);
        this.cpar.putEditText(R.id.txt_x_132_16);
        da.c_Update(cpar);
        super.onDestroy();
    }
}

