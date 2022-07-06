package com.example.basketballwarmups;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Settings extends AppCompatActivity {
    //DatabaseHelper mDatabaseHelper;
    private Button btnSave;
    EditText editseconds;
    DBHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        //mDatabaseHelper = new DatabaseHelper(this);

        editseconds=findViewById(R.id.text_input);
        btnSave = (Button) findViewById(R.id.btnSave);
        DB=new DBHelper(this);

        int data = DB.getTimerData();
        Toast.makeText(Settings.this,"timerData: "+data, Toast.LENGTH_SHORT).show();
        editseconds.setText(data+"");

      btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String secs = editseconds.getText().toString();
                int time = Integer.parseInt(secs);
                Boolean updateData = DB.updateTimerData(time);

                if(updateData==true){
                    Toast.makeText(Settings.this,"Success", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Settings.this,"Failed", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}