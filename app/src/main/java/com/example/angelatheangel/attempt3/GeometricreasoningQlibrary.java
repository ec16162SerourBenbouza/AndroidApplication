package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class GeometricreasoningQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geometricreasoning_qlibrary);

    }
    private String mQuestions[] =
            {"The sum of the interior angles in a triangle add up to ",
                    "The sum of the interior angles in a quadrilateral add up to",
                    "Alternate angels, called Z angles, are...",
                    "Two types of angles are called",
                    "Geometric reasoning can help with... questions"};

    private String mChoices[][] = {
            {"270", "190","180"},
            {"270", "180","360"},
            {"equal to 180", "equal","equal to 360"},
            {"Alternative and Corresponding", "Corresponding and Alternate","Co-interior and Alternative"},
            {"elevation", "physics","geography"}};

    private String mCorrectAnswers[] = {"180", "360", "equal", "Corresponding and Alternate", "elevation"};

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
