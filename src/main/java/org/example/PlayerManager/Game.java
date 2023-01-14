package org.example.PlayerManager;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Player> playersList = new ArrayList<>();

    public void register(Player player) {

        playersList.add(player);
    }

    public int round(String playerName1, String playerName2) {


        Player player1 = null;
        Player player2 = null;

        for (Player player : playersList) {
            if (player.getPlayerName().equals(playerName1)) {
                player1 = player;
            }
            if (player.getPlayerName().equals(playerName2)) {
                player2 = player;

            }
        }

        if (player1 == null) {
            throw new NonRegisteredException("Игрок 1 не зарегистрирован");
        }
        if (player2 == null) {
            throw new NonRegisteredException("Игрок 2 не зарегистрирован");
        }

        if (player1.getStrength() > player2.getStrength()) {
            return 1;
        }
        if (player1.getStrength() < player2.getStrength()) {
            return 2;
        }
        return 0;


    }


}





