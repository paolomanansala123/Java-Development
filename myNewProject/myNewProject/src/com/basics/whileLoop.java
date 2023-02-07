package com.basics;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        int counter;

        Scanner test = new Scanner(System.in);
        System.out.println("Enter your number:");
        counter = test.nextInt();

        while (counter < 10) {
            System.out.println(counter);
            counter+=2; //incremental
        }
    }
}
