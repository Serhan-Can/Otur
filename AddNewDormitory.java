package com.example.otur;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class AddNewDormitory extends AppCompatActivity {
    private Button cancelbtn;
    private Button addNewDormitorybtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_dormitory);

        cancelbtn = (Button) findViewById(R.id.cancelbtn);
        addNewDormitorybtn = (Button) findViewById(R.id.addNewDormitorybtn);
        cancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddNewDormitory.this, CurrentAccommodationsForRent.class);
                startActivity(intent);
            }
        });

        addNewDormitorybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddNewDormitory.this, MyProfileLandlord.class);
                startActivity(intent);
            }
        });
    }
}