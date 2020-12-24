package ru.neoflex.training.shvedov.init.syntax.solution.ch02n003;

import java.util.Scanner;

public class SolutionCh02n003 {

    public static void main(String[] args) {

        int firstNumber, secondNumber, resultNumber;

        System.out.println("Enter two integers:");
        Scanner num1 = new Scanner(System.in);
        if(num1.hasNextInt()) {

            firstNumber = num1.nextInt();
            secondNumber = num1.nextInt();

            resultNumber = ((firstNumber % secondNumber) * (secondNumber % firstNumber)) + 1;
            System.out.println("Result: " + resultNumber);
        }
        else {
            System.out.println("Error! Type int not found!");
        }

    }
}
