package com.umeng.soexample.lianxib;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.widget.media.AndroidMediaController;
import tv.danmaku.ijk.media.widget.media.IjkVideoView;

public class MainActivity extends AppCompatActivity {
    private IjkVideoView video;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        video = (IjkVideoView) findViewById(R.id.video);
        IjkMediaPlayer.loadLibrariesOnce(null);
        IjkMediaPlayer.native_profileBegin("libijkplayer.so");

        AndroidMediaController controller=new AndroidMediaController(this,false);
        video.setMediaController(controller);
        String url="http://ips.ifeng.com/video19.ifeng.com/video09/2014/06/16/1989823-102-086-0009.mp4";
        video.setVideoURI(Uri.parse(url));
        video.start();
    }
}
