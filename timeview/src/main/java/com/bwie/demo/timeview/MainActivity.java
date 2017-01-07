package com.bwie.demo.timeview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.bwie.demo.timeview.view.TimeView;
import com.bwie.demo.timeview.view.bean.Info;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private List<Info> infoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        initData();
         listView.setAdapter(new BaseAdapter() {
             @Override
             public int getCount() {
                 return infoList.size();
             }

             @Override
             public Object getItem(int i) {
                 return infoList.get(i);
             }

             @Override
             public long getItemId(int i) {
                 return i;
             }

             @Override
             public View getView(int i, View view, ViewGroup viewGroup) {
               View  view1 = LayoutInflater.from(MainActivity.this).inflate(R.layout.item,viewGroup,false);
                 TextView tv_content = (TextView) view1.findViewById(R.id.tv_content);
                 TextView tv_time = (TextView) view1.findViewById(R.id.tv_time);
                 TimeView timeView = (TimeView) view1.findViewById(R.id.timeView);
                 tv_content.setText(infoList.get(i).getTitle());
                 tv_time.setText(infoList.get(i).getDes());
                 timeView.setText(infoList.get(i).getTime());

                 return view1;
             }
         });
    }

    public void initData() {
        infoList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            infoList.add(new Info("nn", "10." + i, "我是" + i));

        }
    }
}
