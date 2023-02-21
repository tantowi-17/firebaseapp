package com.tw.firebaseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import com.tw.firebaseapp.crudsqlite.DataSqliteActivity;

public class HomeActivity extends AppCompatActivity {

    Button btnFirebase, btnJson, btnSqlite;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnFirebase = findViewById(R.id.dataFireBase);
        btnJson = findViewById(R.id.dataJson);
        btnSqlite = findViewById(R.id.dataSqlite);

        btnFirebase.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
        });

        btnJson.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), JsonActivity.class));
        });

        btnSqlite.setOnClickListener(v -> {
            startActivity(new Intent(getApplicationContext(), DataSqliteActivity.class));
        });
    }
}