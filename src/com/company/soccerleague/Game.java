// Damien Bafile
// m036449@tafe.wa.edu.au
/////////////////////////
// Java II - Soccer League
package com.company.soccerleague;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private static final ArrayList<Game> games = new ArrayList<>();

    private Team homeTeam;
    private Team awayTeam;
    private int homeTeamScore;
    private int awayTeamScore;

    private int temperature;
    private Random teamAScoreGen = new Random();
    private Random teamBScoreGen = new Random();

    private int id;

    public Game() {
    }

    public Game(Team teamA, Team teamB, int temperature) {
        this.homeTeam = teamA;
        this.awayTeam = teamB;
        this.temperature = temperature;
        games.add(this);
        this.id = games.size();
    }

    public void playGame() {
        this.homeTeamScore = teamAScoreGen.nextInt(6);
        this.awayTeamScore = teamBScoreGen.nextInt(6);
        homeTeam.addToTotalGoalsScored(this.homeTeamScore);
        awayTeam.addToTotalGoalsScored(this.awayTeamScore);
        homeTeam.addTotalGoalsAllowed(this.awayTeamScore);
        awayTeam.addTotalGoalsAllowed(this.homeTeamScore);

        if (homeTeamScore > awayTeamScore) {
            System.out.println(this.homeTeam.getName() + " won");
            this.homeTeam.addWin();
            this.awayTeam.addLoss();
        } else if (homeTeamScore < awayTeamScore) {
            System.out.println(awayTeam.getName() + " won");
            this.homeTeam.addLoss();
            this.awayTeam.addWin();
        } else {
            System.out.println("Draw");
            this.homeTeam.addTie();
            this.awayTeam.addTie();
        }
    }

    public static void printGames() {
        for (Game results : games) {
            System.out.println("Game: " + results.id);
            System.out.println("Temperature: " + results.temperature);
            System.out.println("Away Team: " + results.awayTeam.getName() + ", " + results.awayTeamScore);
            System.out.println("Home Team: " + results.homeTeam.getName() + ", " + results.homeTeamScore);
        }
    }

    public static int numberOfGame() {
        return games.size();
    }


}

