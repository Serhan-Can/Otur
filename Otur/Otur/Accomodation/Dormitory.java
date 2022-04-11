package Otur.Accomodation;

//Dormitory class designed for students to have rentable dormitory object

public class Dormitory {
    int noOfRooms;
    Address address;
    double size;
    int floor;
    int monthlyFee;
    int noOfResidents;
    int capacity;

    public Dormitory() {
    }

    public Dormitory(int noOfRooms, Address address, double size, int floor, int monthlyFee,int capacity) {
        this.noOfRooms = noOfRooms;
        this.address = address;
        this.size = size;
        this.floor = floor;
        this.monthlyFee = monthlyFee;
        this.capacity = capacity;
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

    public Address getAddress() {
        return this.address;
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

    @Override
    public String toString() {
        return "{" +
                "Number Of Rooms: " + getNoOfRooms() + "\n" +
                "Address: " + getAddress() + "\n" +
                "Size: " + getSize() + "\n" +
                "Floor: " + getFloor() + "\n" +
                "Monthyle Fee" + getMonthlyFee() + "\n";
    }

}
