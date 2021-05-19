package com.example.obd2_code;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button avtoerr;
    Button audskoda;
    Button chevr;
    Button avtovaz;
    Button bmw;
    Button ford;
    Button kia;
    Button hyund;
    Button rover;
    Button opel;
    Button toyota;
    Button saab;
    Button greatw;
    Button Chery;

    private DatabaseHelper mDBHelper;
    private SQLiteDatabase mDb;
    public String MARK_TABL ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        avtoerr=(Button) findViewById(R.id.button75);
        avtoerr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MARK_TABL="toyota";

            }
        });
    }
}