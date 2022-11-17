package com.example.myapplication;

import java.util.ArrayList;

public class RecipesRepo {
    public static final Recipe[] recipes = {
            new Recipe("Muffin", 2, "flower, sugar", R.drawable.muffin),
            new Recipe("Ice cream", 2, "milk, sugar", R.drawable.ice_cream),
            new Recipe("Cookie", 2, "sugar, flower", R.drawable.cookie),
            new Recipe("Waffles", 2, "sugar", R.drawable.waffles),
            new Recipe("Lemonade", 1, "water, lemon", R.drawable.lemonade)
    };

    public static ArrayList<Recipe> recipesByCategory(int category) {
        ArrayList<Recipe> chosen = new ArrayList<>();

        for (Recipe r : recipes) {
            if (r.getCategory() == category) {
                chosen.add(r);
            }
        }

        return chosen;
    }
}
