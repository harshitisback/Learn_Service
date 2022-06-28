package com.example.done;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.RelativeLayout;

public class ServiceMain extends AppCompatActivity {

    RelativeLayout start;
    RelativeLayout stop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service_main);

        start = (RelativeLayout) findViewById(R.id.StartButton);
        stop = (RelativeLayout)findViewById(R.id.StopButton);


        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent = new Intent(ServiceMain.this, Servicew.class);
//                startActivity(intent);
                startService(new Intent(ServiceMain.this,MainActivity.class));

            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(ServiceMain.this,MainActivity.class));
            }
        });
    }
}