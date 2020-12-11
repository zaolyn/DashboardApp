package com.example.openhouse;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.openhouse.R;

public class kalkulator extends AppCompatActivity implements View.OnClickListener {

    EditText editText;

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonPlus, buttonMin, buttonClear,buttonDiv, buttonX, buttonEq;

    public static double nilaisekarang = 0;
    public static String operasisekarang= "";
    public static double hasil = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);

        init();
    }

    void init() {
        editText = (EditText)findViewById(R.id.editText);

        button0 = (Button)findViewById(R.id.button0);
        button0.setOnClickListener(this);

        button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(this);

        button2 = (Button)findViewById(R.id.button2);
        button2.setOnClickListener(this);

        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(this);

        button4 = (Button)findViewById(R.id.button4);
        button4.setOnClickListener(this);

        button5 = (Button)findViewById(R.id.button5);
        button5.setOnClickListener(this);

        button6 = (Button)findViewById(R.id.button6);
        button6.setOnClickListener(this);

        button7 = (Button)findViewById(R.id.button7);
        button7.setOnClickListener(this);

        button8 = (Button)findViewById(R.id.button8);
        button8.setOnClickListener(this);

        button9 = (Button)findViewById(R.id.button9);
        button9.setOnClickListener(this);

        buttonPlus = (Button)findViewById(R.id.buttonPlus);
        buttonPlus.setOnClickListener(this);

        buttonMin = (Button)findViewById(R.id.buttonMin);
        buttonMin.setOnClickListener(this);

        buttonDiv = (Button)findViewById(R.id.buttonDiv);
        buttonDiv.setOnClickListener(this);

        buttonClear = (Button)findViewById(R.id.buttonClear);
        buttonClear.setOnClickListener(this);

        buttonX = (Button)findViewById(R.id.buttonX);
        buttonX.setOnClickListener(this);

        buttonEq = (Button)findViewById(R.id.buttonEq);
        buttonEq.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {

            case R.id.button0:
                editText.setText(editText.getText().toString().trim()+"0");
                break;

            case R.id.button1:
                editText.setText(editText.getText().toString().trim()+"1");
                break;

            case R.id.button2:
                editText.setText(editText.getText().toString().trim()+"2");
                break;

            case R.id.button3:
                editText.setText(editText.getText().toString().trim()+"3");
                break;

            case R.id.button4:
                editText.setText(editText.getText().toString().trim()+"4");
                break;

            case R.id.button5:
                editText.setText(editText.getText().toString().trim()+"5");
                break;

            case R.id.button6:
                editText.setText(editText.getText().toString().trim()+"6");
                break;

            case R.id.button7:
                editText.setText(editText.getText().toString().trim()+"7");
                break;

            case R.id.button8:
                editText.setText(editText.getText().toString().trim()+"8");
                break;

            case R.id.button9:
                editText.setText(editText.getText().toString().trim()+"9");
                break;

            case R.id.buttonPlus:
                if (editText.getText().toString().trim().equals("")){
                    Toast.makeText(kalkulator.this, "Angka Harus Di Isi", Toast.LENGTH_SHORT).show();
                    return;
                }
                operasisekarang="tambah";
                nilaisekarang = Double.parseDouble(editText.getText().toString());
                editText.setText("");
                break;

            case R.id.buttonMin:
                if (editText.getText().toString().trim().equals("")){
                    Toast.makeText(kalkulator.this, "Angka Harus Di Isi", Toast.LENGTH_SHORT).show();
                    return;
                }
                operasisekarang="kurang";
                nilaisekarang = Double.parseDouble(editText.getText().toString());
                editText.setText("");
                break;

            case R.id.buttonDiv:
                if (editText.getText().toString().trim().equals("")){
                    Toast.makeText(kalkulator.this, "Angka Harus Di Isi", Toast.LENGTH_SHORT).show();
                    return;
                }
                operasisekarang="bagi";
                nilaisekarang = Double.parseDouble(editText.getText().toString());
                editText.setText("");
                break;

            case R.id.buttonClear:
                if (editText.getText().toString().trim().equals("")){
                    Toast.makeText(kalkulator.this, "Angka Harus Di Isi", Toast.LENGTH_SHORT).show();
                    return;
                }
                nilaisekarang=0;
                editText.setText("");
                break;

            case R.id.buttonX:
                if (editText.getText().toString().trim().equals("")){
                    Toast.makeText(kalkulator.this, "Angka Harus Di Isi", Toast.LENGTH_SHORT).show();
                    return;
                }
                operasisekarang="kali";
                nilaisekarang = Double.parseDouble(editText.getText().toString());
                editText.setText("");
                break;

            case R.id.buttonEq:

                if (operasisekarang.equals("tambah")){
                    hasil = nilaisekarang+Double.parseDouble(editText.getText().toString().trim());
                }

                if (operasisekarang.equals("kurang")){
                    hasil = nilaisekarang-Double.parseDouble(editText.getText().toString().trim());
                }

                if (operasisekarang.equals("bagi")){
                    hasil = nilaisekarang/Double.parseDouble(editText.getText().toString().trim());
                }

                if (operasisekarang.equals("kali")){
                    hasil = nilaisekarang*Double.parseDouble(editText.getText().toString().trim());
                }

                int nilaiTemp = (int) hasil;

                if(nilaiTemp == hasil){
                    editText.setText(String.valueOf((int) hasil));
                }else {
                    editText.setText(String.valueOf(hasil));
                }
                break;
        }
    }
}
