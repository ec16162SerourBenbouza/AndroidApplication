package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class NumbersTopic extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)  //default constructor
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers_topic);

        Spinner mySpinner= findViewById(R.id.Spinner2);     //declare and initialise a spinner
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(NumbersTopic.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Number_Topics));  //set content of spinner

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);    //create adapter for spinner
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {  //Listner to what is chosen on the spinner

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {  //option 0 is not given as it doesn't call anything it just says "Please select"
                if(i==1)
                {
                    startActivity(new Intent(NumbersTopic.this, Integersandnegativenumbers.class)); //calls class
                }
                else if(i==2)
                {
                    startActivity(new Intent(NumbersTopic.this, Bodmasandoperations.class));    //calls class
                }
                else if(i==3)
                {
                    startActivity(new Intent(NumbersTopic.this, Decimalsandrounding.class));    //calls class
                }
                else if(i==4)
                {
                    startActivity(new Intent(NumbersTopic.this, Fractionsandpercentages.class));
                }
                else if(i==5)
                {
                    startActivity(new Intent(NumbersTopic.this, FactorsandHCF.class));
                }
                else if(i==6)
                {
                    startActivity(new Intent(NumbersTopic.this, MultiplesandLCM.class));
                }
                else if(i==7)
                {
                    startActivity(new Intent(NumbersTopic.this, Approximations.class));
                }
                else if(i==8)
                {
                    startActivity(new Intent(NumbersTopic.this, Rootsandpowers.class));
                }
                else if(i==9)
                {
                    startActivity(new Intent(NumbersTopic.this, StandardForm.class));
                }
                else if(i==10)
                {
                    startActivity(new Intent(NumbersTopic.this, Surds.class));
                }
                else if(i==11)
                {
                    startActivity(new Intent(NumbersTopic.this, ConversionGraphs.class));
                }
                else if(i==12)
                {
                    startActivity(new Intent(NumbersTopic.this, Ratio.class));
                }
                else if(i==13)
                {
                    startActivity(new Intent(NumbersTopic.this, DirectProportions.class));
                }
                else if(i==14)
                {
                    startActivity(new Intent(NumbersTopic.this, Inverseproportion.class));
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) { //if nothing chosen do nothing

            }
        });




    }
}