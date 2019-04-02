package com.example.husham.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ShouldersActivity extends AppCompatActivity {
    Button front;
    Button middle;
    Button rear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoulders);

        front = (Button) findViewById(R.id.button8);
        middle = (Button) findViewById(R.id.button9);
        rear = (Button) findViewById(R.id.button10);

        front.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent fro = new Intent(ShouldersActivity.this, FrontActivity.class);
                startActivity(fro);
            }

        });

        middle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mid=new Intent(ShouldersActivity.this, MiddleActivity.class);
                startActivity(mid);
            }
        });

        rear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent rear=new Intent(ShouldersActivity.this, RearActivity.class);
                startActivity(rear);
            }
        });
    }

}