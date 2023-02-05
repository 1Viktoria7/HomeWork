package org.example;

import java.util.ArrayList;

public class User {
    String id;
    String name;
    int age;
    ArrayList<String> phoneNumbers = new ArrayList<String >();


    public User (String id, String name, int age, ArrayList<String> phoneNumbers) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.phoneNumbers = phoneNumbers;
    }
}
