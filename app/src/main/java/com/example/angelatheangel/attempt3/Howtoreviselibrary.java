package com.example.angelatheangel.attempt3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Howtoreviselibrary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howtoreviselibrary);
    }

    private String mQuestions[] =       // String array for questions
            {"What kind of books do you like to read?",     //first question
                    "If you cant spell a word, what do you do",   // second question
                    "What do you do while waiting to pay at the till",
                    "Cat! what did you think of first?",
                    "Whats your favourite way to pass time"};
    private String mChoices[][] = {     //String matrix for multiple choices per question
            {"loads of pictures", "I watch youtube","loads of writing"}, //options for question 1
            {"See if it looks about right", "See if it sounds right ","dictionary"},
            {"phone","talk to the next person","shop more"},
            {"pictured a cat","said the word cat","think of my cat"},
            {"TV", "music", "reading"}};

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

}
