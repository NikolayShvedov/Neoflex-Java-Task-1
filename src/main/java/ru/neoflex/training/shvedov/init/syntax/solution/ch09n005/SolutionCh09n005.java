package ru.neoflex.training.shvedov.init.syntax.solution.ch09n005;

/**
 * The word has been given. Swap the first letter a and the last letter o. Consider the possibility that such letters may not be in the word.
 */
public class SolutionCh09n005 {

    public static void replacingSymbolsInWord(String word) {

        int firstIndexOfSymbolA = word.indexOf('a');
        int lastIndexOfSymbolO = word.lastIndexOf('o');
        if ((firstIndexOfSymbolA == -1) || (lastIndexOfSymbolO == -1)) {
            System.out.println("There are no 'a' or 'o' symbols in the word. No further action possible!");
        } else {
            StringBuilder changedWord = new StringBuilder(word);
            changedWord.setCharAt(firstIndexOfSymbolA, 'o');
            changedWord.setCharAt(lastIndexOfSymbolO, 'a');
            System.out.println(changedWord);
        }
    }
}
