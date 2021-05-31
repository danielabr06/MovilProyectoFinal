package com.baldovino.movilproyectofinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MsjAddNews extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msj_add_news);

        TimerTask tak = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MsjAddNews.this,News.class);
                startActivity(intent);
            }
        };

        Timer time = new Timer();
        time.schedule(tak,2000);

    }
}