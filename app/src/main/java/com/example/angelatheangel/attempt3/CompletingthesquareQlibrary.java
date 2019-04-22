package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class CompletingthesquareQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_completingthesquare_qlibrary);

    }
    String expressionsquare="\u00B2";
    String expressionroot="\u221A";
    String wronganswer1="2(2x+4)"+expressionsquare+"-21";
    String wronganswer1b="4(x+8)"+expressionsquare+"-53";
    String rightanswer1="4(x+4)"+expressionsquare+"-53";
    String rightanswer2="4x"+expressionsquare+"+24x+38=0";
    String wronganswer2="4x"+expressionsquare+"+32x+11=0";
    String wronganswer2b="4x"+expressionsquare+"+48x+35=0";
    String wronganswer3="(x+5)"+expressionsquare+"+24";
    String rightanswer3="(x-5)"+expressionsquare+"-24";
    String wronganswer3b="(x-5)"+expressionsquare+"+26";
    String wronganswer4=expressionroot+"23 +6";
    String wronganswer4b=expressionroot+"23 -6";
    String rightanswer4=expressionroot+"13 -6";

    private String mQuestions[] =
            {"Write the function 4x"+expressionsquare+"+32x+11 in the form of p(x+q)"+expressionsquare+"+r",
                    "Completing the square is helpful to find:",
                    "By completing the square find which of the following equations has no roots",
                    "Write the function x"+expressionsquare+"-10x+1=0 in the form of p(x+q)"+expressionsquare+"+r",
                    "x"+expressionsquare+"+12x+13=0\n Solve in the form of "+expressionroot+"p +q"};

    private String mChoices[][] = {
            {wronganswer1, rightanswer1,wronganswer1b},
            {"The roots", "The intercept","The turning points"},
            {wronganswer2, wronganswer2b,rightanswer2},
            {wronganswer3, rightanswer3,wronganswer3b},
            {rightanswer4, wronganswer4,wronganswer4b}};

    private String mCorrectAnswers[] = {rightanswer1, "The roots", rightanswer2, rightanswer3, rightanswer4};

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

