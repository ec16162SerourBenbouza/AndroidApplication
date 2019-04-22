package com.example.angelatheangel.attempt3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
//this class handles the explanations audio and statement(s) for this subtopic. It loads the audio from the raw files and then uses a listner to start and stop according to preset logic

public class averagesandrangesrevision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_averagesandrangesrevision);
        TextView generalfeedback=findViewById(R.id.integersandnegativenumbersgeneralfeedback);

        generalfeedback.setText("Statistics is a must for histograms and other representations in physics and maths. You should be very confident in this topic by now.");

    }
}
