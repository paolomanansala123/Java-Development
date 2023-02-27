package com.arrays;
import java.util.Random;

public class arrayElementsAsCounters {

    public static void main(String[] args) {
        Random rand = new Random();
        int freq[] = new int[7]; // 0 to 6

        for (int roll = 1; roll<1000; roll++) {
            ++freq[1+rand.nextInt(6)];// will give you number 1 through 6
//            ++freq[rand.nextInt(6)]; will give you number 0 through 5
        }

            System.out.println("Face\tFrequency");

            for(int face=1; face<freq.length; face++) {
                System.out.println(face+"\t\t"+freq[face]);
        }
    }
}
