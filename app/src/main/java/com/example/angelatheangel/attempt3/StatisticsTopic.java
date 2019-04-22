package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
// this class handles all new intents and calls the relevant classes based on the user selection

public class StatisticsTopic extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics_topic);

        Spinner mySpinner= findViewById(R.id.Spinner5);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(StatisticsTopic.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Statistics_Topics));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if(i==1)
                {                    startActivity(new Intent(StatisticsTopic.this, Averagesandranges.class));

                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




    }
}