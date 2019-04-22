package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class InverseproportionQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integersandnegativenumbers_qlibrary);

    }
    String expressionroot="\u221A";
    String myq=expressionroot+"x";
    private String mQuestions[] =
            {"y is inversely proportional to x. It is known that y=20 when x=15. Find y when x=60",
                    "h is inversely proportional to the square of u. When u=6, h=3. Find u when h=27",
                    "a is inversely proportional to the square of d. When d=1,a=216. Find the values of a and d when a=d",
                    "When g=9 s=8. When g=100, s=?",
                    "y is inversely proportional tp:"+expressionroot+"x. When y=9, x=4.When X=36,y=? "};

    private String mChoices[][] = {
            {"5", "3","6"},
            {"2", "3","±2"},
            {"3", "6","4"},
            {"2.4", "2.2","2.3"},
            {"0.3", "3","0.2"}};

    private String mCorrectAnswers[] = {"5", "±2", "6", "2.4", "3"};

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
