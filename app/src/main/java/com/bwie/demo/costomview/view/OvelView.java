package com.bwie.demo.costomview.view;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${薛亚南}
 * on 2017/1/6 19：39.
 */

public class OvelView extends View {
    public OvelView(Context context) {
        super(context);
    }

    public OvelView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public OvelView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int height =    getMeasuredHeight();
        int weith = getMeasuredWidth();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setStyle(Paint.Style.STROKE);
        RectF rectF = new RectF(0,0,300,500);
        canvas.drawOval(rectF, paint);

    }
}
