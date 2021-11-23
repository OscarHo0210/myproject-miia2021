package com.tom;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        int total = 0;
        boolean end = false;
        Scanner scanner = new Scanner(System.in);

        while (!end){
            System.out.println("Please put your coin(1/5/10) total: " + total);
            int coin = scanner.nextInt();

            switch (coin){
                case 1:
                    total = total + 1;
                    break;
                case 5:
                    total = total + 5;
                    break;
                case  10:
                    total = total + 10;
                    break;
                case 0:
                    end = true;
                    System.out.println("end");
                    break;
                default:
                    break;
            }
        }
    }
}
