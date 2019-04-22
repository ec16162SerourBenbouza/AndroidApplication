package com.example.angelatheangel.attempt3;

import androidx.appcompat.app.AppCompatActivity;
//this class stores the API key for youtube and returns it when called
public class YoutubeKey {

    public YoutubeKey(){

    }
    public static final String API_KEY = "AIzaSyC3CLuzAPSbiELAp28E63ahmk1xoN3ypCo";
    public static String getApiKey(){
        return API_KEY;
    }
}