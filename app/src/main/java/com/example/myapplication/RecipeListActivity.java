package com.example.myapplication;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeListActivity extends AppCompatActivity {
    ListView recipesListView;

    private int categoryId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_list_activity);

        Bundle data = getIntent().getExtras();
        if (data != null) {
            categoryId = data.getInt("categoryId", 0);
        }

        recipesListView = findViewById(R.id.recipes_list_view);

        Toast.makeText(this, "Category: " + categoryId, Toast.LENGTH_LONG).show();
    }
}