package com.zan_ryu.quizoo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

public class FifthQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third_question);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);   // Full Screen

        Intent intent = getIntent();
        final String category = intent.getStringExtra("category");    //Selected Category from previous activity.

        final TextView wrong_answer = (TextView) findViewById(R.id.text_wrong_answer);
        TextView question = (TextView) findViewById(R.id.text_question);

        Button button_option1 = (Button) findViewById(R.id.button_option1);
        Button button_option2 = (Button) findViewById(R.id.button_option2);
        Button button_option3 = (Button) findViewById(R.id.button_option3);

        Questions questionList = new Questions();
        String[][] question_details = questionList.question_details;

        // For randomization of array
        //List<String[]> question_details_list = Arrays.asList(question_details);
        //Collections.shuffle(question_details_list);
        //\\question_details_list.toArray(question_details);

        int counter=0;

        for (int i=0; i<question_details.length; i++){

            String array_category = question_details[i][0];
            String array_question = question_details[i][1];
            String array_option1 = question_details[i][2];
            String array_option2 = question_details[i][3];
            String array_option3 = question_details[i][4];
            final String array_right_ans = question_details[i][5];

            if (category.equals(array_category) && counter == 4){
                question.setText(array_question);
                button_option1.setText((array_option1));
                button_option2.setText((array_option2));
                button_option3.setText((array_option3));


                button_option1.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        if (array_right_ans.equals("1")) {
                            Intent intent_quiz = new Intent(FifthQuestion.this, QuizFinish.class);
                            intent_quiz.putExtra("category", category);
                            startActivity(intent_quiz);
                            finish();
                        }
                        else{
                            wrong_answer.setAlpha(0f);
                            wrong_answer.setVisibility(View.VISIBLE);
                            wrong_answer.animate()
                                    .alpha(0.5f)
                                    .setDuration(400)
                                    .setListener(null);
                        }
                    }
                });


                button_option2.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        if (array_right_ans.equals("2")) {
                            Intent intent_quiz = new Intent(FifthQuestion.this, QuizFinish.class);
                            intent_quiz.putExtra("category", category);
                            startActivity(intent_quiz);
                            finish();
                        }
                        else{
                            wrong_answer.setAlpha(0f);
                            wrong_answer.setVisibility(View.VISIBLE);
                            wrong_answer.animate()
                                    .alpha(0.5f)
                                    .setDuration(400)
                                    .setListener(null);
                        }
                    }
                });

                button_option3.setOnClickListener(new View.OnClickListener() {
                    public void onClick(View v) {
                        if (array_right_ans.equals("3")) {
                            Intent intent_quiz = new Intent(FifthQuestion.this, QuizFinish.class);
                            intent_quiz.putExtra("category", category);
                            startActivity(intent_quiz);
                            finish();
                        }
                        else{
                            wrong_answer.setAlpha(0f);
                            wrong_answer.setVisibility(View.VISIBLE);
                            wrong_answer.animate()
                                    .alpha(0.5f)
                                    .setDuration(400)
                                    .setListener(null);
                        }
                    }
                });
            }

            if(category.equals(array_category)){
                counter++;
            }
        }
    }
    @Override
    public void onBackPressed() { }
}