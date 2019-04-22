package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class DirectproportionQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_directproportion_qlibrary);

    }
    private String mQuestions[] =
            {"It takes 45min to fill a 1000l pool from a single tap. A second tap is installed. How long will it take now?...",
                    "...If the second tap is now controlled to have half the flow of the first tap. How long will it take to fill the same pool using both taps?",
                    "Juice is made using a concentrate to water ratio of 1:7. To make 600ml of juice, how much water do we need?",
                    "John can lay 200 tiles a day. Juillete can lay them twice as fast. How long would it take them to lay 1200 tiles together?",
                    "The equation of a line is y=mx+c\n Is y directly proportional to x?"};

    private String mChoices[][] = {
            {"45min", "22.5min","25min"},
            {"45min", "30min","50min"},
            {"4.2l", "525ml","500ml"},
            {"3 days", "2 days","6 days"},
            {"Yes", "No","Maybe"}};

    private String mCorrectAnswers[] = {"22.5min", "30min", "525ml", "2 days", "No"};

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