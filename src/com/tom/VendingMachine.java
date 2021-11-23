package com.tom;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        int total = 0;
        boolean end = false;
        int aDrinkPrice = 15;
        int bDrinkPrice = 25;
        Scanner scanner = new Scanner(System.in);

        while (!end){
            System.out.println("Please put your coin(1/5/10) total: " + total);
            String s = scanner.next();

            try {
                int coin = Integer.parseInt(s);
                switch (coin){
                    case 1:
                    case 5:
                    case 10:
                        total = total + coin;
                        break;
                    case 0:
                        end = true;
                        System.out.println("end");
                        break;
                    default:
                        break;
                }

            }catch (NumberFormatException e){
                System.out.println("Wrong");
                if (s.equals("a")){
                    System.out.println("Drink A");
                }
                if (total >= aDrinkPrice){
                    total = total - aDrinkPrice;
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
