package com.example.angelatheangel.attempt3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.barteksc.pdfviewer.PDFView;

public class Mindmappdf extends AppCompatActivity {

    PDFView pdf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mindmappdf);

    pdf=(PDFView)findViewById(R.id.pdfofmindmap);   //PDFViewer linked to pdf in asset folder

    pdf.fromAsset("mindmap.pdf").load();    //load the pdf on opening activity

    pdf.setMaxZoom(10); //maximum zoom to avoid lagging and blurryness



    }
}
