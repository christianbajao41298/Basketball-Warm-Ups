package com.example.basketballwarmups;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

public class WithBall2 extends AppCompatActivity {
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_with_ball2);
        myImageButton = findViewById(R.id.ballDribbleButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WithBall2.this,BallDribble.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.ballTapButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WithBall2.this,BallTap.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.waistWrapButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WithBall2.this,WaistWrap.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.sideLungeWithTouchButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WithBall2.this,SideLungeWithTouch.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.backLungeWithPassBackButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WithBall2.this,BackLungeWithPassBack.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.singleLegRollButtonIcon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(WithBall2.this,SingleLegRoll.class);
            startActivity(intent);
        });
    }
}