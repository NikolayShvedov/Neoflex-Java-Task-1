package ru.neoflex.training.shvedov.init.syntax.solution.ch04n004;

public class SolutionCh04n004 {

    public static void determinationOfTheDayOfTheYear(int k) {
        int day = (k - 1) % 7;
        if (day < 5)
        {
            System.out.println("Workday");
        }
        else
        {
            System.out.println("Weekend");
        }
    }
}
