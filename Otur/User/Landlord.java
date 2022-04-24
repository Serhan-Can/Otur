package User;

import java.util.*;

import Accommodation.*;

public class Landlord extends User {
	String name;
	RatingOfLandlord ratingOfLandlord;
	ArrayList<House> houses;
	ArrayList<House> housesForRent;
	int noOfRentedHouses;
	ArrayList<Student> renters;

	public Landlord(String name, String number, String password) {
		super(number, password);
		this.name = name;
		this.ratingOfLandlord = new RatingOfLandlord();
		houses = new ArrayList<>();
		renters = new ArrayList<>();
		noOfRentedHouses = houses.size()-housesForRent.size();

	}

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

	public void addComment(String comment) {
		ratingOfLandlord.addComment(comment);
	}

	public void addRating(Integer integer) {
		ratingOfLandlord.addRating(integer);
	}

	public double getAverageRating() {   
		return ratingOfLandlord.getOverralRatingOutOf10();
	}

	public String getAllRatings() {
		String ratings = " ";
		for (int i = 0; i < ratingOfLandlord.getRatings().size(); i++) {
			ratings += ratingOfLandlord.getRatings().get(i) + "\n";
		}
		return ratings;
	}

	public String toString(){
		String str = name + "\n";
		str += getNumber() + "\n";
		str += getAverageRating() + "\n";
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