package ru.neoflex.training.shvedov.init.syntax.tests.ch05n001;

import ru.neoflex.training.shvedov.init.syntax.solution.ch05n001.SolutionCh05n001;

import java.util.Scanner;

public class SolutionCh05n001Test {

    public static void main(String[] args) {

        System.out.println("Enter the current RUB rate for 1 USD:");
        Scanner num = new Scanner(System.in);

        if(num.hasNextDouble()) {

            double currentRate = num.nextDouble();
            SolutionCh05n001.fromUSDToRUB(currentRate);
        }
        else {

            System.out.println("Error! Type double not found!");
        }
    }
}
