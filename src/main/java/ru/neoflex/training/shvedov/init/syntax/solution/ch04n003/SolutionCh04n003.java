package ru.neoflex.training.shvedov.init.syntax.solution.ch04n003;

public class SolutionCh04n003 {

    public static void trafficLightWork(double time) {

        double variable = time % 5;

        if ((variable >= 0) && (variable < 3))
        {
            System.out.println("green");
        }
        else if ((variable >= 3) && (variable < 5))
        {
            System.out.println("red");
        }
    }
}
