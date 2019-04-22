package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class VolumesQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumes_qlibrary);

    }
    private String mQuestions[] =
            {"What is the volume of a cuboid that has the following dimensions:l=9, w=3, h=6",
                    "Which of these is the unit for volume?",
                    "Pyramids have a volume",
                    "Cross-sectional area*length is the volume for a cube",
                    "A... is the name of the 3D circle"};

    private String mChoices[][] = {
            {"162", "27","18"},
            {"cm", "cm2","cm3"},
            {"True", "False","Unsure"},
            {"True", "False","Unsure"},
            {"Prism", "Sphere","Moon"}};

    private String mCorrectAnswers[] = {"162", "cm3", "True", "True", "Sphere"};

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
