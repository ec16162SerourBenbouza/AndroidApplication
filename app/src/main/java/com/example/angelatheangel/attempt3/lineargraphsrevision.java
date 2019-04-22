package com.example.angelatheangel.attempt3;

import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//this class handles the explanations audio and statement(s) for this subtopic. It loads the audio from the raw files and then uses a listner to start and stop according to preset logic

public class lineargraphsrevision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lineargraphsrevision);
        TextView generalfeedback=findViewById(R.id.integersandnegativenumbersgeneralfeedback);

        generalfeedback.setText("Linear graphs show a relationship between two factors. These factors can be directly proportional or just have a relationship that can be represented through y=mx+c where m is the gradient and c is the intercept.");
        final MediaPlayer lingraphs =MediaPlayer.create(this, R.raw.lingraphs);

        Button answersbutton = this.findViewById(R.id.answers);

        answersbutton.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v){
                                                 if(lingraphs.isPlaying()) {
                                                     lingraphs.stop();
                                                 }
                                                 else{
                                                 lingraphs.start();}

                                             }
                                         }
        );
    }
}
