package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class ExpandingbracketsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expandingbrackets_qlibrary);

    }
    String expressionsquare="\u00B2";
    String wrongans1="9"+expressionsquare+"-10m";
    String rightans1="18m"+expressionsquare+"-21m";
    String rightans2="x"+expressionsquare+"+x-12";
    String wrongans2="x"+expressionsquare+"-x-12";
    String wrongans2b="x"+expressionsquare+"+x+1";
    String wrongans3="x"+expressionsquare+"+10x+10";
    String wrongans3b="x"+expressionsquare+"+10x+7";
    String rightans3="x"+expressionsquare+"+7x+10";
    String wrongans4="x"+expressionsquare+"-2";
    String wrongans4b="2x"+expressionsquare;
    String rightans4="x"+expressionsquare+"-2x";
    private String mQuestions[] =
            {"Expand 3m(6m-7)",
                    "Expand and simplify\n(x-3)(x+4)",
                    "Expand and simplify\n(x+2)(x+5)",
                    "Expand x(x-2)",
                    "Expand and simplify\n x(y-3)+y(4-x)"};

    private String mChoices[][] = {
            {"9m-4", wrongans1,rightans1},
            {wrongans2, rightans2,wrongans2b},
            {rightans3, wrongans3,wrongans3b},
            {wrongans4, rightans4,wrongans4b},
            {"2xy-3x-4y", "4y-3x","3x+4y"}};

    private String mCorrectAnswers[] = {rightans1, rightans2, rightans3, rightans4, "4y-3x"};

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
