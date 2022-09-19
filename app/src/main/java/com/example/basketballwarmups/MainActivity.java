package com.example.basketballwarmups;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DB = new DBHelper(this);

        int data = DB.getTimerData();
        if (data == 0) {
            int time = 20;
            Boolean insertData = DB.insertTimerData(time);

            if (insertData == true) {
                Log.d("timer Initialize", "Success" + data);
            } else {
                Log.d("timer Initialize", "Fail");
            }

        }

        int data2 = DB.getRestTimerData();
        if (data2 == 0) {
            int time = 20;
            Boolean insertData = DB.insertRestTimerData(time);

            if (insertData == true) {
                Log.d("timer Initialize", "Success" + data2);
            } else {
                Log.d("timer Initialize", "Fail");
            }

        }
        Handler handler = new Handler();
        handler.postDelayed(() -> startActivity(new Intent(MainActivity.this, MainMenu.class)), 2000);
    }
}
