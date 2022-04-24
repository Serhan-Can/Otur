package Accommodation;

import java.util.ArrayList;

import User.*;

public class House extends Accommodation{
    String noOfRooms;
    double size;
    int rent;
    boolean isApartment;
    int noOfResidents;
    boolean isFurnished;
    Landlord lord;

    public House() {
    }

    public House(String city, String street, String district, String addressExplanation, int houseNo,
    int floorNo,String noOfRooms, double size, int rent, boolean isApartment, Landlord lord) {
        super(city, street, district, addressExplanation, houseNo, floorNo);
        this.noOfRooms = noOfRooms;
        this.size = size;
        this.rent = rent;
        this.isApartment = isApartment;
        this.lord = lord;
    }

    public void rentHouse(){
        lord.rentHouse(this);
        this.noOfResidents++;
    }

    public int getNoOfResidents(){
        return this.noOfResidents;
    }
    public void increaseNoOfResidents(){
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

    public void setAddress(String city, String street, String district, String addressExplanation, int houseNo,int floorNo){
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
    public boolean getIsFurnished(){
        return isFurnished;
    }

    public void setIsFurnished(boolean isFurnished){
        this.isFurnished = isFurnished;
    }
    
    public static void filterHouses(ArrayList<House> houses, boolean isApartment, String noOfRooms, int sizeUnderBound, int sizeUpperBound, int rent, boolean furnish){       
        ArrayList<House> filteredHouses = new ArrayList<>();
        // int noOfRooms;
        // Address address;
        // double size;
        // int rent;
        // boolean isApartment;
        // int noOfResidents;
        //isApartment
        //number of rooms
        //size
        //budget
        //distance
        //furnish
        //anyResident
        for (int i = 0; i < houses.size(); i++){
            if(isApartment != houses.get(i).isApartment)
                continue;
            if(!noOfRooms.equals(houses.get(i).noOfRooms))
                continue;
            if(houses.get(i).size < sizeUnderBound || houses.get(i).size > sizeUpperBound)
                continue;
            if(rent < houses.get(i).rent)
                continue;
            //distance??
            if(furnish != houses.get(i).isFurnished)
                continue;

        }
    }

    @Override
    String getType() {
        return "House";
    }

}