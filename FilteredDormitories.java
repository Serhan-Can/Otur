package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class FilteredDormitories extends AppCompatActivity {
    LinearLayout layout;
    ArrayList<Dormitory> dormitories;
    String city;
    String dormInfo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtered_dormitories);
        layout = (LinearLayout) findViewById(R.id.layout2);
        dormitories = new ArrayList<>();
        Landlord landlord = new Landlord("Doğa","3434","6789");
        Dormitory A = new Dormitory();
        A.setCity("Ankara");
        Dormitory B = new Dormitory();
        B.setCity("İstanbul");
        dormitories.add(A);
        dormitories.add(B);
        ArrayList<Button> buttons = new ArrayList<>();
        for (int i = 0; i < dormitories.size(); i++) {
            HouseButton button = new HouseButton(this,i);
            button.setText(dormitories.get(i).getCity());
            buttons.add(button);
            layout.addView(button);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    city = dormitories.get(button.getId()).getCity();
                    dormInfo = dormitories.get(button.getId()).getCity();
                    Intent intent = new Intent(FilteredDormitories.this,HouseInfo.class);
                    HouseInfo.city=city;
                    HouseInfo.houseInfo=dormInfo;
                    startActivity(intent);
                }
            });
        }
    }
}