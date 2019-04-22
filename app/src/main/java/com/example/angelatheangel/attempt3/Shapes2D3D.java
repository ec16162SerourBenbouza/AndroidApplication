package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
/* This class handles the button press from the quiz, when the button is right it increments score, and toasts, otherwise it toasts. it gets its questions and options and answers by calling a library class and then loading the data. If it is the last question the class calls the results class */

public class Shapes2D3D extends AppCompatActivity {

    private Shapes2D3DQlibrary mQuestionLibrary= new Shapes2D3DQlibrary();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer;
    private int mScore=0;
    private int mQuestionNumber=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shapes2_d3_d);


        mScoreView= findViewById(R.id.score);
        mQuestionView= findViewById(R.id.question);
        mButtonChoice1= findViewById(R.id.choice1);
        mButtonChoice2= findViewById(R.id.choice2);
        mButtonChoice3= findViewById(R.id.choice3);

        updateQuestion();

        //start the button listener button1

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){

                if(mButtonChoice1.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    Toast.makeText(Shapes2D3D.this, "Well Done", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber==5)
                    {
                        Intent i=new Intent(Shapes2D3D.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        Shapes2D3D.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestion();
                    }
                }
                else{
                    Toast.makeText(Shapes2D3D.this, "Next Time", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber==5)
                    {
                        Intent i=new Intent(Shapes2D3D.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        Shapes2D3D.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestion();
                    }                }
            }
        });
        //end
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mButtonChoice2.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    Toast.makeText(Shapes2D3D.this, "Well Done", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber==5)
                    {
                        Intent i=new Intent(Shapes2D3D.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        Shapes2D3D.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestion();
                    }
                }
                else{
                    Toast.makeText(Shapes2D3D.this, "Next Time", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber==5)
                    {
                        Intent i=new Intent(Shapes2D3D.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        Shapes2D3D.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestion();
                    }
                }
            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mButtonChoice3.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    Toast.makeText(Shapes2D3D.this, "Well Done", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber==5)
                    {
                        Intent i=new Intent(Shapes2D3D.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        Shapes2D3D.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestion();
                    }
                }
                else{
                    Toast.makeText(Shapes2D3D.this, "Next Time", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber==5)
                    {
                        Intent i=new Intent(Shapes2D3D.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        Shapes2D3D.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestion();
                    }                }
            }
        });

    }
    private void updateQuestion()
    {
        if (mQuestionNumber <5) {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));


            mAnswer = mQuestionLibrary.getCorrectAnswers(mQuestionNumber);
            mQuestionNumber++;
        }

    }
    private void updateScore(int point)
    {
        mScoreView.setText("" + mScore);
    }

}
