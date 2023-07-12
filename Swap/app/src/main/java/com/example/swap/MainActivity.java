package com.example.swap;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onswap(View v){
        EditText et1,et2;
        et1 =(EditText)findViewById(R.id.et1);
        et2 =(EditText)findViewById(R.id.et2);
        String str = et1.getText().toString();
        String str2 = et2.getText().toString();
        et2.setText(str);
        et1.setText(str2);
    }
}