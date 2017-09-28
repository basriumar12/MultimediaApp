package com.blogbasbas.harike4.activity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.blogbasbas.harike4.R;

import java.io.IOException;

public class RadioActivity extends AppCompatActivity {
    ProgressBar progressBar;
    Button btnPlay, btnStop;
    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);
        // Inflate the layout for this fragment

        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnStop = (Button) findViewById(R.id.btnStop);

        progressBar = (ProgressBar) findViewById(R.id.proggressbar);
        progressBar.setIndeterminate(true);

        btnStop.setVisibility(View.GONE);
        progressBar.setVisibility(View.INVISIBLE);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {

                    player = new MediaPlayer();
                    player.setDataSource("http://103.16.198.36:9160/stream");
                    player.prepareAsync();
                    player.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mediaPlayer) {
                            player.start();
                        }
                    });

                } catch (IOException e) {
                    e.printStackTrace();
                }
                btnPlay.setVisibility(View.GONE);
                btnStop.setVisibility(View.VISIBLE);
                progressBar.setVisibility(View.VISIBLE);


            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {





                try{
                    if (player.isPlaying()){
                        player.stop();
                    }
                }catch (IllegalStateException e){
                    e.printStackTrace();
                }

                btnPlay.setVisibility(View.VISIBLE);
                btnStop.setVisibility(View.GONE);
                progressBar.setVisibility(View.INVISIBLE);

            }
        });
    }

    @Override
    public void onBackPressed() {
        try
        {

        if (player.isPlaying()){
            player.stop();
        }}catch (Exception e){
            e.printStackTrace();
        }
        super.onBackPressed();
    }
}
