package com.fju;

import java.util.Random;
import java.util.Scanner;

public class Guess1To100 {
    public static void main(String[] args) {
        Random random = new Random();
        int hideNumber = random.nextInt(100)+1;
        System.out.println(hideNumber);
        int start = 1;
        int end = 100;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number between 1 to 100");

        for (int i = 0; i<5; i++){
            int number = scanner.nextInt();
            if (number>hideNumber){
                if (end>number){
                    end = number;
                }
                System.out.println("Please enter a number between " +start+" To "+ end);
            }else if (number<hideNumber){
                if (start<number){
                    start = number;
                }
                System.out.println("Please enter a number between " +start+" To "+ end);
            }else if (number==hideNumber){
                System.out.println("You win, the number is "+hideNumber);
                break;
            }

            if (i==4){
                System.out.println("You loose, the number is "+ hideNumber);
                break;
            }
        }
    }
}
