package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;


public class StudentSignup extends AppCompatActivity {
    DatabaseReference referenceOfStudent = FirebaseDatabase.getInstance("https://otur-b78d0-default-rtdb.europe-west1.firebasedatabase.app/").getReference().child("Users").child("Students");
    Intent intent;
    Student student1;
    private Button studentSignupContinue;
    private String name;
    private String major;
    private String university;
    private String number;
    private String password;
    private String passwordConfirm;
    List<Student> studentss = MainActivity.students;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_signup);
        studentSignupContinue = (Button) findViewById(R.id.studentSignupContinue);
        studentSignupContinue.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                name = ((TextView) findViewById( R.id.name1)).getText().toString();
                major = ((TextView) findViewById( R.id.major)).getText().toString();
                university = ((TextView) findViewById( R.id.university)).getText().toString();
                number = ((TextView) findViewById( R.id.phoneNumber2)).getText().toString();
                password = ((TextView) findViewById( R.id.studentPassword)).getText().toString();
                passwordConfirm = ((TextView) findViewById( R.id.studentPasswordRepeat)).getText().toString();
                if (password.equals(passwordConfirm)) {
                    intent = new Intent(StudentSignup.this, StudentSignupFeatures.class);
                    startActivity(intent);
                    student1 = new Student(number,password,name,major,university);
                    studentss.add(student1);
                    referenceOfStudent.setValue(studentss);
                    studentss.clear();
                }
                else ((TextView) findViewById(R.id.studentPasswordRepeat)).setText("Passwords does not match!");
            }
        });

    }
}