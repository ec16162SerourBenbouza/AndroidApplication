package com.example.angelatheangel.attempt3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;
//this class retrieves youtube videos and plays the playlist in the application
public class Physicsrevisionvideos extends YouTubeBaseActivity {    //default constructor


    private static final String TAGED="Physicsrevisionvideos";
    YouTubePlayerView playerView;   //playerview declared
    Button play;   //button to play
    YouTubePlayer.OnInitializedListener mOnInitializedListener; //listener to see if user skips videos or moves to a different video

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_physicsrevisionvideos);
        Log.d(TAGED, "onCreate: Starting");
        play= findViewById(R.id.buttontoplayvideo);
        playerView= findViewById(R.id.playerview);

        mOnInitializedListener=new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
youTubePlayer.loadPlaylist("PLijqQiSMHnP2aEdAajHRDsralGH9n3gHT");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };

        play.setOnClickListener(new View.OnClickListener() {//action when player starts
            @Override
            public void onClick(View v) {   // gets onClick method and passes the API KEY
                Log.d(TAGED,"onClick: Initialising Video ");
                playerView.initialize(YoutubeKey.getApiKey(),mOnInitializedListener);

            }
        });
        }
}
