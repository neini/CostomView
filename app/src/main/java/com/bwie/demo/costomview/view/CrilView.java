package com.bwie.demo.costomview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${薛亚南}
 * on 2017/1/6 19：16.
 */

public class CrilView extends View {
    public CrilView(Context context) {
        super(context);
    }

    public CrilView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CrilView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        paint.setDither(true);
         paint.setStrokeWidth(3);
        //设置风格
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawPoint(200, 200, paint);
        canvas.drawCircle(200, 200, 100, paint);
        canvas.drawCircle(200, 200, 200, paint);
    }
}
