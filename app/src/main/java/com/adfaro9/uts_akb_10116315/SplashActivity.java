package com.adfaro9.uts_akb_10116315;

/*
Dibuat Oleh : Muhammad Adityo Fathur Rahim (10116315)
Kelas       : IF-7/AKB-7
Pada tanggal: 22/05/2019
 */

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    TextView textViewSplash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        textViewSplash = (TextView) findViewById(R.id.textViewSplash);


        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                finish();
            }
        },3000L);
    }

}
