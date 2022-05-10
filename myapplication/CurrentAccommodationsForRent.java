package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class CurrentAccommodationsForRent extends AppCompatActivity {
    Button addNewHouse;
    Button addNewDormitory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_accommodations_for_rent);

        addNewHouse = (Button) findViewById(R.id.addNewHouse);
        addNewDormitory = (Button) findViewById(R.id.addNewDormitory);
        addNewHouse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrentAccommodationsForRent.this, AddNewHouse.class);
                startActivity(intent);
            }
        });

        addNewDormitory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(CurrentAccommodationsForRent.this, AddNewDormitory.class);
                startActivity(intent);
            }
        });


    }
}