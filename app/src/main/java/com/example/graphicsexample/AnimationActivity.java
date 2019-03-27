package com.example.graphicsexample;

import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class AnimationActivity extends AppCompatActivity {

    AnimationDrawable animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        animation = (AnimationDrawable)
                ContextCompat.getDrawable(this, R.drawable.animation);
        ImageView view = new ImageView(this);
        view.setBackgroundColor(Color.WHITE);
        view.setImageDrawable(animation);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.start();
            }
        });
        view.setScaleType(ImageView.ScaleType.CENTER);
        setContentView(view);
    }
}
