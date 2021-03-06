package com.example.graphicsexample;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;

public class ExampleView extends View {
    private Drawable drawable;
    private ShapeDrawable shape;

    public ExampleView (Context context, AttributeSet attrs) {
        super(context, attrs);
        //drawable = ContextCompat.getDrawable(context, R.drawable.anubis);
        //drawable.setBounds(30, 30, 1000, 1267);
        //drawable = ContextCompat.getDrawable(context, R.drawable.ic_00555_celtic_swirl);
        //drawable.setBounds(30, 30, 1000, 1000);
        shape = new ShapeDrawable(new OvalShape());
        shape.getPaint().setColor(0xFF0000FF);
//        shape.setBounds(50, 50, 310, 200);
    }

    @Override
    protected void onSizeChanged(int width, int height, int prev_width, int prev_height)
    {
        shape.setBounds(0, 0, width, height);
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

        shape.draw(canvas);
    }
}