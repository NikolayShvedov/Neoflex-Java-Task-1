package ru.neoflex.training.shvedov.init.syntax.solution.ch05n001;

/**
 * Print the conversion table 1, 2, ... 20 USD dollars to RUB at the current rate (the value of the rate is entered from the keyboard).
 */
public class SolutionCh05n001 {

    public static void fromUSDToRUB(double currentRate) {

        for (int i = 1; i <= 20; i++){
            System.out.println(i + " USD = " + i * currentRate + " RUB");
        }
    }
}
