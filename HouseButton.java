package com.example.myapplication;

import android.content.Context;
import android.widget.Button;
public class HouseButton extends Button {
    int id;
    public HouseButton(Context context,int id) {
        super(context);
        this.id=id;
    }

    @Override
    public int getId() {
        return id;
    }
}
