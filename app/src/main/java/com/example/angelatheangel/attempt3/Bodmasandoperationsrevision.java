package com.example.angelatheangel.attempt3;

import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//this class handles the explanations audio and statement(s) for this subtopic. It loads the audio from the raw files and then uses a listner to start and stop according to preset logic
public class Bodmasandoperationsrevision extends AppCompatActivity {    //default constructor



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodmasandoperationsrevision);

        TextView generalfeedback=findViewById(R.id.integersandnegativenumbersgeneralfeedback);  //textview to give general explanations

        //the next statment is output to explain the general feedback
        generalfeedback.setText("We must remember what Bodmas/Bidmas stands for and that it is always used in any Mathematics question. Brackets, Orders( also called indices), Division, Multiplication, addition and then subtraction. That is the order of priorities.");
        final MediaPlayer bodmas =MediaPlayer.create(this, R.raw.bodmas);   //declare and initialise a mediaplayer with raw file

        Button answersbutton = this.findViewById(R.id.answers); //button to start and stop audio

        answersbutton.setOnClickListener(new View.OnClickListener() {
                                          @Override
                                          public void onClick(View v){      //function to listen to button press
                                              if(bodmas.isPlaying()) {  //if the button is already playing then stop the audio when pressed
                                                  bodmas.stop();
                                              }
                                              else{ //if audio is not playing then start it on press
                                              bodmas.start();}

                                          }
                                      }
        );

    }




}
