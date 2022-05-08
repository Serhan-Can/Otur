package com.example.otur;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class AddNewHouse extends AppCompatActivity {
    private Button cancelbtn;
    private Button addNewHousebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_house);

        cancelbtn = (Button) findViewById(R.id.cancelbtn);
        addNewHousebtn = (Button) findViewById(R.id.addNewHousebtn);
        cancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddNewHouse.this, CurrentAccommodationsForRent.class);
                startActivity(intent);
            }
        });

        addNewHousebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddNewHouse.this, MyProfileLandlord.class);
                startActivity(intent);
            }
        });



    }
}