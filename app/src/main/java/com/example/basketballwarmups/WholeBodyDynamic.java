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
    ImageButton myImageButton2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_whole_body_dynamic);

        myImageButton = findViewById(R.id.armStretchLeftButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this,ArmStretch.class);
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
            Intent intent = new Intent(WholeBodyDynamic.this, KneeHugsLeft.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeHugsRightButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, KneeHugsRight.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.jumpingJacksButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, JumpingJacks.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeStretchLeftButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, KneeStretchLeft.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.kneeStretchRightButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, KneeStretchRight.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.buttKicksButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, ButtKicks.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.walkingHighKneesButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, WalkingHighKnees.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.sideSlidesButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, SideSlides.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.lungesButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, Lunges.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.frankensteinMarchButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, FrankensteinMarch.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.squatButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WholeBodyDynamic.this, Squat.class);
            startActivity(intent);
        });


    }
        }

