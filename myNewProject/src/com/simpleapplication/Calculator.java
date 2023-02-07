package com.simpleapplication;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

    int fnum, snum, answer;

    Scanner input = new Scanner(System.in);
        System.out.println("Enter your first number: ");
    fnum = input.nextInt();
        System.out.println("Enter your second number: ");
    snum = input.nextInt();
        System.out.println("Operators:");
        System.out.println("---------------");
        System.out.println("+ -> addition");
        System.out.println("- -> subtraction");
        System.out.println("* -> multiplication");
        System.out.println("/ -> division");
        System.out.println("% -> modulo");
        System.out.println("Enter the operator: ");
    String operator = input.next();

// SWITCH STATEMENT
//            switch (operator) {
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
//                break;//
//            case "%":
//                answer = fnum % snum;
//                System.out.println("The remainder is: " + answer);
//                break;
//            default:
//                System.out.println("Invalid Operator!");
//                break;
//        }

// NESTED IFS
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
        } else if (operator.equals("%")) {
            answer = fnum % snum;
            System.out.println("The remainder is: " + answer);
        } else {
            System.out.println("Invalid Operator!");
        }
    }
}
