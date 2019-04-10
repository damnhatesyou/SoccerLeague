package com.company.soccerleague;

public class Team {

    private String name;
    private int winTotal;
    private int lossTotal;
    private int tieTotal;
    private int totalGoalsScored;
    private int totalGoalsAllowed;

    public Team(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getTotalGoalsAllowed() {
        return totalGoalsAllowed;
    }

    public void setTotalGoalsAllowed(int totalGoalsAllowed) {
        this.totalGoalsAllowed = totalGoalsAllowed;
    }

    public int getTotalGoalsScored() {
        return totalGoalsScored;
    }

    public void addToTotalGoalsScored(int totalGoalsScored) {
        this.totalGoalsScored += totalGoalsScored;
    }

    public void addWin() {
        winTotal++;
    }

    public int getWinTotal() {
        return winTotal;
    }

    public void addLoss() {
        lossTotal++;
    }

    public int getLossTotal() {
        return lossTotal;
    }

    public void addTie() {
        tieTotal++;
    }

    public int getTieTotal() {
        return tieTotal;
    }

    public void printStats(){
        System.out.println(getName());
        System.out.println("Won " + getWinTotal());
        System.out.println("Loss " + getLossTotal());
        System.out.println("Tie " + getTieTotal());
        System.out.println("Goals Scored " + getTotalGoalsScored());
    }
}
