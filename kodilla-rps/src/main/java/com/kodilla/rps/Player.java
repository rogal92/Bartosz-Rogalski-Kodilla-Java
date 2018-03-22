package com.kodilla.rps;

import java.util.Scanner;

public class Player implements RpsItems {

    Scanner scanner;

    public Player() {
        scanner = new Scanner(System.in);
    }

    public CHOICES getChoice() {

        System.out.println("Please choose '1' for rock, '2' for paper or '3' for scissors :)");
        int playerChoice = scanner.nextLine().charAt(0);

        switch (playerChoice) {

            case '1':
                return CHOICES.ROCK;
            case '2':
                return CHOICES.PAPER;
            case '3':
                return CHOICES.SCISSORS;
            default:
                System.out.println("Something's wrong");
                return getChoice();
        }
    }
}
