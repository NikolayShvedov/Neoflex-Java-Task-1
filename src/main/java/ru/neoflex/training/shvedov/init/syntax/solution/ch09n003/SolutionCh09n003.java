package ru.neoflex.training.shvedov.init.syntax.solution.ch09n003;

public class SolutionCh09n003 {

    public static void printHalfWord(String word) {
        if (word.length() % 2 == 0) {
            char[] symbolsToOutput = new char[word.length() / 2];
            word.getChars(0, (word.length() / 2), symbolsToOutput, 0);
            System.out.println(symbolsToOutput);
        } else {
            System.out.println("The user entered an odd number! It is impossible to deduce half of the word!");
        }

    }
}
