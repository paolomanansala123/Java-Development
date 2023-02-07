package com.basics;

import java.util.Scanner;

public class ifElseStatements {
    public static void main(String[] args) {
        int myNumber;
        Scanner test = new Scanner(System.in);
        System.out.println("Enter you number: ");
        myNumber = test.nextInt();


        if (myNumber < 5) {
            System.out.println(myNumber + " is less than 5");
        } else {
            System.out.println(myNumber + " is greater than 5");
        }
    }
}
