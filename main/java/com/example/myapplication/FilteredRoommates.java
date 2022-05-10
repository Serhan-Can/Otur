package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class FilteredRoommates extends AppCompatActivity {
    LinearLayout layout;
    ArrayList<Student> students;
    String name;
    String major;
    int j;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtered_roommates);
        layout = (LinearLayout) findViewById(R.id.layout232);
        students = new ArrayList<>();

        Student A = new Student("05050","Doğa","Serhan","Computer","Bilkent");
        Student B = new Student("1212","3445","Sarper","Elektronik","Hacettepe");
        students.add(A);
        students.add(B);
        ArrayList<Button> buttons = new ArrayList<>();
        for (int j = 0; j < students.size(); j++) {
            HouseButton button = new HouseButton(this,j);
            button.setText(students.get(j).getName());
            buttons.add(button);
            layout.addView(button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    name = students.get(button.getId()).getName();
                    major = students.get(button.getId()).getMajor();
                    Intent intent = new Intent(FilteredRoommates.this,HouseInfo.class);
                    HouseInfo.city=name;
                    HouseInfo.houseInfo=major;
                    startActivity(intent);
                }
            });
        }
    }
}