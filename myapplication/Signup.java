package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Signup extends AppCompatActivity {

    private Button studentSignupbtn;
    private Button landlordSignupbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        studentSignupbtn = (Button) findViewById(R.id.studentSignupbtn);
        studentSignupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, StudentSignup.class);
                startActivity(intent);
            }
        });

        landlordSignupbtn = (Button) findViewById(R.id.landlordSignupbtn);
        landlordSignupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Signup.this, LandlordSignup.class);
                startActivity(intent);
            }
        });
    }
}