package com.example.husham.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChestActivity extends AppCompatActivity {
    Button upper;
    Button overall;
    Button lower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chest);

        upper=(Button)findViewById(R.id.button);
        overall=(Button)findViewById(R.id.button4);
        lower=(Button)findViewById(R.id.button5);

        upper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newUpper=new Intent(ChestActivity.this,UpperChestActivity.class);
                startActivity(newUpper);
            }
        });

        overall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newOverall=new Intent(ChestActivity.this, OverallChestActivity.class);
                startActivity(newOverall);
            }
        });

        lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newLower=new Intent(ChestActivity.this, LowerChestActivity.class);
                startActivity(newLower);
            }
        });
    }
}
