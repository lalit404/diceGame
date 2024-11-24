package com.swiggy.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestMatch {

    @Test
    public void testStartMatch_Player1Wins() {
        Player player1 = new Player();
        player1.setName("Player1");
        player1.setHealth(50);
        player1.setAttack(10);
        player1.setStrength(5);

        Player player2 = new Player();
        player2.setName("Player2");
        player2.setHealth(30);
        player2.setAttack(8);
        player2.setStrength(4);

        Match match = new Match(player1, player2);
        Player winner = match.startMatch();
        assertEquals("Player1", winner.getName());
    }

    @Test
    public void testStartMatch_Player2Wins() {
        Player player1 = new Player();
        player1.setName("Player1");
        player1.setHealth(30);
        player1.setAttack(2);
        player1.setStrength(2);

        Player player2 = new Player();
        player2.setName("Player2");
        player2.setHealth(90);
        player2.setAttack(40);
        player2.setStrength(50);

        Match match = new Match(player1, player2);
        Player winner = match.startMatch();
        assertEquals("Player2", winner.getName());
    }
}

