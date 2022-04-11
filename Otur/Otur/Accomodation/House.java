package Otur.Accomodation;

import Otur.User.*;

public class House {
    int noOfRooms;
    Address address;
    double size;
    int rent;
    boolean isApartment;
    int noOfResidents;
    Landlord lord;

    public House() {
    }

    public House(int noOfRooms, Address address, double size, int rent, boolean isApartment) {
        this.noOfRooms = noOfRooms;
        this.address = address;
        this.size = size;
        this.rent = rent;
        this.isApartment = isApartment;
        lord = new Landlord();
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
    public int getNoOfRooms() {
        return this.noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    // this method checks if the house is an apartment and decides which method to
    // call
    public String getAddress() {
        if (this.isApartment) {
            return this.getAddressOfApartment();
        }
        return this.getAddressOfDetachedHouse();
    }

    // to avoid multiple method usage and confussion these two methods are called in
    // the same method so these wont be implemented directly
    public String getAddressOfDetachedHouse() {
        return this.address.printAddressOfDetachedHouse();
    }

    public String getAddressOfApartment() {
        return this.address.printAddressOfApartment();
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public boolean isIsApartment() {
        return this.isApartment;
    }

    public boolean getIsApartment() {
        return this.isApartment;
    }

    public void setIsApartment(boolean isApartment) {
        this.isApartment = isApartment;
    }

}
