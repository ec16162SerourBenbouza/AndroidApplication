package com.example.angelatheangel.attempt3;

import android.media.MediaPlayer;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fractionsrevision extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fractionsrevision);

        TextView generalfeedback=findViewById(R.id.integersandnegativenumbersgeneralfeedback);

        generalfeedback.setText("We must remmember what Bodmas/Bidmas stands for and that it is always used in any Mathematics question. Brackets, Orders( also called indices), Division, Multiplication, addition and then subtraction. That is the order of priorities.");
        final MediaPlayer fractions =MediaPlayer.create(this, R.raw.fractions);

        Button answersbutton = this.findViewById(R.id.answers);

        answersbutton.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View v){
                                                 if(fractions.isPlaying()) {
                                                     fractions.stop();
                                                 }
                                                 else{
                                                 fractions.start();}

                                             }
                                         }
        );
    }
}
