package com.time;

public class TimeClass {
    private int hour;
    private int minute;
    private int second;

    public void setTime(int h, int m, int s){
        hour = ((h>=0 && h<24) ? h : 0 ); //validation
        minute = ((m>=0 && m<60) ? m : 0 ); //validation
        second = ((s>=0 && s<60) ? s : 0 ); //validation
    }

    public String toMilitary() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

}
