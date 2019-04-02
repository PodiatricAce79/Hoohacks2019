package com.example.husham.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;

public class ArmsActivity extends AppCompatActivity {
     Button bicep;
     Button tricep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arms);

        bicep=(Button)findViewById(R.id.button2);
        tricep=(Button)findViewById(R.id.button3);
        bicep.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent newBicep= new Intent(ArmsActivity.this, BicepActivity.class);
                startActivity(newBicep);
            }


        });

        tricep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newTricep=new Intent(ArmsActivity.this, TricepActivity.class);
                startActivity(newTricep);
            }
        });



    }
}
