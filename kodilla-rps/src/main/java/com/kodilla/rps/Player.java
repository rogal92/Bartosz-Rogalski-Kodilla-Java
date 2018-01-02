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
        int playerChoice = scanner.nextInt();

        if(playerChoice == 1) {
            return CHOICES.ROCK;
        }
        else if(playerChoice == 2) {
            return CHOICES.PAPER;
        }
        else if(playerChoice == 3) {
            return CHOICES.SCISSORS;
        }
        else {
            System.out.println("Please enter a valid number (1,2 or 3)");
            return getChoice();
        }
    }
}
