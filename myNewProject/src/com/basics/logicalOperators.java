package com.basics;

public class logicalOperators {
    public static void main(String[] args) {
        int boy, girl;
        boy = 18;
        girl = 99;

        // AND
//        if (boy > 10 && girl < 60) {
//            System.out.println("You can enter!");
//        } else {
//            System.out.println("You cannot enter!");
//        }

        // OR
        if (boy > 10 || girl < 60) {
            System.out.println("You can enter!");
        } else {
            System.out.println("You cannot enter!");
        }
    }
}
