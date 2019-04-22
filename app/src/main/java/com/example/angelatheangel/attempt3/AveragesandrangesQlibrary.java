package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class AveragesandrangesQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_averagesandranges_qlibrary);

    }
    private String mQuestions[] =
            {"Which of the following is a  type of averages?",
                    "Range is?",
                    "Find the range for the following values:4,7,22,1,6,2,1,5,6,6,4",
                    "Find the median for the following:4,7,22,1,6,2,1,5,6,6,4",
                    "A class performed a running test. The median score for the girls distance was 2. The median for the boys was 4.5. The boys ran further...T/F?"};

    private String mChoices[][] = {
            {"Mean", "Mode","Both"},
            {"Range=highest-lowest", "Range=highest+lowest","Range=mean"},
            {"22", "6","21"},
            {"6", "4","5"},
            {"True", "False","Need more information"}};

    private String mCorrectAnswers[] = {"Both", "Range=highest-lowest", "21", "5", "True"};

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
