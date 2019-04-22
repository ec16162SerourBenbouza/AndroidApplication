package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class ChooseTopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)  //default constructor
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_topic);

        Spinner mySpinner= findViewById(R.id.Spinner1);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(ChooseTopicActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Choose_Topic));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {  // method call which sets the intents for each entry in the spinner
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==1)                    //if Numbers chosen start Numbers activity
                { startActivity(new Intent(ChooseTopicActivity.this, NumbersTopic.class)); }
                else if(i==2)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(ChooseTopicActivity.this, AlgebraTopic.class)); }
                else if(i==3)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(ChooseTopicActivity.this, GraphsTopic.class)); }
                else if(i==4)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(ChooseTopicActivity.this, StatisticsTopic.class)); }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) { //if nothing then do nothing

            }
        });
        }
    }


