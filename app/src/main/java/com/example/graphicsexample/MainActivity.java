package com.example.graphicsexample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
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
        private Drawable drawable;

        public ExampleView (Context context) {
            super(context);
            drawable = ContextCompat.getDrawable(context, R.drawable.anubis);
            drawable.setBounds(30, 30, 1000, 1267);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            /* Paint circle using color defined in resource files
            Paint brush = new Paint();
            brush.setColor(Color.BLUE);
            brush.setStrokeWidth(8);
            brush.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(150, 150, 100, brush);
            //brush.setColor(Color.argb(127, 255, 0, 0));
            brush.setColor(getResources().getColor(R.color.colorCircle));
            canvas.drawCircle(150, 250, 100, brush);
            */

            /* Paint path
            Path stroke = new Path();
            //stroke.addCircle(150, 150, 100, Path.Direction.CW);
            stroke.moveTo(50, 100);
            stroke.cubicTo(60,70, 150, 65, 200, 110);
            stroke.lineTo(300, 200);
            canvas.drawColor(Color.WHITE);
            Paint brush = new Paint();
            brush.setColor(Color.BLUE);
            brush.setStrokeWidth(8);
            brush.setStyle(Paint.Style.STROKE);
            canvas.drawPath(stroke, brush);
            brush.setStrokeWidth(1);
            brush.setStyle(Paint.Style.FILL);
            brush.setTextSize(25);
            brush.setTypeface(Typeface.SANS_SERIF);
            canvas.drawTextOnPath("Android development", stroke, 0, 40, brush);
            */

            drawable.draw(canvas);
        }
    }
}
