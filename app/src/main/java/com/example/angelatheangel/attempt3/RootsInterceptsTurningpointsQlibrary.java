package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class RootsInterceptsTurningpointsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_roots_intercepts_turningpoints_qlibrary);

    }
    private String mQuestions[] =
            {"The roots of a graph are",
                    "The intercepts are found at",
                    "In a quadratic graph there are(is) ... turning point(s)",
                    "From the equation on a line/curve, can we find:",
                    "A turning point can have a gradient of 0"};

    private String mChoices[][] = {
            {"Where a graph meets the y axis", "Where a graph meets the x axis","Where a graph hits 0"},
            {"The x-axis", "The y-axis","Both"},
            {"1", "2","3"},
            {"The roots", "The intercept","Both and more"},
            {"True", "False","Unsure"}};

    private String mCorrectAnswers[] = {"Where a graph meets the x axis", "Both", "1", "Both and more", "True"};

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
        String choice2 = mChoices[a][1];
        return choice2;
    }
    public String getCorrectAnswers (int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }



}
