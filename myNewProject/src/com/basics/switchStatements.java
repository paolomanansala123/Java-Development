package com.basics;

import java.util.Scanner;

public class switchStatements {
    public static void main(String[] args) {
        int age;

        Scanner test = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        age = test.nextInt();


        switch (age) {
            case 1 :
                System.out.println("You can crawl!");
                break;
            case 2 :
                System.out.println("You can talk!");
                break;
            case 3 :
                System.out.println("You can get in trouble!");
                break;
            default:
                System.out.println("I don't know what is your age!");
                break;
        }
    }

}
