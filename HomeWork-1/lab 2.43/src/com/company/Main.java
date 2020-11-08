package com.company;

import java.util.Scanner;

public class Main {

    /**
     * Задание:
     * Даны два целых числа а и b. Если а делится на b или b делится на а, то вывести 1, иначе любое другое число.
     * Условные операторы и операторы цикла не использовать.
     */
    public static void main(String[] args) {

        int firstNumber, secondNumber, resultNumber;

        System.out.println("Введите два целых числа:");
        Scanner num1 = new Scanner(System.in);
        if(num1.hasNextInt()) {

            firstNumber = num1.nextInt();
            secondNumber = num1.nextInt();

            resultNumber = ((firstNumber % secondNumber) * (secondNumber % firstNumber)) + 1;
            System.out.println("Результат: " + resultNumber);
        }
        else {
            System.out.println("Error! Type int not found!");
        }

    }
}
