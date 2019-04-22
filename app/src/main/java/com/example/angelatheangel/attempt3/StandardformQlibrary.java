package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class StandardformQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standardform_qlibrary);

    }
    String expression5="\u2075";
    String expression6="\u2076";
    String expression4="\u2074";

    String expressioncube="\u00B3";
    String expressionnegative1="\u207B"+"\u00B9";
    String expressionnegative3="\u207B"+"\u00B3";
    String expressionsquare="\u00B2";
    String wrongans1="1.33*10"+expressionsquare;
    String wrongans1b="7.5*10"+expressionsquare;
    String rightans1="7.5*10"+expressioncube;
    String wrongans2="5.3*10"+expressionsquare;
    String rightans2="5.3*10"+expressionnegative3;
    String wrongans2b="5.3*10"+expressioncube;
    String wrongans3="8*10"+expressionsquare;
    String wrongans3b="1.6*10"+expressioncube;
    String rightans3="1.6*10"+expression4;

    private String mQuestions[] =
            {"A rocket travels at 8*10"+expression5+"km/hr. It travels to the moon which is 4*10"+expression5+"km away. How long will it take in hours",
                    "Evaluate (6*10"+expressioncube+")/(8*10"+expressionnegative1+")",
                    "Write 0.0053 in standard form",
                    "A square has a side of 4*10"+expressionsquare+". What is its area in standard form?",
                    "Which of these equals 5*10"+expression6};

    private String mChoices[][] = {
            {"500", "320000000","0.5"},
            {wrongans1, wrongans1b,rightans1},
            {wrongans2, rightans2,wrongans2b},
            {rightans3, wrongans3,wrongans3b},
            {"0.00005", "5000000","0.0000005"}};

    private String mCorrectAnswers[] = {"0.5", rightans1, rightans2, rightans3, "5000000"};

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
