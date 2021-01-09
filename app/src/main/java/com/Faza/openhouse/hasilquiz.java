//package com.example.openhouse;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.TextView;
//
//import androidx.annotation.Nullable;
//
//public class hasilquiz extends Activity {
//
//    @Override
//    protected void onCreate(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.hasil_quiz);
//
//        TextView hasil = findViewById(R.id.hasil);
//        TextView nilai = findViewById(R.id.nilai);
//
//        hasil.setText("Jawaban Benar : "+quiz.benar+"\nJawaban Salah : "+quiz.salah);
//        nilai.setText(""+quiz.hasil);
//    }
//
//    public void ulangi(View view){
//        finish();
//        Intent i = new Intent(getApplicationContext(),quiz.class);
//        startActivity(i);
//    }
//}
