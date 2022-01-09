package com.example.basketballwarmups;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class WholeBodyDynamic extends AppCompatActivity {

    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_whole_body_dynamic);

        myImageButton = findViewById(R.id.armStretchLeftButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, ArmStretch.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.armStretchRightButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, ArmStretch2.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.armCirclesButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, ArmCircles.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeHugsLeftButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, KneeHugs.class);
            startActivity(intent);
        });

            }
        }

