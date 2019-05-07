// Damien Bafile
// m036449@tafe.wa.edu.au
/////////////////////////
// Java II - Soccer League
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
        return  this.name;
    }

    public int getTotalGoalsAllowed() {
        return  this.totalGoalsAllowed;
    }

    public void addTotalGoalsAllowed(int totalGoalsAllowed) {
        this.totalGoalsAllowed += totalGoalsAllowed;
    }

    public int getTotalGoalsScored() {
        return  this.totalGoalsScored;
    }

    public void addToTotalGoalsScored(int totalGoalsScored) {
        this.totalGoalsScored += totalGoalsScored;
    }

    public void addWin() {
        this.winTotal++;
    }

    public int getWinTotal() {
        return  this.winTotal;
    }

    public void addLoss() {
        this.lossTotal++;
    }

    public int getLossTotal() {
        return  this.lossTotal;
    }

    public void addTie() {
        this.tieTotal++;
    }

    public int getTieTotal() {
        return  this.tieTotal;
    }

    public void printStats(){
        System.out.println(getName());
        System.out.println("Won " + getWinTotal() + ", Loss " + getLossTotal() + ", Tie " + getTieTotal());
        System.out.println("Goals Scored " + getTotalGoalsScored() + " Goals Allowed " + getTotalGoalsAllowed());
    }
}
