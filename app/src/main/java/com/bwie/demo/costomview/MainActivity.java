package com.bwie.demo.costomview;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bwie.demo.costomview.activity.ArcActivity;
import com.bwie.demo.costomview.activity.BitmapActivity;
import com.bwie.demo.costomview.activity.CrileActivity;
import com.bwie.demo.costomview.activity.LineActivity;
import com.bwie.demo.costomview.activity.MyTextActivity;
import com.bwie.demo.costomview.activity.OvelActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //画圆
    public void drawCril(View view) {
        jump(CrileActivity.class);
    }

    //画线
    public void drawLine(View view) {
        jump(LineActivity.class);
    }

    //圆椭圆
    public void drawOvel(View view) {
        jump(OvelActivity.class);
    }

    //圆图
    public void drawBitmap(View view) {
        jump(BitmapActivity.class);
    }

    //画文本
    public void drawText(View view) {
        jump(MyTextActivity.class);
    }

    //圆弧画
    public void drawArc(View view) {
        jump(ArcActivity.class);
    }


    public void jump(Class cla) {
        Intent intent = new Intent(this, cla);
        startActivity(intent);
    }
}
