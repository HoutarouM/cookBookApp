package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeActivity extends AppCompatActivity {
    ImageView recipeImageView;

    TextView titleView;
    TextView componentsView;

    Button sendButton;

    private int recipeId;
    private int categoryId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);

        Bundle data = getIntent().getExtras();
        if (data != null) {
            recipeId = data.getInt(RecipeListActivity.RECIPE_ID, 0);
            categoryId = data.getInt(RecipeListActivity.CATEGORY_ID, 0);
        }

        Recipe r = RecipesRepo.recipesByCategory(categoryId).get(recipeId);


//        views initialization
        recipeImageView = findViewById(R.id.imageView);

        titleView = findViewById(R.id.recipe_name_text_view);
        componentsView = findViewById(R.id.components_text_view);

        sendButton = findViewById(R.id.send_recipe_button);


//        set data to views
        recipeImageView.setImageResource(r.getPictureId());

        titleView.setText(r.getName());
        componentsView.setText(r.getComponentsList());


        sendButton.setOnClickListener(view -> {
//            w manifescie dodac filtr do wysylania sms

            Intent intent = new Intent();

            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT, r.getName() + " " + r.getComponentsList() + " Bonapeti");
            intent.setType("text/plain");

            Intent shareIntent = Intent.createChooser(intent, "title");
            startActivity(shareIntent);
        });
    }
}