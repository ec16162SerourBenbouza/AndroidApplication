package com.example.angelatheangel.attempt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// this class handles all new intents and calls the relevant classes based on the user selection

public class mindmap extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindmap);

        btn=(Button)findViewById(R.id.mindmap);     //Button initialised

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {   //Listener for button

                Intent intent = new Intent(mindmap.this, Mindmappdf.class); //when pressed call class
                startActivity(intent);  //start class
            }
        });
    }
}
