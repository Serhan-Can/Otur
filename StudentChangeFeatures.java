package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;

public class StudentChangeFeatures extends AppCompatActivity {
    Button changeFeaturesAndReturnToProfilebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_change_features);
        changeFeaturesAndReturnToProfilebtn = (Button) findViewById(R.id.changeFeaturesAndReturnToProfilebtn);
        changeFeaturesAndReturnToProfilebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentChangeFeatures.this, MyProfileStudent.class);
                startActivity(intent);
            }
        });
    }
}