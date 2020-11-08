package com.company;

import java.lang.Math;
import java.util.Scanner;

public class Main {

    /**
     * Записать по правилам языка программирования некоторые выражения:
     * Используемые функции библиотеки java.lang.Math:
     * Math.abs - значение по модулю
     * Math.pow - число, возведенное в степень
     * Math.sqrt - квадратный корень числа
     * Math.sin - синус угла
     */
    public static void main(String[] args) {

        double x, y;
        double a = 3.3, b = 2.2, c = 1.1;

        System.out.println("Введите число x:");
        Scanner num = new Scanner(System.in);

        if(num.hasNextDouble()) {

            x = num.nextDouble();

            y = Math.sqrt(1 - Math.pow(Math.sin(x), 2));
            System.out.println("Результат первой функции: " + y);

            y = 1 / Math.sqrt((Math.pow(a, 2) * x) + b*x + c);
            System.out.println("Результат второй функции: " + y);

            y = (Math.sqrt(x + 1) + Math.sqrt(x - 1)) / (2 * Math.sqrt(x));
            System.out.println("Результат третей функции: " + y);

            y = Math.abs(x) + Math.abs(x + 1);
            System.out.println("Результат четвёртой функции: " + y);
        }
        else {
            System.out.println("Error! Type double not found!");
        }

    }
}
