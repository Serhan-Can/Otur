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
    public static void main(String[] args) {
        String b = "123";
        Student a1 = new Student(b, b, "1", b, b);
        Student a2 = new Student(b, b, "2", b, b);
        Student a3 = new Student(b, b, "3", b, b);
        Student a4 = new Student(b, b, "4", b, b);

        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("123");
        arr1.add("234");
        arr1.add("345");

        ArrayList<String> arr2 = new ArrayList<>();
        arr2.add("123");
        ArrayList<String> arr3 = new ArrayList<>();
        arr3.add("123");
        arr3.add("234");

        ArrayList<String> arr4 = new ArrayList<>();
        arr4.add("1234");
        RoommateFeatures a = new RoommateFeatures(new ArrayList<>(), new ArrayList<>(), a1);
        a.setHobbiesAndInterests(arr1);
        RoommateFeatures c = new RoommateFeatures(new ArrayList<>(), new ArrayList<>(), a2);
        c.setHobbiesAndInterests(arr2);
        RoommateFeatures d = new RoommateFeatures(new ArrayList<>(), new ArrayList<>(), a3);
        d.setHobbiesAndInterests(arr3);
        RoommateFeatures e = new RoommateFeatures(new ArrayList<>(), new ArrayList<>(), a4);
        e.setHobbiesAndInterests(arr4);
        ArrayList<RoommateFeatures> arr5 = new ArrayList<>();
        arr5.add(a);
        arr5.add(c);
        arr5.add(d);
        arr5.add(e);
        ArrayList<RoommateFeatures> arr6 = new ArrayList<>();
        for(int i = 0; i < arr5.size(); i++){
            arr5.get(i).setCommonFeatures(a);
            if(arr5.get(i).getCommonFeatures() != 0){
                arr6.add(arr5.get(i));
            }
        }
        listRoommates(arr6);
        for(int i = 0; i < arr6.size(); i++){
            System.out.println(arr6.get(i).getStudent());
        }
    }

}