package ru.neoflex.training.shvedov.init.syntax.solution.ch09n004;

/**
 * Write a program that prints a given word starting with the last letter
 */
public class SolutionCh09n004 {

    public static String outputTheWordInReverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}
