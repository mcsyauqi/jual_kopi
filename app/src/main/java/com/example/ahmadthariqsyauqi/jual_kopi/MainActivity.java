package com.example.ahmadthariqsyauqi.jual_kopi;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView jumlahKopi;
    TextView tmpharga;
    TextView pesanBtn;
    CheckBox krimer;
    CheckBox misis;
    CheckBox susu;
    int number=0;
    int hargatotal;
    int hrgkrimer=1000;
    int hrgmisis=500;
    int hrgsusu=2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        jumlahKopi = (TextView) findViewById(R.id.jumlah);
        pesanBtn = (Button) findViewById(R.id.button);
        tmpharga = (TextView) findViewById(R.id.harga);
        krimer = (CheckBox) findViewById(R.id.creamer);
        misis = (CheckBox) findViewById(R.id.meises);
        susu = (CheckBox) findViewById(R.id.milk);
    }
    public void displayCoffee(){
        jumlahKopi.setText(number+"");
    }

    public void tambahKopi(View v){
        number++;
        displayCoffee();
    }

    public void kurangKopi(View v){
        if (number>0)
        number--;
        displayCoffee();
    }

    public void tampilKopi(View v){
        hargatotal=5000*number;
        hitungHarga();
        tmpharga.setText(hargatotal+"");
        Toast.makeText(getApplicationContext(),"Terima kasih",Toast.LENGTH_SHORT).show(); //nampilin Terimakasih setelah klik

    }

    public void hitungHarga() {
        if (krimer.isChecked()) {
            hargatotal += number * hrgkrimer;
        }
        if (misis.isChecked()) {
            hargatotal += number * hrgmisis;
        }
        if (susu.isChecked()) {
            hargatotal += number * hrgsusu;
        }

    }



}
