package com.bwie.demo.costomview.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ${薛亚南}
 * on 2017/1/6 20：43.
 */

public class MytextView extends View {
    public MytextView(Context context) {
        super(context);
    }

    public MytextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MytextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setDither(true);
        paint.setAntiAlias(true);
        String str = "hello world! I am xue ya nan ,I hope I can do my Dream";
          paint.setTextSize(13);
        canvas.drawText(str, 0, 100, paint);
        Path path = new Path();
        path.addCircle(100, 300, 50, Path.Direction.CW);
        canvas.drawTextOnPath(str, path, 0, 0, paint);
    }
}
