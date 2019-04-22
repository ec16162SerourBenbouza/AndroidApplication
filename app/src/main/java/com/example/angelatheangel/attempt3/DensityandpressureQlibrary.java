package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class DensityandpressureQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_densityandpressure_qlibrary);

    }
    String expressioncube="\u00B3";
    String expressionsquare="\u00B2";
    String pressure="N/m"+expressionsquare;
    String density="g/cm"+expressioncube;
    private String mQuestions[] =
            {"The mass of 4 m"+expressioncube+" of copper is 35 800 kg.\nCalculate the density of the copper",
                    "Density is",
                    "Pressure is",
                    "pressure=Force/Area",
                    "Density is measured in units of"};

    private String mChoices[][] = {
            {"8950", "3500","4000"},
            {"How compact", "How spread","Pressure"},
            {"Forces", "Force on the wall","Density"},
            {"True", "False","Unsure"},
            {"kg", density,pressure}};

    private String mCorrectAnswers[] = {"8950", "How compact", "Force on the wall", "True", density};

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
