package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class AnglepropertiesQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_angleproperties_qlibrary);

    }
    private String mQuestions[] =
            {"Parallel lines never...?",
                    "Which of the following is a type of angles?",
                    "Angles in a triangle add up to ",
                    "How many lines of symmetry does a rectangle have?",
                    "Polygons have angle properties too"};

    private String mChoices[][] = {
            {"Reflect", "Refract","Cross"},
            {"Alternative", "Alternate","Vertical"},
            {"270", "90","180"},
            {"3", "2","1"},
            {"True", "False","Unsure"}};

    private String mCorrectAnswers[] = {"Cross",
            "Alternate",
            "180",
            "2",
            "True"};

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

