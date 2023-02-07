package com.simpleapplication;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        // A = P(1+r)^n
        // A -> Future Amount
        // P -> Present Amount
        // r -> rate
        // n -> duration in (days, months, years)
//        double future;
//        double present = 10_000; //initial amount
//        double rate = 0.01;
//
//        for(int year=1; year<=20; year++){
//            future = present*Math.pow(1+rate, year); //Math.pow(1+rate, day) = (1+rate)^year
//            System.out.println(year + "  " + future);
//        }

        double future;
        double present;
        double rate;
        int startYear;
        int endYear;
        int i;
        int numberOfYears;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Initial Amount :");
        present = input.nextDouble();
        System.out.println("Enter the rate: ");
        rate = input.nextDouble();
        System.out.println("Enter the Starting Year: ");
        startYear = input.nextInt();
        System.out.println("Enter the End Year: ");
        endYear = input.nextInt();

        numberOfYears = endYear - startYear;

        for (i = 0; i <= numberOfYears; i++){
            future = present*Math.pow(1+rate, i);
            System.out.println(startYear++ + " -> " + future);
        }
    }
}
