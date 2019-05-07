// Damien Bafile
// m036449@tafe.wa.edu.au
/////////////////////////
// Java II - Soccer League
package com.company.soccerleague;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Team[] teams = {new Team("Cockburn Sounders"), new Team("Melville Hawks"), new Team("Canning Cavaliers"),
                new Team("Armadale Pioneers")};

        Schedule season = new Schedule();
        Scanner myScanner = new Scanner(System.in);
        int freezingCount = 0;
        while (freezingCount != 3) {
            System.out.println("What is the Temperature:");
            int temperature = myScanner.nextInt();


            if (temperature >= 32.0) {
                if (temperature <= 104.0) {
                    freezingCount = 0;
                    season.scheduleGame(teams, temperature);
                }else {
                    System.out.println("Too Hot to play");
                }
            } else {
                System.out.println("Too Cold to play");
                freezingCount++;
            }
        }

        for (Team scores : teams) {
            scores.printStats();
        }

        season.printGames();

    }
}
