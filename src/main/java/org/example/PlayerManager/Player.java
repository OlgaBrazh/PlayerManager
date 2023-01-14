package org.example.PlayerManager;

public class Player {


    private int id;
    private String playerName;
    private int strength;


    public int getStrength() {
        return strength;
    }

    public Player(int id, String playerName, int strength) {
        this.id = id;
        this.playerName = playerName;
        this.strength = strength;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
