package com.example.cardquizgame;

import androidx.appcompat.app.AppCompatActivity;

public class MQuests {

    private String mQuestions []= {
            "What is this app creators name:",
            "At what Age do you get your license?",
            "What is 2 + 2",
            "At what age do you start college",

    };

    private String mChoices [][] = {
            {"Allen", "Alex", "Andy"},
            {"16", "17", "21"},
            {"12", "7", "4"},
            {"18", "15", "25"}
    };

    private  String mRightAnswers [] = {"Allen", "16", "4", "18"};


    public String getQuestions(int a) {
        String question = mQuestions [a];
        return question;
    }

    public String getChoice1(int a){
        String mchoice1 = mChoices[a][0];
        return mchoice1;
    }

    public String getChoice2(int a){
        String mchoice2 = mChoices[a][1];
        return mchoice2;
    }

    public String getChoice3(int a){
        String mchoice3 = mChoices[a][2];
        return mchoice3;
    }

    public String getRightAnswer(int a){
        String answer = mRightAnswers[a];
        return answer;
    }
}

