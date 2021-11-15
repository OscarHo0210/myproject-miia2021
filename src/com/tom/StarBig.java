package com.tom;

public class StarBig {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            for (int j = 0; j <= 20; j++){
                if (i <= 5 && 2*i == j){
                        System.out.print("*");
                 }
                else if (i > 5 && 2 * i == 20 - j){
                        System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            System.out.println();

        }
    }
}
