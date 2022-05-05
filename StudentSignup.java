package com.example.otur;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class StudentSignup extends AppCompatActivity {

    private Button studentSignupContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_signup);

        studentSignupContinue = (Button) findViewById(R.id.studentSignupContinue);
        studentSignupContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentSignup.this, StudentSignupFeatures.class);
                startActivity(intent);
            }
        });

    }
}