package com.example.anik.finalproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Test_technology extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_technology);
        final MediaPlayer scienceright=MediaPlayer.create(this,R.raw.right);
        final MediaPlayer sciencewrong=MediaPlayer.create(this,R.raw.wrong);

        ImageButton imageButtonmobile=(ImageButton)findViewById(R.id.imageButtontestmobile);
        ImageButton imageButtoncomputer=(ImageButton)findViewById(R.id.imageButtontestcomputer);
        ImageButton imageButtonmodem=(ImageButton)findViewById(R.id.imageButtonmodem);


        imageButtonmobile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scienceright.start();
                Toast.makeText(getApplicationContext(), "Right Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imageButtoncomputer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sciencewrong.start();
                Toast.makeText(getApplicationContext(), "Wrong Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imageButtonmodem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sciencewrong.start();
                Toast.makeText(getApplicationContext(), "Wrong Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}
