package com.example.obd2_code;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;
import java.util.ArrayList;


public class AvtoErr extends AppCompatActivity {
    private DatabaseHelper mDBHelper;
    private SQLiteDatabase mDb;
    String check;

    private CheckBox checkBoxP;
    private CheckBox checkBoxC;
    private CheckBox checkBoxB;
    private CheckBox checkBoxU;
    private CheckBox checkBoxF;

    public static final String MARK_COLUMN = "field2";
    public static final String P_COLUMN = "field1";
    public static final String DESCR_COLUMN = "field3";
    public static final String DESCR_COL = "field4";
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

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
        final EditText editText = (EditText)findViewById(R.id.editText);
        final ListView list = (ListView) findViewById(R.id.ListView);
        final Button but = (Button)findViewById(R.id.button);
        this.checkBoxP = (CheckBox) this.findViewById(R.id.checkBoxP);
        this.checkBoxC = (CheckBox) this.findViewById(R.id.checkBoxC);
        this.checkBoxF = (CheckBox) this.findViewById(R.id.checkBoxF);
        this.checkBoxU = (CheckBox) this.findViewById(R.id.checkBoxU);
        this.checkBoxB = (CheckBox) this.findViewById(R.id.checkBoxB);

        final ArrayList<String> COLUMN_list = new ArrayList<>();
        final ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, COLUMN_list);
        list.setAdapter(adapter);
        checkBoxP.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    check="P";
                }
            }
        });

        checkBoxC.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    check="C";
                }
            }
        });
        checkBoxB.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    check="B";
                }
            }
        });
        checkBoxU.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    check="U";
                }
            }
        });
        checkBoxF.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (compoundButton.isChecked()) {
                    check="F";
                }
            }
        });


        String MARK_TABL1 = getIntent().getStringExtra("MARK_TABL");
        String TABL = getIntent().getStringExtra("TABL_BD");
        textView.setText( MARK_TABL1+TABL);
        assert editText != null;
        editText.setOnKeyListener(
                new View.OnKeyListener() {
                    public boolean onKey(View v, int keyCode, KeyEvent event) {
                        if(event.getAction() == KeyEvent.ACTION_DOWN &&
                                (keyCode == KeyEvent.KEYCODE_ENTER)){


                            String str = editText.getText().toString();
                            if (editText.getText().toString().equals(""))
                            {textView.setText("Наберите номер ошибки ПУСТО!");
                            }
                            else
                            { if (checkBoxP.isChecked()) {
                                textView.setText("Наберите номер ошибки!" +check);
                                check="P";

                            }

                                if (checkBoxC.isChecked()) {
                                    textView.setText("Наберите номер ошибки!" +check);
                                    check="C";

                                }
                                if (checkBoxF.isChecked()) {
                                    textView.setText("Наберите номер ошибки!" +check);
                                    check="F";

                                }
                                if (checkBoxB.isChecked()) {
                                    textView.setText("Наберите номер ошибки!" +check);
                                    check="B";

                                }
                                if (checkBoxU.isChecked()) {
                                    textView.setText("Наберите номер ошибки!" +check);
                                    check="U";

                                }
                                str = editText.getText().toString();
                                //PUC.add(0, editText.getText().toString());
                                Cursor cursor = mDb.rawQuery("SELECT * FROM "+TABL+"WHERE field1='"+check+
                                        "' AND field2 LIKE '"+str+"%'", null);

                                cursor.moveToFirst();
                                while (!cursor.isAfterLast()) {
                                    String item_content = cursor.getString(cursor
                                            .getColumnIndex(MARK_COLUMN));
                                    String item_p = cursor.getString(cursor
                                            .getColumnIndex(P_COLUMN));
                                    String item_descr = cursor.getString(cursor
                                            .getColumnIndex(DESCR_COLUMN));
                                    String item_desc = cursor.getString(cursor
                                            .getColumnIndex(DESCR_COL));


                                    COLUMN_list.add(new String(item_content));
                                    COLUMN_list.add(new String(item_p));
                                    COLUMN_list.add(new String(item_descr));
                                    COLUMN_list.add(new String(item_desc));

                                    cursor.moveToNext();
                                }if (COLUMN_list.isEmpty()){textView.setText("Такой ошибки не найдено."); }



                            }

                            return true;
                        }
                        return false;
                    }
                });
        assert but != null;
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (checkBoxP.isChecked()||checkBoxC.isChecked()||checkBoxF.isChecked()||checkBoxU.isChecked()||checkBoxB.isChecked()){
                    checkBoxP.setChecked(false);
                    checkBoxU.setChecked(false);
                    checkBoxB.setChecked(false);
                    checkBoxC.setChecked(false);}
                // PUC.clear();
                // adapterPUC.notifyDataSetChanged();
                COLUMN_list.clear();
                adapter.notifyDataSetChanged();
                textView.setText("");
                editText.setText("");

            }
        });

    }


}

