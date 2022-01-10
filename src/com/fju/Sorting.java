package com.fju;

public class Sorting {
    //排序會考
    public static void main(String[] args) {
        int[] num = {15, 6, 13, 1, 5};

        for (int i=0; i<num.length; i++){
            for (int j=i+1; j< num.length; j++){
                if (num[i]<num[j]){
                    int tmp = num[i];
                    num[i] = num[j];
                    num[j] = tmp;
                }
            }
        }
        for (int i =0; i< num.length; i++){
            System.out.print(num[i] + ",");
        }
    }
}
