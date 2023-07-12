package com.example.education;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    CheckBox c1, c2,c3;
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1 = (CheckBox) findViewById(R.id.c1);
        c2 = (CheckBox) findViewById(R.id.c2);
        c3 = (CheckBox) findViewById(R.id.c3);
        et1 =(EditText) findViewById(R.id.et1);
    }
    public void onsslc(View v){
        String str = "";
        if(c1.isChecked()){
            str=" SSLC ";
            et1.setText(str);
        }
        else {
            c2.setChecked(false);
            c3.setChecked(false);
            str="";
            et1.setText(str);
        }
    }
    public void onplus2(View v){
        String str = "";
        if(c2.isChecked()){
            c1.setChecked(true);
            str=" SSLC and +2";
            et1.setText(str);
        }
      else{
            c3.setChecked(false);
            str=" SSLC ";
            et1.setText(str);
        }

    }
    public void ondegree(View v){
        String str = "";
        if(c3.isChecked()){
            c1.setChecked(true);
            c2.setChecked(true);
            str=" SSLC and +2 and degree";
            et1.setText(str);
        }
        else{
            c3.setChecked(false);
            str=" SSLC and +2 ";
            et1.setText(str);
        }
    }
}