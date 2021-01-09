package com.Faza.openhouse;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private CardView stopwatch, kalkulator, animasi, quiz, score, alarm ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stopwatch = (CardView) findViewById(R.id.stopwatch);
        kalkulator = (CardView) findViewById(R.id.kalkulator);
        animasi = (CardView) findViewById(R.id.kalendar);
//        quiz = (CardView) findViewById(R.id.quiz);
        alarm = (CardView) findViewById(R.id.alarm);


        stopwatch.setOnClickListener(this);
        kalkulator.setOnClickListener(this);
        animasi.setOnClickListener(this);
//        quiz.setOnClickListener(this);
        alarm.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()) {
            case R.id.stopwatch:
                i = new Intent(this, stopwatcAct.class);startActivity(i);
                break;
            case R.id.kalkulator:
                i = new Intent(this, kalkulator.class);startActivity(i);
                break;
            case R.id.kalendar:
                i = new Intent(this, kalendar.class);startActivity(i);
                break;
//            case R.id.quiz:
//                i = new Intent(this, quiz.class);startActivity(i);
//                break;
            case R.id.alarm:
                i = new Intent(this, alarm.class);startActivity(i);
                break;
                default:break;
        }

    }
}

