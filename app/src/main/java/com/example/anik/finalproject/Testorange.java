package com.example.anik.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Testorange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testorange);
        ImageButton testleft3=(ImageButton)findViewById(R.id.imageButtonl3);
        ImageButton testright3=(ImageButton)findViewById(R.id.imageButtonr3);

        testleft3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Testyellow.class);
                startActivity(intent);
            }
        });

        testright3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Test_color.class);
                startActivity(intent);
            }
        });
    }


}
