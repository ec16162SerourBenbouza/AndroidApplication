package com.example.angelatheangel.attempt3;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class GetExplanationsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_explanations);
//46
        Spinner mySpinner= findViewById(R.id.explanationsoptions);
        ArrayAdapter<String> myAdapter = new ArrayAdapter<>(GetExplanationsActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.explanations));

        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);
        mySpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {  // method call
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==1)                    //if Numbers chosen start Numbers activity
                { startActivity(new Intent(GetExplanationsActivity.this, Integersandnegativenumbersrevision.class)); }
                else if(i==2)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, Bodmasandoperationsrevision.class)); }
                else if(i==3)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, decimalsrevision.class)); }
                else if(i==4)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, fractionsrevision.class)); }
                else if(i==5)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, factorsrevision.class)); }
                else if(i==6)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, multiplesrevision.class)); }
                else if(i==7)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, approximationsrevision.class)); }
                else if(i==8)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, rootsrevision.class)); }
                else if(i==9)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, standardformrevision.class)); }
                else if(i==10)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, surdsrevision.class)); }
                else if(i==11)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, conversiongraphsrevision.class)); }
                else if(i==12)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, ratiorevision.class)); }
                else if(i==13)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, directrevision.class)); }//
                else if(i==14)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, inverserevision.class)); }//
                else if(i==15)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, expressionsrevision.class)); }//
                else if(i==16)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, collectingliketermsrevision.class)); }//
                else if(i==17)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, linearequationsrevision.class)); }//
                else if(i==18)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, quadraticequationsrevision.class)); }//
                else if(i==19)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, changingthesubjectrevision.class)); }//
                else if(i==20)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, algebraicfractionsrevision.class)); }//
                else if(i==21)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, algebraicproofrevision.class)); }//
                else if(i==22)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, simrevision.class)); }//
                else if(i==23)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, lineargraphsrevision.class)); }//
                else if(i==24)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, quadgraphsrevision.class)); }//
                else if(i==25)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, exponentialgraphsrevision.class)); }//
                else if(i==26)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, gradrevision.class)); }//
                else if(i==27)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, rootsandothersrevision.class)); }//
                else if(i==28)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, areaundergraphrevision.class)); }//
                else if(i==29)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, expandingbracketsrevision.class)); }//
                else if(i==30)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, factorisingrevision.class)); }//
                else if(i==31)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, reallifegraphsrevision.class)); }//
                else if(i==32)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, geometricreasoningrevision.class)); }//
                else if(i==33)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, anglepropertiesrevision.class)); }//
                else if(i==34)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, D2D3shapesrevision.class)); }//
                else if(i==35)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, elevationsrevision.class)); }//
                else if(i==36)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, Areaperimeterandvolumerevision.class)); }//
                else if(i==37)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, pythagorasrevision.class)); }//
                else if(i==38)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, trigpropertiesrevision.class)); }//
                else if(i==39)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, vectorsrevision.class)); }//
                else if(i==40)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, volumesrevision.class)); }//
                else if(i==41)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, surfacearearevision.class)); }
                else if(i==42)               //if Graphs chosen start Grpahs Activity
                { startActivity(new Intent(GetExplanationsActivity.this, densityandpressurerevision.class)); }//
                else if(i==43)               //if Statistics chosen start Statistics Activity
                { startActivity(new Intent(GetExplanationsActivity.this, completingthesquarerevision.class)); }//
                else if(i==44)               //if Algebra chosen start Algebra activity
                { startActivity(new Intent(GetExplanationsActivity.this, averagesandrangesrevision.class)); }//

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
