package org.example;

import java.sql.SQLOutput;

public class Pet {
    String name;
    int age;

    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void eatSomething() {
        System.out.println("Питомец покушал!");
    }

    public void makeNoise() {
        System.out.println("Небольшой шум");
    }
}
