package ru.neoflex.training.shvedov.init.syntax.solution.ch04n006;

/**
 * In some countries of the Far East (China, Japan, etc.),
 * (and unofficially in use today) a calendar differing
 * from used by us. This calendar is a 60-year cyclic system. Each 60-year cycle consists of five 12-year sub-cycles. In each subcycle of the year, animals are named: Rat, Cow,
 * Tiger, Hare, Dragon, Snake, Horse, Sheep, Monkey, Rooster, Dog and Pig.
 * In addition, in the name of the year, the colors of animals appear, which are related
 * with the five elements of nature - Wood (green), Fire (red), Earth (yellow), Metal (white) and Water (black). As a result, each animal (and its year) has a symbolic color, and this color is often perfect
 * it does not coincide with its "natural" color - the Tiger can be black, the Pig - red, and the Horse - green. For example, 1984 is the year
 * the beginning of the next cycle - called the year of the Green Rat. Every color
 * in the cycle (starting from green) is "valid" for two years, therefore, every
 * 60 years old name of the year (animal and its color) is repeated.
 * Create a program that, given the number of the year of our era n, prints its name according to the described calendar in the form: "Rat, Green". Consider two cases:
 * a) the value of n 1984;
 * b) the value of n can be any natural number.
 */

public class SolutionCh04n006 {

    public static void yearNumberInMonthName(int year) {

        String animal[] = {"Rat", "Bull", "Tiger", "Rabbit", "Dragon", "Snake", "Horse", "Ram", "Monkey", "Rooster", "Dog", "Pig"};
        String animalСolor[] = {"Green", "Red", "Yellow", "White", "Black"};

        int animalNumber, animalСolorNumber;

        animalNumber = (year - 4) % 12;
        animalСolorNumber = ((year - 4) % 10) / 2;

        System.out.println(year + " year: " + animalСolor[animalСolorNumber] + " " + animal[animalNumber]);

    }
}