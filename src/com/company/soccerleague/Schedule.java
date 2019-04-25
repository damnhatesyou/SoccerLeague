package com.company.soccerleague;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Schedule {
    private ArrayList<Integer> usedTeams = new ArrayList<Integer>();
    private Team[] teams = { new Team("Cockburn Sounders"), new Team("Melville Hawks"), new Team("Canning Cavaliers"),
            new Team("Armadale Pioneers") };

    public Schedule() {
        Scanner myScanner = new Scanner(System.in);
        Game games = new Game();

        int freezingCount = 0;
        while (freezingCount != 3) {
            System.out.println("What is the Temperature:");
            double temperature = myScanner.nextDouble();

            if (temperature >= 32.0) {
                if (temperature <= 104.0) {
                    createMatch();
                    games.playGame(teams[usedTeams.get(0)], teams[usedTeams.get(1)], temperature);
                    games.playGame(teams[usedTeams.get(2)], teams[usedTeams.get(3)], temperature);
                } else {
                    System.out.println("Too Hot to play");
                }
                freezingCount = 0;
            } else {
                System.out.println("Too cold to play");
                freezingCount++;
            }
        }
        for (Team team : teams) {
            team.printStats();
        }

        games.printGames();

    }

    private void createMatch() {
        usedTeams.clear();
        while (!(teams.length == usedTeams.size())) {
            Random gen = new Random();
            int temp = gen.nextInt(4);
            if (!usedTeams.contains(temp)) {
                usedTeams.add(temp);
            }
        }
        for (Integer team : usedTeams) {
            System.out.println(team);
        }
    }
}
