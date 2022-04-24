package User;
import java.util.*;
import Accommodation.*;

public class Student extends User{

    private String name;
    private String major;
    private String university;
    private ArrayList<Accommodation> previousAccommodations;

    public Student(String number, String password, String name, String major, String university){
        super(number, password);
        this.name = name;
        this.major = major;
        this.university = university;
        this.previousAccommodations = new ArrayList<>();
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

    public void addAccommodation(House house){
        previousAccommodations.add(house);
    }
	
    @Override
    String getType() {
        return "Student";
    }

    public String toString(){
        String str = name + "\n";
        str += major + "\n";
        str += university + "\n";
        str += getNumber() + "\n";
        return str;
    }

    public ArrayList<Accommodation> getPreviousAccommodations(){
        return previousAccommodations;
    }

    public static void main(String[] args) {
        String b = "123";
        User a = new Student(b,b,b,b,b);
        System.out.println(a);
        
    }
}