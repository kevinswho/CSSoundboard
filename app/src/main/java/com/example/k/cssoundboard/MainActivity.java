package com.example.k.cssoundboard;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer sound = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

    }

    public void playb5(View view){
        if (sound != null){
            sound.stop();
        }
        sound = MediaPlayer.create(MainActivity.this,R.raw.b5);
        sound.start();
    }

    public void inEnd(View view){
        if (sound != null){
            sound.stop();
        }
        sound = MediaPlayer.create(MainActivity.this,R.raw.itriedsohardgotsofar);
        sound.start();
    }

    public void nuke(View view){
        if (sound != null){
            sound.stop();
        }
        sound = MediaPlayer.create(MainActivity.this,R.raw.nuke_tone);
        sound.start();
    }

    public void potc(View view){
        if (sound != null){
            sound.stop();
        }
        sound = MediaPlayer.create(MainActivity.this,R.raw.potc);
        sound.start();
    }

    public void gee(View view){
        if (sound != null){
            sound.stop();
        }
        sound = MediaPlayer.create(MainActivity.this,R.raw.shortergee);
        sound.start();
    }

    public void wtf(View view){
        if (sound != null){
            sound.stop();
        }
        sound = MediaPlayer.create(MainActivity.this,R.raw.wtfgoinon);
        sound.start();
    }

    public void poop(View view){
        if (sound != null){
            sound.stop();
        }
        sound = MediaPlayer.create(MainActivity.this,R.raw.poopoo);
        sound.start();
    }

    public void stop(View view){
        if (sound != null){
            sound.stop();
        }
    }
}
