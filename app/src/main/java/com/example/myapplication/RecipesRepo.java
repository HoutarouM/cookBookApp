package com.example.myapplication;

import java.util.ArrayList;

public class RecipesRepo {
    public static final Recipe[] recipes = {
            new Recipe("Muffin", 1, "flower, sugar", R.drawable.muffin),
            new Recipe("Ice cream", 1, "milk, sugar", R.drawable.ice_cream),
            new Recipe("Cookie", 1, "sugar, flower", R.drawable.cookie),
            new Recipe("Waffles", 1, "sugar", R.drawable.waffles),
            new Recipe("Lemonade", 0, "water, lemon", R.drawable.lemonade)
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
