package com.simpleapplication;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Instantiate new scanner.
        int total = 0; //holds the sum of all the grades.
        int grade; //holds the input of numbers individually.
        int average;
        int counter = 0; //just a counter for the number.
        int number = 10;

        while (counter < 10) {
            System.out.println("Please input "+ number-- +" number/s: ");
            grade = input.nextInt();
            total = total + grade;
            counter++;
        }
        average = total/10;
        System.out.println("Your average is " + average);
    }
}
