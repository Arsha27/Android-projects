package com.example.alertboxdemo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements DialogInterface.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public  void bclick(View v)
    {
        AlertDialog.Builder obj=new AlertDialog.Builder(this);
        obj.setMessage("Are You Sure?");
        obj.setCancelable(true);
        obj.setPositiveButton(android.R.string.ok, this);
        obj.setNegativeButton( android.R.string.cancel,  this);
        AlertDialog d=obj.create();
        d.show();
    }

    @Override
    public void onClick(DialogInterface dialogInterface, int i) {
        if(i == -1)
        {
            finish();
        }
        else
        {
            dialogInterface.cancel();
        }

    }
    public void onClick2(View v)
    {
        AlertDialog.Builder obj=new AlertDialog.Builder(this);
        obj.setMessage("Are you sure?").setCancelable(true)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });
        AlertDialog d = obj.create();
        d.show();




    }
}