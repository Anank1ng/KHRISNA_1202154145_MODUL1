package com.example.anantyakhrisnaseta.khrisna_1202154145_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ActivitySecond extends AppCompatActivity {

    TextView Resto;
    TextView Menu;
    TextView Portion;
    TextView Harga;

    String resto,menu;
    int portion,harga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Resto = (TextView) findViewById(R.id.Resto);
        Menu = (TextView) findViewById(R.id.Menu);
        Portion = (TextView) findViewById(R.id.Portion);
        Harga = (TextView) findViewById(R.id.Harga);
        Intent intent = getIntent();

        resto = intent.getStringExtra("Restaurant");
        menu = intent.getStringExtra("Menu");
        portion = intent.getIntExtra("Portion",0);
        harga = intent.getIntExtra("Harga",0);



        Resto.setText(resto);
        Menu.setText(menu);
        Portion.setText(""+ portion);
        Harga.setText(""+ harga);

        if(harga > 65000){
            Toast toast = Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_LONG);
            toast.show();
        } else {
            Toast toast = Toast.makeText(this,"Disini aja makan malamnya" , Toast.LENGTH_LONG);
            toast.show();
        }

    }




}
