package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class _W_Question extends Fragment {

    c_params cpar;

    MainDataBaseHandler da;


    public _W_Question() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment___w__question, container, false);


        this.cpar = new c_params(Config.ID, container, view);


        this.cpar.setDropdown(R.id.cbo_w_156, R.array.oo_hindi, "Select One");
        this.cpar.setDropdown(R.id.cbo_w_157, R.array.w_saangaling_angtulong, "Select One");
        this.cpar.setCheckBox(R.id.chk_w_155_1);
        this.cpar.setEditText(R.id.txt_w_155_1);
        this.cpar.setCheckBox(R.id.chk_w_155_2);
        this.cpar.setEditText(R.id.txt_w_155_2);
        this.cpar.setCheckBox(R.id.chk_w_155_3);
        this.cpar.setEditText(R.id.txt_w_155_3);
        this.cpar.setCheckBox(R.id.chk_w_155_4);
        this.cpar.setEditText(R.id.txt_w_155_4);
        this.cpar.setCheckBox(R.id.chk_w_155_5);

        this.cpar.setCheckBox(R.id.chk_w_155_6);
        this.cpar.setEditText(R.id.txt_w_155_6);
        this.cpar.setCheckBox(R.id.chk_w_155_7);
        this.cpar.setEditText(R.id.txt_w_155_7);


        return view;

    }

    @Override
    public void onDestroy() {
        da = new MainDataBaseHandler(getActivity().getApplicationContext());
        this.cpar.putCheckBox(R.id.chk_w_155_1);
        this.cpar.putEditText(R.id.txt_w_155_1);
        this.cpar.putCheckBox(R.id.chk_w_155_2);
        this.cpar.putEditText(R.id.txt_w_155_2);
        this.cpar.putCheckBox(R.id.chk_w_155_3);
        this.cpar.putEditText(R.id.txt_w_155_3);
        this.cpar.putCheckBox(R.id.chk_w_155_4);
        this.cpar.putEditText(R.id.txt_w_155_4);
        this.cpar.putCheckBox(R.id.chk_w_155_5);

        this.cpar.putCheckBox(R.id.chk_w_155_6);
        this.cpar.putEditText(R.id.txt_w_155_6);
        this.cpar.putCheckBox(R.id.chk_w_155_7);
        this.cpar.putEditText(R.id.txt_w_155_7);
        this.cpar.putDropdown(R.id.cbo_w_156);
        this.cpar.putDropdown(R.id.cbo_w_157);
        super.onDestroy();
    }
}

