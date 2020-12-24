package ru.neoflex.training.shvedov.init.syntax.solution.ch04n005;

public class SolutionCh04n005 {

    public static void definitionOfMonthAndTimeOfYear(int numberMonth) {

        switch(numberMonth) {
            case 1: {
                System.out.println("Month: January, season: Winter");
                break;
            }
            case 2: {
                System.out.println("Month: February, season: Winter");
                break;
            }
            case 3: {
                System.out.println("Month: March, season: Spring");
                break;
            }
            case 4: {
                System.out.println("Month: April, season: Spring");
                break;
            }
            case 5: {
                System.out.println("Month: May, season: Spring");
                break;
            }
            case 6: {
                System.out.println("Month: June, season: Summer");
                break;
            }
            case 7: {
                System.out.println("Month: July, season: Summer");
                break;
            }
            case 8: {
                System.out.println("Month: August, season: Summer");
                break;
            }
            case 9: {
                System.out.println("Month: September, season: Autumn");
                break;
            }
            case 10: {
                System.out.println("Month: October, season: Autumn");
                break;
            }
            case 11: {
                System.out.println("Month: November, season: Autumn");
                break;
            }
            case 12: {
                System.out.println("Month: December, season: Winter");
                break;
            }
            default: {
                System.out.println("Error! The month must be between 1 and 12!");
            }
        }
    }
}

