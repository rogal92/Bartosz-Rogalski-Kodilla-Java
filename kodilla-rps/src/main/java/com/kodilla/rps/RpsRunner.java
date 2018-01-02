package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {

        Game game = new Game();

        game.play();
        Scanner scanner = new Scanner(System.in);
        char exit = ' ';

        System.out.println("Press 'x' to end game or 'p' to play again");
        exit = scanner.nextLine().toUpperCase().charAt(0);

        if (exit == 'p') {
            System.out.println("Thank you for playing! ");
            game.play();

        } else if (exit == 'x') {
            game.ending();
        }
        else {
            System.out.println("Press the valid key 'x' or 'p'");
        }
    }
}
//        while (exit != 'X') {
//            game.play();
//
//            System.out.println("Thanks for playing rock, paper, scissors!");
//            exit = scanner.nextLine().toUpperCase().charAt(0);
//            scanner.close();
//            game.ending();