package ru.neoflex.training.shvedov.init.syntax.solution.ch05n002;

/**
 * A man goes to work, which is 1 km away from home.
 * Having reached the place of work, he suddenly remembers that he forgot to kiss his wife before leaving, and turns back. Halfway through, he changes his mind, deciding that it would be more correct to return to work.
 * Having walked 1/3 km towards work, he suddenly realizes that he will be a real scoundrel if he does not kiss his wife. This time, before changing his mind, he walks 1/4 km.
 * So he continues to rush, and after the N stage, having covered 1 / N km, he again changes his mind.
 * Define:
 * a) at what distance from the house will the man be after the 100th stage
 * (assuming that this is possible);
 * b) what is the general path he will pass at the same time
 */

public class SolutionCh05n002 {

    public static void determiningTheDistanceOfThePath(int numberOfStages) {

        double distanceFromHome = 0.0, commonPath = 0.0, home, work = -1.0;

        for (int i = 1; i <= numberOfStages; i++) {
            home = 1. / i;
            work *= -1;
            commonPath += home;
            distanceFromHome += home * work;
        }

        System.out.println("Distance from home: " + 1000 * distanceFromHome + " meters");
        System.out.println("Common path: " + 1000 * commonPath + " meters");
    }
}
