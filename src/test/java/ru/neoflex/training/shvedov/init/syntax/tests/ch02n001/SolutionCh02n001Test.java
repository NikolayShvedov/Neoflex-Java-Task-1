package ru.neoflex.training.shvedov.init.syntax.tests.ch02n001;

import ru.neoflex.training.shvedov.init.syntax.solution.ch02n001.SolutionCh02n001;

import java.util.Scanner;

public class SolutionCh02n001Test {

    public static void main(String[] args) {
        testIsEven();
    }

    public static void testIsEven() {
        int defaultNumber;
        System.out.println("Enter a three-digit number:");
        Scanner num = new Scanner(System.in);
        if(num.hasNextInt()) {

            defaultNumber = num.nextInt();

            if ((defaultNumber > 100) && (defaultNumber < 200)) {

                SolutionCh02n001.checkingTheDisplayedNumber(defaultNumber);
            }
            else {

                System.out.println("The number must be between 100 and 200!");
            }
        }
        else {

            System.out.println("Error! Type int not found!");
        }
    }
}
