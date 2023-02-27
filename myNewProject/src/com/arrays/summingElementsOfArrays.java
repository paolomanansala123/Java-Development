package com.arrays;

public class summingElementsOfArrays {
    public static void main(String[] args) {
        int array[] = {21, 10, 15, 16, 30};
        int sum = 0;

        for (int i=0; i<array.length; i++) {
            sum+=array[i];
        }
        System.out.println("The sum of these numbers is " + sum);
    }
}
