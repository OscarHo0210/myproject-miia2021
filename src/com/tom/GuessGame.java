package com.tom;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Number n = new Number();
        Scanner scanner = new Scanner(System.in);
        System.out.println("input range:");
        int inputRange = scanner.nextInt();
        n.generateNumber(inputRange);
        System.out.println("enter times");
        int enterTimes = scanner.nextInt();
        n.setGuessTimes(enterTimes);
        System.out.println("Please enter a number: ");

        for (int i = 0; i < n.getGuessTimes(); i++){
            int number = scanner.nextInt();
            int getGuessResult = n.getGuessResult(number);

            if (getGuessResult <0){
                System.out.println("Please enter BIGGER number");
            }else if (getGuessResult >0){
                System.out.println("Please enter SMALLER number");
            }else {
                System.out.println("BINGO!!");
                break;
            }
        }
    }
}
