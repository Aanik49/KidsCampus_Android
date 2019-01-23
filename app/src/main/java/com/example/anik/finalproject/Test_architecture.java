package com.example.anik.finalproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Test_architecture extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_architecture);
        final MediaPlayer placeright=MediaPlayer.create(this,R.raw.right);
        final MediaPlayer placewrong=MediaPlayer.create(this,R.raw.wrong);
        ImageButton imageButtonminar=(ImageButton)findViewById(R.id.imageButtontestminar);
        ImageButton imageButtonmoyna=(ImageButton)findViewById(R.id.imageButtontestmoyna);
        ImageButton imageButtonsriti=(ImageButton)findViewById(R.id.imageButtonsriti);


        imageButtonminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placeright.start();
                Toast.makeText(getApplicationContext(), "Correct Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imageButtonmoyna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placewrong.start();
                Toast.makeText(getApplicationContext(), "Wrong Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imageButtonsriti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                placewrong.start();
                Toast.makeText(getApplicationContext(), "Wrong Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}
