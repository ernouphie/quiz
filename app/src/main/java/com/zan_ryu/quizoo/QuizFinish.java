package com.zan_ryu.quizoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;

public class QuizFinish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_finish);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);   // Full Screen

        TextView text_thanks = (TextView) findViewById(R.id.text_thanks);

        Button button_quit = (Button) findViewById(R.id.button_quit);

        button_quit.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finishAndRemoveTask();

            }
        });
    }
}