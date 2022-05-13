package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
public class RoommateFilter extends AppCompatActivity {
    Button cecilio;
    Button meGusta;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roommate_filter);
        cecilio = (Button) findViewById(R.id.cecilio);
        cecilio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoommateFilter.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        meGusta = (Button) findViewById(R.id.button2);
        meGusta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RoommateFilter.this, FilteredRoommates.class);
                startActivity(intent);
            }
        });
    }
}