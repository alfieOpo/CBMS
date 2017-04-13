package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class switcher_adapter extends ArrayAdapter<String> {

    private Context ctx;
    TextView lbl_topic_Tile,lbl_topic_description;
    String []Title;
    ImageButton imageButton ;
    int []img;
    public switcher_adapter(Context context, String[] title,int [] _img) {
        super(context,R.layout.activity_switcher_adapter, title);
        this.ctx = context;
        Title=title;
        img=_img;
    }
    public View getView(int position, View contentView, ViewGroup parent){
        LayoutInflater layoutInflater= LayoutInflater.from(getContext());
        View CustomView=layoutInflater.inflate(R.layout.activity_switcher_adapter,parent,false);
        imageButton=(ImageButton)CustomView.findViewById(R.id.imageButton);
        imageButton.setTag(Title[position]);
        imageButton.setImageResource(img[position]);
        return  CustomView;
    }

}
