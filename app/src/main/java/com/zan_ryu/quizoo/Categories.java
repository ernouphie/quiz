package com.zan_ryu.quizoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Categories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);   // Full Screen

        // Var Declarations
        Button button_category_animals = (Button) findViewById(R.id.button_category_animals);
        Button button_category_gaming = (Button) findViewById(R.id.button_category_gaming);
        Button button_category_geography = (Button) findViewById(R.id.button_category_geography);
        Button button_category_history = (Button) findViewById(R.id.button_category_history);
        Button button_category_music = (Button) findViewById(R.id.button_category_music);


        // Click Listener for Animal Category Button
        button_category_animals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_quiz = new Intent(Categories.this, FirstQuestion.class);
                intent_quiz.putExtra("category", "animals");
                startActivity(intent_quiz);
                finish();
            }
        }); // End of Click Listener for Animal Category Button

        // Click Listener for Gaming Category Button
        button_category_gaming.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_quiz = new Intent(Categories.this, FirstQuestion.class);
                intent_quiz.putExtra("category", "gaming");
                startActivity(intent_quiz);
                finish();
            }
        }); // End of Click Listener for Gaming Category Button

        // Click Listener for Geography Category Button
        button_category_geography.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_quiz = new Intent(Categories.this, FirstQuestion.class);
                intent_quiz.putExtra("category", "geography");
                startActivity(intent_quiz);
                finish();
            }
        }); // End of Click Listener for Geography Category Button

        // Click Listener for History Category Button
        button_category_history.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_quiz = new Intent(Categories.this, FirstQuestion.class);
                intent_quiz.putExtra("category", "history");
                startActivity(intent_quiz);
                finish();
            }
        }); // End of Click Listener for History Category Button

        // Click Listener for Music Category Button
        button_category_music.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_quiz = new Intent(Categories.this, FirstQuestion.class);
                intent_quiz.putExtra("category", "music");
                startActivity(intent_quiz);
                finish();
            }
        }); // End of Click Listener for Music Category Button
    }
}