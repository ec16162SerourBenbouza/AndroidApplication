
package com.example.angelatheangel.attempt3;

        import androidx.appcompat.app.AppCompatActivity;

        import android.annotation.SuppressLint;
        import android.net.Uri;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.Toast;
        import android.widget.VideoView;

public class ForcesGame extends AppCompatActivity {
    Button option2;
    Button option3;
    Button option4;
    Button option5;
    Button option6;
    Button option7;
    Button option8;
    Button option9;
    Button option10;
    Button option11;
    Button option12;
    Button option13;
    Button option14;
    Button option15;
    Button option16;

    Button click;
    VideoView videoview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forces_game);

        click= findViewById(R.id.button17);
        videoview= findViewById(R.id.videoView1);

        option2= findViewById(R.id.button2);
        option5= findViewById(R.id.button5);
        option8= findViewById(R.id.button8);
        option12= findViewById(R.id.button12);
        option15= findViewById(R.id.button15);

        option3= findViewById(R.id.button3);
        option4= findViewById(R.id.button4);
        option6= findViewById(R.id.button6);
        option7= findViewById(R.id.button7);
        option9= findViewById(R.id.button9);
        option10= findViewById(R.id.button10);
        option11= findViewById(R.id.button11);
        option13= findViewById(R.id.button13);
        option14= findViewById(R.id.button14);
        option16= findViewById(R.id.button16);




    }
    @SuppressLint("ResourceAsColor")
    public void score(View view)
    { Toast.makeText(ForcesGame.this, "Well Done", Toast.LENGTH_SHORT).show();
        option2.setBackgroundColor(getResources().getColor(R.color.color4));

    }
    public void score2(View view)
    { Toast.makeText(ForcesGame.this, "Well Done", Toast.LENGTH_SHORT).show();
        option6.setBackgroundColor(getResources().getColor(R.color.color4));

    }
    public void score3(View view)
    { Toast.makeText(ForcesGame.this, "Well Done", Toast.LENGTH_SHORT).show();
        option8.setBackgroundColor(getResources().getColor(R.color.color4));

    }
    public void score4(View view)
    { Toast.makeText(ForcesGame.this, "Well Done", Toast.LENGTH_SHORT).show();
        option12.setBackgroundColor(getResources().getColor(R.color.color4));

    }
    public void score5(View view)
    { Toast.makeText(ForcesGame.this, "Well Done", Toast.LENGTH_SHORT).show();
        option15.setBackgroundColor(getResources().getColor(R.color.color4));

    }
    public void wrongans(View view){
        Toast.makeText(ForcesGame.this, "Next Time", Toast.LENGTH_SHORT).show();
        option3.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        option4.setBackgroundColor(getResources().getColor(R.color.colorAccent));

    }
    public void wrongans1(View view){
        Toast.makeText(ForcesGame.this, "Next Time", Toast.LENGTH_SHORT).show();
        option6.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        option7.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }
    public void wrongans2(View view){
        Toast.makeText(ForcesGame.this, "Next Time", Toast.LENGTH_SHORT).show();
        option9.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        option10.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }
    public void wrongans3(View view){
        Toast.makeText(ForcesGame.this, "Next Time", Toast.LENGTH_SHORT).show();
        option11.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        option13.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }
    public void wrongans4(View view){
        Toast.makeText(ForcesGame.this, "Next Time", Toast.LENGTH_SHORT).show();
        option14.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        option16.setBackgroundColor(getResources().getColor(R.color.colorAccent));
    }
    public void videoplayer(View video)
    {

        String videolocation = "android.resource://com.example.angelatheangel.attempt3/"+R.raw.forcesoncar;

        Uri uri=Uri.parse(videolocation);    // uniform resource identifier accepts string to identify any resource from a location
        videoview.setVideoURI(uri);
        videoview.start();

    }
    public void Answers(View view)
    {
        //link to new activity for explanations

    }

}
