package com.kodilla.rps;

public class Statistics implements RpsItems {

    private int playerScore;
    private int computerScore;
    private int gamesPlayed;

    public Statistics() {
    }

    public int getPlayerScore() {
        return playerScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    private RESULTS getResults(CHOICES playerChoice, CHOICES computerChoice) {
        if (playerChoice == computerChoice)
            return RESULTS.TIE;
        switch (playerChoice) {

            case ROCK:
                return (computerChoice == CHOICES.SCISSORS ? RESULTS.WIN : RESULTS.LOOSE);
            case PAPER:
                return (computerChoice == CHOICES.ROCK ? RESULTS.WIN : RESULTS.LOOSE);
            case SCISSORS:
                return (computerChoice == CHOICES.PAPER ? RESULTS.WIN : RESULTS.LOOSE);
            default:
                throw new IllegalArgumentException();
        }
    }

    private void displayResults(CHOICES playerChoice, CHOICES computerChoice, RESULTS results) {

        if (results.equals(RESULTS.TIE)) {
            System.out.println(playerChoice + " " + "Is the same with" + " " + computerChoice);
            System.out.println("It is a Tie!");
        } else if (results.equals(RESULTS.LOOSE)) {
            System.out.println(computerChoice + " " + "beats" + " " + playerChoice);
            System.out.println("You lost!");
        } else if (results.equals(RESULTS.WIN)) {
            System.out.println(playerChoice + " " + "beats" + " " + computerChoice);
            System.out.println("WINNER!");
        }
    }

    private void updateScores(RESULTS results) {
        gamesPlayed++;

        if (results.equals(RESULTS.WIN)) {
            playerScore++;
            System.out.println("Player score is: " + playerScore);

        } else if (results.equals(RESULTS.LOOSE)) {
            computerScore++;
            System.out.println("Computer score is: " + computerScore);
        }
    }

    public void updateStatistic(CHOICES playerChoice, CHOICES computerChoice) {

       RESULTS result = getResults(playerChoice, computerChoice);
       displayResults(playerChoice,computerChoice,result);
       updateScores(result);
    }

    public void displayStats() {
        System.out.println("Games amount: " + gamesPlayed);
        System.out.println("Player have won: " + playerScore + " " + "times");
        System.out.println("Computer have won " + computerScore + " " + "times");
    }
    public void reset() {
        playerScore = 0;
        computerScore = 0;
        gamesPlayed = 0;
    }
}
