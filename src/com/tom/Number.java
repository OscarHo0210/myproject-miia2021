package com.tom;

import java.util.Random;

public class Number {
    int hideNumber;
    int saveTimes;

    void generateNumber(int range){
        Random random = new Random();
        hideNumber = random.nextInt(range)+1;
        System.out.println(hideNumber);
    }

    void setGuessTimes(int times){
        saveTimes = times;
    }

    int getGuessTimes() {
        return saveTimes;
    }

    int getGuessResult(int number) {
        return number - hideNumber;
    }
}
