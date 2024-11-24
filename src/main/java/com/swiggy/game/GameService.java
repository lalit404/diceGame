package com.swiggy.game;

import java.util.Scanner;

public class GameService {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Player playerOne= new Player();
        Player playerTwo= new Player();

        System.out.println("Enter the player one name");
        playerOne.setName(scanner.next());
        System.out.println("Enter the player two name");
        playerTwo.setName(scanner.next());

        System.out.println("Enter the " + playerOne.getName() + " health");
        playerOne.setHealth(scanner.nextInt());
        System.out.println("Enter the " + playerTwo.getName() + " health");
        playerTwo.setHealth(scanner.nextInt());

        System.out.println("Enter the " + playerOne.getName() + " strength");
        playerOne.setStrength(scanner.nextInt());
        System.out.println("Enter the " + playerTwo.getName() + " strength");
        playerTwo.setStrength(scanner.nextInt());

        System.out.println("Enter the " + playerOne.getName() + " attack");
        playerOne.setAttack(scanner.nextInt());
        System.out.println("Enter the " + playerTwo.getName() + " attack");
        playerTwo.setAttack(scanner.nextInt());

        playerOne.setId(1);
        playerTwo.setId(2);
        scanner.close();

        Match match = new Match(playerOne, playerTwo);
        Player winner = match.startMatch();
        System.out.println("Game over! Winner is " + winner.getName());

    }
}
