package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class QuadraticgraphsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadraticgraphs_qlibrary);

    }
    String expressionsquare="\u00B2";
    private String mQuestions[] =
            {"Is the gradient of this curve +ve or -ve?",
                    "The curve has a positive gradient, then a gradient of 0 then a negative gradient",
                    "The point where the gradient is 0 is a turning point",
                    "This curve has two roots",
                    "This is a quadratic graph with a x"+expressionsquare+"equation"};

    private String mChoices[][] = {
            {"positive", "negative","both and even 0 at a point"},
            {"True", "False","Unsure"},
            {"True", "False","Unsure"},
            {"True", "False","Unsure"},
            {"True", "False","Unsure"}};

    private String mCorrectAnswers[] = {"both and even 0 at a point", "True", "True", "True", "False"};

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
