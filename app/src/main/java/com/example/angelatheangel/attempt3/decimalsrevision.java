package com.example.angelatheangel.attempt3;

import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
//this class handles the explanations audio and statement(s) for this subtopic. It loads the audio from the raw files and then uses a listner to start and stop according to preset logic

public class decimalsrevision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimalsrevision);

        TextView generalfeedback=findViewById(R.id.integersandnegativenumbersgeneralfeedback);

        generalfeedback.setText("Decimals are closely related to fractions and decimals. Once you understand these two most of the numbers topic will be easier.");
        final MediaPlayer decimals =MediaPlayer.create(this, R.raw.decimals);

        Button answersbutton = this.findViewById(R.id.answers);

        answersbutton.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v){
                                                 decimals.start();

                                             }
                                         }
        );
    }
}
