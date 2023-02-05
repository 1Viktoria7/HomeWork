package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        //Проверить, начинается ли ваша строка подстрокой “I like”. Используем методString.startsWith().
//        String str = "I like Java!!!";
//        boolean start = str.startsWith("I like");
//        System.out.println(start);
//
//        // Найти позицию подстроки “Java” в строке “I like Java!!!”.
//        int index = str.indexOf("Java");
//        System.out.println(index);
//
//        // Заменить все символы “а” на “о”.
//        String replStr = str.replace ('a','o');
//        System.out.println(replStr);
//
//        // Преобразуйте строку к верхнему регистру.
//        System.out.println(str.toUpperCase());
//
//        // Преобразуйте строку к нижнему регистру.
//        System.out.println(str.toLowerCase());
//
//        //Вырезать строку Java c помощью метода String.substring().
//        String subStr = str.substring(6,11);
//        System.out.println(subStr);

        //2. Необходимо написать программу конвертер физических величин.
        // Пользователю сначала предлагается выбрать что переводить (масса или расстояние),
        // затем предлагается выбрать единицу измерения.
        // Далее пользователь должен ввести число.
        // В результате программа должна вывести 4 строки с переведенными величинами.
        // Масса: кг, грамм, фунт(lb), карат в любую сторону
        // Длина (расстояние):метр, миля, ярд, фут в любую сторону
        // Пример:> Выберите что переводить:
        // > [1] - масса>
        // [2] - расстояние>
        // 2> Выберите единицу измерения:>
        // [1] - метр> [2] - миля> [3] - ярд> [4] - фут> 1>
        // Введите число:> 10>
        // Результат:> метры: 10> мили: 0.006214> ярды: 10.94> футы: 32.81

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите что переводить:\n [1] - масса\n [2] - расстояние");
        int massDis = sc.nextInt();
        if (massDis == 1) {
            System.out.println("Выберите единицу измерения\n [1] - кг\n [2] - грамм\n [3] - фунт\n [4] - карат");
            int unit = sc.nextInt();
            System.out.println("Введите число");
            int number = sc.nextInt();
            double kg = 0;
            double gr = 0;
            double ft = 0;
            double kar = 0;
            switch (unit) {
                case 1:
                    gr = number * 1000;
                    break;
                case 2:
                    gr = number;
                    break;
                case 3:
                    gr = number * 453.6;
                    break;
                case 4:
                    gr = number / 5;
                    break;
            }
            kg = gr / 1000;
            ft = gr / 453.6;
            kar = gr * 5;
            System.out.println("Результат:\nКиллограмм:" + kg + "\nГраммы:" + gr + "\nФунты:" + ft + "\nКараты:" + kar);
        } else if (massDis == 2) {
            System.out.println("Выберите единицу измерения\n [1] - метр\n [2] - миля\n [3] - ярд\n [4] - фут");
            int unit = sc.nextInt();
            System.out.println("Введите число");
            int number = sc.nextInt();
            double meter = 0;
            double miles = 0;
            double yard = 0;
            double foot = 0;
            switch (unit) {
                case 1:
                    meter = number;
                    break;
                case 2:
                    meter = number / 1609;
                    break;
                case 3:
                    meter = number / 1.094;
                    break;
                case 4:
                    meter = number / 3.281;
                    break;
            }
            miles = meter / 1609;
            yard = meter * 1.094;
            foot = meter * 3.281;
            System.out.println("Результат:\nМетры:" + meter + "\nМили:" + miles + "\nЯрды:" + yard + "\nФуты:" + foot);
        }
    }
}
