package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class FactorisingQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorising_qlibrary);

    }
    String expressionsquare="\u00B2";
    private String mQuestions[] =
            {"Factorise the following\n 2x"+expressionsquare+"-5x-3",
                    "16x"+expressionsquare+"-25",
                    "Factorise 6x"+expressionsquare+"-6",
                    "Factorise 2x"+expressionsquare+"+3x-5",
                    "Factorise the following expression\n4x"+expressionsquare+"+24x+36"};

    private String mChoices[][] = {
            {"(2x-3)(x+1)", "(2x-1)(x-3)","(2x+1)(x-3)"},
            {"(16x-5)(x+5)", "(4x-5)(4x+5)","(4x-5)(4x-5)"},
            {"(6x-6)(x+1)", "(3x+2)(2x+3)","6(x+1)(x-1)"},
            {"(2x-5)(x+1)", "(2x+5)(x-1)","(2x+1)(x-5)"},
            {"(2x-4)(2x+9)", "4(x+3)(x-3)","4(x+3)(x+3)"}};

    private String mCorrectAnswers[] = {"(2x+1)(x-3)", "(4x-5)(4x+5)", "6(x+1)(x-1)", "(2x+5)(x-1)", "4(x+3)(x+3)"};

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
