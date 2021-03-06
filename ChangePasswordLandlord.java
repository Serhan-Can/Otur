package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class ChangePasswordLandlord extends AppCompatActivity {
    Button changePasswordBtn;
    Button cancelBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_change_password_landlord);
        changePasswordBtn = (Button) findViewById(R.id.changePasswordBtn);
        changePasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChangePasswordLandlord.this, MyProfileLandlord.class);
                startActivity(intent);
            }
        });
        cancelBtn = (Button) findViewById(R.id.cancelBtn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ChangePasswordLandlord.this, MyProfileLandlord.class);
                startActivity(intent);
            }
        });
    }
}