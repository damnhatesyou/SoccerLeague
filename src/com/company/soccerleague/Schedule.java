// Damien Bafile
// m036449@tafe.wa.edu.au
/////////////////////////
// Java II - Soccer League
package com.company.soccerleague;

import java.util.ArrayList;
import java.util.Random;

public class Schedule {
    private int totalTemps = 0;
    private int hottestTemp = 0;
    private ArrayList<Integer> usedTeams = new ArrayList<>();
    Game games = new Game();


    public void scheduleGame(Team[] teams, int temperature) {

        if (temperature > hottestTemp)
            hottestTemp = temperature;
        totalTemps += temperature;
        createMatch(teams);
        games = new Game(teams[usedTeams.get(0)], teams[usedTeams.get(1)], temperature);
        games.playGame();
        games = new Game(teams[usedTeams.get(2)], teams[usedTeams.get(3)], temperature);
        games.playGame();
    }
    private void createMatch(Team[] teams){
        usedTeams.clear();
        while (!(teams.length == usedTeams.size())) {
            Random gen = new Random();
            int temp = gen.nextInt(4);
            if (!usedTeams.contains(temp)) {
                usedTeams.add(temp);
            }
        }
    }

    public void printGames() {

        if (Game.numberOfGame() != 0){
            Game.printGames();
            System.out.println("Hottest Temperature: " + hottestTemp);
            System.out.printf("Average Temperature: %.2f" , ((double)totalTemps / (Game.numberOfGame()/2)));
        } else {
            System.out.println("No games played this season");
        }

    }

}

