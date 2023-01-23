package org.example;

public class Main {
    public static void main(String[] args) {
        //С некоторого момента прошло 234 дня. Сколько полных недель прошло за этот период? А месяцев?
        // Выведите полученные значения в консоль.
        int countOfDays = 234;
        int countOfWeeks = countOfDays / 7;
        int countOfMonths = countOfDays / 30;
        System.out.println("Количество недель = " + countOfWeeks + "\nКоличество месяцев = " + countOfMonths);
        System.out.println("___________________________________________________");

        //Дано двузначное число 57. Найти:
        // a.число десятков в нем;
        // b.число единиц в нем;
        // c.сумму его цифр;
        // d.произведение его цифр.
        // Выведите все полученные значения в консоль
        final int number = 57;
        int count10 = number / 10;
        int count1 = number % 10;
        int summa = count1 + count10;
        int multip = count1 * count10;
        System.out.println("Число десятков = " + count10 + "\nЧисло единиц = " + count1 + "\nСумма цифр = " + summa
                + "\nПроизведение цифр = " + multip);
        System.out.println("___________________________________________________");

        //Найдите возраст человека, если известно, что год его рождения 1991.
        // Выведите полученный результат в виде “Возраст = ...”
        final int dateOfBirth = 1991;
        final int currentDate = 2023;
        int age = currentDate - dateOfBirth;
        System.out.println("Возраст = " + age);
    }
}