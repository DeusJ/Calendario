package com.example.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button Fecha, Hora;
    EditText fec, hor;
private int dia,mes,ano,hora,minutos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Fecha = (Button)findViewById(R.id.btnfecha);
        Hora = (Button)findViewById(R.id.btnhora);

        fec = (EditText)findViewById(R.id.txtfecha);
        hor= (EditText)findViewById(R.id.txthora);

        Fecha.setOnClickListener(this);
        Hora.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        if(v==Fecha){
            final Calendar c= Calendar.getInstance();
            dia=c.get(Calendar.DAY_OF_MONTH);
            mes=c.get(Calendar.MONTH);
            ano=c.get(Calendar.YEAR);
            DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                fec.setText(dayOfMonth+"/"+month+"/"+year);
                }
            },dia,mes,ano);
            datePickerDialog.show();
            }
        if ((v == Hora)) {
            final Calendar c= Calendar.getInstance();
            hora=c.get(Calendar.HOUR_OF_DAY);
            minutos=c.get(Calendar.MINUTE);

            TimePickerDialog timePickerDialog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                   hor.setText(hourOfDay+":"+minute);
                }
            },hora,minutos,false);
            timePickerDialog.show();

        }
        }
    }

