package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DormitoryFilter extends AppCompatActivity {
    public Button cancel;
    public Button find;
    int roomCapacity;
    double minSize;
    double maxSize;
    int fee;
    boolean isSharedBathroom;
    boolean hasKitchen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dormitory_filter);
        cancel = (Button) findViewById(R.id.dormcancel);
        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DormitoryFilter.this, Accommodation2.class);
                startActivity(intent);
            }
        });
        find = (Button) findViewById(R.id.show);
        find.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DormitoryFilter.this,FilteredDormitories.class);
                startActivity(intent);
            }
        });
    }
}