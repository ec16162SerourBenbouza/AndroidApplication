package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class AlgebraicproofQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebraicproof_qlibrary);

    }
    String expression ="\u215B";
    String expressioncube="\u00B3";
    String expressionsquare="\u00B2";
    private String answer2="2a"+expressioncube+"2a"+expressionsquare;
    private String answer3="2a"+expressionsquare+"(a+1)";
    private String answer4="4a"+expressioncube;
    private String answer5="n"+expressionsquare; //n2
    private String answer6="(n+2)"+expressionsquare; //(n+2)2
    private String answer7="(n+1)"+expressionsquare; //(n+1)2 correct
    private String answer7right = answer5+"and "+answer7;
    private String mQuestions[] =
            {"Prove the simplest form of the following equation:"+expression+"(4n+1)(n+8)-"+expression+"n(4n+1)",
                    "A rectangle of sides a"+expressioncube+" and a"+expressionsquare+". Prove its perimeter algebraically",
                    "Which of the following represents two consecutive square numbers where n is a positive integer?",
                    "For the equation a"+expressionsquare+"=25. The only value that a can hold is 5" ,
                    "If my rectangle has a perimeter of 2a+2b , what is its area?"};

    private String mChoices[][] = {
            {"4n+1", "n+1","n+8"},
            {answer2, answer3,answer4},
            {answer5+"and "+expressionsquare+"+2", answer5+"and "+answer6 ,answer7right},
            {"True", "False","Unsure"},
            {"a+b", "ab","2(a+b)"}};

    private String mCorrectAnswers[] = {"4n+1", answer3 , answer7right, "False", "ab"};

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
