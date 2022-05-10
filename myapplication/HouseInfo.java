package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HouseInfo extends AppCompatActivity {
    static String city;
    TextView text;
    static  String houseInfo;
    TextView hausa;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_info);
        text=(TextView) findViewById(R.id.cityText);
        text.setText(city);
        hausa = (TextView) findViewById(R.id.textView33);
        hausa.setText(houseInfo);
    }
}