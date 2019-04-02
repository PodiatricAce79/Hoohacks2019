package com.example.husham.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class BicepActivity extends AppCompatActivity {
    TextView dumbell_curls;
    EditText dumbellCurlsText;
    int dumbellCurls;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bicep);

        dumbellCurlsText=(EditText)findViewById(R.id.editText2);
        dumbellCurls = Integer.parseInt(dumbellCurlsText.getText().toString());


    }
}
