package com.tom;

import java.util.Random;

public class Number {
    Random random = new Random();
    int hideNumber = random.nextInt(10)+1;

    public boolean bigger(int n){
        if (n > hideNumber){
            return true;
        }else if (n == hideNumber){
            return true;
        }else {
            return false;
        }
    }

    public boolean smaller(int n){
        if (n < hideNumber){
            return true;
        }else if (n == hideNumber){
            return true;
        }else {
            return false;
        }
    }

}
