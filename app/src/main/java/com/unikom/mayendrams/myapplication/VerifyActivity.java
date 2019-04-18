package com.unikom.mayendrams.myapplication;
//Nama : Mayendra Muhammad Shiddiq
//NIM : 10116513
//Waktu Pengerjaan : 18-04-2019

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class VerifyActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verify_activity);
        Button verify = (Button) findViewById(R.id.Verify);

        verify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(VerifyActivity.this,SendVerify.class);
                startActivity(intent);
            }
        });
    }
}
