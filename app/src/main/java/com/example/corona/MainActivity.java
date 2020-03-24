package com.example.corona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private static int Splash_screen = 5000;
    Animation anim,anim2;
    ImageView imgView;
    TextView txt1,txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        anim  = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        anim2  = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);


        imgView = findViewById(R.id.img);
        txt1 = findViewById(R.id.sty_hm);
        txt2 = findViewById(R.id.sty_sf);

        imgView.setAnimation(anim);

        txt1.setAnimation(anim2);
        txt2.setAnimation(anim2);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,BasicInfoActivity.class);
                startActivity(intent);
                finish();
            }
        },Splash_screen);

    }



}
