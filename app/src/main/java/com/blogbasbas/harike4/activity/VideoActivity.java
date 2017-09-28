package com.blogbasbas.harike4.activity;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

import com.blogbasbas.harike4.R;

public class VideoActivity extends AppCompatActivity {
    //deklarasi variabel
    VideoView videoView;
    MediaController mediaController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
        videoView = (VideoView) findViewById(R.id.videoView);
        //videoView.setVideoURI(Uri.parse("http://idn.id/semarang/tes/tatacara.mp4"));
         videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.imastudio));
        mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);
        videoView.requestFocus();
        videoView.start();

    }
}
