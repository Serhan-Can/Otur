package Otur.User;
import java.util.*;
import Otur.Accomodation.*;

public class Student {

    private String name;
    private ContactInfo contactInfo;
    private String major;
    private String university;
    private String password;

    public Student(){
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
    public String getPassword(){
        return password;
    }
    public void setPassword(){
        this.password = password;
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
