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
        int computerPoint = computer%13+1; //點數 1~13
        int computerType = computer/13; //花色 0~3
        System.out.println("Computer: " + computerPoint + "" + type[computerType] + "(" + computer + ")");

        //player
        int player = random.nextInt(52);
        int playerPoint = player%13+1;
        int playerType = player/13;
        System.out.println("Player: " + playerPoint + "" + type[playerType] + "(" + player + ")");

        //玩家點數>電腦點數 或 (玩家花色>電腦花色 && 玩家點數==電腦點數)
        if (playerPoint > computerPoint || (playerType > computerType && playerPoint == computerPoint)){
            System.out.println("You win");
        }else if (playerPoint == 1){
            System.out.println("You win");
        } else {
            System.out.println("You loose");
        }

    }
}
