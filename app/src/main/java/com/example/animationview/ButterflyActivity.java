package com.example.animationview;


import android.animation.Animator;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


public class ButterflyActivity extends AppCompatActivity {
    private Button btnzoom,btnmove,btnblink,btnup,btnfade,btndown;
    private ImageView imgview;
    private static final String TAG=ButterflyActivity.class.getSimpleName();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.butterfly);
        imgview=findViewById(R.id.imgview);
        imgview.setImageResource(R.drawable.ic_iconfinder_butterfly_2998133);

        btnzoom=findViewById(R.id.btnzoom);
        btnmove =findViewById(R.id.btnmove);
        btnblink=findViewById(R.id.btnblink);
        btnup=findViewById(R.id.btnup);
        btnfade=findViewById(R.id.btnfade);
        btndown=findViewById(R.id.btndown);
        btnzoom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
                imgview.startAnimation(animation);
            }
        });
        btnmove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                imgview.startAnimation(animation);
            }
        });
        btnblink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                imgview.startAnimation(animation);
            }
        });
        btnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slideup);
                imgview.startAnimation(animation);
            }
        });
        btnfade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                imgview.startAnimation(animation);
            }
        });
        btndown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slidedown);
                imgview.startAnimation(animation);
            }
        });
    }
}
