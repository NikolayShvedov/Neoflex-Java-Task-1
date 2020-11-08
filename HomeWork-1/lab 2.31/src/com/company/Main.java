package com.company;

import java.util.Scanner;

public class Main {

    /**
     * Задание:
     * В трехзначном числе x зачеркнули его вторую цифру.
     * Когда к образовавшемуся двухзначному числу справа приписали вторую цифру числа x, то получилось число n.
     * По заданному n найти число x (значение n вводится с клавиатуры, 100 <= n <= 999).
     */
    public static void main(String[] args) {

        int defaultNumber, firstNumeral, secondNumeral, thirdNumeral, resultingNumber;

        System.out.println("Введите трёхзначное число от 100 до 999:");
        Scanner num = new Scanner(System.in);
        if(num.hasNextInt()) { // Проверка на принятие, вводимого с клавиатуры, значения в тип int

            defaultNumber = num.nextInt();

            if ((defaultNumber > 100) && (defaultNumber < 999)) { // Проверка числа на принадлежность к диапазону от 100 до 200

                firstNumeral = defaultNumber % 10; // Первая цифра числа
                defaultNumber /= 10;

                secondNumeral = defaultNumber % 10; // Вторая цифра числа
                defaultNumber /= 10;

                thirdNumeral = defaultNumber % 10; // Третья цифра числа

                resultingNumber = (thirdNumeral * 100) + (firstNumeral * 10) + secondNumeral; // Получившееся число

                System.out.println("Полученное число: " + resultingNumber); // Вывод получившегося числа числа
            }
            else {
                System.out.println("Число должно быть в пределах от 100 до 999!");
            }
        }
        else {
            System.out.println("Error! Type int not found!");
        }
    }
}
