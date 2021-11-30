package com.tom;


import java.util.Random;

public class RollingDice {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(6)+1;
        int[] dices = {1, 2, 3, 4, 5, 6};
        for (int i = 0; i < 10; i++){
            switch (i){
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    System.out.println("end");
                    System.out.println(i);

            }
        }

    }
}
