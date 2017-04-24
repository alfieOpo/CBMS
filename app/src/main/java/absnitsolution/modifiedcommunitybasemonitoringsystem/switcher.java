package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListAdapter;


/**
 * A simple {@link Fragment} subclass.
 */
public class switcher extends Fragment {


    GridView gridview;
    public switcher() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_switcher, container, false);
        gridview=(GridView)view.findViewById(R.id.gridview);
        Config.EDIT=false;
        Config.ID="0";
        String []name={"New","List","Callback List","Gallery","Upload","Setting","User Account","About Us"};
        int [] image={R.drawable.new_logo,
                R.drawable.list_logo,
                R.drawable.callback_logo,
                R.drawable.gallery_logo,
                R.drawable.upload_logo,
                R.drawable.settings_logo,
                R.drawable.account_logo,
                R.drawable.aboutus_logo};

        ListAdapter listAdapter=new switcher_adapter(getActivity(),name,image);
        gridview.setAdapter(listAdapter);
        gridview.setOnItemClickListener(new itemlist());/*
        btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



            }
        });*/
        return view;
    }
    class  itemlist implements AdapterView.OnItemClickListener{
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            ViewGroup vg=(ViewGroup)view;
            ImageView img=(ImageView)vg.findViewById(R.id.imageButton);
            String name=img.getTag().toString();
            switch (name){
                case "New":
                    LoadFrame(new New(),name);
                    break;
                case "Callback List":
                    LoadFrame(new CallbackList(),name);
                    break;
                case "Gallery":
                    LoadFrame(new Gallery(),name);
                    break;
                case "Upload":
                    LoadFrame(new UploadData(),name);
                    break;
                case "Setting":
                    LoadFrame(new mySettings(),name);
                    break;
                case "User Account":
                    LoadFrame(new register(),name);
                    break;
                case "About Us":
                    LoadFrame(new AboutUs(),name);
                    break;
                case "List":
                    LoadFrame(new ListofPerson(),name);
                    break;
            }

        }
    }
    private  void LoadFrame(Fragment fragment,String title){
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        getActivity().setTitle(title);
        fragmentManager.beginTransaction().replace(R.id.frame,fragment).commit();
    }
}
