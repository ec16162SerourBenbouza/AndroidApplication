package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class ExponentialgraphsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exponentialgraphs_qlibrary);

    }
    private String mQuestions[] =
            {"The Domain of this graph is -infinity to ?",
                    "The range of this graph is(z,infinity) where z=?",
                    "Is this graph increasing or decreasing or other?",
                    "Can exponential graphs help with calculating bacteria growth with time?",
                    "Can exponential graphs have a base e?"};

    private String mChoices[][] = {
            {"6", "999","infinity"},
            {"5", "-5","0"},
            {"increasing", "decreasing","increasing then decreasing "},
            {"Yes", "No","Unsure"},
            {"Yes", "No","Unsure"}};

    private String mCorrectAnswers[] = {"infinity", "0", "decreasing", "Yes", "Yes"};

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
