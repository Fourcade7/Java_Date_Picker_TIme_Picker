package com.fourcade7.java_date_picker_timer_picker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button button1,button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1=findViewById(R.id.button1);
        button2=findViewById(R.id.button2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar calendar=Calendar.getInstance();
                int yaer=calendar.get(Calendar.YEAR);
                int month=calendar.get(Calendar.DAY_OF_MONTH);
                int day=calendar.get(Calendar.DAY_OF_MONTH);
                DatePickerDialog.OnDateSetListener dateSetListener;
                dateSetListener=new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {


                        Toast.makeText(MainActivity.this, i+"/"+(i1+1)+"/"+i2, Toast.LENGTH_SHORT).show();
                    }
                };

                DatePickerDialog datePickerDialog=new DatePickerDialog(MainActivity.this,R.style.ThemeOverlay_Material3_Dialog,dateSetListener,yaer,month,day);
                datePickerDialog.show();
            }
        });
    }
}