package User;

import java.util.ArrayList;
import java.util.Collections;

public class RoommateFeatures implements Comparable<RoommateFeatures> {
    ArrayList<String> hobbiesAndInterests;
    ArrayList<String> properties;
    Student student;
    int commonFeatures;
    
    RoommateFeatures(ArrayList<String> hobbiesAndInterests, ArrayList<String> properties, Student student){
        this.hobbiesAndInterests = hobbiesAndInterests;
        this.properties = properties;
        this.student = student;
        commonFeatures = 0;
    }

    public ArrayList<String> getHobbiesAndInterests(){
        return hobbiesAndInterests;
    }

    public void setHobbiesAndInterests(ArrayList<String> hobbiesAndInterests){
        this.hobbiesAndInterests = hobbiesAndInterests;
    }

    public ArrayList<String> getProperties(){
        return properties;
    }

    public void setProperties(ArrayList<String> properties){
        this.properties = properties;
    }

    public Student getStudent(){
        return student;
    }

    public int getCommonFeatures(){
        return commonFeatures;
    }

    public void setCommonFeatures(RoommateFeatures a){
        int returnValue = 0;
        for(int i = 0; i < a.hobbiesAndInterests.size(); i++){
            for(int j = 0; j < this.hobbiesAndInterests.size(); j++){
                if(a.hobbiesAndInterests.get(i).equals(this.hobbiesAndInterests.get(j))){
                    returnValue++;
                }
            }
        }
        for(int i = 0; i < a.properties.size(); i++){
            for(int j = 0; j < this.properties.size(); j++){
                if(a.properties.get(i).equals(this.properties.get(j))){
                    returnValue++;
                }
            }
        }
        commonFeatures = returnValue;
    }

    @Override
    public int compareTo(RoommateFeatures o) {
        if(this.commonFeatures < o.commonFeatures)
            return 1;
        if(this.commonFeatures > o.commonFeatures)
            return -1;
        return 0;
    }

    public static void listRoommates(ArrayList<RoommateFeatures> roommates){
        Collections.sort(roommates);
    }
    

}