package com.tom;

public class UsingSwitch {
    public static void main(String[] args) {
        int i = 0;

        switch (i){
            case 1:
                System.out.println("1");
                break;
            case 0:
                System.out.println("0");
                break;
            default:
                System.out.println("other");
                break;
        }

        System.out.println("end");
    }
}
