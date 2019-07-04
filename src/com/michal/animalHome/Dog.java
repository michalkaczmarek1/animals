package com.michal.animalHome;

public class Dog {

    private int weight;
    private int age;

    public Dog() {
    }

    public Dog(int weight, int age) {
        this.weight = weight;
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
