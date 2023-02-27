package com.arrays;

public class basicArrayTable {
    public static void main(String[] args) {
        System.out.println("Index\tValue");  //\t is just a tab.
        int[] array = {2, 5, 6, 40, 10, 5};

        for(int i=0; i<=array.length; i++) {
            System.out.println(i + "\t\t" +array[i]);
        }
    }
}
