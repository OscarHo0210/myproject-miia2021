package com.simu;

import java.util.Scanner;

public class Simu2 {
    public static void main(String[] args) {
        int[] prices = {15,30,20};
        int n = -1;
        int total =1000;
        Scanner scanner = new Scanner(System.in);
        while (n !=0){
            System.out.println("buy item((1)dress(2)socks(3)bag)");
            String string = scanner.next();
            switch (string){
                case "1":
                case "2":
                case "3":
                case "0":
                    int index = Integer.parseInt(string);
                    total = total - prices[index-1] ;
                    System.out.println(total);
                    break;
            }

        }
    }
}
