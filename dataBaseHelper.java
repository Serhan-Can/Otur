package com.example.firebase2;
import android.widget.Toast;


import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class dataBaseHelper {
    DatabaseReference databaseReference;
    ArrayList<User> userss = new ArrayList<User>();
    public dataBaseHelper(String ID)
    {
        databaseReference=FirebaseDatabase.getInstance("https://otur-b78d0-default-rtdb.europe-west1.firebasedatabase.app/").getReference("Users").child("Students");
    }
    public void addToDatabaseUsers(Object obj)
    {
        userss.add((User)obj);
            databaseReference.setValue(userss);
    }

}
