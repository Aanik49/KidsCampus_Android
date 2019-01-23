package com.example.anik.finalproject;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        final Animation animation= AnimationUtils.loadAnimation(this,R.anim.anim_translate);

        Button button=(Button)findViewById(R.id.button);
        Button button2=(Button)findViewById(R.id.button2);
        Button button3=(Button)findViewById(R.id.button3);
        Button button4=(Button)findViewById(R.id.button4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(animation);
                Intent intent= new Intent(getApplicationContext(),Learning.class);
                startActivity(intent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                v.startAnimation(animation);
                Intent intent= new Intent(getApplicationContext(),Testing.class);
                startActivity(intent);
            }
        });
button3.setOnClickListener(new View.OnClickListener() {

    public void onClick(View v) {

        v.startAnimation(animation);
        Intent intent= new Intent(getApplicationContext(),About.class);
        startActivity(intent);
    }
});

button4.setOnClickListener(new View.OnClickListener() {

    public void onClick(View v) {

        moveTaskToBack(true);
        Home.this.finish();

    }
});


    }

    public void onBackPressed(){
        moveTaskToBack(true);
        Home.this.finish();
    }
}
