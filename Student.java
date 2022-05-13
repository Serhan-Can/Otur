package com.example.myapplication;

import java.util.*;


public class Student extends User{
    public ArrayList<Accommodation> getPreviousAccommodations() {
        return previousAccommodations;
    }

    public void setPreviousAccommodations(ArrayList<Accommodation> previousAccommodations) {
        this.previousAccommodations = previousAccommodations;
    }

    private String name;
    private String major;
    private String university;
    private ArrayList<Accommodation> previousAccommodations;

    public Student(String number, String password, String name, String major, String university){
        super(number, password);
        this.name = name;
        this.major = major;
        this.university = university;
        this.previousAccommodations = new ArrayList<>();
    }
    public Student(){
        super();
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getMajor(){
        return major;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public String getUniversity(){
        return university;
    }

    public void setUniversity(String university){
        this.university = university;
    }

    public void addAccommodation(House house){
        previousAccommodations.add(house);
    }

    @Override
    String getType() {
        return "Student";
    }

    public String toString(){
        String str = name + "\n";
        str += major + "\n";
        str += university + "\n";
        str += getNumber() + "\n";
        return str;
    }

}
