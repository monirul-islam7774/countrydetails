package com.example.monirul.countryprofile;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button bangladeshbutton,indiabutton,pakistanbutton;
    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangladeshbutton = findViewById(R.id.BangladeshButtonId);
        indiabutton = findViewById(R.id.IndiaButtonId);
        pakistanbutton = findViewById(R.id.PakistanButtonId);


        bangladeshbutton.setOnClickListener(this);
        indiabutton.setOnClickListener(this);
        pakistanbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.BangladeshButtonId){
            intent = new Intent(MainActivity.this,ProfileDetailsActivity.class);
            intent.putExtra("name","Bangladesh");
            startActivity(intent);
        }
        if (view.getId() == R.id.IndiaButtonId){
            intent = new Intent(MainActivity.this,ProfileDetailsActivity.class);
            intent.putExtra("name","India");
            startActivity(intent);
        }
        if (view.getId() == R.id.PakistanButtonId){
            intent = new Intent(MainActivity.this,ProfileDetailsActivity.class);
            intent.putExtra("name","Pakistan");
            startActivity(intent);
        }
    }

    @Override
    public void onBackPressed() {

        final AlertDialog.Builder alertDialogBuilder;
        alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        alertDialogBuilder.setIcon(R.drawable.question);
        alertDialogBuilder.setTitle(R.string.Title_text);
        alertDialogBuilder.setMessage(R.string.messgage_text);
        alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                finish();
            }
        });
        alertDialogBuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {

                dialogInterface.cancel();
            }
        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialogBuilder.show();


    }
}
