package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class Shapes2D3DQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes2_d3_dqlibrary);

    }
    private String mQuestions[] =
            {"A square is to a cube what a .... is to a cuboid",
                    "the cross section of a pyramid is ",
                    "An octagon has x sides. Find x",
                    "Many shapes can be combined to produce...",
                    "A square has how many edges and sides?"};

    private String mChoices[][] = {
            {"triangle", "angle","rectangle"},
            {"triangle", "angle","rectangle"},
            {"9", "6","8"},
            {"Angles", "complex shapes","circles"},
            {"3 and 3", "4 and 4","3 and 4"}};

    private String mCorrectAnswers[] = {"rectangle", "triangle",
            "8", "complex shapes", "4 and 4"};

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
