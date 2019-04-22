package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class AreaperimetervolumeQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areaperimetervolume_qlibrary);

    }
    private String mQuestions[] =
            {"The perimeter of a shape is ",
                    "The area of a shape is",
                    "The volume of a shape is",
                    "The volume of a cube, length l, is ",
                    "Cross-sectional area*length gives..."};

    private String mChoices[][] = {
            {"the space enclosed by the walls", "The sum of the wall lengths","The sum of the interior angles"},
            {"the space enclosed by the walls", "The sum of the wall lengths","The sum of the interior angles"},
            {"the space enclosed inside a 2D shape", "the space enclosed inside a 3D shape","The sum of the wall lengths"},
            {"l*l*l", "l*l","l*3"},
            {"the length", "the area","the volume"}};

    private String mCorrectAnswers[] = {"The sum of the wall lengths",
            "the space enclosed by the walls",
            "the space enclosed inside a 3D shape",
            "l*l*l",
            "the volume"};

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
