package com.example.obd2_code;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;


public class AvtoErr extends AppCompatActivity {
    private DatabaseHelper mDBHelper;
    private SQLiteDatabase mDb;

    public static final String MARK_COLUMN = "Code";
    public static final String P_COLUMN = "P";
    public static final String DESCR_COLUMN = "Descr";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.avtoerr);
        setTitle("ОБОЗНАЧЕНИЕ ОШИБОК OBD2");
        ActionBar actionBar =getSupportActionBar();
        actionBar.setHomeButtonEnabled(true);
        actionBar.setDisplayHomeAsUpEnabled(true);
        mDBHelper = new DatabaseHelper(this);

        try {
            mDBHelper.updateDataBase();
        } catch (IOException mIOException) {
            throw new Error("UnableToUpdateDatabase");
        }

        try {
            mDb = mDBHelper.getWritableDatabase();
        } catch (SQLException mSQLException) {
            throw mSQLException;
        }

        TextView  textView = (TextView) findViewById(R.id.textView);
        final ListView list = (ListView) findViewById(R.id.ListVeiw);

        final ArrayList<String> COLUMN_list = new ArrayList<>();
        final ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, COLUMN_list);
        list.setAdapter(adapter);


        String MARK_TABL1 = getIntent().getStringExtra("MARK_TABL");
        String TABL = getIntent().getStringExtra("TABL_BD");
        textView.setText( MARK_TABL1+TABL);

    }


}

