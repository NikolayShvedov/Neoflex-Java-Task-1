package ru.neoflex.training.shvedov.init.syntax.solution.ch09n001;

/**
 * The word has been given. Display its k-th character.
 */
public class SolutionCh09n001 {

    public static void outputStringCharacter(String word, int symbolNumber) {

        if (symbolNumber > word.length()-1 || symbolNumber < 0) {
            System.out.println("Error! There is no such symbol in the code!");
        }
        else {
            char symbol = word.charAt(symbolNumber-1);
            System.out.println(symbolNumber + " symbol: " + symbol);
        }

    }
}
