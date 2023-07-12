package com.example.addsub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void add(View v){
        EditText t1=(EditText)findViewById(R.id.et1);
        EditText t2=(EditText)findViewById(R.id.et2);

        //convert value into int
        int x=Integer.parseInt(t1.getText().toString());
        int y=Integer.parseInt(t2.getText().toString());

        //sum these two numbers
        int z=x+y;

        //display this text to TextView

    }
    public void sub(View v){

    }
}