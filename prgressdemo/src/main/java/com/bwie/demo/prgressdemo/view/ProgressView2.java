package com.bwie.demo.prgressdemo.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${薛亚南}
 * on 2017/1/7 08：46.
 */

public class ProgressView2 extends View {
    private int progress;
    private int max;


    public ProgressView2(Context context) {
        super(context);
    }

    public ProgressView2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ProgressView2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setDither(true);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(getMeasuredWidth()/2, getMeasuredHeight()/2,  getMeasuredHeight()/2, paint);
        RectF rectF = new RectF(0, 0, getMeasuredWidth(), getMeasuredHeight());
        paint.setColor(Color.BLUE);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        if(max != 0)
        canvas.drawArc(rectF, 0, 360 * progress / max, true, paint);

        String text = progress + "%";
        Rect rect = new Rect();
        paint.getTextBounds(text, 0, text.length(), rect);
        paint.setColor(Color.BLACK);
        canvas.drawText(text, getMeasuredWidth()/2 - rect.width() / 2, getMeasuredHeight()/2 + rect.height() / 2, paint);
    }
    public void setMax(int max){
        this.max=max;
    }
    public void setPrgressAndText(int progress){
        this.progress=progress;
        postInvalidate();
    }
}
