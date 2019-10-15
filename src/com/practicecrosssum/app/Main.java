package com.practicecrosssum.app;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Constants declaration
        final int ELEMENTS_ARRAY = 5;

        //Variable declarations
        byte vector1[] = new byte[ELEMENTS_ARRAY];
        byte vector2[] = new byte[ELEMENTS_ARRAY];
        int vectorResults [] = new int[ELEMENTS_ARRAY];
        int resultSum = 0;

        //Object declaration
        Random random = new Random(System.nanoTime());

        //Fill vectors
        for (byte i = 0; i < vector1.length; i++){
            vector1[i] = (byte) (random.nextInt(100) + 1);
            vector2[i] = (byte) (random.nextInt(100) + 1);
        }

        //Process sum
        for (byte i = 0, j = ELEMENTS_ARRAY - 1; i < vector1.length; i++, j--){
            resultSum = vector1[i] + vector2[j];
            vectorResults[i] = resultSum;
         //   System.out.println(vector1[i]+" + "+vector2[j]+" = " + resultSum);
        }

        //Output vector results
        for(byte i = 0; i < ELEMENTS_ARRAY; i++){
            System.out.println(vectorResults[i]);
        }
    }
}
