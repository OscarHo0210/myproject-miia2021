package com.tom;

public class DiceCounter {
    public static void main(String[] args) {
        int[] counters = new int[6];
        for (int i = 0; i < 10; i++) {
            Dice dice1 = new Dice();
            Dice dice2 = new Dice();
            dice1.roll();
            System.out.println(dice1.point);
            counters[dice1.point-1]++;
        }
        int max = 0;
        int point = 0;
        for (int i = 0; i < 6; i++) {
            System.out.println((i+1) + " -> " + counters[i] + " times");
            if (counters[i] > max) {
                max = counters[i];
                point = i+1;
            }
        }
    }
}
