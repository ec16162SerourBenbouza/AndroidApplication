package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class FractionsandpercentagesQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fractionsandpercentages_qlibrary);

    }

    private String mQuestions[] =
            {"A store is offering products at 80% off, which is true:",
                    "Write 0.2 as a faction in its simplest form",
                    "What is 4% as a fraction?",
                    "What is the current VAT percentage?",
                    "If the VAT is 25, can we say that approximately 1/4 of the cost is a tax?"};

    private String mChoices[][] = {
            {"To find the new cost, multiply by 0.8", "To find the new cost, divide by 0.8","The products are a dupe"},
            {"2/100", "2/10","1/5"},
            {"4/100", "2/50","1/25"},
            {"17.7", "20","25"},
            {"Yes", "No","Not a 1/4"}};

    private String mCorrectAnswers[] = {"To find the new cost, multiply by 0.8", "1/5", "1/25", "20", "Yes"};

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

