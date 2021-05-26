package com.example.obd2_code;

import android.content.Intent;
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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toyota = (Button) findViewById(R.id.button75);
        avtovaz = (Button) findViewById(R.id.button74);
        toyota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля TOYOTA";
                String TABL_BD = "toyota";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);

            }
        });


        avtovaz.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View v){

        Intent intent = new Intent(MainActivity.this, AvtoErr.class);
        String MARK_TABL = "Коды ошибок для автомобиля АвтоВАЗ";
            String TABL_BD = "avtoVaz";
        intent.putExtra("MARK_TABL", MARK_TABL);
            intent.putExtra("TABL_BD", TABL_BD);
        startActivity(intent);

    }
    });
}

}