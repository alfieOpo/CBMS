package absnitsolution.modifiedcommunitybasemonitoringsystem;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class FlashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flash_screen);


        Thread thread = new Thread(
        ) {
            @Override
            public void run() {
                try {
                    UsersDatabase UD = new UsersDatabase(getApplicationContext());

                    sleep(2000);
                    Intent startmainactivity = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(startmainactivity);
                    finish();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }



}
