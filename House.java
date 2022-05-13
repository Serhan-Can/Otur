package com.example.myapplication;

import java.util.ArrayList;



public class House extends Accommodation {
    String noOfRooms;
    int noOfFiltersApplied ;
    double size;
    int rent;
    boolean isApartment;
    int noOfResidents;
    boolean isFurnished;
    Landlord lord;
    static ArrayList<House> filteredHouses;

    public House() {
        noOfFiltersApplied = 0;
    }

    public House(String city, String street, String district, String addressExplanation, int houseNo,
                 int floorNo, String noOfRooms, double size, int rent, boolean isApartment, Landlord lord) {
        super(city, street, district, addressExplanation, houseNo, floorNo);
        this.noOfRooms = noOfRooms;
        this.size = size;
        this.rent = rent;
        this.isApartment = isApartment;
        this.lord = lord;
        noOfFiltersApplied = 0;
    }

    public int getNoOfFiltersApplied() {
        return noOfFiltersApplied;
    }

    public boolean isApartment() {
        return isApartment;
    }

    public void setApartment(boolean apartment) {
        isApartment = apartment;
    }

    public void setNoOfResidents(int noOfResidents) {
        this.noOfResidents = noOfResidents;
    }

    public boolean isFurnished() {
        return isFurnished;
    }

    public void setFurnished(boolean furnished) {
        isFurnished = furnished;
    }

    public Landlord getLord() {
        return lord;
    }

    public void setLord(Landlord lord) {
        this.lord = lord;
    }

    public static ArrayList<House> getFilteredHouses() {
        return filteredHouses;
    }

    public static void setFilteredHouses(ArrayList<House> filteredHouses) {
        House.filteredHouses = filteredHouses;
    }

    public void rentHouse() {
        lord.rentHouse(this);
        this.noOfResidents++;
    }
    public void setNoOfFiltersApplied(int a){
        this.noOfFiltersApplied = a;
    }

    public int getNoOfResidents() {
        return this.noOfResidents;
    }

    public void increaseNoOfResidents() {
        this.noOfResidents++;
    }

    public String getNoOfRooms() {
        return this.noOfRooms;
    }

    public void setNoOfRooms(String noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public String getAddress() {
        if (this.isApartment) {
            return this.getAddressOfApartment();
        }
        return this.getAddressOfDetachedHouse();
    }

    private String getAddressOfDetachedHouse() {
        return district + " " + street + " " + houseNo + " " + city + " " + addressExplanation;
    }

    private String getAddressOfApartment() {
        return district + " " + street + " " + apartmentNo + " " + floorNo + " " + houseNo + " " + city + " "
                + addressExplanation;
    }

    public void setAddress(String city, String street, String district, String addressExplanation, int houseNo, int floorNo) {
        this.houseNo = houseNo;
        this.addressExplanation = addressExplanation;
        this.floorNo = floorNo;
        this.street = street;
        this.district = district;
        this.city = city;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getRent() {
        return this.rent;
    }

    public void setRent(int rent) {
        this.rent = rent;
    }

    public boolean getIsApartment() {
        return this.isApartment;
    }

    public void setIsApartment(boolean isApartment) {
        this.isApartment = isApartment;
    }

    public boolean getIsFurnished() {
        return isFurnished;
    }

    public void setIsFurnished(boolean isFurnished) {
        this.isFurnished = isFurnished;
    }

    public static ArrayList<House> filterHouses(ArrayList<House> houses, boolean isApartment, String noOfRooms, int sizeUnderBound, int sizeUpperBound, int rent, boolean furnish) {
        filteredHouses = new ArrayList<>();

        for (int i = 0; i < houses.size(); i++) {
            if (isApartment != houses.get(i).isApartment) {
                houses.get(i).noOfFiltersApplied++;
                continue;
            }
            if (!noOfRooms.equals(houses.get(i).noOfRooms)) {
                houses.get(i).noOfFiltersApplied++;
                continue;
            }
            if (houses.get(i).size < sizeUnderBound || houses.get(i).size > sizeUpperBound) {
                houses.get(i).noOfFiltersApplied++;
                continue;
            }
            if (rent < houses.get(i).rent) {
                houses.get(i).noOfFiltersApplied++;
                continue;
            }
            //distance??
            if (furnish != houses.get(i).isFurnished) {
                houses.get(i).noOfFiltersApplied++;
                continue;
            }
        }
        for(int i = 0;i<houses.size();i++){
            if(houses.get(i).noOfFiltersApplied == 0){
                filteredHouses.add(houses.get(i));
            }
        }
        return filteredHouses;
    }
    public void resetFilters(ArrayList<House> houses){
        for(int i = 0;i<houses.size();i++){
            houses.get(i).setNoOfFiltersApplied(0);
        }
    }

    @Override
    public String toString() {
        return "House{" +
                "noOfRooms='" + noOfRooms + '\'' +
                ", noOfFiltersApplied=" + noOfFiltersApplied +
                ", size=" + size +
                ", rent=" + rent +
                ", isApartment=" + isApartment +
                ", noOfResidents=" + noOfResidents +
                ", isFurnished=" + isFurnished +
                ", lord=" + lord +
                '}';
    }

    @Override
    String getType() {
        return "House";
    }

}