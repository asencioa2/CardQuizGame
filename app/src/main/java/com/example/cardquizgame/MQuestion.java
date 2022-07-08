package com.example.cardquizgame;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MQuestion extends AppCompatActivity{

    private MQuests mQuestions = new MQuests();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button multipleChoice1;
    private Button multipleChoice2;
    private Button multipleChoice3;
    Button next;

    private String mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mquest);

        next = findViewById(R.id.next);
        mScoreView = findViewById(R.id.grade);
        mQuestionView = findViewById(R.id.quest);
        multipleChoice1 = findViewById(R.id.mchoice1);
        multipleChoice2 = findViewById(R.id.mchoice2);
        multipleChoice3 = findViewById(R.id.mchoice3);

        updateQuestion();

        multipleChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (multipleChoice1.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(MQuestion.this, "correct", Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText(MQuestion.this, "incorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        multipleChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (multipleChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText(MQuestion.this, "correct", Toast.LENGTH_SHORT).show();
                }

                else {
                    Toast.makeText( MQuestion.this, "incorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        multipleChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                if (multipleChoice3.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();

                    Toast.makeText( MQuestion.this, "correct", Toast.LENGTH_SHORT).show();

                }

                else {
                    Toast.makeText( MQuestion.this, "incorrect", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View vi) {
                Intent i = new Intent(MQuestion.this, OEQuest.class);
                startActivity(i);
            }
        });
    }



    private void updateQuestion(){
        mQuestionView.setText(mQuestions.getQuestions(mQuestionNumber));
        multipleChoice1.setText(mQuestions.getChoice1(mQuestionNumber));
        multipleChoice2.setText(mQuestions.getChoice2(mQuestionNumber));
        multipleChoice3.setText(mQuestions.getChoice3(mQuestionNumber));

        mAnswer = mQuestions.getRightAnswer(mQuestionNumber);
        mQuestionNumber++;
    }

    @SuppressLint("SetTextI18n")
    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }


}

