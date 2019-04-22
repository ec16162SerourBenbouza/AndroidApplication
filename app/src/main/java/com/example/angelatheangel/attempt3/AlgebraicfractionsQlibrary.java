package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class AlgebraicfractionsQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebraicfractions_qlibrary);

    }
    String expression = "\u00B2";   //unicode for squared notation stored in a string variable
    String expressiondivision = "\u2215";   //unicode for division sign stored in a string variable
    String expressionfractionhalf ="\u00BD";    //unicode for ½  stored in a string variable


    String myexpression = "5x"+expressiondivision+"2";
    String myexpression1 = "(x-4)"+expressiondivision+"2";
    String myexpression3 = "x(x-4)"+expressiondivision+"2x";
    String myexpression4 = "(3-x)"+expressiondivision+"(3+x)";
    String myexpression5 = "(x-1)"+expressiondivision+"x";
    private String mQuestions[] =       // String array for questions
            {"5x"+ expression +expressiondivision+"2x",     //first question
                    "x"+expression+"-4x"+expressiondivision+"2x",   // second question
                    "(9-x"+expression+")"+expressiondivision+"(x+3)"+expression,
                    "x"+expression+"-1"+expressiondivision+"x"+expression+"+x",
                    "What do we look for to simplify algebraic fractions?"};
    private String mChoices[][] = {     //String matrix for multiple choices per question
            {myexpression,"2x","2.5x"}, //options for question 1
            {myexpression1,myexpression3,"x+2"},
            {myexpression4, "(3+x)/(3-x)","3"},
            {"x", myexpression5,"(x+1)/x"},
            {"Common Multiple", "Common Factor","Both"}};
    private String mCorrectAnswers[] =  //String array for correct answers of all 5 questions
            {myexpression, myexpression1,myexpression4, myexpression5, "Both"};

    public String getQuestion (int a){  //public method which returns string
        String question = mQuestions[a];    //stores question with index array a into variable called question
        return question;                //returns the question
    }

    public String getChoice1 (int a){   //public method which returns string
        String choice0 = mChoices[a][0];    //stores choice with location in matrix position 0 on row a
        return choice0;                 //returns the choice
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
