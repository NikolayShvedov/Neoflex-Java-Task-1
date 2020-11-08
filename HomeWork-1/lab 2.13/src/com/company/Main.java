package com.company;

import java.util.Scanner;

/**
 * Задание:
 * Дано трёхзначное число от 100 до 200. Найти число полученное при прочтении его цифр справа налево.
 */
public class Main {

    public static void main(String[] args) {

        int defaultNumber, firstNumeral, secondNumeral, thirdNumeral, resultingNumber;

        System.out.println("Введите трёхзначное число от 100 до 200:");
        Scanner num = new Scanner(System.in);
        if(num.hasNextInt()) { // Проверка на принятие, вводимого с клавиатуры, значения в тип int

            defaultNumber = num.nextInt();

            if ((defaultNumber > 100) && (defaultNumber < 200)) { // Проверка числа на принадлежность к диапазону от 100 до 200

                firstNumeral = defaultNumber % 10; // Первая цифра числа
                defaultNumber /= 10;

                secondNumeral = defaultNumber % 10; // Вторая цифра числа
                defaultNumber /= 10;

                thirdNumeral = defaultNumber % 10; // Третья цифра числа

                resultingNumber = (firstNumeral * 100) + (secondNumeral * 10) + thirdNumeral; // Получившееся число

                System.out.println("Полученное число: " + resultingNumber); // Вывод получившегося числа числа
            }
            else {
                System.out.println("Число должно быть в пределах от 100 до 200!");
            }
        }
        else {
            System.out.println("Error! Type int not found!");
        }
    }
}
