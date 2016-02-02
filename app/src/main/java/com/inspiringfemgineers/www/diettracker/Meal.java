package com.inspiringfemgineers.www.diettracker;

import java.util.ArrayList;

/**
 * Created by 2017ehu on 1/14/2016.
 */
public class Meal {
    private int calories;
    private ArrayList<Food> foods;
    private ArrayList<String> ingredients;

    public void addCalories(int addedCalories) {
        calories = calories + addedCalories;
    }
    public void getIngredients(){
        for (Food f : foods) {
           ingredients.addAll(f.getIngredients());
        }
    }
    private void addFood(Food food) {
        foods.add(food);
    }

    public int getCalories() {
        for(Food f: foods){
            addCalories(f.getCalories());
        }
        return calories;
        }
    }

