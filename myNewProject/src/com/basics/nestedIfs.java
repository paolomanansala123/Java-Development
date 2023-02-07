package com.basics;

import java.util.Scanner;

public class nestedIfs {
    public static void main(String[] args) {
//        int age = 60;
//
//        if (age < 50) {
//            System.out.println("You are young!");
//        } else {
//            System.out.println("You are old!");
//            if (age > 75) {
//                System.out.println("You are REALLY old!");
//            } else {
//                System.out.println("Don't worry you aren't really old!");
//            }
//        }
//    }
        int fnum, snum, answer;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        fnum = input.nextInt();
        System.out.println("Enter your second number: ");
        snum = input.nextInt();
        System.out.println("Enter the operator (+,-,*,/): ");
        String operator = input.next();
        //Using Switch Statement!
//        String operator = input.nextLine();

// Using Switch Statement.
//        switch (operator) {
//            case "+":
//                answer = fnum + snum;
//                System.out.println("The sum is: " + answer);
//                break;
//            case "-":
//                answer = fnum - snum;
//                System.out.println("The difference is: " + answer);
//                break;
//            case "*":
//                answer = fnum * snum;
//                System.out.println("The product is: " + answer);
//                break;
//            case "/":
//                answer = fnum / snum;
//                System.out.println("The quotient is: " + answer);
//                break;
//            default:
//                System.out.println("Invalid Operator!");
//                break;
//        }
//    }

        // Using nested ifs.
        if (operator.equals("+")) {
            answer = fnum + snum;
            System.out.println("The sum is: " + answer);

        } else if (operator.equals("-")) {
            answer = fnum - snum;
            System.out.println("The difference is: " + answer);

        } else if (operator.equals("*")) {
            answer = fnum * snum;
            System.out.println("The product is: " + answer);

        } else if (operator.equals("/")) {
            answer = fnum / snum;
            System.out.println("The quotient is: " + answer);

        } else {
            System.out.println("Invalid Operator!");
        }
    }
}
