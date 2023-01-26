package org.example;

public class Dog extends Pet {
    Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Гав!");
    }

    public void buryBone() {
        System.out.println("Закапыват кость!");
    }
}
