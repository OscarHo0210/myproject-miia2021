package com.fju;

import java.util.Random;

public class DiceCounter {
    public static void main(String[] args) {
        Random random = new Random();
        int[] dices = new int[6];

        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(6) + 1;
            System.out.println(num);
            dices[num - 1]++;
        }
        for (int i = 0; i < 6; i++) {
            int max = 0;
            int point = 0;
            if (dices[i] > max) {
                max = dices[i];
                point = i + 1;
                System.out.println((i+1) + " -> " + dices[i] + " times");
            }
        //System.out.println((i+1) + " -> " + dices[i] + " times");

        }
    }
    
}
