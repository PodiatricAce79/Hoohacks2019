package com.example.husham.myapplication;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton armsButton;
    ImageButton chestButton;
    ImageButton legsButton;
    ImageButton shouldersButton;
    ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        armsButton=(ImageButton)findViewById(R.id.imageButton11);
        chestButton=(ImageButton)findViewById(R.id.imageButton10);
        legsButton=(ImageButton)findViewById(R.id.imageButton9);
        shouldersButton=(ImageButton)findViewById(R.id.imageButton4);
        backButton=(ImageButton)findViewById(R.id.imageButton3);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View view) {
                Intent intentloa=new Intent(MainActivity.this, BackActivity.class);
                startActivity(intentloa);

                }
        });

        shouldersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentlo = new Intent(MainActivity.this, ShouldersActivity.class);
                startActivity(intentlo);
                }
        });

        legsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentL=new Intent(MainActivity.this, LegsActivity.class);
                startActivity(intentL);
            }
        });

        chestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View w){
                Intent intentLoad=new Intent(MainActivity.this, ChestActivity.class);
                startActivity(intentLoad);
            }
        });

        armsButton.setOnClickListener(new View.OnClickListener(){
           @Override
           public void onClick(View v){
               Intent intentLoadNewActivity=new Intent(MainActivity.this, ArmsActivity.class);
               startActivity(intentLoadNewActivity);

           }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
