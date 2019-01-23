package com.example.anik.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Testing extends AppCompatActivity {


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);
        final Animation animation3= AnimationUtils.loadAnimation(this, R.anim.anim_translate);
        Button button10=(Button)findViewById(R.id.button10);
        Button button11=(Button)findViewById(R.id.button11);
        Button button12=(Button)findViewById(R.id.button12);
        Button button13=(Button)findViewById(R.id.button13);
        Button button14=(Button)findViewById(R.id.button14);
        //color
        button10.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                v.startAnimation(animation3);
                Intent intent= new Intent(getApplicationContext(),Test_color.class);
                startActivity(intent);
            }
        });
        //shape
        button11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                v.startAnimation(animation3);
                Intent intent= new Intent(getApplicationContext(),Test_shape.class);
                startActivity(intent);
            }
        });
        //poet
        button12.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                v.startAnimation(animation3);
                Intent intent= new Intent(getApplicationContext(),Test_writer.class);
                startActivity(intent);
            }
        });
        //technology
        button13.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                v.startAnimation(animation3);
                Intent intent= new Intent(getApplicationContext(),Test_technology.class);
                startActivity(intent);
            }
        });
        //place
        button14.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                v.startAnimation(animation3);
                Intent intent= new Intent(getApplicationContext(),Test_architecture.class);
                startActivity(intent);
            }
        });

    }

   
}
