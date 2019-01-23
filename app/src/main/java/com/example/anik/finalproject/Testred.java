package com.example.anik.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Testred extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testred);

        ImageButton testleft4=(ImageButton)findViewById(R.id.imageButtonl4);
        ImageButton testright4=(ImageButton)findViewById(R.id.imageButtonr4);

        testleft4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Testgreen.class);
                startActivity(intent);
            }
        });

        testright4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Testyellow.class);
                startActivity(intent);
            }
        });

    }


}
