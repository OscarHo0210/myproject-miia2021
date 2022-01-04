package com.fju;

import java.util.Scanner;

public class VendingMachine {
    //會考
    public static void main(String[] args) {
        int total = 0;
        boolean end = false;
        //int aDrinkPrice = 15;
        //int bDrinkPrice = 25;
        //int cDrinkPrice = 30;
        int[] prices = {15, 25, 30, 22, 18};
        System.out.println(prices.length);
        System.out.println(prices[0]);
        for (int i = 0; i< prices.length; i++){
            System.out.println(prices[i]);
        }

        Scanner scanner = new Scanner(System.in);
        while (!end){
            System.out.println("Please put your coin(1/5/10) total: " + total);
            String s = scanner.next();

            try {
                switch (s){
                    case "1":
                    case "5":
                    case "10":
                        int n = Integer.parseInt(s);
                        //total = total + coin;
                        total+=n;
                        int i = 0;
                        i++;
                        break;
                    case "a":
                    case "b":
                    case "c":
                    case "d":
                    case "e":
                        System.out.println(s.compareTo(s));
                        int index = s.compareTo(s);
                        if (total>=prices[index]){
                            System.out.println("DON");
                            total-=prices[index];
                        }else {
                            System.out.println("BEEP");
                        }
                        break;
                    case "0":
                        end = true;
                        System.out.println("end");
                        break;
                    default:
                        break;
                }

            }catch (NumberFormatException e){
                if (s.equals("a")){
                    System.out.println("Drink A");
                }
                if (total >= prices[0]){
                    total = total - prices[0];
                    System.out.println("DON");
                }else {
                    System.out.println("BEEP");
                }
                break;
            }
        }
                /* System.out.println("Choose drink a or b: ");
                 String drink = scanner.next();
                 switch (drink){
                     String a;
                     String b;
                     case a:
                 }*/

    }
}
