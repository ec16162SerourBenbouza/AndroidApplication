package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class VectorsandproofsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vectorsandproofs_qlibrary);

    }
    private String mQuestions[] =
            {"A vector always have direction and magnitude",
                    "Which of the following is a vector",
                    "A quantity with just a magnitude is called a",
                    "Which of these is a vector",
                    "Can vectors be combined to show an overall vector?"};

    private String mChoices[][] = {
            {"True", "False","Unsure"},
            {"Distance", "Speed","acceleration"},
            {"vector", "value","scalar"},
            {"a", "-a","Both"},
            {"Yes", "No","Maybe"}};

    private String mCorrectAnswers[] = {"True", "acceleration", "scalar", "Both", "Yes"};

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
