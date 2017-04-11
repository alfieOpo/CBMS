package absnitsolution.modifiedcommunitybasemonitoringsystem;


import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Gallery extends Fragment {
    GridView gridView;
    ImageView personimage, houseimage;
    MainDataBaseHandler db;

    public Gallery() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_gallery, container, false);
        db = new MainDataBaseHandler(getActivity());
        gridView = (GridView) view.findViewById(R.id.gridView);
        GalleryAdapter listAdapter = new GalleryAdapter(getActivity().getApplicationContext(), db.getListAll());
        gridView.setAdapter(listAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                final Cursor cursor = db.getListAll();
                personimage = (ImageView) view.findViewById(R.id.personimage);
                houseimage = (ImageView) view.findViewById(R.id.houseimage);
                cursor.moveToFirst();
                cursor.move(position);
                personimage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        byte[] byteArray = cursor.getBlob(cursor.getColumnIndexOrThrow("person_image"));
                        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                        EditDeleteDiaglog diaglog = new EditDeleteDiaglog(getActivity(), bmp);
                        diaglog.show();
                    }
                });
                houseimage.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        byte[] byteArray = cursor.getBlob(cursor.getColumnIndexOrThrow("house_image"));
                        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                        EditDeleteDiaglog diaglog = new EditDeleteDiaglog(getActivity(), bmp);
                        diaglog.show();
                    }
                });
            }
        });
        return view;
    }
}
