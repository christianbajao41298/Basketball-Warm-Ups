package com.example.basketballwarmups;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class InPlace extends AppCompatActivity {
        ImageButton myImageButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_place);

        myImageButton = findViewById(R.id.armStretchLeftButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this,ArmStretch.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.armStretchRightButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this, ArmStretch2.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.armCirclesButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this, ArmCircles.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeHugsLeftButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this, KneeHugsLeft.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeHugsRightButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this, KneeHugsRight.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.jumpingJacksButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this, JumpingJacks.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeStretchLeftButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this, KneeStretchLeft.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeStretchRightButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this, KneeStretchRight.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.buttKicksButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this, ButtKicks.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.walkingHighKneesButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this, WalkingHighKnees.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.lungesButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this, Lunges.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.squatButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this, Squat.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.pushUpButtonIcon2);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(InPlace.this, PushUp.class);
            startActivity(intent);
        });

    }
}