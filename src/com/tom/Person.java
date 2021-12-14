package com.tom;

public class Person {

    float height;
    float weight;

    public Person(float weight, float height){
        this.height = height;
        this.weight = weight;
    }

    public float bmi(){
        return weight/(height*height);
    }
}
