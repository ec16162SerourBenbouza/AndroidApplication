package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class QuadraticequationsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadraticequations_qlibrary);

    }
    String expressionsquare="\u00B2";

    private String mQuestions[] =
            {"Solve this equation\n 3x"+expressionsquare+"=9-6x",
                    "x"+expressionsquare+"+4x+4=0\n Solve for x",
                    "x"+expressionsquare+"+6x-7=0\n Solve for x",
                    "2y"+expressionsquare+"+6y+20\n Solve for y",
                    "z"+expressionsquare+"+7z-18=0\n Solve for z"};

    private String mChoices[][] = {
            {"x=3 and x=-1", "x=-3 and x=1","x=3 and x=1"},
            {"x=2", "x=4","x=-2"},
            {"x=-1 and x=7", "x=1 and x=7 ","x=-1 and x=-7"},
            {"y=2 and y=-5", "y=-2 and y=5","y=-2 and y=-5"},
            {"z=-2 and z=9", "z=2 and z=-9","z=2 and z=9"}};

    private String mCorrectAnswers[] = {"x=-3 and x=1", "x=-2", "x=-1 and x=-7", "y=-2 and y=5", "z=2 and z=-9"};

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
