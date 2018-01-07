package com.kodilla.rps;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Scanner;

public class Player implements rpsItems {

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
        }

        System.out.println("Wrong input, please press '1', '2' or '3'");
        return getChoice();
    }
}
