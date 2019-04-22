package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class LinearequationsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linearequations_qlibrary);

    }

    private String mQuestions[] =
            {"What is the slope of the following line? 3x + 7y = 4",
                    "Re-write the following equation in y = mx + b form 6x + 4y = 2",
                    "Find the distance between the following two point: (-3, -2) and (1,1)",
                    "what is the x - intercept of the following equation? 6x + 9y = 12",
                    "Find the equation of the line containing the given point and slope (3,2); m= 4"};

    private String mChoices[][] = {
            {"3", "7","-3/7"},
            {"y = 3/2x + 6", "y = -3/2x + 6","4y = 6x +24"},
            {"5", "7","6"},
            {" (9,0)", "(-6,0)","(2,0)"},
            {"y = -4x -10", " y = -4x +10","y = 4x -10"}};

    private String mCorrectAnswers[] = {"-3/7", "y = -3/2x + 6", "5", "(2,0)", "y = 4x -10"};
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
