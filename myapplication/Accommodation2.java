package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;
public class Accommodation2 extends AppCompatActivity {
    public Button back;
    public Button house;
    public Button dormitory;
    public Button profile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accommodation);

        back = (Button) findViewById(R.id.accommodationBack);
        back.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Accommodation2.this, MainActivity2.class);
                startActivity(intent);
        }
    });
        house = (Button) findViewById(R.id.house);
        house.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accommodation2.this,HouseFilter.class);
               startActivity(intent);
            }
        });

        dormitory = (Button) findViewById(R.id.roommate);
        dormitory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accommodation2.this,DormitoryFilter.class);
                startActivity(intent);
            }
        });
        profile = (Button) findViewById(R.id.button3);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Accommodation2.this,MyProfileStudent.class);
                startActivity(intent);
            }
        });
}}