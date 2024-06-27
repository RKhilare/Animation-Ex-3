package com.example.animationapplicationex_4;

import static com.example.animationapplicationex_4.R.*;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity
{

    Button blink1,rotate1,zoom1,fade1,translate1,stop;
    ImageView img;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        img=findViewById(R.id.img1);

        blink1=findViewById(R.id.btn1);
        rotate1=findViewById(R.id.btn2);
        zoom1=findViewById(R.id.btn3);
        fade1=findViewById(R.id.btn4);
        translate1=findViewById(R.id.btn5);
        stop=findViewById(id.btn6);


        Animation blinkAnimation= AnimationUtils.loadAnimation(this, anim.blink);
        Animation rotateAnimation=AnimationUtils.loadAnimation(this, anim.rotate);
        Animation zoomAnimation=AnimationUtils.loadAnimation(this, anim.zoom);
        Animation fadeAnimation=AnimationUtils.loadAnimation(this, anim.fade);
        Animation translateAnimation=AnimationUtils.loadAnimation(this, anim.translate);


        blink1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(blinkAnimation);
            }
        });

        rotate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(rotateAnimation);
            }
        });

        zoom1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(zoomAnimation);
            }
        });

        fade1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(fadeAnimation);
            }
        });

        translate1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.startAnimation(translateAnimation);
            }
        });

        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                img.clearAnimation();
            }
        });

    }
}
