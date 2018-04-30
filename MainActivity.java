package com.example.du.finalproject;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {
    VideoView videov;
    Button buttonPlay;
    MediaController mediaCon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPlay = (Button) findViewById(R.id.button1);
        videov = (VideoView) findViewById(R.id.videoView1);
        mediaCon = new MediaController(this);

    }

    public void videoplay(View view) {
        String videopath = "android.resources://com.example.du.finalproject/" + R.raw.five_second_lion_king;
        Uri uri = Uri.parse(videopath);
        videov.setVideoURI(uri);
        videov.setMediaController(mediaCon);
        mediaCon.setAnchorView(videov);
        videov.start();
    }
}
