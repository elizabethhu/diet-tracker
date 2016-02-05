package com.inspiringfemgineers.www.diettracker;

import java.util.ArrayList;

/**
 * Created by 2017ehu on 2/2/2016.
 */
public class Food {
        private int calories;
        private ArrayList<String> ingredients;

        public void addCalories(int addedCalories) {
            calories = calories + addedCalories;
        }

        public int getCalories() {
            return calories;
        }
    public ArrayList<String> getIngredients() {
return ingredients;
    }
    public void addIngredients(String ing) {
ingredients.add(ing);
    }
    }
    }

