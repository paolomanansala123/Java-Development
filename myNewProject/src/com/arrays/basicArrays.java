package com.arrays;

public class basicArrays {
    public static void main(String[] args) {
//        int array[] = new int[10];  //the number inside int is the number of variables you wanna restore on the array.
//        array[0] = 87;
//        array[1] = 543;
//        array[9] = 23;

//        System.out.println(array[0]); //will give you the specific array.
//        System.out.println();

        //using Array Initializer.
        int array[] = {2,3,4,5,2,3};
        int i;

        for (i = 0; i<array.length; i++) { //array.length will give you the length of the array, in this case = 6.
            System.out.println(array[i]);
        }
    }


}
