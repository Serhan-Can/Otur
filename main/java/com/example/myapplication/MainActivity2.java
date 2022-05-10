package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {
    public Button accomodation;
    public Button roommate;
    public Button profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        accomodation = (Button) findViewById(R.id.accommodation);
        accomodation.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
              Intent intent = new Intent(MainActivity2.this, Accommodation2.class);
              startActivity(intent);
        }
    });
        roommate = (Button) findViewById(R.id.roommate);
        roommate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,RoommateFilter.class);
                startActivity(intent);
            }
        });
        profile = (Button) findViewById(R.id.button3);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MyProfileStudent.class);
                startActivity(intent);
            }
        });
}}