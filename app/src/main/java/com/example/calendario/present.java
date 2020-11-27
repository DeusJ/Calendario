package com.example.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class present extends AppCompatActivity {
    public static final long SPLASH_SCREAM_DELAY=4000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_present);

        TimerTask tim = new TimerTask() {
            @Override
            public void run() {
                Intent it = new Intent().setClass(present.this,MainActivity.class);
                startActivity(it);
                finish();
            }
        };

        Timer re = new Timer();
        re.schedule(tim,SPLASH_SCREAM_DELAY);

    }
}
