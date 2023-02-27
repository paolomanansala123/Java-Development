package com.basics;

public class enhancedForLoop {
    public static void main(String[] args) {
        int array[] = {4,5,6,7};
        int total = 0;

        // for(type identifier : name)
        for(int x : array){
            total+=x;
        }

        System.out.println(total);
    }
}
