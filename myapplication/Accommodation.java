package com.example.myapplication;

public abstract class Accommodation {

    int apartmentNo;
    String addressExplanation;
    int floorNo;
    String street;
    String district;

    public int getApartmentNo() {
        return apartmentNo;
    }

    public void setApartmentNo(int apartmentNo) {
        this.apartmentNo = apartmentNo;
    }

    String city;
    int houseNo;

    public Accommodation() {
    }

    public Accommodation(String city, String street, String district, String addressExplanation, int houseNo, int floorNo) {
        this.houseNo = houseNo;
        this.addressExplanation = addressExplanation;
        this.floorNo = floorNo;
        this.street = street;
        this.district = district;
        this.city = city;
    }

    public Accommodation(String city, String street, String district, String addressExplanation, int apartmentNo, int houseNo,
                         int floorNo) {
        this.houseNo = houseNo;
        this.addressExplanation = addressExplanation;
        this.floorNo = floorNo;
        this.street = street;
        this.district = district;
        this.city = city;
        this.apartmentNo = apartmentNo;
    }

    abstract String getType();

    public int getHouseNo() {
        return this.houseNo;
    }

    public void setHouseNo(int houseNo) {
        this.houseNo = houseNo;
    }

    public String getAddressExplanation() {
        return this.addressExplanation;
    }

    public void setAddressExplanation(String addressExplanation) {
        this.addressExplanation = addressExplanation;
    }

    public int getFloorNo() {
        return this.floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getDistrict() {
        return this.district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    // public boolean isDetached(Object obj){
    //     //if(Object)
    // }

    public String printAddressOfApartment() {
        return district + " " + street + " " + apartmentNo + " " + floorNo + " " + houseNo + " " + city + " "
                + addressExplanation;
    }

    public String printAddressOfDetachedHouse() {
        return district + " " + street + " " + houseNo + " " + city + " " + addressExplanation;
    }

}
