package com.fju;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        int[] prices = {15,20,25,30,35};
        int total = 0;
        boolean end = false;
        Scanner scanner = new Scanner(System.in);

        while (!end){
            System.out.println("Please put your coin(1/5/10)" + total);
            String string = scanner.next();

            switch (string){
                case "1":
                case "5":
                case "10":
                    int num = Integer.parseInt(string);
                    total = total + num;
                    break;
                case "0":
                    break;
                case "a":
                case "b":
                case "c":
                case "d":
                case "e":
                    int index = string.charAt(0)-97;
                    if (total > prices[index]){
                        System.out.println("DON");
                        total = total-prices[index];
                    }else {
                        System.out.println("BEEP");
                    }
                    break;

                default:
                    System.out.println("WRONG");
                    break;
            }
        }
    }
}
