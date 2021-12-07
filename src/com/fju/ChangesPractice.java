package com.fju;

public class ChangesPractice {
    public static void main(String[] args) {
        int i = 38;
        System.out.println("10: " + (i/10));
        System.out.println("5:  " + (i-(i/10)*10-i%5)/5);
        System.out.println("1:  " + (i % 5));
    }
}
