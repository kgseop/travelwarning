package com.capstone.crime;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ApplicationErrorReport;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button gocrime;
    Button gowarning;
    Button gogps;
    Button gomanual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        gocrime = findViewById(R.id.gocrime);

        gocrime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent001 = new Intent(MainActivity.this, crimeinfo.class);
                startActivity(intent001);
            }
        });

        gowarning = findViewById(R.id.gowarning);

        gowarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent002 = new Intent(MainActivity.this, warning.class);
                startActivity(intent002);
            }
        });

        gogps = findViewById(R.id.gogps);

        gogps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent003 = new Intent(MainActivity.this, detail.class);
                startActivity(intent003);
            }
        });

        gomanual = findViewById(R.id.gomanual);

        gomanual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent004 = new Intent(MainActivity.this, manual.class);
                startActivity(intent004);
            }
        });


    }

}
