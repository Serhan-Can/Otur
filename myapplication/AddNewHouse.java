package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class AddNewHouse extends AppCompatActivity {
    private Button cancelbtn;
    private Button addNewHousebtn;
    String city;
    String street;
    String district;
    String addressExplanation;
    int houseNo;
    int floorNo;
    String noOfRooms;
    double size;
    int rent;
    boolean isApartment;
    boolean isFurnished;
    Landlord lord;
    List<House> houses = MainActivity.houses;
    DatabaseReference referenceOfHouse = FirebaseDatabase.getInstance().getReference().child("Accommodation").child("House");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_house);

        cancelbtn = (Button) findViewById(R.id.cancelbtn);
        addNewHousebtn = (Button) findViewById(R.id.addNewHousebtn);
        cancelbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AddNewHouse.this, CurrentAccommodationsForRent.class);
                startActivity(intent);
            }
        });

        addNewHousebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                city = ((TextView) findViewById( R.id.City)).getText().toString();
                street = ((TextView) findViewById( R.id.ageOfTheBuilding)).getText().toString();
                district = ((TextView) findViewById( R.id.location)).getText().toString();
                addressExplanation = ((TextView) findViewById( R.id.title)).getText().toString();
                lord = new Landlord("Adil","45645465","1111111");
                houseNo = 3;
                floorNo = Integer.parseInt(((TextView) findViewById( R.id.floorIfItIsAnApartment)).getText().toString());
                if (((RadioButton)findViewById(R.id.radioButton4)).isSelected())
                noOfRooms = "1+0";
                else if (((RadioButton)findViewById(R.id.radioButton2)).isSelected())
                    noOfRooms = "1+1";
                else if (((RadioButton)findViewById(R.id.radioButton6)).isSelected())
                    noOfRooms = "2+1";
                else if (((RadioButton)findViewById(R.id.radioButton7)).isSelected())
                    noOfRooms = "3+1";
                else if (((RadioButton)findViewById(R.id.radioButton8)).isSelected())
                    noOfRooms = "4+1";
                else noOfRooms = "Other";
                size = Integer.parseInt(((TextView) findViewById( R.id.size)).getText().toString());
                rent = Integer.parseInt(((TextView) findViewById( R.id.rent)).getText().toString());
                if (((RadioButton)findViewById(R.id.radioButton17)).isSelected())
                isApartment = false;
                else isApartment = true;
                Intent intent = new Intent(AddNewHouse.this, MyProfileLandlord.class);
                startActivity(intent);
                House h = new House(city,street,district,addressExplanation,houseNo,floorNo,noOfRooms,size,rent,isApartment,lord);
                houses.add(h);
                referenceOfHouse.setValue(houses);
                houses.clear();
            }
        });



    }
}