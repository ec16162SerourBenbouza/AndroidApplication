package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class CollectingliketermsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collectingliketerms_qlibrary);

    }
    private String mQuestions[] =
            {"4x+8+3x",
                    "7w−5−2w",
                    "6x−8y−3x+22y−4x",
                    "3b+(2b−3)",
                    "5n+2m+1"};

    private String mChoices[][] = {
            {"7x+8", "4(x+2)+3x","15x"},
            {"5w-5", "5(w-1)","9w-5"},
            {"14y-x", "-x+13y","-14y-x"},
            {"b-3", "5b-3","6b-9"},
            {"5n+2m+1", "7nm+1","5n+3m"}};

    private String mCorrectAnswers[] = {"7x+8", "5w-5", "14y-x", "5b-3", "5n+2m+1"};

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
