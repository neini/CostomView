package com.bwie.demo.costomview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by ${薛亚南}
 * on 2017/1/6 19：06.
 */

public class LineView extends View {
    public LineView(Context context) {
        super(context);
    }

    public LineView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public LineView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        //  paint.setColor(Color.RED);
        //抗锯齿 抗震动
        paint.setAntiAlias(true);
        paint.setDither(true);
        //设置宽度
        paint.setStrokeWidth(2);
        paint.setColor(Color.GREEN);
        //绘制一堆线
        //一堆点坐标  x0,y0,x1,y1
        float[] pts = {0, 0, 100, 100, 100, 100, 200, 100, 200, 100, 300, 300};
        canvas.drawLines(pts, paint);
        //  canvas.drawLine(0, 0, 100, 200, paint);
    }
}
