package com.swiggy.game;


public class Match {
    Player player1;
    Player player2;

    public Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    /*
    return winner of the match
     */
    public Player startMatch(){
        boolean isPlayer1Attacking = player1.getHealth() <= player2.getHealth();
        int roundNumber = 1;
        while(player1.getHealth() > 0 && player2.getHealth() > 0){
            Player attacker = isPlayer1Attacking? player1 : player2;
            Player defender = isPlayer1Attacking? player2 : player1;
            int attackScore=attackScore(attacker);
            int defendScore=defendScore(defender);
            if(attackScore > defendScore){
             defender.setHealth(Math.max(0,defender.getHealth() - (attackScore-defendScore)));
            }
            isPlayer1Attacking = !isPlayer1Attacking;
            System.out.println("Round "+ roundNumber+" : " + attacker.getName() +" is attacking and " + defender.getName()+" is defending");
            System.out.println("Health after round " + roundNumber + " : " );
            System.out.println(attacker.getName()+ " : " + attacker.getHealth());
            System.out.println(defender.getName()+ " : " + defender.getHealth());
            roundNumber++;
        }
        return player1.getHealth() <= 0 ? player2 : player1;
    }

    public int attackScore(Player attacker){
        int diceScore=DiceUtil.rollDice();
        return diceScore*attacker.getAttack();
    }
    public int defendScore(Player defender){
        int diceScore=DiceUtil.rollDice();
        return diceScore*defender.getStrength();
    }
}
