package ru.neoflex.training.shvedov.init.syntax.solution.ch01n002;

import java.util.Scanner;

public class SolutionCh01n002 {

    /**
     * Write some expressions according to the rules of the programming language:
     * Library functions used java.lang.Math:
     * Math.abs - modulo value
     * Math.pow - raised number
     * Math.sqrt - square root of a number
     * Math.sin - sin angle
     */
    public static void main(String[] args) {

        double x;
        double a = 3.3, b = 2.2, c = 1.1;

        System.out.println("Insert the number x:");
        Scanner num = new Scanner(System.in);

        if(num.hasNextDouble()) {

            x = num.nextDouble();
            equationCalculation(x, 3.3, 2.2, 1.1);

        }
        else {
            System.out.println("Error! Type double not found!");
        }
    }

    static void equationCalculation(double x, double a, double b, double c) {

        double y;
        y = Math.sqrt(1 - Math.pow(Math.sin(x), 2));
        System.out.println("The result of the first function: " + y);

        y = 1 / Math.sqrt((Math.pow(a, 2) * x) + b*x + c);
        System.out.println("The result of the second function: " + y);

        y = (Math.sqrt(x + 1) + Math.sqrt(x - 1)) / (2 * Math.sqrt(x));
        System.out.println("Result of the third function: " + y);

        y = Math.abs(x) + Math.abs(x + 1);
        System.out.println("The result of the fourth function: " + y);
    }
}
