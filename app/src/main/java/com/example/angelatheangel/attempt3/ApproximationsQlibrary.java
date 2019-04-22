package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class ApproximationsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_approximations_qlibrary);

    }
    String expressionroots = "\u221A";
    String expressiondivision = "\u2215";
    private String mQuestions[] =
            {"Find an approximate answer for (312*7.92)"+expressiondivision+"0.42",
                    "Find the estimate for "+expressionroots+"98",
                    "What is the approximate length of a football field",
                    "Approximately, what is the value of g, gravitational constant",
                    "Approximately how long does it take an Iphone X to charge? In hours"};

    private String mChoices[][] = {
            {"3000", "6000","5880"},
            {"9.9", "9","9.1"},
            {"50m", "100m","300m"},
            {"9", "10","9.9"},
            {"5", "4","6"}};

    private String mCorrectAnswers[] =
            {"6000",
                    "9",
                    "100m",
                    "10",
                    "4"};

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
