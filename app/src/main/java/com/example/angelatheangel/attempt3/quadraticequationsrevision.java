package com.example.angelatheangel.attempt3;

import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//this class handles the explanations audio and statement(s) for this subtopic. It loads the audio from the raw files and then uses a listner to start and stop according to preset logic

public class quadraticequationsrevision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quadraticequationsrevision);
        TextView generalfeedback=findViewById(R.id.integersandnegativenumbersgeneralfeedback);

        generalfeedback.setText("Quadratic equations can be solved in many different ways, but you should aim to know all, understanding all the methods will help you to solve any sort of quadratic equations as well as form your own eventually");
        final MediaPlayer quad =MediaPlayer.create(this, R.raw.quad);

        Button answersbutton = this.findViewById(R.id.answers);

        answersbutton.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v){
                                                 if(quad.isPlaying()) {
                                                     quad.stop();
                                                 }
                                                 else{
                                                 quad.start();}

                                             }
                                         }
        );
    }
}
