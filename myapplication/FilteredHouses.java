package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.view.View;

import java.util.ArrayList;


public class FilteredHouses extends AppCompatActivity {
     LinearLayout layout;
     ArrayList<House> houses;
     String city;
     String houseInfo;
     int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtered_houses);
        layout = (LinearLayout) findViewById(R.id.layout232);
        houses = new ArrayList<>();
        Landlord landlord = new Landlord("Doğa","3434","6789");

        House A = new House("Ankara","Bakers Street","Beytepe","Caminin karşısı",23,4,"2+1",400,700,true,landlord);
        House B = new House("İstanbul","Justice street","Kadıköy","Statın altı",45,6,"1+0",100,300,true,landlord);
        House C = new House("Trabzon","Hamsi sokak","Hamsi köy","Fırtına deresi karşısı",1,1,"3+1",800,1000,false,landlord);
        House D = new House("Bilecik","Doğa Sokak","Gülbahçe","Meydanda",12,3,"4+1",1500,2000,true,landlord);
        houses.add(A);
        houses.add(B);
        houses.add(C);
        houses.add(D);
        ArrayList<Button> buttons = new ArrayList<>();
        for ( i=0;i<houses.size();i++){
        HouseButton button = new HouseButton(this,i);
        button.setText(houses.get(i).getCity()+" "+houses.get(i).getDistrict() +" " +houses.get(i).getNoOfRooms());
        buttons.add(button);
        layout.addView(button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city = houses.get(button.getId()).getAddress();
                houseInfo = houses.get(button.getId()).toString();
                Intent intent = new Intent(FilteredHouses.this,HouseInfo.class);
                HouseInfo.city=city;
                HouseInfo.houseInfo=houseInfo;
                startActivity(intent);

            }
        });

    }
}
}