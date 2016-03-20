package com.android.allychan.studyjamfinalreport;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textMovie1, textMovie2, textMovie3, textMovie4, textMovie5, textContact;
    private ImageView imgMovie1, imgMovie2, imgMovie3, imgMovie4, imgMovie5, imgContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textMovie1 = (TextView) findViewById(R.id.textMovie1);
        textMovie2 = (TextView) findViewById(R.id.textMovie2);
        textMovie3 = (TextView) findViewById(R.id.textMovie3);
        textMovie4 = (TextView) findViewById(R.id.textMovie4);
        textMovie5 = (TextView) findViewById(R.id.textMovie5);
        textContact = (TextView) findViewById(R.id.textContact);
        imgMovie1 = (ImageView) findViewById(R.id.imgMovie1);
        imgMovie2 = (ImageView) findViewById(R.id.imgMovie2);
        imgMovie3 = (ImageView) findViewById(R.id.imgMovie3);
        imgMovie4 = (ImageView) findViewById(R.id.imgMovie4);
        imgMovie5 = (ImageView) findViewById(R.id.imgMovie5);
        imgContact = (ImageView) findViewById(R.id.imgContact);


        View.OnClickListener movie1Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do the thing
                Intent intent = new Intent(getBaseContext(),Movie1Activity.class);
                // intent.putExtra("teamA",scoreTeamA);
                //intent.putExtra("teamB",scoreTeamB);
                startActivity(intent);

            }
        };

        View.OnClickListener movie2Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do the thing
                Intent intent = new Intent(getBaseContext(),Movie2Activity.class);
                // intent.putExtra("teamA",scoreTeamA);
                //intent.putExtra("teamB",scoreTeamB);
                startActivity(intent);

            }
        };

        View.OnClickListener movie3Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do the thing
                Intent intent = new Intent(getBaseContext(),Movie3Activity.class);
                // intent.putExtra("teamA",scoreTeamA);
                //intent.putExtra("teamB",scoreTeamB);
                startActivity(intent);

            }
        };

        View.OnClickListener movie4Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do the thing
                Intent intent = new Intent(getBaseContext(),Movie4Activity.class);
                // intent.putExtra("teamA",scoreTeamA);
                //intent.putExtra("teamB",scoreTeamB);
                startActivity(intent);
            }
        };

        View.OnClickListener movie5Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do the thing
                Intent intent = new Intent(getBaseContext(),Movie5Activity.class);
                // intent.putExtra("teamA",scoreTeamA);
                //intent.putExtra("teamB",scoreTeamB);
                startActivity(intent);

            }
        };

        View.OnClickListener contactListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // do the thing
                Intent intent = new Intent(getBaseContext(),ContactActivity.class);
                // intent.putExtra("teamA",scoreTeamA);
                //intent.putExtra("teamB",scoreTeamB);
                startActivity(intent);

            }
        };


        textMovie1.setOnClickListener(movie1Listener);
        imgMovie1.setOnClickListener(movie1Listener);

        textMovie2.setOnClickListener(movie2Listener);
        imgMovie2.setOnClickListener(movie2Listener);

        textMovie3.setOnClickListener(movie3Listener);
        imgMovie3.setOnClickListener(movie3Listener);

        textMovie4.setOnClickListener(movie4Listener);
        imgMovie4.setOnClickListener(movie4Listener);

        textMovie5.setOnClickListener(movie5Listener);
        imgMovie5.setOnClickListener(movie5Listener);

        textContact.setOnClickListener(contactListener);
        imgContact.setOnClickListener(contactListener);

    }
}
