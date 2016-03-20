package com.android.allychan.studyjamfinalreport;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Movie5Activity extends AppCompatActivity {

    private TextView btnHome, btnPrev;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie5);

        btnHome = (TextView) findViewById(R.id.textBtnHome);
        btnPrev = (TextView) findViewById(R.id.textBtnPrev);

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

        btnPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), Movie4Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
