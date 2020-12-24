package ru.neoflex.training.shvedov.init.syntax.solution.ch04n001;

public class SolutionCh04n001 {

    public static void ageDetermination(int yearOfBirth, int monthOfBirth, int yearToday, int monthToday){

        int fullYears = 0;
        int differenceInMonths = monthOfBirth - monthToday;

        if (monthOfBirth <= monthToday) {
            fullYears = yearToday - yearOfBirth;
        }
        else if (monthOfBirth > monthToday){
            fullYears = yearToday - yearOfBirth - 1;
        }
        System.out.println("Возраст человека (число полных лет): " + fullYears);

    }
}
