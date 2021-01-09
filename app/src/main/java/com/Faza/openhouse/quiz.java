//package com.example.openhouse;
//
//import android.content.Intent;
//import android.os.Bundle;
//import android.view.View;
//import android.widget.RadioButton;
//import android.widget.RadioGroup;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import androidx.appcompat.app.AppCompatActivity;
//
//    public class quiz extends AppCompatActivity {
//
//        TextView pertanyaan;
//        RadioButton opsiA, opsiB, opsiC, opsiD;
//        RadioGroup rg;
//        int nomor = 0;
//
//        public static int hasil, benar, salah;
//
//        String[] pertanyaan_kuis = new String[]{
//                "1. Kepanjangan dari IDN?",
//                "2. Dimana letak IDN?",
//                "3. Siapakah developer Daily Tools?",
//                "4. Tanggal berapakah sekarang?",
//    };
//
//    String[] pilihan_jawaban = new String[]{
//            "Indonesian Developer Network","Islamic Diniyyah Network","Internet Development Network","Islamic Development Network",
//            "Bekasi","Dayeuh","Jonggol","Jakarta",
//            "Dzaky","Budi","Arief","Candra",
//            "23 November","24 November","25 November","26 November"
//    };
//
//    String[] jawaban_benar = new String[]{
//            "Islamic Development Network",
//            "Jonggol",
//            "Dzaky",
//            "24 November"
//    };
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_quiz);
//
//        pertanyaan = (TextView) findViewById(R.id.pertanyaan);
//        rg = (RadioGroup) findViewById(R.id.rg);
//        opsiA = (RadioButton)findViewById(R.id.opsiA);
//        opsiB = (RadioButton)findViewById(R.id.opsiB);
//        opsiC= (RadioButton)findViewById(R.id.opsiC);
//        opsiD= (RadioButton)findViewById(R.id.opsiD);
//
//        pertanyaan.setText(pertanyaan_kuis[nomor]);
//        opsiA.setText(pilihan_jawaban[3]);
//        opsiB.setText(pilihan_jawaban[1]);
//        opsiC.setText(pilihan_jawaban[2]);
//        opsiD.setText(pilihan_jawaban[3]);
//
//        rg.check(0);
//        benar = 0;
//        salah = 0;
//    }
//
//    public void next(View view) {
//        if (opsiA.isChecked() || opsiB.isChecked() || opsiC.isChecked() || opsiD.isChecked()) {
//            RadioButton jawaban_user = findViewById(rg.getCheckedRadioButtonId());
//            String ambil_jawaban = jawaban_user.getText().toString();
//            rg.check(0);
//            if (ambil_jawaban.equalsIgnoreCase(jawaban_benar[nomor])) benar++;
//            else salah++;
//            nomor++;
//            if (nomor < pertanyaan_kuis.length) {
//                pertanyaan.setText(pertanyaan_kuis[nomor]);
//                opsiA.setText(pilihan_jawaban[(nomor * 4) + 0]);
//                opsiB.setText(pilihan_jawaban[(nomor * 4) + 1]);
//                opsiC.setText(pilihan_jawaban[(nomor * 4) + 2]);
//                opsiD.setText(pilihan_jawaban[(nomor * 4) + 3]);
//
//            } else {
//                hasil = benar * 25;
//                Intent selesai = new Intent(getApplicationContext(), hasilquiz.class);
//                startActivity(selesai);
//
//            }
//        }else{
//            Toast.makeText(this, "Pilih Jawaban Dahulu", Toast.LENGTH_SHORT).show();
//        }
//    }
//}
