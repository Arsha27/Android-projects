package com.example.valuepass;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        Bundle b = getIntent().getExtras();
        String s = b.getString("name");
        EditText e = (EditText) findViewById(R.id.et2);
        e.setText(s);
    }
    public void onHide(View v){
       finish();
    }

}