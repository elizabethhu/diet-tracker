package com.inspiringfemgineers.www.diettracker;

/**
 * Created by 2017ehu on 1/14/2016.
 */
import java.util.ArrayList;

/**
 * Created by 2017ehu on 1/5/2016.
 */
public class Day {
    private Meal[] meals;
    private int calories;
    private ArrayList<String> totaling;
    //add ints for year, month, day

    public int getCalories() {
        for (Meal meal: meals) {
            calories = calories + meal.getCalories();
        }
        return calories;
    }

    public void enterfood(int n, int calories, ArrayList<String> ingredients) {
        meals[n].addCalories(calories);
        for (String s: ingredients) {
            totaling.add(s);
        }
    }


}