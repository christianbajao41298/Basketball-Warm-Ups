package com.example.basketballwarmups;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    VideoView videoView;
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        VideoView videoView =findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.sample);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        myImageButton = findViewById(R.id.wholebodydynamicButton);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainMenu.this, WholeBodyDynamic3.class);
            startActivity(intent);
        });
        myImageButton = findViewById(R.id.inPlaceButton);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainMenu.this, InPlace.class);
            startActivity(intent);
        });

        myImageButton = findViewById(R.id.withBallButton);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainMenu.this, WithBall2.class);
            startActivity(intent);
        });

        myImageButton = findViewById(R.id.stretchingButton);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainMenu.this, Stretching.class);
            startActivity(intent);
        });

        myImageButton = findViewById(R.id.settingsbuttonicon);
        myImageButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainMenu.this, Settings.class);
            startActivity(intent);
        });
    }
}