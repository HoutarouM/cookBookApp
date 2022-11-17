package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RecipeListActivity extends AppCompatActivity {
    ListView recipesListView;

    ArrayAdapter<Recipe> adapterRecipes;

    private int categoryId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list_activity);

        Bundle data = getIntent().getExtras();
        if (data != null) {
            categoryId = data.getInt("categoryId", 0);
        }


        ArrayList<Recipe> chosenRecipes = RecipesRepo.recipesByCategory(categoryId);
        adapterRecipes = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, chosenRecipes);

        recipesListView = findViewById(R.id.recipes_list_view);
        recipesListView.setAdapter(adapterRecipes);
    }
}