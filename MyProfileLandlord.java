package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MyProfileLandlord extends AppCompatActivity {
    Button currentAccommodationsForRent;
    Button changePasswordBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile_landlord);
        currentAccommodationsForRent = (Button) findViewById(R.id.currentAccommodationsForRent);
        changePasswordBtn = (Button) findViewById(R.id.changePasswordBtn);
        currentAccommodationsForRent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyProfileLandlord.this, CurrentAccommodationsForRent.class);
                startActivity(intent);
            }
        });
        changePasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyProfileLandlord.this,ChangePasswordLandlord.class);
                startActivity(intent);
            }
        });
    }
}