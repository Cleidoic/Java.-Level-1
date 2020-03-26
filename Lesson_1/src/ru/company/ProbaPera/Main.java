package ru.company.ProbaPera;

    /**
    (пример Javadoc)
    Домашняя работа №1.
    Переменные, примитивы, условия, методы, перегрузка методов
    Галицкий Кирилл Олегович.
    Создан: 2020.03.03
    Обновлён: 2020.09.03
    */

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Просто созданные переменные

        final int varOne = 1;
        final int varTwo = 2;
        final int varThree = 3;
        final int varFour = 4;

        // Переменные в "венгерской нотации", перед именем переменной
        // строчной буквой обозначен её тип
        final float fOne = 1f;
        final float fTwo = 2f;
        final float fThree = 3f;
        final float fFour = 4.0f;

        //Первое задание

        System.out.println("Введите число a: ");
        int a = scanner.nextInt();
        System.out.println("Введите число b: ");
        int b = scanner.nextInt();
        System.out.println("Введите число c: ");
        int c = scanner.nextInt();
        System.out.println("Введите число d: ");
        int d = scanner.nextInt();
        System.out.printf("По формуле a * (b + (c / d)) результат будет равен: %.2f \n", calc(a, b, c, d));

        //Второе задание

        System.out.println("\nЗадание 2.\n");
        System.out.println("Введите первое число:");
        int number_1 = scanner.nextInt();
        System.out.println("Введите второе число:");
        int number_2 = scanner.nextInt();

        System.out.println(sum(number_1, number_2));

        //Третье задание

        System.out.println("\nЗадание 3.\n");
        System.out.println("Введите целое число: ");
        int variable = scanner.nextInt();
        System.out.println(isPositive(variable));

        //Четвёртое задание

        /*
        Почему-то не получается считывать строку из консоли таким способом:
        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();
        */
        System.out.println("\nЗадание 4.\n");
        System.out.println(welcome("Вася Пупкин"));

        //Пятое задание

        System.out.println("\nЗадание 5.\n");
        System.out.println("Какой сейчас год?");
        int year = scanner.nextInt();
        System.out.println(isLeapYear (year));

        scanner.close();

        }

    //Метод первого задания, который делает вычисление по формуле

    public static double calc(int a, int b, int c, int d) {
        return a * (b + ((double) c / d));
    }

    /*
    Или так:
    public static float calc(int a, int b, int c, int d) {
    return a * (b + (c * 1.0f / d));
    }
    */

    //Метод второго задания

    public static boolean sum(int number_1, int number_2) {
        if (number_1 + number_2 >= 10 && number_1 + number_2 <= 20) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Написать метод, которому в качестве параметра передается
     * целое число, метод должен проверить положительное ли число
     * передали, или отрицательное. Замечание: ноль считаем
     * положительным числом.
     *
     * Результат работы метода вывести в консоль
     */

    private static boolean isPositive(int variable) {
        return variable >= 0;
    }

    /*
     * Написать метод, которому в качестве параметра передаётся строка,
     * обозначающая имя, метод должен вывести в консоль сообщение "Привет, указанное_имя!"
     */
    private static String welcome(String name) {
        return "Привет, " + name + "!\n" + "Просто шучу )";
    }

    /*
     * Написать метод, который определяет является ли год високосным.
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0);
    }

}