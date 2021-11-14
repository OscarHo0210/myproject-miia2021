package com.tom;

import java.util.Random;
import java.util.Scanner;

public class Guess1To100 {
    public static void main(String[] args) {
        Random random = new Random();
        int hideNumber = random.nextInt(100)+1;
        int start = 1;
        int end = 100;
        System.out.println(hideNumber);

        for (int i = 0; i < 3; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter your number: ");
            int number = scanner.nextInt();
            System.out.println("User" + number);
            if (number>hideNumber){
                if (end>number){
                    end = number;
                }
                System.out.println("Smaller " + start + "~" + end);
            }else if (number<hideNumber){
                if (start<number){
                    start = number;
                }
                System.out.println("Bigger " + start + "~" + end);
            }else if (number == hideNumber){
                System.out.println("Bingo");
                break;
            }

        }
            System.out.println("Bye");

    }
}
