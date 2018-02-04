package com.example.anantyakhrisnaseta.khrisna_1202154145_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText makan;
    EditText jumlah;

    String Restaurant,Menu;
    int Portion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        makan = (EditText)findViewById(R.id.Makan);
        jumlah = (EditText)findViewById(R.id.Jumlah);
    }

    public void eatbus(View view) {

        Intent intent=new Intent(this, ActivitySecond.class);
        Restaurant = "eatbus";
        Menu = makan.getText().toString();
        Portion = Integer.parseInt(jumlah.getText().toString());
        int Harga = 50000*Portion;
        Log.d("total harga","Rp."+Harga);
        intent.putExtra("Restaurant",Restaurant); //melempar data ke second activiy
        intent.putExtra("Menu",Menu);
        intent.putExtra("Portion",Portion);
        intent.putExtra("Harga",Harga);
        startActivity(intent);

    }

    public void abnormal(View view) {

        Intent intent=new Intent(this, ActivitySecond.class);
        Restaurant = "abnormal";
        Menu = makan.getText().toString();
        Portion = Integer.parseInt(jumlah.getText().toString());
       int Harga = 30000*Portion;
        intent.putExtra("Restaurant",Restaurant); //melempar data ke second activiy
        intent.putExtra("Menu",Menu);
        intent.putExtra("Portion",Portion);
        intent.putExtra("Harga",Harga);
        startActivity(intent);

    }
}
