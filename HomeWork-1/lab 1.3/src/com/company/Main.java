package com.company;

import java.util.Scanner;

public class Main {

    /**
     * Составить программу вывода на экран числа, вводимого с клавиатуры.
     * Выводимому числу должно предшествовать сообщение "Вы ввели число"
     * Для ввода числа использовать класс Scanner
     */
    public static void main(String[] args) {

	    int variable = 0; // Инициализация переменной целого типа

        System.out.println("Введите любое целое число:");
        Scanner num = new Scanner(System.in); // создание объекта класса Scanner

        if(num.hasNextInt()) { // Проверка на принятие, вводимого с клавиатуры, значения в тип int
            variable = num.nextInt(); // Присвоение переменной variable значения, вводимого с клавиатуры
            System.out.println("Вы ввели число: " + variable); // Вывод на экран числа, вводимого с клавиатуры
        }
        else {
            System.out.println("Error! Type int not found!");
        }

    }
}
