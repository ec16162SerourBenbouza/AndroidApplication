package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class ReallifegraphsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reallifegraphs_qlibrary);

    }
    private String mQuestions[] =
            {"When does the graph show the first 0 gradient ",
                    "The graph shows the fastest velocity starting at which time?",
                    "The gradient of the graph shows the",
                    "The stage of the journey where the graph is flat shows",
                    "After 12 min how far has the person moved"};

    private String mChoices[][] = {
            {"3-6min", "7min","2-6min"},
            {"10min", "8min","12min"},
            {"acceleration", "speed","velocity"},
            {"stationary phase", "parked phase","not moving phase"},
            {"700", "600","500"}};

    private String mCorrectAnswers[] = {"2-6min",
            "12min",
            "speed",
            "stationary phase",
            "600"};

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
