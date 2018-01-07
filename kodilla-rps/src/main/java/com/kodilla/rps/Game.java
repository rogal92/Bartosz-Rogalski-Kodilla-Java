package com.kodilla.rps;

import java.util.Scanner;

public class Game implements rpsItems {

    private CHOICES playerChoices;
    private CHOICES computerChoices;
    private RESULTS results;
    private Computer computer = new Computer();
    private Player player = new Player();
    private int playerScore;
    private int computerScore;
    private int gamesPlayed;

    public Game(CHOICES playerChoices, CHOICES computerChoices, RESULTS results, Computer computer, Player player, int gamesPlayed, int playerScore, int computerScore) {
        this.playerChoices = playerChoices;
        this.computerChoices = computerChoices;
        this.results = results;
        this.computer = computer;
        this.player = player;
        this.gamesPlayed = gamesPlayed;
        this.computerScore = computerScore;
        this.playerScore = playerScore;
    }

    public Game() {
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void play() {
        playerChoices = player.getChoice();
        computerChoices = computer.getChoice();
        results = getResults();
        displayResults();
        statistics();
        ending();
    }

    public void ending() {
        System.out.println("Games amount: " + gamesPlayed);
        System.out.println("Player have won: " + playerScore + " " + "times");
        System.out.println("Computer have won " + computerScore + " " + "times");
    }

    private RESULTS getResults() {
        if (playerChoices == computerChoices)
            return RESULTS.TIE;
        switch (playerChoices) {

            case ROCK:
                return (computerChoices == CHOICES.SCISSORS ? RESULTS.WIN : RESULTS.LOOSE);
            case PAPER:
                return (computerChoices == CHOICES.ROCK ? RESULTS.WIN : RESULTS.LOOSE);
            case SCISSORS:
                return (computerChoices == CHOICES.PAPER ? RESULTS.WIN : RESULTS.LOOSE);
        }
        throw new IllegalArgumentException();
    }

    private void displayResults() {

        if (results.equals(RESULTS.TIE)) {
            System.out.println(playerChoices + " " + "Is the same with" + " " + computerChoices);
            System.out.println("It is a Tie!");
        } else if (results.equals(RESULTS.LOOSE)) {
            System.out.println(computerChoices + " " + "beats" + " " + playerChoices);
            System.out.println("You lost!");
        } else if (results.equals(RESULTS.WIN)) {
            System.out.println(playerChoices + " " + "beats" + " " + computerChoices);
            System.out.println("WINNER!");
        }
    }

    private void statistics() {

        if (results.equals(RESULTS.TIE) || results.equals(RESULTS.LOOSE) || results.equals(RESULTS.WIN)) {
            gamesPlayed++;
        }
        if (results.equals(RESULTS.WIN) && playerScore <= 3) {
            playerScore++;
            System.out.println("Player score is: " + playerScore);
            if (playerScore == 3) {
                System.out.println("Player scored: " + playerScore + "Game over");
                playAgain();
            }
        } else if (results.equals(RESULTS.LOOSE) && computerScore <= 3) {
            computerScore++;
            System.out.println("Computer score is: " + computerScore);
            if (computerScore == 3) {
                System.out.println("Computer scored: " + computerScore + " " + "Game over");
                playAgain();
            }
        } else if (results.equals(RESULTS.TIE)) {
            System.out.println();
        } else {
            System.out.println("Game ends with 3 points scored");
        }
    }

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

    public void playAgain() {
        System.out.println("Press 'x' to end game or 'N' to play again");
        Scanner scanner = new Scanner(System.in);
        char exit = ' ';
        exit = scanner.nextLine().toUpperCase().charAt(0);
        scanner.close();

        if (exit == 'X') {
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