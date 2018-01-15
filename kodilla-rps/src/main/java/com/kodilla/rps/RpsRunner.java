package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.introduction();

        do {
            game.stats.reset();

            while (game.stats.getComputerScore() < 3 && game.stats.getPlayerScore() < 3) {
                game.play();
            }
            game.stats.displayStats();
        } while (playAgain());
    }
    public static boolean playAgain() {
        System.out.println("Press 'X' to end game or 'N' to play again");
        Scanner scanner = new Scanner(System.in);
        char exit = ' ';
        exit = scanner.nextLine().toUpperCase().charAt(0);

        if (exit == 'X') {
            return false;
        }
        if (exit == 'N') {
            return true;
        } else {
            System.out.println("Wrong input! Press 'X' to quit or 'N' to start again");
           return playAgain();
        }
    }
}
