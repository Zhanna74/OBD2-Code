package com.example.obd2_code;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


public class AvtoErr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtoerr);

        TextView  textView = (TextView) findViewById(R.id.textView);

        String MARK_TABL1 = getIntent().getStringExtra("MARK_TABL");
        String TABL = getIntent().getStringExtra("TABL_BD");
        textView.setText( MARK_TABL1+TABL);

    }


}

