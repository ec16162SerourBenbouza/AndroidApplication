package com.example.angelatheangel.attempt3;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class mainpageofapp extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState)  //initialises this activity as a new activity
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpageofapp);    //sets the interface to have the structure defined in the xml file
        Spinner mySpinner= findViewById(R.id.Spinner6);     // declares and initialises the spinner for this activity
        // the next line is used to insert the list from the strings xml file to the spinner options
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(mainpageofapp.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.Choose_Activity));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);    //set the adapter
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {  //listen to which item is chosen from list
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l)
            {
                if(i==1)    //if the first option is chosen go to the activity called choose topics
                { startActivity(new Intent(mainpageofapp.this, ChooseTopicActivity.class)); }
                else if(i==2)   //if the second option is chosen
                { startActivity(new Intent(mainpageofapp.this, Physicsrevisionvideos.class)); }
                else if(i==3)//if the third option is chosen
                { startActivity(new Intent(mainpageofapp.this, Speclist.class)); }
                else if(i==4)//if the fourth option is chosen
                { startActivity(new Intent(mainpageofapp.this, Chooseaphysicstopic.class)); }
                else if(i==5)//if the fifth option is chosen
                { startActivity(new Intent(mainpageofapp.this, Revisiontips.class)); }
                else if(i==6)//if the sixth option is chosen
                { startActivity(new Intent(mainpageofapp.this, mindmap.class)); }
                else if(i==7)//if the seventh option is chosen
                { startActivity(new Intent(mainpageofapp.this, TextDetectorMain.class)); }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) //nothing selected nothing happens
            {
            }
        });
    }

}
