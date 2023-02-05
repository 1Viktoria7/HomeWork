package org.example;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Создайте класс User с полями id, name, age и phoneNumbers. Поле phoneNumbers должно быть списком.
        // Сделайте конструктор с параметрами для заполнения всех полей объектов при их создании.
        // Создайте два объекта полученного класса.
        ArrayList<String> myList1 = new ArrayList();
        myList1.add("89778616860");
        ArrayList<String> myList2 = new ArrayList();
        myList2.add("89067139656");
        User user1 = new User ("V12V", "Vika",21, myList1);
        User user2 = new User ("K21K", "Konstantin", 25, myList2);
    }
}