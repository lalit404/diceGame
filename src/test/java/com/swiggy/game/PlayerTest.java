package com.swiggy.game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {
    @Test
    public void testSetAndGetHealth(){
        Player player = new Player();
        player.setHealth(100);
        assertEquals(100,player.getHealth());
    }

    @Test
    public void testSetAndGetStrength(){
        Player player = new Player();
        player.setStrength(10);
        assertEquals(10,player.getStrength());
    }

    @Test
    public void testSetAndGetAttack(){
        Player player = new Player();
        player.setAttack(20);
        assertEquals(20,player.getAttack());
    }

    @Test
    public void testSetAndGetName(){
        Player player = new Player();
        player.setName("test player");
        assertEquals("test player",player.getName());
    }
}
