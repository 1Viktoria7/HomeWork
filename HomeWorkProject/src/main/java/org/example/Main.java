package org.example;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        firstTask();
        secondTask();
    }

    public static void firstTask() {
        //Мальчик хочет написать на заборе признание в любви девочке из пятнадцати букв и трех пробелов.
        // На каждые три буквы мальчик тратит по 62 см длины забора, а на каждый пробел - 12 см.
        // Напишите программу, которая поможет по длине забора (введенной пользователем) выяснить,
        // поместится ли на забор такой длины надпись мальчика.

        int lengthOfWord = 62*(15/3) + 12*3;
        System.out.println("Введите длину забора");
        Scanner sc = new Scanner(System.in);
        int lengthFence = sc.nextInt();
        if (lengthFence >= lengthOfWord) {
            System.out.println("Надпись на забор поместится");
        } else {
            System.out.println("Надпись не помещается");
        }
    }

    public static void secondTask() {
        //У программиста Васи на подоконнике растёт кактус. Вася постоянно забывает его поливать, поэтому он купил датчик
        // влажности и решил составить программу для отслеживания времени полива.
        // На вход программа ждет дату последнего полива кактуса. Если сейчас зима(декабрь - февраль),
        // то кактус поливается раз в месяц. Если осень или весна -раз в неделю.
        // Летом поливается в зависимости от влажности воздуха, но нечаще одного раза в два дня.
        // Значение влажности воздуха в программу попадает автоматически от датчика(реализуйте через вызов метода класса
        // Датчик, внутри которого будет генерация рандомного числа). Если влажность меньше 30%, кактус нужнополить.
        // Вася ожидает от программы, что после проверки всех данных, она выведет ему сообщение с датой,
        // когда надо поливать кактус.Реализуйте программу, используя принципы ООП и библиотеки для работы с датой.

        String seasons[] = {"Зима", "Зима", "Весна", "Весна", "Весна", "Лето", "Лето",
                "Лето", "Осень", "Осень", "Осень", "Зима",};

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите дату последнего полива");
        System.out.print("Введите год: ");
        int year = sc.nextInt();
        System.out.print("Введите месяц (от 1 до 12): ");
        int month = sc.nextInt();
        System.out.print("Введите день: ");
        int day = sc.nextInt();

        GregorianCalendar lastDate = new GregorianCalendar(year,month - 1,day);
        GregorianCalendar currentDate = new GregorianCalendar();
        int lastDayOfYear = lastDate.get(Calendar.DAY_OF_YEAR);
        int currentDayOfYear = currentDate.get(Calendar.DAY_OF_YEAR);
        int different = 0;
        if (currentDayOfYear >= lastDayOfYear) {
            different = currentDayOfYear - lastDayOfYear;
        } else {
            different = (currentDayOfYear + 365) - lastDayOfYear;
        }
        System.out.println("Разница в днях между поливами = " + different);

        String season = seasons[currentDate.get(Calendar.MONTH)];
        switch (season) {
            case "Зима":
                if (different >= 30) {
                    System.out.println("Нужно полить цветок");
                } else {
                    System.out.println("Не нужно поливать цветок");
                }
                break;
            case "Весна", "Осень":
                if (currentDayOfYear - lastDayOfYear >= 7) {
                    System.out.println("Нужно полить цветок");
                } else {
                    System.out.println("Не нужно поливать цветок");
                }
                break;
            case "Лето":
                HumiditySensor humiditySensor = new HumiditySensor();
                double humidity = humiditySensor.getHumidity();

                if ((currentDayOfYear - lastDayOfYear >= 2) && (humidity < 30)) {
                    System.out.println("Нужно полить цветок");
                } else {
                    System.out.println("Не нужно поливать цветок");
                }
                break;
        }
    }
}