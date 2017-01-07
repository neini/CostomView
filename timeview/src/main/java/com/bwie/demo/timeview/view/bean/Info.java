package com.bwie.demo.timeview.view.bean;

/**
 * Created by ${薛亚南}
 * on 2017/1/7 11：02.
 */

public class Info {
    private String title;
    private String time;
    private String des;

    public Info(String title, String time, String des) {
        this.title = title;
        this.time = time;
        this.des = des;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getTitle() {
        return title;
    }

    public String getTime() {
        return time;
    }

    public String getDes() {
        return des;
    }
}
