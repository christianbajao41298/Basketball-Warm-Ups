package com.example.basketballwarmups;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class WholeBodyDynamic3 extends AppCompatActivity {

    ImageButton myImageButton;
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_whole_body_dynamic3);

        myImageButton = findViewById(R.id.armStretchLeftButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this,ArmStretch.class);
            startActivity(intent);
        });

        myImageButton = findViewById(R.id.armStretchRightButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, ArmStretch2.class);
            startActivity(intent);
        });

        myImageButton = findViewById(R.id.armCirclesButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, ArmCircles.class);
            startActivity(intent);
        });

        myImageButton = findViewById(R.id.kneeHugsLeftButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, KneeHugsLeft.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeHugsRightButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, KneeHugsRight.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.jumpingJacksButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, JumpingJacks.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeStretchLeftButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, KneeStretchLeft.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeStretchRightButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, KneeStretchRight.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.buttKicksButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, ButtKicks.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.walkingHighKneesButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, WalkingHighKnees.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.sideSlidesButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, SideSlides.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.lungesButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, Lunges.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.frankensteinMarchButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, FrankensteinMarch.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.squatButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, Squat.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.inchwormButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, Inchworm.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.walkingLungeWithRotationButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, WalkingLungeWithRotation.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.gluteWalksButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, GluteWalks.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.pushUpButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, PushUp.class);
            startActivity(intent);
        });

        myButton = findViewById(R.id.wholeBodyDynamicStartButton);
        myButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic3.this, ArmStretch.class);
            startActivity(intent);
        });
    }
}