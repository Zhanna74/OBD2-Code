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
    Button avtovaz;
    Button bmw;
    Button Ford;
    Button kia;
    Button hyundai;
    Button rover;
    Button opel;
    Button toyota;
    Button saab;
    Button greatw;
    Button Chery;
    Button alfaromeo;
    Button audi;
    Button Cadillac;
    Button Chevrolet;
    Button Crysler;
    Button Citroen;
    Button Dacia;
    Button Daewoo;
    Button Daihatsu;
    Button Datsun;
    Button Dodge;
    Button Fiat;
    Button Geely;
    Button gmc;
    Button honda;
    Button hummer;
    Button infiniti;
    Button isuzu;
    Button jaguar;
    Button jeep;
    Button lancia;
    Button lexus;
    Button mazda;
    Button mercedes;
    Button mitsubishi;
    Button nissan;
    Button peugeot;
    Button pontiac;
    Button renault;
    Button volvo;
    Button skoda;
    Button ssangyong;
    Button subaru;
    Button suzuki;
    Button help;

    private DatabaseHelper mDBHelper;
    private SQLiteDatabase mDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toyota = (Button) findViewById(R.id.button75);
        avtovaz = (Button) findViewById(R.id.button74);
        alfaromeo = (Button) findViewById(R.id.button71);
        audi = (Button) findViewById(R.id.button73);
        bmw = (Button) findViewById(R.id.button72);
        Cadillac=(Button) findViewById(R.id.button68);
        Chery=(Button) findViewById(R.id.button69);
        Chevrolet=(Button) findViewById(R.id.button70);
        Crysler=(Button) findViewById(R.id.button66);
        Citroen=(Button) findViewById(R.id.button67);
        Dacia=(Button) findViewById(R.id.button65);
        Daewoo=(Button) findViewById(R.id.button63);
        Daihatsu=(Button) findViewById(R.id.button64);
        Datsun=(Button) findViewById(R.id.button62);
        Dodge=(Button) findViewById(R.id.button59);
        Fiat=(Button) findViewById(R.id.button61);
        Ford=(Button) findViewById(R.id.button60);
        Geely=(Button) findViewById(R.id.button56);
        gmc=(Button) findViewById(R.id.button58);
        honda=(Button) findViewById(R.id.button57);
        hummer=(Button) findViewById(R.id.button53);
        hyundai=(Button) findViewById(R.id.button54);
        infiniti=(Button) findViewById(R.id.button55);
        isuzu=(Button) findViewById(R.id.button50);
        jaguar=(Button) findViewById(R.id.button51);
        jeep=(Button) findViewById(R.id.button52);
        kia=(Button) findViewById(R.id.button47);
        lancia=(Button) findViewById(R.id.button48);
        rover=(Button) findViewById(R.id.button49);
        lexus=(Button) findViewById(R.id.button28);
        mazda=(Button) findViewById(R.id.button29);
        mercedes=(Button) findViewById(R.id.button30);
        mitsubishi=(Button) findViewById(R.id.button25);
        nissan=(Button) findViewById(R.id.button26);
        opel=(Button) findViewById(R.id.button27);
        peugeot=(Button) findViewById(R.id.button17);
        pontiac=(Button) findViewById(R.id.button18);
        renault=(Button) findViewById(R.id.button19);
        saab=(Button) findViewById(R.id.button20);
        volvo=(Button) findViewById(R.id.button21);
        skoda=(Button) findViewById(R.id.button22);
        ssangyong=(Button) findViewById(R.id.button23);
        subaru=(Button) findViewById(R.id.button24);
        suzuki=(Button) findViewById(R.id.button16);
        help=(Button) findViewById(R.id.button78);

        help.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, Help.class);
                                startActivity(intent);
            }
        });


        suzuki.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля suzuki";
                String TABL_BD = " suzuki";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });


        subaru.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля subaru";
                String TABL_BD = " subaru";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });


        ssangyong.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля ssangyong";
                String TABL_BD = " ssangyong";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        skoda.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля skoda";
                String TABL_BD = " skoda";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        volvo.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля volvo";
                String TABL_BD = " volvo";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        saab.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля saab";
                String TABL_BD = " saab";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        renault.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля renault";
                String TABL_BD = " renault";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        pontiac.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля pontiac";
                String TABL_BD = " pontiac";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        peugeot.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля peugeot";
                String TABL_BD = " peugeot";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        opel.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля opel";
                String TABL_BD = " opel";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        nissan.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля nissan";
                String TABL_BD = " nissan";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });


        mitsubishi.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля mitsubishi";
                String TABL_BD = " mitsubishi";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        mercedes.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля mercedes";
                String TABL_BD = " mercedes";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        mazda.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля mazda";
                String TABL_BD = " mazda";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        lexus.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля lexus";
                String TABL_BD = " lexus";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        rover.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля rover";
                String TABL_BD = " rover";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        lancia.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля lancia";
                String TABL_BD = " lancia";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        kia.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля kia";
                String TABL_BD = " kia";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        jeep.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля jeep";
                String TABL_BD = " jeep";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        jaguar.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля jaguar";
                String TABL_BD = " jaguar";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        isuzu.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля isuzu";
                String TABL_BD = " isuzu";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        infiniti.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля infiniti";
                String TABL_BD = " infiniti";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        hyundai.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля hyundai";
                String TABL_BD = " hyundai";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        hummer.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля hummer";
                String TABL_BD = " hummer";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        honda.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля honda";
                String TABL_BD = " honda";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        gmc.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля gmc";
                String TABL_BD = " gmc";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Geely.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Geely";
                String TABL_BD = " Geely";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Ford.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Ford";
                String TABL_BD = " Ford";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Fiat.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Fiat";
                String TABL_BD = "Fiat";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Dodge.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Dodge";
                String TABL_BD = "Dodge";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Datsun.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Datsun";
                String TABL_BD = "Datsun";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Daihatsu.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Daihatsu";
                String TABL_BD = "Daihatsu";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Daewoo.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Daewoo";
                String TABL_BD = "Daewoo";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Dacia.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Dacia";
                String TABL_BD = "Dacia";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Citroen.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Citroen";
                String TABL_BD = "Citroen";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Crysler.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Crysler";
                String TABL_BD = "Crysler";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Chevrolet.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Chevrolet";
                String TABL_BD = "Chevrolet";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Chery.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Chery";
                String TABL_BD = "Chery";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Cadillac.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля Cadillac";
                String TABL_BD = "Cadillac";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        bmw.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля BMW";
                String TABL_BD = "BMW";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });
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

       avtovaz.setOnClickListener(new View.OnClickListener()  {
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
        alfaromeo.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля ALFA ROMEO";
                String TABL_BD = "ALFA ROMEO";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });
        audi.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "Коды ошибок для автомобиля AUDI";
                String TABL_BD = "AUDI";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });
}

}