package com.example.oturv5;

import java.util.*;


public  class Landlord extends User {
    String name;
    ArrayList<House> houses;
    ArrayList<House> housesForRent;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<House> getHouses() {
        return houses;
    }

    public void setHouses(ArrayList<House> houses) {
        this.houses = houses;
    }

    public ArrayList<House> getHousesForRent() {
        return housesForRent;
    }

    public void setHousesForRent(ArrayList<House> housesForRent) {
        this.housesForRent = housesForRent;
    }

    public void setNoOfRentedHouses(int noOfRentedHouses) {
        this.noOfRentedHouses = noOfRentedHouses;
    }

    public ArrayList<Student> getRenters() {
        return renters;
    }

    public void setRenters(ArrayList<Student> renters) {
        this.renters = renters;
    }

    int noOfRentedHouses;
    ArrayList<Student> renters;

    public Landlord(String name, String number, String password) {
        super(number, password);
        this.name = name;
        houses = new ArrayList<>();
        renters = new ArrayList<>();
    }
    public Landlord(){}

    public void increaseNoOfRentedHouses() {
        this.noOfRentedHouses++;
    }

    public int getNoOfRentedHouses() {
        return this.noOfRentedHouses;
    }

    public void addHouse(House house) {
        this.houses.add(house);
    }

    public void rentHouse(House h) {
        housesForRent.remove(h);
    }

    public void addRenter(Student student) {
        this.renters.add(student);
    }


    public String toString(){
        String str = name + "\n";
        str += getNumber() + "\n";
        return str;
    }

    public void displayAccommodations(){
        for(int i = 0; i < housesForRent.size(); i++){
            System.out.println(housesForRent.get(i));
        }
    }

    @Override
    String getType() {
        return "Landlord";
    }

}
