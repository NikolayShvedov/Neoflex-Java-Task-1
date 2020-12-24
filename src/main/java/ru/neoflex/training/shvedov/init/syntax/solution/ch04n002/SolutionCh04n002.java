package ru.neoflex.training.shvedov.init.syntax.solution.ch04n002;

public class SolutionCh04n002 {

    public static void determiningTheNumberOnParity(int number) {
        if (number % 2 == 0)
        {
            System.out.println("Число " + number + " заканчивается чётной цифрой.");
        }
        else
        {
            System.out.println("Число " + number + " заканчивается нечётной цифрой.");
        }
    }
}
