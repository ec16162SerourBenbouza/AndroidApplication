package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class LineargraphsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineargraphs_qlibrary);

    }

    private String mQuestions[] =
            {"Is x and y directly proportional?",
                    "How can we tell if the graph is directly proportional?",
                    "What is the y-intercept of the graph",
                    "Which of these could be the x-intercept?",
                    "Which of these can be the equation of this line?"};
    private String mChoices[][] = {
            {"True", "False","Cannot tell"},
            {"Is a straight line", "Goes through (0,0)","We get told"},
            {"2", "(0,2)","(2,0)"},
            {"-4", "(-5,0)","(-9,0)"},
            {"y=0.25x+2", "y=3x+4","7y=x+2"}};

    private String mCorrectAnswers[] = {"False", "Goes through (0,0)", "(0,2)", "(-5,0)", "y=0.25x+2"};

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
