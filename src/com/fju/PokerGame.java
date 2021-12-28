package com.fju;

import java.util.Random;

public class PokerGame {
    public static void main(String[] args) {
        Random random = new Random();
        char[] type = {'C', 'D', 'H', 'S'};

        int[] cards = new int[52];
        //準備
        for (int i = 0; i < 52; i++) {
            cards[i] = i;
            System.out.print(cards[i] + " ");
        }
        System.out.println();
        //洗牌
        for (int i = 0; i < 52; i++) {
            int r = random.nextInt(52);
            int tmp = cards[i];
            cards[i] = cards[r];
            cards[r] = tmp;
        }
        for (int i = 0; i < 52; i++) {
            System.out.print(cards[i] + "　");
        }
        System.out.println();
        System.out.println("--------------------------------------------------");

        //computer
        int computer = random.nextInt(52);
        int computerPoint = computer%13+1;
        int computerType = computer/13;
        System.out.println("Computer: " + computerPoint + "" + type[computerType] + "(" + computer + ")");

        //player
        int player = random.nextInt(52);
        int playerPoint = player%13+1;
        int playerType = player/13;
        System.out.println("Player: " + playerPoint + "" + type[playerType] + "(" + player + ")");

        if (playerPoint > computerPoint || (playerType > computerType && player == computerType)){
            System.out.println("You win");
        }else if (playerPoint == 1){
            System.out.println("You win");
        } else {
            System.out.println("You loose");
        }

    }
}
