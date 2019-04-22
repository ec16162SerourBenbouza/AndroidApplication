package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class AlgebraiexpressionsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebraiexpressions_qlibrary);

    }
    String expression ="\u215B";
    String expressioncube="\u00B3";
    String expressionsquare="\u00B2";
    private String Q3right="";
    private String Q4right="";
    private String Q5right="";
    private String mQuestions[] =
            {"The sum of two numbers is s. The two numbers are denoted using p and q. Which of the following represents s",
                    "Martin is twice as old as his baby brother Eric. If Eric is x months old. How old is martin ",
                    "Mr Hill's house is worth x pounds. His brother, Dr Hill's house is worth y pounds. The equation x-y represents what?",
                    "A company hires tents for £25 a day plus a one off charge of £10. Teddy hired a tent for d days. How much will he pay in total? ",
                    "The product of x, y and z is p. What is p equal to?"};

    private String mChoices[][] = {
            {"s=q/p", "s=pq","s=p+q"},
            {"x", "x+2","2x"},
            {"The difference in the age of the houses ", "The difference in the brother's ages ","The difference in the value of the houses"},
            {"10+25d", "10d+25","5(2+5d)"},
            {"p=x+y+z", "p=(x+y)z","p=xyz"}};

    private String mCorrectAnswers[] = {"s=p+q", "2x", "The difference in the value of the houses", "5(2+5d)", "p=xyz"};

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
