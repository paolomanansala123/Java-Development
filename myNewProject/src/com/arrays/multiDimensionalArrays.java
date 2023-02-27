package com.arrays;

public class multiDimensionalArrays {
    public static void main(String[] args) {
//        int firstArray[][] = new int[2][3];
        int firstArray[][] = {{8,9,10,11},{12,13,14,15}};
        int secondArray[][] = {{30,31,32,33},{43},{4,5,6}};

        System.out.println("This is the first array!");
        display(firstArray);

        System.out.println("This is the second array!");
        display(secondArray);
    }

    public static void display(int x[][]) {
        for(int row=0;row<x.length; row++) {
            for(int column=0; column<x[row].length; column++){
                System.out.print(x[row][column]+"\t\t");
            }
            System.out.println();
        }
    }
}
