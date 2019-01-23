package com.example.anik.finalproject;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Test_shape extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_shape);
        final MediaPlayer shaperight=MediaPlayer.create(this,R.raw.right);
        final MediaPlayer shapewrong=MediaPlayer.create(this,R.raw.wrong);

        ImageButton imageButtontapizium=(ImageButton)findViewById(R.id.imageButtontrapizium);
        ImageButton imageButtonsquare=(ImageButton)findViewById(R.id.imageButtonsquare);
        ImageButton imageButtonstar=(ImageButton)findViewById(R.id.imageButtonstar);


        imageButtontapizium.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                shapewrong.start();
                Toast.makeText(getApplicationContext(), "Wrong Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
imageButtonsquare.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        shaperight.start();
        Toast.makeText(getApplicationContext(), "Correct Answer",
                Toast.LENGTH_SHORT).show();
    }
});
        imageButtonstar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                shapewrong.start();
                Toast.makeText(getApplicationContext(), "Wrong Answer",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }


}
