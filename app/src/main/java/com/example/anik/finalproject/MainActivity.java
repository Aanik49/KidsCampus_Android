package com.example.anik.finalproject;

import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=(TextView)findViewById(R.id.textView);
        TextView textView1=(TextView)findViewById(R.id.textView2);
        Typeface myFonts= Typeface.createFromAsset(getAssets(), "fonts/Redhair.ttf");
        Typeface myFonts2=Typeface.createFromAsset(getAssets(),"fonts/Fat Tats.ttf");
        textView.setTypeface(myFonts2);
        textView1.setTypeface(myFonts);

        Thread timerThread = new Thread() {
            public void run() {
                try {
                    sleep(1800);
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    Intent intent = new Intent(getApplicationContext(),
                            Home.class);
                    startActivity(intent);
                    finish();
                }
            }
        };
        timerThread.start();

    }


}
