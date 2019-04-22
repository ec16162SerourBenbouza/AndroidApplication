package com.example.angelatheangel.attempt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
// this class handles all new intents and calls the relevant classes based on the user selection

public class Chooseaphysicstopic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooseaphysicstopic);

        Spinner mySpinner= findViewById(R.id.Spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(Chooseaphysicstopic.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.physics));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {  // method call
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==1)                    //if Numbers chosen start Numbers activity
                { startActivity(new Intent(Chooseaphysicstopic.this, Trainscenario.class)); }
                else if(i==2)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(Chooseaphysicstopic.this, Fridges.class)); }
                else if(i==3)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(Chooseaphysicstopic.this, ForcesGame.class)); }
                else if(i==4)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(Chooseaphysicstopic.this, Energy.class)); }
                else if(i==5)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(Chooseaphysicstopic.this, Heatloss.class)); }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
