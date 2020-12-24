package ru.neoflex.training.shvedov.init.syntax.solution.ch01n001;

public class SolutionCh01n001 {

    /**
     * Create a program for displaying a number entered from the keyboard.
     * The displayed number must be preceded by the message "You have entered a number"
     * Use the Scanner class to enter a number
     * @param outputLine output line for test
     */
    public static void checkingTheDisplayedNumber(int outputLine) {

        int variable; // Integer variable initialization
        int default_number = 111; // The string required in the task

        if(outputLine == default_number) {

            System.out.println("You entered the number: " + outputLine); // Displaying a number entered from the keyboard
        }
        else {
            System.out.println("Error! You entered the wrong number!");
        }

    }
}
