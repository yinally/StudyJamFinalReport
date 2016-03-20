package com.android.allychan.studyjamfinalreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Movie1Activity extends AppCompatActivity {

    private TextView btnHome, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie1);

        btnHome = (TextView) findViewById(R.id.textBtnHome);
        btnNext = (TextView) findViewById(R.id.textBtnNext);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),Movie2Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
