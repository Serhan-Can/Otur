package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class MyProfileStudent extends AppCompatActivity {
    Button changePasswordBtn;
    Button save;
    Button changeFeaturesbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile_student);
        changePasswordBtn = (Button) findViewById(R.id.changePasswordBtn);
        changePasswordBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyProfileStudent.this, ChangePasswordStudent.class);
                startActivity(intent);
            }
        });
        save = (Button) findViewById(R.id.button7);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyProfileStudent.this, MainActivity2.class);
                startActivity(intent);
            }
        });
        changeFeaturesbtn = (Button) findViewById(R.id.changeFeaturesbtn);
        changeFeaturesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MyProfileStudent.this, StudentChangeFeatures.class);
                startActivity(intent);
            }
        });
    }
}