package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class RecipeListActivity extends AppCompatActivity {
    public static final String RECIPE_ID = "recipe_id";
    public static final String CATEGORY_ID = "category_id";

    ListView recipesListView;
    ArrayAdapter<Recipe> adapterRecipes;

    private int categoryId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list_activity);

        Bundle data = getIntent().getExtras();
        if (data != null) {
            categoryId = data.getInt(MainActivity.CATEGORY_ID, 0);
        }


        ArrayList<Recipe> chosenRecipes = RecipesRepo.recipesByCategory(categoryId);
        adapterRecipes = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, chosenRecipes);

        recipesListView = findViewById(R.id.recipes_list_view);
        recipesListView.setAdapter(adapterRecipes);

        recipesListView.setOnItemClickListener((adapterView, view, i, l) -> {
            Intent recipeActivityIntent = new Intent(RecipeListActivity.this, RecipeActivity.class);

            recipeActivityIntent.putExtra(RECIPE_ID, i);
            recipeActivityIntent.putExtra(CATEGORY_ID, categoryId);

            startActivity(recipeActivityIntent);
        });
    }
}