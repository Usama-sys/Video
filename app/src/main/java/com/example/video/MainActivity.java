package com.example.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    //  VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView videoView=(VideoView) findViewById(R.id.vv);
        MediaController mediaController= new MediaController(this);
      mediaController.setAnchorView(videoView);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.aa);
       videoView.setMediaController(mediaController);
        videoView.start();

    }
}