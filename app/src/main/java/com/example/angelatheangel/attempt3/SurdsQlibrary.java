package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class SurdsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surds_qlibrary);

    }
    String expressionroot="\u221a";
    String incorrectanswer1=expressionroot+"(2/3)";
    String correctanswer2= "5"+expressionroot+"30";
    String incorrectanswer2="7.5"+expressionroot+"10";
    String incorrectanswer3=expressionroot+"(xy)";
    String incorrectanswer3b="x/"+expressionroot+"y";
    String correctanswer3=expressionroot+"(x/y)";
    String finalanswer=expressionroot+"5";

    private String mQuestions[] =
            {"Calculate :("+expressionroot+"3/"+expressionroot+"2)/("+expressionroot+"2/"+expressionroot+"3)",
                    expressionroot+"750 in its simplest form",
                    expressionroot+"x/"+expressionroot+"y is equal to?",
                    expressionroot+"b is a surd where b is an integer of values 0<b<10.\nHow many different values can b have?",
                    "("+expressionroot+"15*"+expressionroot+"35)/"+expressionroot+"21 is equivalent to ?"};

    private String mChoices[][] = {
            {"2/3", incorrectanswer1,"3/2"},
            {"27", correctanswer2,incorrectanswer2},
            {correctanswer3, incorrectanswer3,incorrectanswer3b},
            {"6", "7","8"},
            {"25", "5",finalanswer}};

    private String mCorrectAnswers[] = {"3/2", correctanswer2, correctanswer3, "7", "25"};

    public String getQuestion (int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1 (int a){
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public String getChoice2 (int a){
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3 (int a){
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getCorrectAnswers (int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }



}
