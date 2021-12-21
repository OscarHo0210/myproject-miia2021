package com.tom;

import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        Number n = new Number();
        int start = 1;
        int end = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println(n.hideNumber);
        System.out.println("Please enter a number: ");

        for (int i = 0; i<5; i++){
            int number = scanner.nextInt();
            if (n.bigger(number)){
                if (end>number){
                    end = number;
                }
                System.out.println("Please enter a number between " +start+" To "+ end);
            }else if (n.smaller(number)){
                if (start<number){
                    start = number;
                }
                System.out.println("Please enter a number between " +start+" To "+ end);
            }else {
                System.out.println("You win, the number is "+n.hideNumber);
                break;
            }
            if (i==4){
                System.out.println("You loose, the number is "+ n.hideNumber);
                break;
            }
        }
    }
}
