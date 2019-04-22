package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class DecimalsandroundingQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodmasandoperations_qlibrary);

    }
    private String mQuestions[] =
            {"Round 0.1278 to the nearest thousandth",
                    "Round 7.1093 to the nearest hundredth",
                    "Round 13.0112 to the nearest tenth",
                    "Round 61.5365 to the nearest thousandth",
                    "Round 45.3267 to the nearest thousandth"};

    private String mChoices[][] = {
            {"0.127", "0.126","0.128"},
            {"7.10", "7.11","7.19"},
            {"13", "13.0","13.3"},
            {" 61.537", "61.538","61.535"},
            {"45.327", "45.323","45.325"}};

    private String mCorrectAnswers[] = {"0.128", "7.11", "13.0", " 61.537", "45.327"};

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
