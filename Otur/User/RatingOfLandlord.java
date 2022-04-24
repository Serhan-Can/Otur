package User;

import java.util.*;

public class RatingOfLandlord {
    int overralRatingOutOf10;
    ArrayList<Integer> ratings;
    ArrayList<String> comments;



    public RatingOfLandlord() {
        ratings = new ArrayList<Integer>();
        comments = new ArrayList<String>();
    }

    public String getComments() {
        String comments = "";
        for (int i = 0; i < this.comments.size(); i++) {
            comments += this.comments.get(i);
        }
        return comments;
    }

    public void addComment(String comment) {
        comments.add(comment);
    }

    public void addRating(Integer rating) {
        ratings.add(rating);
    }

    public double getOverralRatingOutOf10() {
        double sum = 0;
        for(int i =0;i<ratings.size();i++){
            sum += ratings.get(i);
        }
        double average = sum/ratings.size();
        return average;
    }

    public ArrayList<Integer> getRatings() {
        return this.ratings;
    }

    public void setRatings(ArrayList<Integer> ratings) {
        this.ratings = ratings;
    }
    
}