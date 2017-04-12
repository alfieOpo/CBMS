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
public class switcher extends Fragment {

ImageButton btn_new;
    public switcher() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_switcher, container, false);
        btn_new=(ImageButton)view.findViewById(R.id.btn_new);
        Config.EDIT=false;
        Config.ID="0";
        btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                getActivity().setTitle("New");
                fragmentManager.beginTransaction().replace(R.id.frame, new New()).commit();
            }
        });
        return view;
    }
}
