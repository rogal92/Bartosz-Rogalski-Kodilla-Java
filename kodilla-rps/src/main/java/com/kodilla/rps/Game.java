package com.kodilla.rps;

import java.util.Scanner;

public class Game implements RpsItems {

    private Computer computer = new Computer();
    private Player player = new Player();

    public Game(Computer computer, Player player) {
        this.computer = computer;
        this.player = player;
    }

    public Game() {
    }

    Statistics stats = new Statistics();

    public void introduction() {

        System.out.println("Welcome to Rock, paper, scissors game");
        System.out.println("Please enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("Ok" + " " + playerName + " " + "Here are some instructions:");
        System.out.println("We play until one of the players scores 3 points");
        System.out.println("press 1 to pick ROCK, 2 to pick PAPER, 3 to pick SCISSORS");
        System.out.println("LET'S START!!");
    }

    public void play() {

        stats.updateStatistic(player.getChoice(), computer.getChoice());
//        if (results.equals(RESULTS.WIN) && playerScore <= 3) {
//            playerScore++;
//            System.out.println("Player score is: " + playerScore);
//            if (playerScore == 3) {
//                System.out.println("Player scored: " + playerScore + "Game over");
//                game.playAgain();
//            }
//        } else if (results.equals(RESULTS.LOOSE) && computerScore <= 3) {
//            computerScore++;
//            System.out.println("Computer score is: " + computerScore);
//            if (computerScore == 3) {
//                System.out.println("Computer scored: " + computerScore + " " + "Game over");
//                game.playAgain();
//            }
    }


}