package com.example.husham.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BackActivity extends AppCompatActivity {
    Button upper;
    Button lower;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);

        upper=(Button)findViewById(R.id.button6);
        lower=(Button)findViewById(R.id.button7);


        upper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent upper=new Intent(BackActivity.this, UpperBackActivity.class);
                startActivity(upper);
            }
        });

        lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent lower= new Intent(BackActivity.this, LowerBackActivity.class);
                startActivity(lower);
            }
        });
    }
}
