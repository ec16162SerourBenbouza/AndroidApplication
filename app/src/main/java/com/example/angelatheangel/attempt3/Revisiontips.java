package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
// this class handles all new intents and calls the relevant classes based on the user selection

public class Revisiontips extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revisiontips);

        Button Whereto= findViewById(R.id.Whereto);
        Button Howto= findViewById(R.id.Howto);

        Whereto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                startActivity(new Intent(Revisiontips.this, Wheretorevise.class));
                Revisiontips.this.finish();

            }
        });

        Howto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finishAffinity();
                startActivity(new Intent(Revisiontips.this, Howtorevise.class));
                Revisiontips.this.finish();

            }
        });




    }
}
