package com.zan_ryu.quizoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);   // Full Screen

        // Var Declarations
        Button button_play = (Button) findViewById(R.id.button_play);
        Button button_categories = (Button) findViewById(R.id.button_categories);

        // Click Listener for Play Button
        button_play.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Categories.class));
                finish();
            }
        }); // End of Click Listener for Play Button
    }
}