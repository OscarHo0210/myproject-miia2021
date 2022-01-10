package com.simu;

public class Simu1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if (i == 0|| i==4){
                    System.out.print("*");
                }else {
                    if (j == 0 || j ==5){
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
/*
 ******
 *    *
 *    *
 *    *
 ******
 */
