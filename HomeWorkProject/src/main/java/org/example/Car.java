package org.example;

public class Car {
    String color;
    String type;
    int year;
    public void startEngine() {
        System.out.println("Автомобиль заведен");
    }
    public void stopEngine() {
        System.out.println("Автомобиль заглушен");
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setColor(String color) {
        this.color = color;
    }

}
