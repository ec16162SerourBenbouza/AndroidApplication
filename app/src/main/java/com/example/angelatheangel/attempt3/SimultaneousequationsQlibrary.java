package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class SimultaneousequationsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simultaneousequations_qlibrary);

    }
    private String mQuestions[] =
            {"A farmer owns pigs p and geese g thus a total of 21 heads and 74 legs.How many p and g are there?",
                    "Solve for x and y\nx+y=4 and y=2x+10",
                    "Three chews c and four bubblies b cost 72p.Five chews and 2 bubblies cost 64p. So... ",
                    "Solve: x+3y=13\nx-y=5",
                    "Solve the following\n 3m-6b=-10 and 11m-9b=-41"};

    private String mChoices[][] = {
            {"p=5 and g=16", "p=16 and g=5","p=10 and g=15"},
            {"x=-2 and y=6", "x=-2 and y=-6","x=2 and y=-6"},
            {"4b=72-3c and 5c+2b=64", "3c+4b=72 and 2b-5c=64","72=-3c-4b and 2b-5c=64"},
            {"x=-2 and y=-7", "x=-2 and y=7","x=-2 and y=7"},
            {"m=-4 and b=1/3", "m=-4 and b=-1/3","m=4 and b=-1/3"}};

    private String mCorrectAnswers[] = {"p=16 and g=5", "x=-2 and y=6", "4b=72-3c and 5c+2b=64", "x=-2 and y=7", "m=4 and b=-1/3"};

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
