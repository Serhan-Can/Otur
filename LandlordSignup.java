package com.example.otur;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class LandlordSignup extends AppCompatActivity {
    private Button landlordSignupbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landlord_signup);
        landlordSignupbtn = (Button) findViewById(R.id.landlordSignupbtn);
        landlordSignupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LandlordSignup.this, MyProfileLandlord.class);
                startActivity(intent);
            }
        });
    }
}