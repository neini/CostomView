package com.bwie.demo.timeview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

import java.util.Random;


/**
 * Created by ${薛亚南}
 * on 2017/1/7 10：58.
 */

public class TimeView extends View {
    private Random random = new Random();
    private String text = "0";

    public TimeView(Context context) {
        super(context);
    }

    public TimeView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public TimeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(Color.rgb(100 + random.nextInt(155), 100 + random.nextInt(155), 100 + random.nextInt(155)));
        paint.setStyle(Paint.Style.FILL);
        //获取当前控件的宽和高 设置圆心点的坐标和半径
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, paint);
        Rect rect = new Rect();
        //绘制文字
        paint.setTextSize(20);
        //测出文字的大小
        paint.getTextBounds(text, 0, text.length(), rect);
        paint.setColor(Color.BLACK);
        canvas.drawText(text, getMeasuredHeight() / 2 - rect.width() / 2, getMeasuredHeight() / 2 + rect.height() / 2, paint);
    }

    public void setText(String text) {
        this.text = text;
    }
}
