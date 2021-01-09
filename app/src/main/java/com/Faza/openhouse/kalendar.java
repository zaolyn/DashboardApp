package com.Faza.openhouse;

        import android.os.Bundle;
        import android.widget.Button;
        import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class kalendar extends AppCompatActivity {

    CalendarView cv;
    TextView myDate;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalendar);

        cv = findViewById(R.id.calen);
        myDate = findViewById(R.id.myDate);
        button = findViewById(R.id.buttoncalen);

        cv.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1 + "/" + i2 + "/" + i);
                myDate.setText(date);
            }
        });





    }
}
