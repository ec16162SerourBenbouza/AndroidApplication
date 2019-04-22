package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class PythagorasandareaoftrianglesQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pythagorasandareaoftriangles_qlibrary);

    }
    private String mQuestions[] =
            {"A triangle of sides 4cm and 9cm, find the length of its Hypotenuse",
                    "A triangle has sides of length 2cm and 2cm. What type of triangle is it?",
                    "A triangle has a side of length x, a side of length 9cm and a hypotenuse of length 10cm. Find x.",
                    "Find the Hypotenuse of a triangle with sides 4cm and 3cm.",
                    "Points A(1,2)and B(5,5) find the length of the line AB"};

    private String mChoices[][] = {
            {"11cm", "9.8cm","8.1cm"},
            {"Equilateral", "acute","Obtuse"},
            {"13.5cm", "1cm","4.4cm"},
            {"5cm", "7cm","2.6cm"},
            {"5.0", "5.2","2.8"}};

    private String mCorrectAnswers[] = {"9.8cm", "Equilateral", "4.4cm", "5cm", "5.0"};

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
