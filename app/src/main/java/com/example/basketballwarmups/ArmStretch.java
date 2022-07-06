package com.example.basketballwarmups;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v4.app.INotificationSideChannel;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class ArmStretch extends AppCompatActivity {

    ImageView img;
    ImageButton myImageHomeButton;

    DBHelper DB = new DBHelper(this);
    private static long START_TIME_IN_MILLIS;
    private TextView mTextViewCountDown;
    private Button mButtonStartPause;
    private Button mButtonReset;
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis = START_TIME_IN_MILLIS;
    VideoView videoView;
    private INotificationSideChannel.Default someCountDownTimer;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arm_stretch);

        //get timer data
        int data = DB.getTimerData();
        START_TIME_IN_MILLIS = data*1000;
        mTimeLeftInMillis = START_TIME_IN_MILLIS;


        VideoView videoView =findViewById(R.id.videoView2);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.kneehugs);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.start();
        mediaController.setVisibility(View.INVISIBLE);

        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
                public void onPrepared(MediaPlayer mp) {
                    mp.setLooping(true);
            }
        });

        mTextViewCountDown = findViewById(R.id.countdown_text);
        mButtonStartPause = findViewById(R.id.startButton);
        mButtonReset = findViewById(R.id.resetButton);
        startTimer();
        mButtonStartPause.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (mTimerRunning) {
                    pauseTimer();
                    videoView.pause();
                } else {
                    startTimer();
                    videoView.start();
                }

            }
        });
            mButtonReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) { resetTimer();
                }
            });
             updateCountDownText();

     }
            private void startTimer() {
                mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        mTimeLeftInMillis = millisUntilFinished;
                        updateCountDownText();


                    }
                    @Override
                    public void onFinish() {
                        startActivity(new Intent(getApplicationContext(),RestArmStretchRight.class));
                    }
                }.start();
                    mTimerRunning = true;
                    mButtonStartPause.setText("Pause");
                    mButtonReset.setVisibility(View.INVISIBLE);

            }
            private void pauseTimer(){
            mCountDownTimer.cancel();
            mTimerRunning = false;
            mButtonStartPause.setText("Continue");
            mButtonReset.setVisibility(View.VISIBLE );

            }
            private void resetTimer(){
                //get timer data
                int data = DB.getTimerData();
                START_TIME_IN_MILLIS = data*1000;
                mTimeLeftInMillis = START_TIME_IN_MILLIS;
            updateCountDownText();
            mButtonReset.setVisibility(View.INVISIBLE);
            mButtonStartPause.setText("Pause");
            mButtonStartPause.setVisibility(View.VISIBLE);

                VideoView videoView =findViewById(R.id.videoView2);
                videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.kneehugs);
                MediaController mediaController = new MediaController(this);
                mediaController.setAnchorView(videoView);
                videoView.setMediaController(mediaController);
                videoView.start();
                mediaController.setVisibility(View.INVISIBLE);
                videoView.setMediaController(mediaController);

                mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        mTimeLeftInMillis = millisUntilFinished;
                        updateCountDownText();
                    }
                    @Override
                    public void onFinish() {
                        startActivity(new Intent(getApplicationContext(),RestArmStretchRight.class));
                    }
                }.start();
                mTimerRunning = true;
                mButtonStartPause.setText("Pause");
                mButtonReset.setVisibility(View.INVISIBLE);
            }
            private void updateCountDownText(){
                int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
                int seconds = (int) (mTimeLeftInMillis / 1000) % 60;
                String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
                mTextViewCountDown.setText(timeLeftFormatted);
            }

    }
