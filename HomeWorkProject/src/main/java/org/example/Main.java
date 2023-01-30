package org.example;

import java.awt.*;
import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        //1.Напишите программу с классом Car.
        // ●Создайте конструктор класса Car.
        // ●Создайте атрибуты класса Car—color(цвет),type(тип),year(год).
        // ●Напишите пять методов:
        // ○Первый—запуск автомобиля,при его вызове выводится сообщение «Автомобиль заведен».
        // ○Второй—отключение автомобиля—выводит сообщение «Автомобиль заглушен».
        // ○Третий—присвоение автомобилю года выпуска.
        // ○Четвертый метод—присвоение автомобилю типа.
        // ○Пятый—присвоение автомобилю цвета.
        Car car = new Car();
        car.setColor("Чёрный");
        car.setType("Седан");
        car.setYear(2007);
        car.startEngine();
        car.stopEngine();

        //Создайте класс Animal и его класс-наследник Cat.
        // В базовом классе задайте поле для имени,а в классе-наследнике сделайте метод drinkMilk(),
        // который будет выводить в консоль строку “Кошка пьёт воду”.
        // Создайте объект и задайте кошке имя,а затем вызовите метод drinkMilk().
        Scanner sc = new Scanner(System.in);
        String catName = sc.next();
        Cat cat = new Cat(catName);
        System.out.println(cat.name);
        cat.drinkMilk();
    }
}