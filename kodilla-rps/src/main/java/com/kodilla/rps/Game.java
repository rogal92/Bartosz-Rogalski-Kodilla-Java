package com.kodilla.rps;

public class Game implements rpsItems {

    private CHOICES playerChoices;
    private CHOICES computerChoices;
    private RESULTS results;
    private Computer computer = new Computer();
    private Player player = new Player();
    private static int playerScore;
    private static int computerScore;
    private static int ties;
    private int gamesPlayed = playerScore + computerScore + ties;

    public Game(CHOICES playerChoices, CHOICES computerChoices, RESULTS results, Computer computer, Player player, int gamesPlayed, int ties) {
        this.playerChoices = playerChoices;
        this.computerChoices = computerChoices;
        this.results = results;
        this.computer = computer;
        this.player = player;
        this.gamesPlayed = gamesPlayed;
        this.ties = ties;
    }

    public Game() {
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
        System.out.println("Tie happened:" + ties + " " + "times");
    }

    private RESULTS getResults() {
        if (computerChoices == playerChoices) {
            return RESULTS.TIE;
        } else if (playerChoices == CHOICES.PAPER && computerChoices == CHOICES.ROCK) {
            return RESULTS.WIN;
        } else if (playerChoices == CHOICES.PAPER && computerChoices == CHOICES.SCISSORS) {
            return RESULTS.LOOSE;
        } else if (playerChoices == CHOICES.ROCK && computerChoices == CHOICES.SCISSORS) {
            return RESULTS.WIN;
        } else if (playerChoices == CHOICES.ROCK && computerChoices == CHOICES.PAPER) {
            return RESULTS.LOOSE;
        } else if (playerChoices == CHOICES.SCISSORS && computerChoices == CHOICES.PAPER) {
            return RESULTS.WIN;
        } else if (playerChoices == CHOICES.SCISSORS && computerChoices == CHOICES.ROCK) {
            return RESULTS.LOOSE;
        }
        throw new IllegalArgumentException();
    }
    private void displayResults() {

        if(results.equals(RESULTS.TIE)) {
            System.out.println("It is a Tie!");
        } else if (results.equals(RESULTS.LOOSE)) {
            System.out.println("You lost!");
        } else if (results.equals(RESULTS.WIN)) {
            System.out.println("WINNER!");
        }
    }
    private void statistics() {


        if(results.equals(RESULTS.WIN) && playerScore <= 3) {
            playerScore++;
            System.out.println("Player score is: " + playerScore);
            if(playerScore == 3) {
                System.out.println("Player scored: " + playerScore + "Game over");
            }
        }
        else if (results.equals(RESULTS.LOOSE) && computerScore <= 3) {
            computerScore++;
            System.out.println("Computer score is: " + computerScore);
            if(computerScore == 3) {
                System.out.println("Computer scored: " + computerScore + "Game over");
            }
        }
        else if ( results.equals(RESULTS.TIE)) {
            System.out.println();
        }
        else {
            System.out.println("Game ends with 3 points scored");
        }
    }
}