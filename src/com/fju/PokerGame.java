package com.fju;

import java.util.Random;

public class PokerGame {
    public static void main(String[] args) {
        Random random = new Random();
        char[] type = {'C', 'D', 'H', 'S'};

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
        }else {
            System.out.println("You loose");
        }

    }
}
