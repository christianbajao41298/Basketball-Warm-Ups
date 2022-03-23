package com.example.basketballwarmups;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {
    //DatabaseHelper mDatabaseHelper;
    private Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        btnSave = (Button) findViewById(R.id.btnSave);
        //mDatabaseHelper = new DatabaseHelper(this);
    }
}