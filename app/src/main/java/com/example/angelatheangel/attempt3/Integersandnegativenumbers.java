package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

//create default constructor here





/* declare 3  buttons and 2 textviews here in the class outside constructor
* also declare a counter and a question number */





/* initialise everything previously declared  inside constructor*/




/* function which updates questions by calling a Qlibrary class*/


/*function which increments score*/

/* button logic for each button, must have scenarios for if question is the last one, if the answer is right and if the answer is wrong*/



public class Integersandnegativenumbers extends AppCompatActivity {     //default constructor

    private IntegersandnegativenumbersQLibrary mQuestionLibrary= new IntegersandnegativenumbersQLibrary();  //imports questions from this external class

    //declare all textviews and buttons
    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String mAnswer; //to store answer
    private int mScore=0;   //to count score in integer variable
    private int mQuestionNumber=0;  //to count question numbers for logic handling

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integersandnegativenumbers);

    //initialise all textviews and buttons
        mScoreView= findViewById(R.id.score);
        mQuestionView= findViewById(R.id.question);
        mButtonChoice1= findViewById(R.id.choice1);
        mButtonChoice2= findViewById(R.id.choice2);
        mButtonChoice3= findViewById(R.id.choice3);

        //call function which gets question from library
        updateQuestion();

        //start the button listener button1

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){ //if button 1 is pressed

                if(mButtonChoice1.getText()==mAnswer){  //if the button is the correct answer obtained from the questionslibrary
                    mScore=mScore+1;    //increment score
                    updateScore(mScore);    //update the score on screen
                    Toast.makeText(Integersandnegativenumbers.this, "Well Done", Toast.LENGTH_SHORT).show();    //toast well done
                    if(mQuestionNumber==5)  //nested if statement this is the final question
                    {
                        Intent i=new Intent(Integersandnegativenumbers.this, ResultsActivity.class);    // call the resultsactivity class
                        Bundle bundle=new Bundle();
                        bundle.putInt("final score",mScore);    //output the score obtained in the quiz
                        i.putExtras(bundle);
                        Integersandnegativenumbers.this.finish(); //End the activity to avoid having too many activities open
                        startActivity(i);   //start ResultsActivity class
                    }
                    else{
                        updateQuestion();   //if it wasnt the final question
                    }
                }

                else{   //if the answer was wrong
                    Toast.makeText(Integersandnegativenumbers.this, "Next Time", Toast.LENGTH_SHORT).show();    //toast next time
                    if(mQuestionNumber==5)  //if this was the final question
                    {
                        Intent i=new Intent(Integersandnegativenumbers.this, ResultsActivity.class);    //call results activity class
                        Bundle bundle=new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        Integersandnegativenumbers.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestion();
                    }                }
            }
        });
        //end

        //repeat the above approach for the next two buttons

        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mButtonChoice2.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    Toast.makeText(Integersandnegativenumbers.this, "Well Done", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber==5)
                    {
                        Intent i=new Intent(Integersandnegativenumbers.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        Integersandnegativenumbers.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestion();
                    }
                }
                else{
                    Toast.makeText(Integersandnegativenumbers.this, "Next Time", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber==5)
                    {
                        Intent i=new Intent(Integersandnegativenumbers.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        Integersandnegativenumbers.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestion();
                    }                }
            }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mButtonChoice3.getText()==mAnswer){
                    mScore=mScore+1;
                    updateScore(mScore);
                    Toast.makeText(Integersandnegativenumbers.this, "Well Done", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber==5)
                    {
                        Intent i=new Intent(Integersandnegativenumbers.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        Integersandnegativenumbers.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestion();
                    }
                }
                else{
                    Toast.makeText(Integersandnegativenumbers.this, "Next Time", Toast.LENGTH_SHORT).show();
                    if(mQuestionNumber==5)
                    {
                        Intent i=new Intent(Integersandnegativenumbers.this, ResultsActivity.class);
                        Bundle bundle=new Bundle();
                        bundle.putInt("final score",mScore);
                        i.putExtras(bundle);
                        Integersandnegativenumbers.this.finish();
                        startActivity(i);
                    }
                    else{
                        updateQuestion();
                    }                }
            }
        });
    }
    private void updateQuestion()   //function to update questions from the library
    {
        if (mQuestionNumber <5) {   //if not the final question
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));   //get next q and place it in the textview
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));   //get option 1 and place it in button
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));   //get option 2 and place it in button
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));   //get option 3 and place it in button


            mAnswer = mQuestionLibrary.getCorrectAnswers(mQuestionNumber);  //get the actual correct answer and store it in variable
            mQuestionNumber++;  //increment question
        }

    }
    private void updateScore(int point) //function to update score in score bar
    {
        mScoreView.setText("" + mScore);
    }

}
