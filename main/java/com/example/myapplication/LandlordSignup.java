package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class LandlordSignup extends AppCompatActivity {
    DatabaseReference referenceOfLandLords = FirebaseDatabase.getInstance("https://otur-b78d0-default-rtdb.europe-west1.firebasedatabase.app/").getReference().child("Users").child("LandLord");
    List<Landlord> landlords = MainActivity.landlords;
    private String name;
    private String number;
    private String password;
    private String passwordConfirm;
    private Button landlordSignupbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landlord_signup);
        landlordSignupbtn = (Button) findViewById(R.id.landlordSignupbtn);
        landlordSignupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = ((TextView) findViewById( R.id.name2)).getText().toString();
                number = ((TextView) findViewById( R.id.phoneNumber3)).getText().toString();
                password = ((TextView) findViewById( R.id.landlordPassword)).getText().toString();
                passwordConfirm = ((TextView) findViewById( R.id.landlordPasswordRepeat)).getText().toString();
                if (password.equals(passwordConfirm)){
                Intent intent = new Intent(LandlordSignup.this, MyProfileLandlord.class);
                startActivity(intent);
                Landlord landlord = new Landlord(name,number,password);
                landlords.add(landlord);
                referenceOfLandLords.setValue(landlords);
                landlords.clear();
                }
                else ((TextView) findViewById(R.id.landlordPasswordRepeat)).setText("Passwords does not match!");
            }
        });
    }
}