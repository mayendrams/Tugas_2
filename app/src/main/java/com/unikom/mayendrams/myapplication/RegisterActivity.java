package com.unikom.mayendrams.myapplication;
//Nama : Mayendra Muhammad Shiddiq
//NIM : 10116513
//Waktu Pengerjaan : 18-04-2019

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class RegisterActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        Button register = (Button) findViewById(R.id.Register1);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RegisterActivity.this,VerifyActivity.class);
                startActivity(intent);
            }
        });
    }
}
