package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class UploadedfilesAdapter extends ArrayAdapter<String> {

    private Context ctx;
    TextView txt_name,txt_oras_nagsimula,txt_oras_natapos,txt_id;
    String []Name;
    String []M_ID;
    String []oras_natapos;
    String []oras_nagsimula;
    public UploadedfilesAdapter(Context context, String []Name,
            String []M_ID,
            String []oras_natapos,
            String []oras_nagsimula) {
        super(context,R.layout.activity_uploadedfiles_adapter, Name);
        this.ctx = context;

        this.Name=Name;
        this.M_ID=M_ID;
        this.oras_natapos=oras_natapos;
        this.oras_nagsimula=oras_nagsimula;

    }

    public View getView(int position, View contentView, ViewGroup parent){
        LayoutInflater layoutInflater= LayoutInflater.from(getContext());
        View CustomView=layoutInflater.inflate(R.layout.activity_uploadedfiles_adapter,parent,false);
        txt_name=(TextView)CustomView.findViewById(R.id.txt_name);
        txt_oras_nagsimula=(TextView)CustomView.findViewById(R.id.txt_oras_nagsimula);
        txt_oras_natapos=(TextView)CustomView.findViewById(R.id.txt_oras_natapos);
        txt_id=(TextView)CustomView.findViewById(R.id.txt_id);


        txt_name.setText("Nakapanayam : "+Name[position]);
        txt_oras_nagsimula.setText("Oras Nagsimula : "+oras_nagsimula[position]);
        txt_oras_natapos.setText("Oras Natapos : "+oras_natapos[position]);
        txt_id.setText(M_ID[position]);
        return  CustomView;
    }

}
