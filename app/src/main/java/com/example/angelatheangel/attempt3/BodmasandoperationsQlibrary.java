package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/
public class BodmasandoperationsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodmasandoperations_qlibrary);

    }
    String expressionroots = "\u221A";
    String expressionsquare = "\u00B2";
    String expressionbox= "\u2610";
    String correctanswer1= "8*7+(4-10)"+expressionsquare+"=92";

    private String mQuestions[] =
            {"\u221A(2*8)"+"*4 equals?",
                    "3-2"+expressionsquare+"*5 is equal to?",
                    "Which statement is correct?",
                    "What is Y?\n"+"(8*Y)+(1-0)"+expressionsquare+"=25",
                    "What does M stand for in bodmas?"};

    private String mChoices[][] = {
            {"24", "8","16"},
            {"-17", "37","-25"},
            {"8*7+4-10"+expressionsquare+"=92",
                    "(8*7)+4-10"+expressionsquare+"=92",
                    correctanswer1},
            {"4", "5","3"},
            {"Mode", "Mean","Multiplication"}};

    private String mCorrectAnswers[] = {"16", "-17",correctanswer1, "3", "Multiplication"};

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