package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class ConversiongraphsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversiongraphs_qlibrary);

    }
    private String mQuestions[] =
            {"What is the name of the graph above",
                    "What does the graph convert to and from",
                    "What type of line is shown on the graph?",
                    "10 Pounds=x Kilograms. Find x",
                    "5.5 kilograms= y Pounds"};

    private String mChoices[][] = {
            {"histogram", "Conversion Graph","Exponential Graph"},
            {"Pounds->Kilograms", "Kilograms->Pounds","Pounds->Kilograms and vice versa"},
            {"Quadratic", "Exponential","Linear"},
            {"4.5 ", "5","4"},
            {"11", "12","11.5"}};

    private String mCorrectAnswers[] = {"Conversion Graph", "Pounds->Kilograms and vice versa", "Linear", "4.5", "12"};

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
