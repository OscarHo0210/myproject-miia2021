package com.tom;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int hideNumber = random.nextInt();
        System.out.println(hideNumber);
        System.out.println("Please enter your number: ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        System.out.println("User: " + string);
        int number = Integer.parseInt(string);
        if (number > hideNumber){
            System.out.println("Smaller");
        }else if (number < hideNumber){
            System.out.println("Bigger");
        }else if (number == hideNumber){
            System.out.println("Bingo");
        }
    }
}
