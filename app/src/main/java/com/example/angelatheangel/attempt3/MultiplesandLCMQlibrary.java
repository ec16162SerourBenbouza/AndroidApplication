package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/


public class MultiplesandLCMQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multiplesand_lcmqlibrary);

    }
    private String mQuestions[] =
            {"What is the LCM of 10 and 12",
                    "X=abc and Y=bde, What is the LCM of X and Y",
                    "Which of these is a multiple of 24?",
                    "2 is the lowest multiple of all even numbers",
                    "Kevin is payed £8.20 an hour, which of these is a likely payment that he may receive after a shift"};

    private String mChoices[][] = {
            {"2", "5","3"},
            {"a", "b","e"},
            {"12", "48","30"},
            {"True", "False","Unsure"},
            {"25.2", "34.5","43"}};

    private String mCorrectAnswers[] = {"2", "b", "48", "True", "43"};

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
