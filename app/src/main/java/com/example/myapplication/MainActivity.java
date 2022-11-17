package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // jezeli w ukladzie z ogranieczeniami nie zdefiniowane ograniczenia (constrainty)
    // pojawia sie w lewych gornym rogu

//    adapter most pomiedzy danym i widokiem

    public static final String CATEGORY_ID = "category_id";

    ListView categoryListView;

    Button addRecipeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryListView = findViewById(R.id.category_list);

        addRecipeButton = findViewById(R.id.add_recipe_button);


        categoryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showNewActivity(i);
            }
        });


        addRecipeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    private void showNewActivity(int category) {
        Intent recipeListIntent = new Intent(this, RecipeListActivity.class);

        recipeListIntent.putExtra(CATEGORY_ID, category);

        startActivity(recipeListIntent);
    }
}