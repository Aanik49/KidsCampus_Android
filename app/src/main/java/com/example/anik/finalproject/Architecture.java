package com.example.anik.finalproject;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

public class Architecture extends Activity {



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_architecture);
        ImageButton leftarrow11=(ImageButton)findViewById(R.id.imagebtnleft11);
        ImageButton rightarrow11=(ImageButton)findViewById(R.id.imagebtnright11);

        rightarrow11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Sririsoudho.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });

        leftarrow11.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Moynamoti.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
        

    }
    public void onBackPressed(){
        Intent intent = new Intent(getApplicationContext(), Learning.class);
        startActivity(intent);
    }

}
