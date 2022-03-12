package com.example.basketballwarmups;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
public class MenuActivity extends AppCompatActivity {
    VideoView videoView;
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);
        videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("");
        videoView.start();

        myImageButton = findViewById(R.id.wholebodydynamicButton);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, WholeBodyDynamic2.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.inPlaceButton);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, InPlace.class);
            startActivity(intent);
        });

        myImageButton = findViewById(R.id.withBallButton);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, WithBall2.class);
            startActivity(intent);
        });

        myImageButton = findViewById(R.id.stretchingButton);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MenuActivity.this, Stretching.class);
            startActivity(intent);
        });
    }


}


