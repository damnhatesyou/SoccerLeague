package com.company.soccerleague;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Schedule {
    String[] Match1;
    String[] Match2;
    private ArrayList<Team> teams = new ArrayList<Team>();
    private ArrayList<Game> match;
    private ArrayList<Integer> usedTeams = new ArrayList<Integer>();

    public Schedule() {
        Scanner myScanner = new Scanner(System.in);
        int temperature;

        teams.add(new Team("Cockburn Sounders"));
        teams.add(new Team("Melville Hawks"));
        teams.add(new Team("Canning Cavaliers"));
        teams.add(new Team("Armadale Pioneers"));

        System.out.println("What is the Temperature:");
        temperature = myScanner.nextInt();


        if (temperature >= 30) {
            if (temperature <= 104) {
                createMatch();
                for (Integer i : usedTeams) {
                    System.out.println(i);
                }
            } else {
                System.out.println("Too Hot to play");
            }
        } else {
            System.out.println("Too cold to play");
        }
    }

    private void createMatch() {
        while (!(usedTeams.size() == teams.size())) {
            Random gen = new Random();
            int temp = gen.nextInt(4);
            if (!usedTeams.contains(temp)) {
                usedTeams.add(temp);
            }
        }
    }
}
