package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class AreaundergraphsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaundergraphs_qlibrary);

    }
    private String mQuestions[] =
            {"The area under the graph can usually be worked out using...",
                    "In a velocity-time graph the area under the graph represents",
                    "My velocity-time graph is below the x-axis. This means...",
                    "The area under an acceleration-time graph represents...",
                    "The steeper the line, the bigger the area under the graph"};

    private String mChoices[][] = {
            {"Areas of shapes", "Integration","Both depending on the shape"},
            {"distance covered", "acceleration","Speed*time"},
            {"My distance is negative", "My Displacement is away from a position","Must be wrong"},
            {"The displacement", "Change in speed","Change in velocity"},
            {"True", "False","Depends"}};

    private String mCorrectAnswers[] = {"Both depending on the shape",
            "distance covered",
            "My Displacement is away from a position",
            "Change in velocity", "Depends"};

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
