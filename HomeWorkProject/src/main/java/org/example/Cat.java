package org.example;

public class Cat extends Pet {
    Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Мяу!");
    }

    public void drinkMilk() {
        System.out.println("Кошка выпила молоко.");
    }
}
