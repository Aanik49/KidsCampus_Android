package com.example.anik.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Orange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_orange);
        ImageButton btnleft5=(ImageButton)findViewById(R.id.imagebtnleft5);
        ImageButton btnright5=(ImageButton)findViewById(R.id.imagebtnright5);

        btnleft5.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent= new Intent(getApplicationContext(),Yellow.class);
               intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
btnright5.setOnClickListener(new View.OnClickListener() {

    public void onClick(View v) {
        Intent intent= new Intent(getApplicationContext(),Color.class);
       intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
});

    }

    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), Learning.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
