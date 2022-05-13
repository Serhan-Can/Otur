package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    private Button loginbtn;
    private Button signupbtn;
    Student aStudent;
    TextView phoneNumber;
    DatabaseReference referenceOfStudent = FirebaseDatabase.getInstance("https://otur-b78d0-default-rtdb.europe-west1.firebasedatabase.app/").getReference().child("Users").child("Student");
    DatabaseReference referenceOfLandLord = FirebaseDatabase.getInstance("https://otur-b78d0-default-rtdb.europe-west1.firebasedatabase.app/").getReference().child("Users").child("LandLord");
    DatabaseReference referenceOfHouse = FirebaseDatabase.getInstance("https://otur-b78d0-default-rtdb.europe-west1.firebasedatabase.app/").getReference().child("Accommodation").child("House");

    public static List<Student> students = new ArrayList<Student>();
    public static List<Landlord> landlords = new ArrayList<Landlord>();
    public static List<House> houses = new ArrayList<House>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        referenceOfStudent.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String prevChildKey) {
                System.out.println(dataSnapshot.exists());
                System.out.println(dataSnapshot.getValue());
                students.add(dataSnapshot.getValue(Student.class));
                System.out.println("Previous Post ID: " + prevChildKey);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String prevChildKey) {}

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {}

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String prevChildKey) {}

            @Override
            public void onCancelled(DatabaseError databaseError) {}
        });
        referenceOfLandLord.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String prevChildKey) {
                System.out.println(dataSnapshot.exists());
                System.out.println(dataSnapshot.getValue());
                landlords.add(dataSnapshot.getValue(Landlord.class));
                System.out.println("Previous Post ID: " + prevChildKey);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String prevChildKey) {}

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {}

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String prevChildKey) {}

            @Override
            public void onCancelled(DatabaseError databaseError) {}
        });

        referenceOfHouse.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String prevChildKey) {
                House newPost = dataSnapshot.getValue(House.class);
                houses.add(newPost);
                System.out.println("Previous Post ID: " + prevChildKey);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String prevChildKey) {}

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {}

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String prevChildKey) {}

            @Override
            public void onCancelled(DatabaseError databaseError) {}
        });
        setContentView(R.layout.activity_main);
        phoneNumber = (TextView) findViewById(R.id.phoneNumber);

        signupbtn = (Button) findViewById(R.id.signupbtn);
        signupbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Signup.class);
                startActivity(intent);
            }
        });
        loginbtn = (Button) findViewById(R.id.loginbtn);
        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (phoneNumber.getText().toString().equals("1")){
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(intent);}
                else {
                    Intent intent = new Intent(MainActivity.this, MyProfileLandlord.class);
                    startActivity(intent);}

            }
        });


    }
}