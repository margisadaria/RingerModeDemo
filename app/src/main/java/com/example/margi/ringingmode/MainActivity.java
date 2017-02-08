package com.example.margi.ringingmode;

import android.content.Context;
import android.media.AudioManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button ring,vib,sil;
    AudioManager audioManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ring = (Button)findViewById(R.id.main_ring);
        vib = (Button)findViewById(R.id.main_vibrate);
        sil = (Button)findViewById(R.id.main_silent);
        audioManager =(AudioManager)getSystemService(Context.AUDIO_SERVICE);

        ring.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                audioManager.setRingerMode(AudioManager.RINGER_MODE_NORMAL);
                Toast.makeText(MainActivity.this,"ringing mode",Toast.LENGTH_SHORT).show();
            }
        });
        vib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                audioManager.setRingerMode(AudioManager.RINGER_MODE_VIBRATE);
                Toast.makeText(MainActivity.this,"viberate mode",Toast.LENGTH_SHORT).show();
            }
        });

        sil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                audioManager.setRingerMode(AudioManager.RINGER_MODE_SILENT);
                Toast.makeText(MainActivity.this,"silent mode",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
