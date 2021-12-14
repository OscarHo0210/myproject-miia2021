package com.tom;

public class BMI {
    public static void main(String[] args) {
        Person person = new Person(68, (float) 1.7);
        System.out.println("Your BMI is " + person.bmi());
    }
}
