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
//        stats.getPlayerChoices() = player.getChoice();
//        stats.getComputerChoices() = computer.getChoice();

        stats.getResults();
        stats.displayResults();
        stats.statistics();
        stats.endingStats();
    }

    public void playAgain() {
        System.out.println("Press 'X' to end game or 'N' to play again");
        Scanner scanner = new Scanner(System.in);
        char exit = ' ';
        exit = scanner.nextLine().toUpperCase().charAt(0);

        if (exit == 'X') {
            scanner.close();
            System.exit(1);
        }
        if (exit == 'N') {
            play();
        } else {
            System.out.println("Wrong input! Press 'X' to quit or 'N' to start again");
            playAgain();
        }
    }
}