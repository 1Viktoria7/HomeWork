package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Составить программу, которая уменьшает первое введенное число в два раза,
        // если оно больше второго введенного числа по абсолютной величине.
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int number = sc.nextInt();
        System.out.println("Введите второе число");
        int number2 = sc.nextInt();
        if (number > number2) {
            System.out.println(number = number / 2);
        }

        //Напечатать числа с помощью цикла for следующим образом:
        // 10 10.4
        // 11 11.4
        // ...
        // 25 25.4
        for (int i = 10; i <= 25; i++) {
            System.out.println(i + " " + (i + 0.4));
        }
        // Найти максимальное из натуральных чисел, не превышающих 5000, которое нацело делится на 39.
        // Используйте цикл с пост- или предусловием
        int x = 1;
        int maxNumber = 0;
        while (x <= 5000) {
            int y = x % 39;
            if (y == 0) {
                maxNumber = x;
            }
            x++;
        }
        System.out.println(maxNumber);

        //Заполнить массив из десяти элементов значениями, вводимыми с клавиатуры в ходевыполнения программы.
        System.out.println("Введите значение");
        int[] array;
        array = new int [10]; //массив из 10 элементов
        for (int i = 0; i < 10; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("_____________________");
        for (int i = 0; i < 10; i++) {
            System.out.println("Элемент " + i + " = " + array[i]);
        }
        System.out.println(array);

        //Гражданин 1 марта открыл счет в банке, вложив 1000 руб.
        // Через каждый месяц размер вклада увеличивается на 2% от имеющейся суммы. Определить:
        // 1.за какой месяц величина ежемесячного увеличения вклада превысит 30 руб.;
        double deposit1 = 1000;
        double monthlyProfit1 = 0;
        int x1 = 0;
        while (monthlyProfit1 <= 30) {
            monthlyProfit1 = deposit1 * 0.02;
            deposit1 = deposit1 + monthlyProfit1;
            x1++;
        }
        System.out.println(x);

        // 2.через сколько месяцев размер вклада превысит 1200 руб.
        double deposit = 1000;
        double monthlyProfit = 0;
        int months = 0;
        while (deposit < 1200) {
            monthlyProfit = deposit * 0.02;
            deposit = deposit + monthlyProfit;
            months++;
        }
        System.out.println(months);
    }
}