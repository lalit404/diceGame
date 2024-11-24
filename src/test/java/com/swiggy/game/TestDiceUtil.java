package com.swiggy.game;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDiceUtil {
    @Test
    public void testRollDiceInRange(){
        for(int i=0;i<=50;i++){
            int value = DiceUtil.rollDice();
            assertTrue(value >=1 && value <=6);
        }
    }
}
