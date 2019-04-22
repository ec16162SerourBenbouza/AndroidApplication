package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
// this class handles all new intents and calls the relevant classes based on the user selection

public class GraphsTopic extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graphs_topic);

        Spinner mySpinner= findViewById(R.id.Spinner4);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(GraphsTopic.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Graphs_Topics));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==1)
                {
                    startActivity(new Intent(GraphsTopic.this, Reallifegraphs.class));
                }
                else if(i==2)
                {
                    startActivity(new Intent(GraphsTopic.this, Geometricreasoning.class));
                }
                else if(i==3)
                {
                    startActivity(new Intent(GraphsTopic.this, Angleproperties.class));
                }
                else if(i==4)
                {
                    startActivity(new Intent(GraphsTopic.this, Shapes2D3D.class));
                }
                else if(i==5)
                {
                    startActivity(new Intent(GraphsTopic.this, Elevations.class));
                }
                else if(i==6)
                {
                    startActivity(new Intent(GraphsTopic.this, Areaperimetervolume.class));
                }
                else if(i==7)
                {                    startActivity(new Intent(GraphsTopic.this, Pythagorasandareaoftriangles.class));

                }
                else if(i==8)
                {                    startActivity(new Intent(GraphsTopic.this, Trig.class));

                }
                else if(i==9)
                {                    startActivity(new Intent(GraphsTopic.this, Vectorsandproofs.class));

                }
                else if(i==10)
                {                    startActivity(new Intent(GraphsTopic.this, Volumes.class));

                }
                else if(i==11)
                {                    startActivity(new Intent(GraphsTopic.this, Surfaceareas.class));

                }
                else if(i==12)
                { startActivity(new Intent(GraphsTopic.this, Densityandpressure.class));
                }

                else if(i==13)
                {                    startActivity(new Intent(GraphsTopic.this, Completingthesquare.class));

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }
}