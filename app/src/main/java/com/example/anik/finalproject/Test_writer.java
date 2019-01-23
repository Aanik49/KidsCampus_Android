package com.example.anik.finalproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Test_writer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_writer);

        ImageButton imageButtonrobi=(ImageButton)findViewById(R.id.imageButtontestrobithakur);
        ImageButton imageButtonnazrul=(ImageButton)findViewById(R.id.imageButtonnazrul);
        ImageButton imageButtonjasim=(ImageButton)findViewById(R.id.imageButtonjasim);

final MediaPlayer poetright=MediaPlayer.create(this,R.raw.right);
        final MediaPlayer poetwrong=MediaPlayer.create(this,R.raw.wrong);


         imageButtonrobi.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 poetwrong.start();
                 Toast.makeText(getApplicationContext(), "Wrong Answer",
                         Toast.LENGTH_SHORT).show();
             }
         });
        imageButtonnazrul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poetright.start();

                Toast.makeText(getApplicationContext(), "Right Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
        imageButtonjasim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                poetwrong.start();
                Toast.makeText(getApplicationContext(), "Wrong Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}
