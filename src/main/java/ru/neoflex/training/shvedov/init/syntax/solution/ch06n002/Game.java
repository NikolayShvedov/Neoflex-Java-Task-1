package ru.neoflex.training.shvedov.init.syntax.solution.ch06n002;

import java.util.Scanner;

public class Game {

    /** here will be implemented console input logic for 2 players */
    public static void play() {
        String firstTeam, secondTeam, gameResults;
        int team, gameScore, firstTeamScore = 0, secondTeamScore = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter team #1:");
        firstTeam = scan.nextLine();
        System.out.println("Enter team #2:");
        secondTeam = scan.nextLine();
        do {
            System.out.println("Enter team to score (1 or 2 or 0 to finish game):");
            team = scan.nextInt();
            if ((team == 1) || (team == 2)) {

                System.out.println("Enter a score: 1, 2, or 3:");
                gameScore = scan.nextInt();
                if ((gameScore == 1) || (gameScore == 2) || (gameScore == 3)) {
                    if (team == 1) {
                        firstTeamScore += gameScore;
                    } else if (team == 2) {
                        secondTeamScore += gameScore;
                    }
                }
            } else if (team == 0) {
                gameResults = score(firstTeamScore, secondTeamScore, firstTeam, secondTeam);
                System.out.println(gameResults);
            } else {
                System.out.println("Team number " + team + " does not exist!");
            }
        } while (team != 0);
    }

    /** intermediate score */
    public static String score(int firstTeamScore, int secondTeamScore, String firstTeam, String secondTeam) {
        String result = "";
        if (firstTeamScore > secondTeamScore)
        {
            result = "The team " + firstTeam + " won (" + firstTeamScore + " points)" + "\n" +
                     "The team " + secondTeam + " (" + secondTeamScore + " points)";
        } else if (secondTeamScore > firstTeamScore)
        {
            result = "The team " + secondTeam + " won (" + secondTeamScore + " points)" + "\n" +
                    "The team " + firstTeam + " (" + firstTeamScore + " points)";
        } else if (firstTeamScore == secondTeamScore){
            result = "Draw" + "\n" +
                     "The team " + firstTeam + " and " + secondTeam + "(" + firstTeamScore + " points)";
        }
        return result;
    }

}
