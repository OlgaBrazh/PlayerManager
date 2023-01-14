package org.example.PlayerManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class GameTest {

    List<Player> playersList = new ArrayList<>();
    Game game = new Game();

    Player player1 = new Player(1, "Olya", 5);
    Player player2 = new Player(2, "Kolya", 7);
    Player player3 = new Player(3, "Petya", 8);
    Player player4 = new Player(4, "Vasya", 7);
    Player player5 = new Player(5, "Masha", 4);
    Player player6 = null;
    Player player7 = null;



    @Test
    public void shouldRoundWhenFirstWin() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        game.round("Olya","Masha");

        int expected = 1;
        int actual = game.round("Olya","Masha");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRoundWhenSecondWin() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        game.round("Olya","Masha");

        int expected = 2;
        int actual = game.round("Olya","Petya");
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldRoundWhenTogetherWins() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);

        game.round("Vasya","Kolya");

        int expected = 0;
        int actual = game.round("Vasya","Kolya");
        Assertions.assertEquals(expected, actual);
    }



    public static void main(String[] args) {


        HashSet<String> playersList = new HashSet<>();

        playersList.add("Olga84");
        playersList.add("Petya55");
        playersList.add("Miron");
        playersList.add("Bob");
        playersList.add("Surprise");
        System.out.println(playersList);


    }
    @Test
    public void shouldRoundWhenFirstNull() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);



        Assertions.assertThrows(NonRegisteredException.class, ()->{
            game.round ("Alina","Masha");
    });
    }

    @Test
    public void shouldRoundWhenSecondNull() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);



        Assertions.assertThrows(NonRegisteredException.class, ()->{
            game.round ("Vasya","Polina");
        });
    }

    @Test
    public void shouldRoundWhenTogetherNull() {
        game.register(player1);
        game.register(player2);
        game.register(player3);
        game.register(player4);
        game.register(player5);



        Assertions.assertThrows(NonRegisteredException.class, ()->{
            game.round ("Alina","Polina");
        });
    }

}
