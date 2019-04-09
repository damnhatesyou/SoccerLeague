package com.company.soccerleague;

class Game {
    private Team teamAName;
    private Team teamBName;
    private int teamAScore;
    private int teamBScore;
    private float temperature;


    /**
     * @return the teamAName
     */
    public Team getTeamAName() {
        return teamAName;
    }

    /**
     * @param teamAName the teamAName to set
     */
    public void setTeamAName(Team teamAName) {
        this.teamAName = teamAName;
    }

    /**
     * @return the temperature
     */
    public float getTemperature() {
        return temperature;
    }

    /**
     * @param temperature the temperature to set
     */
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    /**
     * @return the teamBScore
     */
    public int getTeamBScore() {
        return teamBScore;
    }

    /**
     * @param teamBScore the teamBScore to set
     */
    public void setTeamBScore(int teamBScore) {
        this.teamBScore = teamBScore;
    }

    /**
     * @return the teamAScore
     */
    public int getTeamAScore() {
        return teamAScore;
    }

    /**
     * @param teamAScore the teamAScore to set
     */
    public void setTeamAScore(int teamAScore) {
        this.teamAScore = teamAScore;
    }

    /**
     * @return the teamBName
     */
    public Team getTeamBName() {
        return teamBName;
    }

    /**
     * @param teamBName the teamBName to set
     */
    public void setTeamBName(Team teamBName) {
        this.teamBName = teamBName;
    }

}
