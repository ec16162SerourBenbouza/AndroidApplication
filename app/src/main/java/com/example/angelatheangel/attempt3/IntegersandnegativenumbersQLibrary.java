package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class IntegersandnegativenumbersQLibrary extends AppCompatActivity{ //default constructor
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integersandnegativenumbers_qlibrary);

    }
    private String mQuestions[] =       //string array to store all questions on private so it cannot be changed
            {"-9/3", "-15/-3", "-12*5", "14/-2", "-7*-7"};

    private String mChoices[][] = { //string array to store all answers on private so it cannot be changed
            {"-3", "3","None of the above"}, {"5", "-5","-3"}, {"-60", "60","7"}, {"-7", "7","1"}, {"-49", "49","1"}};

    private String mCorrectAnswers[] = {"-3", "5", "-60", "-7", "49"};  //sting array to store all correct answers on private so it cannot be changed

    public String getQuestion (int a){  //function to get question and return it.
        String question = mQuestions[a];
        return question;
    }

    public String getChoice1 (int a){   //function to get option for button 1 and return it
        String choice0 = mChoices[a][0];
        return choice0;
    }
    public String getChoice2 (int a){//function to get option for button 2 and return it
        String choice1 = mChoices[a][1];
        return choice1;
    }

    public String getChoice3 (int a){//function to get option for button 3 and return it
        String choice2 = mChoices[a][2];
        return choice2;
    }
    public String getCorrectAnswers (int a){//function to get the right answer and return it
        String answer = mCorrectAnswers[a];
        return answer;
    }



}
