package com.example.oturv5;

import java.util.*;


public class Student  {


    public void setPassword(String password) {
        this.password = password;
    }

    private  String number;

    public String getPassword() {
        return password;
    }

    private  String password;
    private  String name;

    public void setNumber(String number) {
        this.number = number;
    }

    private  String major;
    private  String university;




    public Student(String number, String password, String name, String major, String university){
        this.number=number;
        this.password=password;
        this.name = name;
        this.major = major;
        this.university = university;
    }
    public Student(){}
    public String getNumber()
    {
        return number;
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


    public String toString(){
        String str = name + "\n";
        str += major + "\n";
        str += university + "\n";
        str += number + "\n";
        str += password+"\n";
        return str;
    }

   /* public ArrayList<Accommodation> getPreviousAccommodations(){
        return previousAccommodations;
    }*/
/*
    public static void main(String[] args) {
        String b = "123";
        User a = new Student(b,b,b,b,b);
        System.out.println(a);

    }

 */
}