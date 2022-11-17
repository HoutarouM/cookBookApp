package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    // jezeli w ukladzie z ogranieczeniami nie zdefiniowane ograniczenia (constrainty)
    // pojawia sie w lewych gornym rogu

    ListView categoryListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoryListView = findViewById(R.id.category_list);

        categoryListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                showNewActivity(i);
            }
        });
    }

    private void showNewActivity(int category) {
        Intent recipeListIntent = new Intent(this, RecipeListActivity.class);

        recipeListIntent.putExtra("categoryId", category);

        startActivity(recipeListIntent);
    }
}