package com.kodilla.rps;

public class Statistics implements RpsItems {

    private RpsItems.CHOICES playerChoices;
    private RpsItems.CHOICES computerChoices;
    private RpsItems.RESULTS results;
    private int playerScore;
    private int computerScore;
    private int gamesPlayed;

    public Statistics(CHOICES playerChoices, CHOICES computerChoices, RESULTS results, int playerScore, int computerScore, int gamesPlayed) {
        this.playerChoices = playerChoices;
        this.computerChoices = computerChoices;
        this.results = results;
        this.playerScore = playerScore;
        this.computerScore = computerScore;
        this.gamesPlayed = gamesPlayed;
    }

    public CHOICES getPlayerChoices() {
        return playerChoices;
    }

    public CHOICES getComputerChoices() {
        return computerChoices;
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public Statistics() {
    }
    Game game = new Game();

    public RESULTS getResults() {
        if (playerChoices == computerChoices)
            return RESULTS.TIE;
        switch (playerChoices) {

            case ROCK:
                return (computerChoices == CHOICES.SCISSORS ? RESULTS.WIN : RESULTS.LOOSE);
            case PAPER:
                return (computerChoices == CHOICES.ROCK ? RESULTS.WIN : RESULTS.LOOSE);
            case SCISSORS:
                return (computerChoices == CHOICES.PAPER ? RESULTS.WIN : RESULTS.LOOSE);
            default:
                throw new IllegalArgumentException();
        }
    }

    public void displayResults() {

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

    public void statistics() {

        if (results.equals(RESULTS.TIE) || results.equals(RESULTS.LOOSE) || results.equals(RESULTS.WIN)) {
            gamesPlayed++;
        }
        if (results.equals(RESULTS.WIN) && playerScore <= 3) {
            playerScore++;
            System.out.println("Player score is: " + playerScore);
            if (playerScore == 3) {
                System.out.println("Player scored: " + playerScore + "Game over");
                game.playAgain();
            }
        } else if (results.equals(RESULTS.LOOSE) && computerScore <= 3) {
            computerScore++;
            System.out.println("Computer score is: " + computerScore);
            if (computerScore == 3) {
                System.out.println("Computer scored: " + computerScore + " " + "Game over");
                game.playAgain();
            }
        } else if (results.equals(RESULTS.TIE)) {
            System.out.println();
        } else {
            System.out.println("Game ends with 3 points scored");
        }
    }

    public void endingStats() {
        System.out.println("Games amount: " + gamesPlayed);
        System.out.println("Player have won: " + playerScore + " " + "times");
        System.out.println("Computer have won " + computerScore + " " + "times");
    }
}
