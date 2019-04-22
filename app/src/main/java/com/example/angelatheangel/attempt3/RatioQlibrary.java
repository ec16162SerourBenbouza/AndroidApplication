package com.example.angelatheangel.attempt3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
/* This class stores all the questions, options and answers in string arrays, then calls the functions to update the questions according to their position in the array and return them to be viewed when the library is called*/

public class RatioQlibrary extends AppCompatActivity{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ratio_qlibrary);

    }
    private String mQuestions[] =
            {"Ann and Peter share £240 in the ratio of 3:5. Ann gave 1/2 of her share to Mary, Peter only gave 1/10th of his share to Mary. What fraction did Mary end up with?",
                    "Write 0.2:(3/10) in its simplest ratio form",
                    "Tom is 13, Timmy is 11 and Troy is 6. They share £24 in ratios of their age.How much did Timmy get in pounds?",
                    "From the £8.8 received,Timmy gave his mum 1/3. How much does he have left?",
                    "A cord of length x is shared equally between John and Adam. If Adam already had a cord of length y, how much longer can his overall cord be if combined"};

    private String mChoices[][] = {
            {"21/80", "20/80","1/4"},
            {"3:2", "2:3","13:12"},
            {"8.8", "11","0.8"},
            {"5.68", "5.78","5.87"},
            {"x+y", "x-y","x+y-1"}};

    private String mCorrectAnswers[] = {"1/4", "2:3", "8.8", "5.87", "x+y"};

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
