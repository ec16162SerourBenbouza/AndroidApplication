package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {     //default constructor

    TextView mGrade, mFinalScore;   //declare all textviews
    Button mHome, explanation;      //declare all buttons
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);


        mGrade= findViewById(R.id.grade);   //to display result from quiz
        mFinalScore= findViewById(R.id.outOf);  //out of 5
        mHome= findViewById(R.id.Home); //button for home
        explanation=findViewById(R.id.explanations);    //button to get explanations
        Bundle bundle= getIntent().getExtras();
        int score= bundle.getInt("final score");    //final score displayed

        mFinalScore.setText("You scored " +score+" out of 5");  //statement

        if(score==5){   //if full marks
            mGrade.setText("Outstanding. You have understood this subtopic.");
        }
        else    //if less than 5 marks
        {
            mGrade.setText("You should review this subtopic content.\n Remember a mark lost here means a mark you can save in the exam!");

        }
        mHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {    //button listner for home
                finishAffinity();
                startActivity(new Intent(ResultsActivity.this, ChooseTopicActivity.class)); //calls class home
                ResultsActivity.this.finish();  //end activity

            }
        });
        explanation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //button listner for explanations
                finishAffinity();
                startActivity(new Intent(ResultsActivity.this, GetExplanationsActivity.class)); //calls class for explanations
                ResultsActivity.this.finish();  //end actvity

            }
        });

    }
}
