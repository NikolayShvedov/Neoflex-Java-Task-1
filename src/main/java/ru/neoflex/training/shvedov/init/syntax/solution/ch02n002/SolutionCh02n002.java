package ru.neoflex.training.shvedov.init.syntax.solution.ch02n002;

public class SolutionCh02n002 {

    public static void checkingTheDisplayedNumber(int defaultNumber) {

        int firstNumeral, secondNumeral, thirdNumeral, resultingNumber;
        firstNumeral = defaultNumber % 10;
        defaultNumber /= 10;

        secondNumeral = defaultNumber % 10;
        defaultNumber /= 10;

        thirdNumeral = defaultNumber % 10;

        resultingNumber = (firstNumeral * 100) + (secondNumeral * 10) + thirdNumeral;

        System.out.println("The resulting number: " + resultingNumber);
    }
}
