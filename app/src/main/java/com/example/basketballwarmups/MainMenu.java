package com.example.basketballwarmups;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {

    VideoView videoView;
    ImageButton myImageButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        VideoView videoView =findViewById(R.id.videoView);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.wew);
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

    @Override
    public void onBackPressed() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder
                .setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                moveTaskToBack(true);
                                android.os.Process.killProcess(android.os.Process.myPid());
                                System.exit(1);
                            }
                        })

                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {

                        dialog.cancel();
                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}