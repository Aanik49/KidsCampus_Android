package com.example.anik.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Testgreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testgreen);
        ImageButton testleft2=(ImageButton)findViewById(R.id.imageButtonl2);
        ImageButton testright2=(ImageButton)findViewById(R.id.imageButtonr2);

        testleft2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Test_color.class);
                startActivity(intent);
            }
        });

        testright2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Testred.class);
                startActivity(intent);
            }
        });

    }


}
