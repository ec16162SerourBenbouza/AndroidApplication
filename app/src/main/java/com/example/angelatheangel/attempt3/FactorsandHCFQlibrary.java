package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class FactorsandHCFQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorsand_hcfqlibrary);

    }
    String expressionsquare="\u00B2";
    String incorrectanswer1= "2"+expressionsquare+"*3";
    String correctanswer1 ="2*3"+expressionsquare;
    String correctanswer2="90=2*5*3"+expressionsquare;
    private String mQuestions[] =
            {"The HCF of 30 and 45 is?",
                    "Write 18 as a product of its prime factors",
                    "Which is the correct representation of 19 as a product of its prime factors",
                    "The number x can be written as:3"+expressionsquare+"*5"+expressionsquare+"\n What is the square root of x?",
                    "What is the HCF of 14 and 20?"};

    private String mChoices[][] = {
            {"3", "25","15"},
            {"2*9", correctanswer1,incorrectanswer1},
            {"90=3*5*6", "90=5*9*2",correctanswer2},
            {"15", "7","30"},
            {"2", "4","6"}};

    private String mCorrectAnswers[] = {"15",correctanswer1, correctanswer2,"15","2"};

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
