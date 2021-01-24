package ru.neoflex.training.shvedov.init.syntax.solution.ch09n002;

/**
 * The word has been given. Is it true that it begins and ends with the same letter?
 */
public class SolutionCh09n002 {

    public static void checkingForEqualitySecondAndFourthSymbol(String word) {

        String result = (word.charAt(0) == word.charAt(word.length()-1))
                ? "The word starts and ends with the same letter"
                : "The word starts and ends with different letters";
        System.out.println(result);
    }
}
