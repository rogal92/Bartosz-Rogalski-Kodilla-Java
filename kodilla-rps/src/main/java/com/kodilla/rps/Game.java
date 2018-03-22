package com.kodilla.rps;

import java.util.Scanner;

public class Game implements RpsItems {

    private Computer computer = new Computer();
    private Player player = new Player();

    public Game(final Computer computer, final Player player) {
        this.computer = computer;
        this.player = player;
    }

    public Game() {}

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
    }
}