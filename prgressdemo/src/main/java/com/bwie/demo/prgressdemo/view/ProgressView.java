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

public class ProgressView extends View {
    private int progress;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            if (progress >= 100) {
                handler.removeCallbacksAndMessages(null);
            } else {
                progress++;
                invalidate();
                handler.sendEmptyMessageDelayed(0, 200);
            }

        }
    };

    public ProgressView(Context context) {
        super(context);
    }

    public ProgressView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ProgressView(Context context, AttributeSet attrs, int defStyleAttr) {
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
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, getMeasuredHeight() / 2, paint);
        paint.setColor(Color.BLUE);
        RectF rectF = new RectF(0, 0, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawArc(rectF, 0, 360 * progress / 100, false, paint);

        String text = progress + "";
        Rect rect = new Rect();
        paint.getTextBounds(text, 0, text.length(), rect);
        //  float v = paint.measureText(text);

        canvas.drawText(text, getMeasuredHeight() / 2 - rect.width() / 2, getMeasuredHeight() / 2 + rect.height() / 2, paint);
    }

    public void start() {
        handler.sendEmptyMessageDelayed(0, 200);
    }

}
