package com.tom;

public class Star {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++){
            for (int j = 0; j < 20; j++){
                if (i == 1){
                    System.out.print("*");
                }else if (i == 2){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
