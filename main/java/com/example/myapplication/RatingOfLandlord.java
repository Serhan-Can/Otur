package com.example.myapplication;

import java.util.*;

public class RatingOfLandlord {
    double overralRatingOutOf10;
    ArrayList<Integer> ratings;
    ArrayList<String> comments;



    public RatingOfLandlord() {
        ratings = new ArrayList<>();
        comments = new ArrayList<>();
    }

    public String getComments() {
        String comments = "";
        for (String comment : this.comments) {
            comments += comment;
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
        for (Integer rating : ratings) {
            sum += rating;
        }
        this.overralRatingOutOf10 = sum/ratings.size();
        return this.overralRatingOutOf10;
    }

    public ArrayList<Integer> getRatings() {
        return this.ratings;
    }

    public void setRatings(ArrayList<Integer> ratings) {
        this.ratings = ratings;
    }

}