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
        avtoerr=(Button) findViewById(R.id.button76);

        help.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, Help.class);
                                startActivity(intent);
            }
        });
        avtoerr.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????????? ??????????????????????";
                String TABL_BD = "all";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });


        suzuki.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? suzuki";
                String TABL_BD = "suzuki";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });


        subaru.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? subaru";
                String TABL_BD = "subaru";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });


        ssangyong.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? ssangyong";
                String TABL_BD = "Ssangyong";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        skoda.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? skoda";
                String TABL_BD = "skoda";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        volvo.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? volvo";
                String TABL_BD = "volvo";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        saab.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? saab";
                String TABL_BD = "Saab";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        renault.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? renault";
                String TABL_BD = "renault";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        pontiac.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? pontiac";
                String TABL_BD = "pontiac";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        peugeot.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? peugeot";
                String TABL_BD = "citroenpegeot";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        opel.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? opel";
                String TABL_BD = "Opel";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        nissan.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? nissan";
                String TABL_BD = "nissan";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });


        mitsubishi.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? mitsubishi";
                String TABL_BD = "mitsubishi";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        mercedes.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? mercedes";
                String TABL_BD = "mercedes";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        mazda.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? mazda";
                String TABL_BD = "mazda";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        lexus.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? lexus";
                String TABL_BD = "lexus";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        rover.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? rover";
                String TABL_BD = "Rover";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        lancia.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? lancia";
                String TABL_BD = "lancia";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        kia.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? kia";
                String TABL_BD = "Kia";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        jeep.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? jeep";
                String TABL_BD = "CryslerJeep";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        jaguar.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? jaguar";
                String TABL_BD = "jaguar";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        isuzu.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? isuzu";
                String TABL_BD = "isuzu";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        infiniti.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? infiniti";
                String TABL_BD = "infiniti";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        hyundai.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? hyundai";
                String TABL_BD = "Hyundai";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        hummer.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? hummer";
                String TABL_BD = "hummer";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        honda.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? honda";
                String TABL_BD = "honda";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        gmc.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? gmc";
                String TABL_BD = "gmc";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Geely.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Geely";
                String TABL_BD = "geely";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Ford.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Ford";
                String TABL_BD = "ford";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Fiat.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Fiat";
                String TABL_BD = "fiat";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Dodge.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Dodge";
                String TABL_BD = "dodge";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Datsun.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Datsun";
                String TABL_BD = "datsun";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Daihatsu.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Daihatsu";
                String TABL_BD = "daihatsu";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Daewoo.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Daewoo";
                String TABL_BD = "daewoo";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Dacia.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Dacia";
                String TABL_BD = "dacia";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Citroen.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Citroen";
                String TABL_BD = "citroenpegeot";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Crysler.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Crysler";
                String TABL_BD = "CryslerJeep";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });

        Chevrolet.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Chevrolet";
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
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Chery";
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
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? Cadillac";
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
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? BMW";
                String TABL_BD = "bmw";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });
        toyota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? TOYOTA";
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
          String MARK_TABL = "???????? ???????????? ?????? ???????????????????? ??????????????";
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
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? ALFA ROMEO";
                String TABL_BD = "alfaromeo";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });
        audi.setOnClickListener(new View.OnClickListener()  {
            @Override
            public void onClick (View v){
                Intent intent = new Intent(MainActivity.this, AvtoErr.class);
                String MARK_TABL = "???????? ???????????? ?????? ???????????????????? AUDI";
                String TABL_BD = "AudiSeatSkodaVolkswagen";
                intent.putExtra("MARK_TABL", MARK_TABL);
                intent.putExtra("TABL_BD", TABL_BD);
                startActivity(intent);
            }
        });
}

}