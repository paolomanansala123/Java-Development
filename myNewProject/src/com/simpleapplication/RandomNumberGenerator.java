package com.simpleapplication;

import java.util.Random;

public class RandomNumberGenerator {
    public static void main(String[] args) {
       Random dice = new Random();
       int number;

       for(int counter=1; counter<=10; counter++) {
//           number = dice.nextInt(6); //will only give you 0 through 5.
           number = 1+dice.nextInt(6); //will give you 1 through 6.
           System.out.println(number);
       }
    }
}
