package com.example.graphicsexample;

import android.graphics.drawable.TransitionDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class TransitionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ImageView image = new ImageView(this);
        setContentView(image);
        TransitionDrawable transition = (TransitionDrawable)
                ContextCompat.getDrawable(this, R.drawable.transition);
        image.setImageDrawable(transition);
        transition.startTransition(2000);
    }
}
