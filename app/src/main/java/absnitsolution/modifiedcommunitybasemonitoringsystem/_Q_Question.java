package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageButton;
import com.weiwangcn.betterspinner.library.material.MaterialBetterSpinner;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class _Q_Question extends Fragment {
    c_params cpar;

    MainDataBaseHandler da;
    ImageButton btn_back, btn_next;
    MaterialBetterSpinner cbo_q_133;
    LinearLayout layout;

    public _Q_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment___q__question, container, false);

        btn_back = (ImageButton) view.findViewById(R.id.btn_back);
        btn_next = (ImageButton) view.findViewById(R.id.btn_next);

        cbo_q_133 = (MaterialBetterSpinner) view.findViewById(R.id.cbo_q_133);
        layout = (LinearLayout) view.findViewById(R.id.layout);

        this.cpar = new c_params(Config.ID, container, view);

        this.cpar.setDropdown(R.id.cbo_q_133, R.array.oo_hindi, "Select One");
        this.cpar.setEditText(R.id.txt_q_133_1);
        this.cpar.setEditText(R.id.txt_q_133_1_1);
        this.cpar.setEditText(R.id.txt_q_133_2);
        this.cpar.setEditText(R.id.txt_q_133_3);
        this.cpar.setEditText(R.id.txt_q_133_3_1);
        this.cpar.setEditText(R.id.txt_q_133_3_2);
        this.cpar.setEditText(R.id.txt_q_133_3_3);
        this.cpar.setEditText(R.id.txt_q_133_4);
        this.cpar.setEditText(R.id.txt_q_133_4_1);
        this.cpar.setEditText(R.id.txt_q_133_4_2);
        this.cpar.setEditText(R.id.txt_q_133_5);
        this.cpar.setEditText(R.id.txt_q_133_5_1);
        this.cpar.setEditText(R.id.txt_q_133_5_2);
        this.cpar.setEditText(R.id.txt_q_133_6);
        this.cpar.setEditText(R.id.txt_q_133_7);
        this.cpar.setEditText(R.id.txt_q_133_8);
        this.cpar.setEditText(R.id.txt_q_133_9);
        this.cpar.setEditText(R.id.txt_q_134_1_1);
        this.cpar.setEditText(R.id.txt_q_134_1_2);
        this.cpar.setEditText(R.id.txt_q_134_2_1);
        this.cpar.setEditText(R.id.txt_q_134_2_2);
        this.cpar.setEditText(R.id.txt_q_134_3_1);
        this.cpar.setEditText(R.id.txt_q_134_3_2);
        this.cpar.setEditText(R.id.txt_q_134_4_1);
        this.cpar.setEditText(R.id.txt_q_134_4_2);
        this.cpar.setEditText(R.id.txt_q_134_5);
        this.cpar.setEditText(R.id.txt_q_134_5_1);
        this.cpar.setEditText(R.id.txt_q_134_5_2);


        cbo_q_133.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                if (i == 1 ) // hindi
                {
                    layout.setVisibility(View.INVISIBLE);
                } else {
                    layout.setVisibility(View.VISIBLE);
                }
            }
        });


        btn_back.setOnClickListener(new View.OnClickListener() {
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
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment fragment = null;
                try {
                    fragment = _R_Question.class.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                // Insert the fragment by replacing any existing fragment
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.frame, fragment, "S. PANGINGISDA").commit();
            }
        });

        return view;

    }

    @Override
    public void onDestroy() {
        this.cpar.putEditText(R.id.txt_q_133_1);
        this.cpar.putEditText(R.id.txt_q_133_1_1);
        this.cpar.putEditText(R.id.txt_q_133_2);
        this.cpar.putEditText(R.id.txt_q_133_3);
        this.cpar.putEditText(R.id.txt_q_133_3_1);
        this.cpar.putEditText(R.id.txt_q_133_3_2);
        this.cpar.putEditText(R.id.txt_q_133_3_3);
        this.cpar.putEditText(R.id.txt_q_133_4);
        this.cpar.putEditText(R.id.txt_q_133_4_1);
        this.cpar.putEditText(R.id.txt_q_133_4_2);
        this.cpar.putEditText(R.id.txt_q_133_5);
        this.cpar.putEditText(R.id.txt_q_133_5_1);
        this.cpar.putEditText(R.id.txt_q_133_5_2);
        this.cpar.putEditText(R.id.txt_q_133_6);
        this.cpar.putEditText(R.id.txt_q_133_7);
        this.cpar.putEditText(R.id.txt_q_133_8);
        this.cpar.putEditText(R.id.txt_q_133_9);
        this.cpar.putEditText(R.id.txt_q_134_1_1);
        this.cpar.putEditText(R.id.txt_q_134_1_2);
        this.cpar.putEditText(R.id.txt_q_134_2_1);
        this.cpar.putEditText(R.id.txt_q_134_2_2);
        this.cpar.putEditText(R.id.txt_q_134_3_1);
        this.cpar.putEditText(R.id.txt_q_134_3_2);
        this.cpar.putEditText(R.id.txt_q_134_4_1);
        this.cpar.putEditText(R.id.txt_q_134_4_2);
        this.cpar.putEditText(R.id.txt_q_134_5);
        this.cpar.putEditText(R.id.txt_q_134_5_1);
        this.cpar.putEditText(R.id.txt_q_134_5_2);
        this.cpar.putDropdown(R.id.cbo_q_133);

        
        super.onDestroy();
    }
}

