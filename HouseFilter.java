package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class HouseFilter extends AppCompatActivity {
    public  Button cancel;
    public  Button showMeHouses;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_filter);

        cancel = (Button) findViewById(R.id.cancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HouseFilter.this, Accommodation2.class);
                startActivity(intent);
            }
        });
        showMeHouses = (Button) findViewById(R.id.button5);
        showMeHouses.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HouseFilter.this,FilteredHouses.class);
                startActivity(intent);
            }
        });
    }
}