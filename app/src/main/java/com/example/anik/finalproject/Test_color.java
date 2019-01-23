package com.example.anik.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Test_color extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_color);
        final MediaPlayer palyercolorr8=MediaPlayer.create(this,R.raw.right);
        final MediaPlayer playercolorrng=MediaPlayer.create(this,R.raw.wrong);
        Button buttontest1=(Button)findViewById(R.id.buttontest1);
        Button buttontest2=(Button)findViewById(R.id.buttontest2);
        Button buttontest3=(Button)findViewById(R.id.buttontest3);
        Button buttontest4=(Button)findViewById(R.id.buttontest4);
        Button buttontest5=(Button)findViewById(R.id.buttontest5);
        Button buttontest6=(Button)findViewById(R.id.buttontest6);


buttontest1.setOnClickListener(new View.OnClickListener() {

    public void onClick(View v) {
        playercolorrng.start();
        Toast.makeText(getApplicationContext(), "Wrong Answer",
                Toast.LENGTH_SHORT).show();
    }
});


        buttontest2.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                palyercolorr8.start();
                Toast.makeText(getApplicationContext(), "Correct Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
        buttontest3.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                playercolorrng.start();
                Toast.makeText(getApplicationContext(), "Wrong Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
        buttontest4.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                playercolorrng.start();
                Toast.makeText(getApplicationContext(), "Wrong Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
        buttontest5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                playercolorrng.start();
                Toast.makeText(getApplicationContext(), "Wrong Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
        buttontest6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                palyercolorr8.start();
                Toast.makeText(getApplicationContext(), "Correct Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}
