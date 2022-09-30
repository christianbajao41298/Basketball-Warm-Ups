package com.example.basketballwarmups;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class RestPushUp extends AppCompatActivity {

    DBHelper DB = new DBHelper(this);
    private static long START_TIME_IN_MILLIS;
    private TextView mTextViewCountDown;
    private Button mButtonStartPause;
    private Button mButtonReset;
    private CountDownTimer mCountDownTimer;
    private boolean mTimerRunning;
    private long mTimeLeftInMillis;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rest_push_up);
        mTextViewCountDown = findViewById(R.id.countdown_text);
        //get timer data
        int data = DB.getRestTimerData();
        START_TIME_IN_MILLIS = data*1000;
        mTimeLeftInMillis = START_TIME_IN_MILLIS;
        startTimer();

    }
    private void startTimer() {
        mCountDownTimer = new CountDownTimer(mTimeLeftInMillis, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                mTimeLeftInMillis = millisUntilFinished;
                int minutes = (int) (mTimeLeftInMillis / 1000) / 60;
                int seconds = (int) (mTimeLeftInMillis / 1000) % 60;
                String timeLeftFormatted = String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds);
                mTextViewCountDown.setText(timeLeftFormatted);
            }
            @Override
            public void onFinish() {
                startActivity(new Intent(getApplicationContext(),PushUp.class));
                finish();
            }
        }.start();
        mTimerRunning = true;
    }
    @Override
    public void onBackPressed()
    {
        super.onBackPressed();
        startActivity(new Intent(RestPushUp.this, WholeBodyDynamic3.class));
        mCountDownTimer.cancel();
        finish();
    }
}

