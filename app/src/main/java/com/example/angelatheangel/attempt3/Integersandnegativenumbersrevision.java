package com.example.angelatheangel.attempt3;

import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Integersandnegativenumbersrevision extends AppCompatActivity { //default constructor



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_integersandnegativenumbersrevision);

        TextView generalfeedback=findViewById(R.id.integersandnegativenumbersgeneralfeedback);  //textview for general feedback
        TextView answersexplanation=findViewById(R.id.numbersfeedback1);    //text view for answers explanations

        //output text
        generalfeedback.setText("The rules to remember are: when the signs are the same the result will be +ve and when they are different the result is always negative. To understand this concept we can take two scenarios debt and bonuses at work.");

        final MediaPlayer debt =MediaPlayer.create(this, R.raw.debtscenario);   //final mediaplayer declared and initialised from the raw folder
        final MediaPlayer bonus =MediaPlayer.create(this, R.raw.bonusscenario);//final mediaplayer declared and initialised from the raw folder
        final Button debtbutton = this.findViewById(R.id.debtbutton);   //button to play audio 1
        Button bonusbutton = this.findViewById(R.id.bonusbutton);   //button to play audio 2

        debtbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){    //listener to start and stop player
                if(debt.isPlaying()) {  //if already playing and button pressed again then stop it
                    debt.stop();
                }
                else{ debt.start();}    //otherwise start the video

            }
        }
        );
        bonusbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){    //button for listener 2 with the same logic as button 1.
                if(bonus.isPlaying()) {
                    bonus.stop();
                }
                else{
                bonus.start();}

            }
        }
        );

        //the next statement is output for explanation of the answers
        answersexplanation.setText("1) -9/3 . Well 9/3 is 3 but we have the negative/positive thus -3 \n2) -15/-3 . negative/negative is positive, 15/3 is 5 thus answer is 5 \n3)negative*positive is negative, 12*5 is 60 thus the answer overall is -60 \n4)positive/negative is negative and 14/2 is 7. Overall the answer is -7 \n5)negative*negative is positive while 7*7 is 49. So the answer is 49 ");

    }




}
