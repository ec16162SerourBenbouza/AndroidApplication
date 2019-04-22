package com.example.angelatheangel.attempt3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Energy extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energy);
        final MediaPlayer energy =MediaPlayer.create(this, R.raw.energyq);

        Button answersbutton = this.findViewById(R.id.answers);

        answersbutton.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v){
                                                 if(energy.isPlaying()) {
                                                     energy.stop();
                                                 }
                                                 else{
                                                     energy.start();}

                                             }
                                         }
        );
    }
}
