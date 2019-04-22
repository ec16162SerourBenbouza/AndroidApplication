package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
// this class handles all new intents and calls the relevant classes based on the user selection
public class AlgebraTopic extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algebra_topic);

        Spinner mySpinner= findViewById(R.id.Spinner3);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(AlgebraTopic.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Algebra_Topics));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==1)
                {
                    startActivity(new Intent(AlgebraTopic.this, Algebraiexpressions.class));
                }
                else if(i==2)
                {
                    startActivity(new Intent(AlgebraTopic.this, Collectingliketerms.class));
                }
                else if(i==3)
                {
                    startActivity(new Intent(AlgebraTopic.this, Linearequations.class));
                }
                else if(i==4)
                {
                    startActivity(new Intent(AlgebraTopic.this, Quadraticequations.class));
                }
                else if(i==5)
                {
                    startActivity(new Intent(AlgebraTopic.this, Changingthesubject.class));
                }
                else if(i==6)
                {
                    startActivity(new Intent(AlgebraTopic.this, Algebraicfractions.class));
                }
                else if(i==7)
                {
                    startActivity(new Intent(AlgebraTopic.this, Algebraicproof.class));
                }
                else if(i==8)
                {
                    startActivity(new Intent(AlgebraTopic.this, Simultaneousequations.class));
                }
                else if(i==9)
                {
                    startActivity(new Intent(AlgebraTopic.this, Lineargraphs.class));
                }
                else if(i==10)
                {
                    startActivity(new Intent(AlgebraTopic.this, Quadraticgraphs.class));
                }
                else if(i==11)
                {
                    startActivity(new Intent(AlgebraTopic.this, Exponentialgraphs.class));
                }
                else if(i==12)
                {
                    startActivity(new Intent(AlgebraTopic.this, Gradients.class));
                }
                else if(i==13)
                {
                    startActivity(new Intent(AlgebraTopic.this, RootsInterceptsTurningpoints.class));
                }
                else if(i==14)
                {
                    startActivity(new Intent(AlgebraTopic.this, Areaundergraphs.class));
                }
                else if(i==15)
                {
                    startActivity(new Intent(AlgebraTopic.this, Expandingbrackets.class));
                }
                else if(i==16)
                {
                    startActivity(new Intent(AlgebraTopic.this, Factorising.class));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }
}