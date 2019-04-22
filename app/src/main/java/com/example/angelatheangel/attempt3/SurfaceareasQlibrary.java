package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class SurfaceareasQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surfaceareas_qlibrary);

    }
    String expressionpi="\u03a0";
    String expressionsquared="\u00b2";
    String mywrongans1="2(hr"+expressionpi+"+"+expressionpi+"r"+expressionsquared+")";
    String mywrongans2= expressionpi+"hr"+expressionsquared;
    String myrightans="2r"+expressionpi+"(h+r)";
    private String mQuestions[] =
            {"My cuboid has sides of l and w and a height of h. What is its surface area?",
                    "What is the surface area of a can of tomatoes, radius r and height h",
                    "The surface area of a prism is the total area of its...",
                    "Is a triangular prism half a cuboid?",
                    "To calculate the surface area of a triangular prism, we half that of a cuboid"};

    private String mChoices[][] = {
            {"lwh", "2(wh+lw+lh)","2hw+2wh+2lh"},
            {mywrongans1, mywrongans2,myrightans},
            {"sides", "angles","faces"},
            {"Yes", "No","Depends how you look at it"},
            {"True", "False","Unsure"}};

    private String mCorrectAnswers[] = {"2(wh+lw+lh)", myrightans, "faces", "Yes", "False"};

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
