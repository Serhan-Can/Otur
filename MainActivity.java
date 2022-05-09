package com.example.oturv5;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    static int index;
    static int index2;
    static int index3;
    Landlord lL;
    String name;
    String number;
    String password;
    String major;
    String university;
    Button bt;
    Post a;
    Student st;
    Student std;
    DatabaseReference databaseReference = FirebaseDatabase.getInstance("https://oturv4-default-rtdb.europe-west1.firebasedatabase.app/").getReference().child("Users").child("Students");
    DatabaseReference databaseReferenceLandLord = FirebaseDatabase.getInstance("https://oturv4-default-rtdb.europe-west1.firebasedatabase.app/").getReference().child("Users").child("LandLords");
    DatabaseReference databaseReferenceHouse = FirebaseDatabase.getInstance("https://oturv4-default-rtdb.europe-west1.firebasedatabase.app/").getReference().child("Accommodation").child("Houses");

    final List<Student> listeStd = new ArrayList<Student>();
    final List<Object> listeLL = new ArrayList<Object>();
    final List<Object> listeHs = new ArrayList<Object>();

    List<Student> students = new ArrayList<>();
    List<Landlord> landlords = new ArrayList<>();
    List<House> houses = new ArrayList<>();

    // Get a reference to our posts
    //final FirebaseDatabase database = FirebaseDatabase.getInstance("https://oturv4-default-rtdb.europe-west1.firebasedatabase.app/");
    //DatabaseReference ref = database.getReference();
    public boolean isUser(Student a)
    {
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        databaseReferenceHouse.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String prevChildKey) {
                System.out.println(dataSnapshot.exists());
                System.out.println(dataSnapshot.getValue());
                houses.add(dataSnapshot.getValue(House.class));

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

       databaseReference.addChildEventListener(new ChildEventListener() {
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

        databaseReferenceLandLord.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String prevChildKey) {
                System.out.println(dataSnapshot.exists());
                System.out.println(dataSnapshot.getValue());
                landlords.add(dataSnapshot.getValue(Landlord.class));
                index++;

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


        bt=(Button) findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                name =  "Madil1";
                number =  "123";
                password =  "findViewById";
                major =  "AAA";
                university =  "Bİlkent";
                st = new Student(number,password,name,major,university);
                listeStd.add(st);
                st = new Student("number",password,"name",major,university);
                listeStd.add(st);
                databaseReference.setValue(listeStd);
                 lL= new Landlord("LandlordName","number1","paswword1");
                listeLL.add(lL);
                databaseReferenceLandLord.setValue(listeLL);
                House hs = new House("İstanbul City","Baris Sok.","district","exp",1,4,"3",2,1234, true,lL);
                listeHs.add(hs);
                databaseReferenceHouse.setValue(listeHs);

            }
        });
    }

}