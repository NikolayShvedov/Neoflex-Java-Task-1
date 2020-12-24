package ru.neoflex.training.shvedov.init.syntax.tests.ch01n001;

import ru.neoflex.training.shvedov.init.syntax.solution.ch01n001.SolutionCh01n001;

import java.util.Scanner;

public class SolutionCh01n001Test {

    public static void main(String[] args) {
        testIsEven();
    }

    public static void testIsEven() {
        int variable; // Integer variable initialization
        System.out.println("Enter any integer:");
        Scanner num = new Scanner(System.in); // creating an object of the Scanner class

        if(num.hasNextInt()) { // Checking for acceptance of a value entered from the keyboard into an int type
            variable = num.nextInt(); // Assigning a keyboard value to variable
            SolutionCh01n001.checkingTheDisplayedNumber(variable);
        }
        else {
            System.out.println("Error! Type int not found!");
        }
    }

}
