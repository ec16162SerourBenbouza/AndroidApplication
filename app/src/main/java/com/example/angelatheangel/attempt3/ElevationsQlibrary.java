package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class ElevationsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elevations_qlibrary);

    }
    private String mQuestions[] =
            {"Which of the following contributes to elevations ",
                    "Sine rule and Cosine rules are ",
                    "Pythagoras is used on ....",
                    "Elevations are resolved into ...",
                    "Can elevations be related to forces?"};

    private String mChoices[][] = {
            {"Angles", "pavements","None of the above"},
            {"used to resolve elevations", "too difficult","the same rule"},
            {"rectangles", "triangles","neither"},
            {"wrong and right", "vertical and horizontal","Just vertical"},
            {"Yes", "No","Maybe"}};

    private String mCorrectAnswers[] = {"Angles", "used to resolve elevations", "triangles", "vertical and horizontal", "Yes"};

    public String getQuestion (int a){
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1 (int a) {
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
