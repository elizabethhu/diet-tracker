package com.inspiringfemgineers.www.diettracker;

/**
 * Created by 2017ehu on 1/14/2016.
 */
public class Meal {
    private int calories;
    private String[] ingredients;

    public void addCalories(int addedCalories) {
        calories = calories + addedCalories;
    }

    public int getCalories() {
        return calories;
    }
}
