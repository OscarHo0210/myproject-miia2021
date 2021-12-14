package com.fju;

public class Poker {
    public static void main(String[] args) {
        //unicode
        int n = 0x00A9;
        System.out.println((char) n);
        System.out.println("------------------------------------------");
        //array
        char[] pokers = {'C', 'D', 'H', 'S'};
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                System.out.print((j+1)  + "" + pokers[i] + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        //switch case
        String string = "C";
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                switch(i){
                    case 1:
                        string = "D";
                        break;
                    case 2:
                        string = "H";
                        break;
                    case 3:
                        string = "S";
                        break;
                }
                System.out.print((j+1) + string + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------------");
        //if else
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 13; j++) {
                if (i == 0){
                    System.out.print((j+1) + "C");
                }else if (i ==1){
                    System.out.print((j+1) + "D");
                }else if (i ==2){
                    System.out.print((j+1) + "H");
                }else {
                    System.out.print((j+1) + "S");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
