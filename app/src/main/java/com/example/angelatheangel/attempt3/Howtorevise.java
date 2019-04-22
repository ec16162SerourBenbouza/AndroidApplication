package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;
import java.util.Collections;

public class Howtorevise extends AppCompatActivity {

    private Howtoreviselibrary mQuestionLibrary= new Howtoreviselibrary();

    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;
    private int mQuestionNumber=0;

    private int mScore=0;
    private int visual=0;
    private int auditory=0;
    private int readwrite=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_howtorevise);


        mQuestionView= findViewById(R.id.question);
        mButtonChoice1= findViewById(R.id.option1);
        mButtonChoice2= findViewById(R.id.option2);
        mButtonChoice3= findViewById(R.id.option3);
        uploadquestion();

        mButtonChoice1.setOnClickListener(new View.OnClickListener() {//listener for button 1
            @Override
            public void onClick(View view){ //if button is clicked this method is called from XML
                if(mButtonChoice1.isPressed()){  //if answer is correct
                    visual++;    //increment score
                    if(mQuestionNumber==5)  //if final question
                    {//call class results activity
                        int largest = Collections.max(Arrays.asList(visual,auditory,readwrite));
                        if(largest==visual)
                        {
                            String text = "You should use the revision methods such as Mind maps and other visual learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();


                        }
                        else if(largest==auditory)
                        {
                            String text = "You should use the revision methods such as Youtube videos and other audio learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();


                        }
                        else if(largest==readwrite){
                            String text = "You should use the revision methods such as Books and other writing based learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else{
                            String text = "You should use a combination of revision methods as you are a visual and auditory learner";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        Intent i=new Intent(Howtorevise.this, Revisiontips.class);
                        Howtorevise.this.finish();   //finish activity so that not all activities are open
                        startActivity(i);   //start new activity
                    }
                    else{ uploadquestion();   //next question
                    } }
                else{   //if answer is wrong
                    if(mQuestionNumber==5)  //if final question
                    {  int largest = Collections.max(Arrays.asList(visual,auditory,readwrite));
                        if(largest==visual)
                        {
                            String text = "You should use the revision methods such as Mind maps and other visual learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else if(largest==auditory)
                        {
                            String text = "You should use the revision methods such as Youtube videos and other audio learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else if(largest==readwrite){
                            String text = "You should use the revision methods such as Books and other writing based learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else{
                            String text = "You should use a combination of revision methods as you are a visual and auditory learner";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        Intent i=new Intent(Howtorevise.this, Revisiontips.class);
                        Howtorevise.this.finish();
                        startActivity(i); }
                    else{   //otherwise next question
                        uploadquestion(); } } }
        });
        //end
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {//listener for button 1
            @Override
            public void onClick(View view){ //if button is clicked this method is called from XML
                if(mButtonChoice2.isPressed()){  //if answer is correct
                    auditory++;    //increment score
                    if(mQuestionNumber==5)  //if final question
                    {//call class results activity
                        int largest = Collections.max(Arrays.asList(visual,auditory,readwrite));
                        if(largest==visual)
                        {
                            String text = "Revise using Mind maps and other visual learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else if(largest==auditory)
                        {
                            String text = "Revise using Youtube videos and other audio learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else if(largest==readwrite){
                            String text = "Revise using Books and other writing based learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else{
                            String text = "Revise using a combination of revision methods as you are a visual and auditory learner";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }

                        Intent i=new Intent(Howtorevise.this, Revisiontips.class);
                        Howtorevise.this.finish();   //finish activity so that not all activities are open
                        startActivity(i);   //start new activity
                    }
                    else{ uploadquestion();   //next question
                    } }
                else{   //if answer is wrong
                    if(mQuestionNumber==5)  //if final question
                    {  int largest = Collections.max(Arrays.asList(visual,auditory,readwrite));

                        if(largest==visual)
                        {
                            String text = "Revise using Mind maps and other visual learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else if(largest==auditory)
                        {
                            String text = "Revise using Youtube videos and other audio learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else if(largest==readwrite){
                            String text = "Revise using Books and other writing based learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else{
                            String text = "Revise using combination of revision methods as you are a visual and auditory learner";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }                        Intent i=new Intent(Howtorevise.this, Revisiontips.class);
                        Howtorevise.this.finish();
                        startActivity(i); }
                    else{   //otherwise next question
                        uploadquestion(); } } }
        });
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {//listener for button 1
            @Override
            public void onClick(View view){ //if button is clicked this method is called from XML
                if(mButtonChoice3.isPressed()){  //if answer is correct
                    readwrite++;    //increment score
                    if(mQuestionNumber==5)  //if final question
                    {//call class results activity
                        int largest = Collections.max(Arrays.asList(visual,auditory,readwrite));

                        if(largest==visual)
                        {
                            String text = "Revise using Mind maps and other visual learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else if(largest==auditory)
                        {
                            String text = "Revise using Youtube videos and other audio learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else if(largest==readwrite){
                            String text = "Revise using Books and other writing based learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else{
                            String text = "Revise using a combination of revision methods as you are a visual and auditory learner";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }                        Intent i=new Intent(Howtorevise.this, Revisiontips.class);
                        Howtorevise.this.finish();   //finish activity so that not all activities are open
                        startActivity(i);   //start new activity
                    }
                    else{ uploadquestion();   //next question
                    } }
                else{   //if answer is wrong
                    if(mQuestionNumber==5)  //if final question
                    {  int largest = Collections.max(Arrays.asList(visual,auditory,readwrite));

                        if(largest==visual)
                        {
                            String text = "Revise using Mind maps and other visual learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else if(largest==auditory)
                        {
                            String text = "Revise using Youtube videos and other audio learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else if(largest==readwrite){
                            String text = "Revise using Books and other writing based learning methods";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }
                        else{
                            String text = "Revise using a combination of revision methods as you are a visual and auditory learner";
                            Toast.makeText(Howtorevise.this, text, Toast.LENGTH_LONG).show();

                        }                        Intent i=new Intent(Howtorevise.this, Revisiontips.class);
                        Howtorevise.this.finish();
                        startActivity(i); }
                    else{   //otherwise next question
                        uploadquestion(); } } }
        });






    }

    private void uploadquestion() {
        if (mQuestionNumber < 5) {   //repeats 5 times for 5 questions
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));
            mQuestionNumber++;  //increments the question number from last if statement by 1
        } else {   //if variable is equal to or more than 5 the test is over
            startActivity(new Intent(Howtorevise.this, Revisiontips.class));
        }
    }

}