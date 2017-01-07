package com.bwie.demo.costomview.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

import com.bwie.demo.costomview.R;

/**
 * Created by ${薛亚南}
 * on 2017/1/6 20：25.
 */

public class BitmapView extends View {
    public BitmapView(Context context) {
        super(context);
    }

    public BitmapView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BitmapView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
        //绘制点的过程
        //  canvas.drawBitmap(bitmap, 400, 400, null);
        //设置矩阵
//       Matrix matrix=new Matrix();
//        matrix.postTranslate(10,10);
//        matrix.postScale(2,2);
//        canvas.drawBitmap(bitmap,matrix,null);
        RectF rectF = new RectF(0, 0, 200, 200);
        Rect rect = new Rect(0,0,200,200);
        canvas.drawBitmap(bitmap, rect, rectF, new Paint());
    }
}
