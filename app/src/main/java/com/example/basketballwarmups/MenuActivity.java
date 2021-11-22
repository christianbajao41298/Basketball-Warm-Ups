package com.example.basketballwarmups;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;
public class MenuActivity extends AppCompatActivity {
    VideoView videoView;
    ImageButton myImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_menu);
        videoView = findViewById(R.id.videoView);
        videoView.setVideoPath("");
        videoView.start();

        myImageButton = findViewById(R.id.wholebodydynamicButton);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, WholeBodyDynamic.class);
                startActivity(intent);
            }

        });
        myImageButton = findViewById(R.id.imageButton6);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, InPlace.class);
                startActivity(intent);
            }
        });

        myImageButton = findViewById(R.id.imageButton7);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, WithBall.class);
                startActivity(intent);
            }
        });

        myImageButton = findViewById(R.id.imageButton8);
        myImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, Stretching.class);
                startActivity(intent);
            }
        });
    }


}


