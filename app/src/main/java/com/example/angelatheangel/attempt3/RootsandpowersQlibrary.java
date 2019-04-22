package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class RootsandpowersQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rootsandpowers_qlibrary);

    }
    String expressionsquare="\u00B2";
    String expression5="\u2075";
    String expression6="\u2076";
    String expression4="\u2074";
    String expressionroot="\u221A";
    String expressioncube="\u00B3";
    String expressionnegative1="\u207B"+"\u00B9";
    String expressionnegative3="\u207B"+"\u00B3";
    String expressionnegative2="\u207B"+"\u00B2";
    String expression8="\u2078";
    String expression9="\u2079";

    String wrongans1="x"+expression8;
    String wrongans1b="x"+expression9;
    String rightans1="3x"+expression4;
    String wrongans2="6"+expression9;
    String rightans2="36x"+expression9;
    String wrongans2b="36x"+expression5;
    String wrongans3=expressionroot+"2 * "+expressionroot+"10";
    String rightans3="2"+expressionroot+"5";
    String wrongans4=expressionroot+"ab";
    String wrongans4b=expressionroot+"a";
    String rightans4=expressionroot+"b";
    private String mQuestions[] =
            {"Simplify 6"+expressionnegative2,
                    "What is the perimeter of an equilateral triangle of side length x"+expression4,
                    "Find the correct answer when simplifying (6"+expression5+")*(6"+expression4+")",
                    expressionroot+"20 is exactly equivalent to which of the following ",
                    "Which is equal to ("+expressionroot+"(ab))/"+expressionroot+"a?"};

    private String mChoices[][] = {
            {"1/36", "12","-36"},
            {rightans1, wrongans1,wrongans1b},
            {rightans2, wrongans2,wrongans2b},
            {"4", wrongans3,rightans3},
            {rightans4, wrongans4b,wrongans4}};

    private String mCorrectAnswers[] = {"1/36",rightans1, rightans2, rightans3, rightans4};

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
