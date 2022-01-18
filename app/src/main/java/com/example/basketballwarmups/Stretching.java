package com.example.basketballwarmups;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class Stretching extends AppCompatActivity {
        ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_stretching);

        myImageButton = findViewById(R.id.armStretchLeftButtonIcon3);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(Stretching.this,ArmStretch.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.armStretchRightButtonIcon3);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(Stretching.this,ArmStretch2.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeHugsLeftButtonIcon3);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(Stretching.this,KneeHugsLeft.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeHugsRightButtonIcon3);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(Stretching.this,KneeHugsRight.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeStretchLeftButtonIcon3);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(Stretching.this,KneeStretchLeft.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeStretchRightButtonIcon3);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(Stretching.this,KneeStretchRight.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.walkingLungeWithRotationButtonIcon3);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(Stretching.this,WalkingLungeWithRotation.class);
            startActivity(intent);
        });


    }
}