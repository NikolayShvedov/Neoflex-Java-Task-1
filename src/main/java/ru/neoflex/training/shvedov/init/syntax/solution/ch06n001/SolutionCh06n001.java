package ru.neoflex.training.shvedov.init.syntax.solution.ch06n001;

/**
 * Given number n. From numbers 1, 4, 9, 16, 25, ... print those that do not exceed n.
 */
public class SolutionCh06n001 {

    public static void displayingNumbers(int number) {

        if (number > 0)
        {
            System.out.println("Number entered: " + number);
            for (int i = 1; i <= number; i++) {
                System.out.println((int)Math.pow(i, 2));
            }
        }
        else
        {
            System.out.println("Invalid number entered!");
        }
    }
}
