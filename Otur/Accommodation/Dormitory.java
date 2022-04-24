//Dormitory class designed for students to have rentable dormitory object
package Accommodation;

import User.*;

public class Dormitory extends Accommodation {
    int noOfRooms;
    double size;
    int floor;
    int monthlyFee;
    int noOfResidents;
    int capacity;
    boolean isBathroomShared;
    boolean hasKitchen;
    Landlord lord;

    public Dormitory() {
    }

    public Dormitory(String city, String street, String district, String addressExplanation,int houseNo, int floorNo,
    boolean hasKitchen, boolean isBathroomShared, int noOfRooms, double size, int floor, int monthlyFee,int capacity, Landlord lord) {
        super(city, street, district, addressExplanation, houseNo, floorNo);
        this.isBathroomShared = isBathroomShared;
        this.hasKitchen = hasKitchen;
        this.noOfRooms = noOfRooms;
        this.size = size;
        this.floor = floor;
        this.monthlyFee = monthlyFee;
        this.capacity = capacity;
        this.lord = lord;

    }

    public boolean getIsBathroomShared(){
        return isBathroomShared;
    }

    public void setIsBathroomShared(boolean isBathroomShared){
        this.isBathroomShared = isBathroomShared;
    }

    public boolean hasKitchen(){
        return hasKitchen;
    }

    public void setHasKitchen(boolean hasKitchen){
        this.hasKitchen = hasKitchen;
    }
    
    public int getNoOfResidents(int noOfResidents) {
        return this.noOfResidents;
    }

    public void increaseNoOfResidents(){
        this.noOfResidents++;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getNoOfResidents(){
        return this.noOfResidents;
    }

    public int getNoOfRooms() {
        return this.noOfRooms;
    }

    public int getFreeSpace(){
        return capacity-noOfResidents;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public String printAddress() {
        return district + " " + street + " " + houseNo + " " + city + " " + addressExplanation;
    }

    public double getSize() {
        return this.size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public int getFloor() {
        return this.floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getMonthlyFee() {
        return this.monthlyFee;
    }

    public void setMonthlyFee(int monthlyFee) {
        this.monthlyFee = monthlyFee;
    }

    public void setAddress(String city, String street, String district, String addressExplanation, int houseNo,int floorNo){
        this.houseNo = houseNo;
        this.addressExplanation = addressExplanation;
        this.floorNo = floorNo;
        this.street = street;
        this.district = district;
        this.city = city;
    }

    @Override
    public String toString() {
        return "{" +
                "Number Of Rooms: " + getNoOfRooms() + "\n" +
                "Address: " + printAddress() + "\n" +
                "Size: " + getSize() + "\n" +
                "Floor: " + getFloor() + "\n" +
                "Monthyle Fee" + getMonthlyFee() + "\n";
    }

    @Override
    String getType() {
        return "Dormitory";
    }

}
