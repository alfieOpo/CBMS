package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class ListofPerson extends Fragment {
    ListView list_view;
    Context _ctx;

    MainDataBaseHandler db;
    TextView lbl_person_name, lbl_address, lbl_date, lbl_id;

    public ListofPerson() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        list_view = (ListView) view.findViewById(R.id.list_view);
        Config.EDIT=false;
        loadListView();

        return view;
    }

    private void loadListView() {

        db = new MainDataBaseHandler(getActivity().getApplicationContext());
        db.DeleteUnUseDData();
        MainListAdapter listAdapter = new MainListAdapter(getActivity().getApplicationContext(), db.getList());
        list_view.setAdapter(listAdapter);
        list_view.setOnItemClickListener(new itemlist());

    }

    class itemlist implements AdapterView.OnItemClickListener {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            lbl_person_name = (TextView) view.findViewById(R.id.lbl_person_name);
            lbl_id = (TextView) view.findViewById(R.id.lbl_id);
            lbl_address = (TextView) view.findViewById(R.id.lbl_address);
            lbl_date = (TextView) view.findViewById(R.id.lbl_date);
            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setIcon(R.drawable.edit_file);
            final Cursor cursor = db.getList();
            cursor.moveToFirst();
            cursor.move(position);
            Config.ID = cursor.getString(cursor.getColumnIndexOrThrow("_id"));
            builder.setMessage("NAKAPANAYAM : " + lbl_person_name.getText().toString());
            builder.setPositiveButton("EDIT", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {

                        Config.EDIT=true;
                    Fragment fragment = null;
                    try {
                        fragment = New.class.newInstance();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    // Insert the fragment by replacing any existing fragment
                    FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                    getActivity().setTitle("MCBMS - MUNICIPALITY OF SANTA MARIA,BULACAN ");
                    fragmentManager.beginTransaction().replace(R.id.frame, fragment, "A. PAGKAKAKILANLAN").commit();
                }
            });
            builder.setNegativeButton("DELETE", new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int id) {




                    //------------------
                    AlertDialog.Builder builder2 = new AlertDialog.Builder(getActivity());
                    builder2.setIcon(R.drawable.edit_file);
                    builder2.setMessage("ARE YOU SURE YOU WANT TO DELETE \n'" + lbl_person_name.getText().toString() + "'");
                    builder2.setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {

                            db.Delete();
                            loadListView();
                        }
                    });
                    builder2.setNegativeButton("NO", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Toast.makeText(getActivity(), "NO", Toast.LENGTH_SHORT).show();
                        }
                    });
                    AlertDialog dialog2 = builder2.create();
                    dialog2.show();



                }
            });
            AlertDialog dialog = builder.create();
            dialog.show();
        }
    }
}
