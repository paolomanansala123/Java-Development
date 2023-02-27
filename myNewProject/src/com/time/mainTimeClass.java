package com.time;

public class mainTimeClass {
    public static void main(String[] args) {
        TimeClass timeClass = new TimeClass();
        System.out.println(timeClass.toMilitary());
        timeClass.setTime(13, 27,6);
        System.out.println(timeClass.toMilitary());


    }
}
