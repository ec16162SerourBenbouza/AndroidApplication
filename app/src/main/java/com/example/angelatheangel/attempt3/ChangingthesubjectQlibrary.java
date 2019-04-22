package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class ChangingthesubjectQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changingthesubject_qlibrary);

    }
    String expressionsquare="\u00B2";
    String expressioncube="\u00B3";
    String expressionroot="\u221A";

    String wrongans1="v+u"+expressionsquare+"+2a=s";
    String wrongans2="v"+expressionsquare+"-u"+expressionsquare+"=2as";
    String rightans="(v"+expressionsquare+"-u"+expressionsquare+")/2a=s";
    String wrongans3="d=3h";
    String wrongans4="d"+expressioncube+"=3h";
    String rightans2="1/3d"+expressionsquare+"=h";
    private String mQuestions[] =
            {"Make c the subject of the formula\n 4a=3c–4",
                    "Make t the subject of the formula D=ut+kt"+expressionsquare,
                    "Make s the subject of the equation v"+expressionsquare+"= u"+expressionsquare+"2+2as",
                    "m=5n–21\nMake n the subject",
                    "d="+expressionroot+"(3h)\n Make h the subject"};

    private String mChoices[][] = {
            {"4a-4=3c", "4/3(a-4)=c","4/3(a+1)=c"},
            {"D-u=t+kt", "D=t(u+k)","t=D/(u+k)"},
            {wrongans1, wrongans2,rightans},
            {"(m-21)/5=n", "n=(m+21)/5","n=5(m+21)"},
            {wrongans3, rightans2,wrongans4}};

    private String mCorrectAnswers[] = {"4/3(a+1)=c", "t=D/(u+k)", rightans, "n=(m+21)/5", rightans2};

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
