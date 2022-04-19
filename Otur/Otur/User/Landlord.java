package Otur.User;

import java.util.*;

import Otur.Accomodation.*;

public class Landlord {
	RatingOfLandlord ratingOfLandlord;
	ArrayList<House> houses;
	ArrayList<House> housesForRent;
	int noOfRentedHouses;
	ArrayList<Student> renters;
	ContactInfo contactInfo;

	public Landlord() {
		this.ratingOfLandlord = new RatingOfLandlord();
		houses = new ArrayList<>();
		renters = new ArrayList<>();
		noOfRentedHouses = houses.size()-housesForRent.size();
		contactInfo = new ContactInfo();
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

	public double getAverageWeigth() {   
		return ratingOfLandlord.getOverralRatingOutOf10();
	}

	public String getAllRatings() {
		String ratings = " ";
		for (int i = 0; i < ratingOfLandlord.getRatings().size(); i++) {
			ratings += ratingOfLandlord.getRatings().get(i) + "\n";
		}
		return ratings;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.contactInfo.setNumber(phoneNumber);
	}

	public void setEMailAddress(String eMailAddress) {
		this.contactInfo.setEMailAddress(eMailAddress);
	}

	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public String getContactInfo() {
		return this.contactInfo.getContactInfo();
	}

}
