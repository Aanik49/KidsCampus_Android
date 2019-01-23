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

public class Learning extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning);
        final Animation animation2= AnimationUtils.loadAnimation(this, R.anim.anim_translate);

        Button button5=(Button)findViewById(R.id.button5);
        Button button6=(Button)findViewById(R.id.button6);
        Button button7=(Button)findViewById(R.id.button7);
        Button button8=(Button)findViewById(R.id.button8);
        Button button9=(Button)findViewById(R.id.button9);
        //color
        button5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                v.startAnimation(animation2);
                Intent intent= new Intent(getApplicationContext(),Color.class);
                startActivity(intent);
            }
        });
        //shape
        button6.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                v.startAnimation(animation2);
                Intent intent= new Intent(getApplicationContext(),Shape.class);
                startActivity(intent);
            }
        });
        //poet
        button7.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                v.startAnimation(animation2);
                Intent intent= new Intent(getApplicationContext(),Writer.class);
                startActivity(intent);
            }
        });
        //technology
        button8.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                v.startAnimation(animation2);
                Intent intent= new Intent(getApplicationContext(),Technology.class);
                startActivity(intent);
            }
        });
        //place
        button9.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                v.startAnimation(animation2);
                Intent intent= new Intent(getApplicationContext(),Architecture.class);
                startActivity(intent);
            }
        });
    }
    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), Home.class);
        //intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
   
}
