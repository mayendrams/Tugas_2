package com.unikom.mayendrams.myapplication;
//Nama : Mayendra Muhammad Shiddiq
//NIM : 10116513
//Waktu Pengerjaan : 18-04-2019
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;


public class HasilActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_activity);
        TextView register = (TextView) findViewById(R.id.myName);

    }
}
