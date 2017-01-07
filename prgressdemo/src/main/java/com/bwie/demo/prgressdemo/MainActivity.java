package com.bwie.demo.prgressdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bwie.demo.prgressdemo.view.ProgressView;
import com.bwie.demo.prgressdemo.view.ProgressView2;

public class MainActivity extends AppCompatActivity {

    private ProgressView2 progressView2;
    private ProgressView progressView;
    private int progress = 0;
    public static Object object = new Object();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //   progressView = (ProgressView) findViewById(R.id.progress);
        progressView2 = (ProgressView2) findViewById(R.id.progress2);

    }

    public void startPlay(View view) {
        progress=0;
       //  progressView.start();
        progressView2.setMax(100);
        new Thread() {
            @Override
            public void run() {
                super.run();
                synchronized (object) {
                    while (true) {
                        try {
                            sleep(200);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        if (progress >= 100) {
                            progress=100;
                            break;
                        }else{
                            progress++;
                            progressView2.setPrgressAndText(progress);
                        }
                    }
                }
            }
        }.start();

    }
}
