package com.example.graphicsexample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new ExampleView(this));
    }

    public class ExampleView extends View {
        public ExampleView (Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            Paint brush = new Paint();
            brush.setColor(Color.BLUE);
            brush.setStrokeWidth(8);
            brush.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(150, 150, 100, brush);
            //brush.setColor(Color.argb(127, 255, 0, 0));
            brush.setColor(getResources().getColor(R.color.colorCircle));
            canvas.drawCircle(150, 250, 100, brush);
        }
    }
}
