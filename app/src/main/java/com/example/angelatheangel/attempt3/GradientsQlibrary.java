package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class GradientsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gradients_qlibrary);

    }
    private String mQuestions[] =
            {"What kind of line is  y=6?",
                    "What kind of line is x=-5",
                    "What is the equation of the line that goes through points (0,0),(1,3),(2,6)?",
                    "What's the gradient of a line whose equation is y=7x-3",
                    "What's the value of y when the line  y=5x-2 intersects the y-axis"};

    private String mChoices[][] = {
            {"Horizontal", "Vertical","Diagonal"},
            {"Horizontal", "Vertical","Diagonal"},
            {"y=3", "x=3y","y=3x"},
            {"3", "7","-3"},
            {"2", "-2","5"}};

    private String mCorrectAnswers[] = {"Horizontal", "Vertical", "y=3x", "-3", "-2"};

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
