package com.company.soccerleague;

import java.util.ArrayList;
import java.util.Random;

public class Game {
    private static ArrayList<Game> games = new ArrayList<>();

    private int gameID = 0;

    private String homeTeamName;
    private String awayTeamName;
    private int homeTeamScore;
    private int awayTeamScore;

    private double temperature;
    private Random teamAScoreGen = new Random();
    private Random teamBScoreGen = new Random();

    public void playGame(Team teamA, Team teamB, double temperature) {
        setHomeTeamScore(teamAScoreGen.nextInt(6));
        teamA.addToTotalGoalsScored(getHomeTeamScore());
        setAwayTeamScore(teamBScoreGen.nextInt(6));
        teamB.addToTotalGoalsScored(getAwayTeamScore());

        if (getHomeTeamScore() > getAwayTeamScore()){
            System.out.println(teamA.getName() + " won");
            teamA.addWin();
            teamB.addLoss();
        }else if (getHomeTeamScore() < getAwayTeamScore()){
            System.out.println(teamB.getName() + " won");
            teamA.addLoss();
            teamB.addWin();
        }else{
            System.out.println("Draw");
            teamA.addTie();
            teamB.addTie();
        }

        setHomeTeamName(teamA.getName());
        setAwayTeamName(teamB.getName());
        setTemperature(temperature);
        setGameID(getGameID() + 1);
        games.add(this);
    }

    /**
     * @return the temperature
     */
    public double getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the awayTeamScore
     */
    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    /**
     * @param awayTeamScore the awayTeamScore to set
     */
    public void setAwayTeamScore(int awayTeamScore) {
        this.awayTeamScore = awayTeamScore;
    }

    /**
     * @return the homeTeamScore
     */
    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    /**
     * @param homeTeamScore the homeTeamScore to set
     */
    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    /**
     * @return the homeTeamName
     */
    public String getHomeTeamName() {
        return homeTeamName;
    }

    /**
     * @return the awayTeamName
     */
    public String getAwayTeamName() {
        return awayTeamName;
    }

    /**
     * @param homeTeamName the homeTeamName to set
     */
    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    /**
     * @return the homeTeamScore
     */
    public String teamBName() {
        return awayTeamName;
    }

    /**
     * @param awayTeamName the awayTeamName to set
     */
    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    /**
     * @return the gameID
     */
    public int getGameID() {
        return gameID;
    }

    /**
     * @param gameID the gameID to set
     */
    public void setGameID(int gameID) {
        this.gameID = gameID;
    }
/*
Game #1
Temperature: 90
Away Team: Team 2, 4
Home Team: Team 4, 7
 */
    public void printGames(){
        for (Game results :
                games) {
            System.out.println("Game " + getGameID());
            System.out.println("Temperature: " + getTemperature());
            System.out.println("Away Team: "+ results.getAwayTeamName()+","+ results.getAwayTeamScore());
            System.out.println("Home Team: "+ results.getHomeTeamName()+","+ results.getHomeTeamScore() );
        }
    }
}
