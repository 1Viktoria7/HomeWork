package org.example;

public class Main {
    public static void main(String[] args) {
        Pet pet = new Pet("Питомец", 1);
        Cat cat = new Cat("Киса", 3);
        Dog dog = new Dog("Микки",4);

        System.out.println("Class Pet");
        pet.makeNoise();
        pet.eatSomething();

        System.out.println("\nClass Cat");
        cat.drinkMilk();
        cat.makeNoise();
        cat.eatSomething();

        System.out.println("\nClass Dog");
        dog.buryBone();
        dog.makeNoise();
        dog.eatSomething();
    }
}