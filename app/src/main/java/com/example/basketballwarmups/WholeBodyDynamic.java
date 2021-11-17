package com.example.basketballwarmups;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class WholeBodyDynamic extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_whole_body_dynamic);

        myButton = findViewById(R.id.armstretchbutton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WholeBodyDynamic.this, ArmStretch.class);
                startActivity(intent);
            }
        });
        myButton = findViewById(R.id.armstretchbutton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WholeBodyDynamic.this, ArmStretch.class);
                startActivity(intent);
            }
        });
        myButton = findViewById(R.id.armstretchbutton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WholeBodyDynamic.this, ArmStretch.class);
                startActivity(intent);
            }
        });
        myButton = findViewById(R.id.armstretchbutton);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WholeBodyDynamic.this, ArmStretch.class);
                startActivity(intent);
            }
        });
    }
}