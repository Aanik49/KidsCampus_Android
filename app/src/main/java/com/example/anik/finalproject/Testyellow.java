package com.example.anik.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Testyellow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testyellow);
        ImageButton testleft5=(ImageButton)findViewById(R.id.imageButtonl5);
        ImageButton testright5=(ImageButton)findViewById(R.id.imageButtonr5);

        testleft5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Testred.class);
                startActivity(intent);
            }
        });

        testright5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Testorange.class);
                startActivity(intent);
            }
        });
    }


}
