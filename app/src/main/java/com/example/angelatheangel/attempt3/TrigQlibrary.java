package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class TrigQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trig_qlibrary);

    }
    String expressionsquare="\u00B2";
    String wrongans1="a"+expressionsquare+"+b"+expressionsquare+"=c"+expressionsquare;
    String wrongans1b="cos=adj/hyp";
    String rightans1="a"+expressionsquare+"=b"+expressionsquare+"+c"+expressionsquare+"-2bcCosA";
    String wrongans2="sin=opp/hyp";
    String wrongans2b="a/sinA";
    String rightans2="(a/sinA)=(b/sinB)";
    private String mQuestions[] =
            {"What is the Cosine rule",
                    "What is the sine rule",
                    "The sine rule can be used when we have:",
                    "tan=",
                    "How do we remember the rules for Sin,Cos and Tan"};

    private String mChoices[][] = {
            {wrongans1, wrongans1b,rightans1},
            {rightans2, wrongans2,wrongans2b},
            {"two sides and an angle", "3 sides","3 angles"},
            {"opp/hyp", "opp/adj","opp/opp"},
            {"COS SIN TAN", "TOS SOC SIN","SOH CAH TOA"}};

    private String mCorrectAnswers[] = {rightans1, rightans2, "two sides and an angle", "opp/adj", "SOH CAH TOA"};

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
