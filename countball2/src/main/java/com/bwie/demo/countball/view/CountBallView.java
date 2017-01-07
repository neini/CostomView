package com.bwie.demo.countball.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${薛亚南}
 * on 2017/1/6 21：16.
 */

public class CountBallView extends View implements View.OnClickListener {
    private int count = 0;

    public CountBallView(Context context) {
        super(context);
        init();
    }

    public CountBallView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CountBallView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, 50, paint);
      //  canvas.drawCircle(200, 200, 50, paint);
        Rect rect = new Rect();
        paint.setColor(Color.BLUE);
        paint.setTextSize(20);
        String str = count + "";
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(str, getMeasuredWidth() / 2 - rect.width() / 2, getMeasuredHeight() / 2 + rect.height() / 2, paint);

    }
    public void init() {
        this.setOnClickListener(this);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    public void onClick(View view) {
        count++;
        postInvalidate();
    }
}
