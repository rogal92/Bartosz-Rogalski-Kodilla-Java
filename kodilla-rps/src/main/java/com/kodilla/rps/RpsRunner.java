package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.introduction();

        while (game.getComputerScore() < 3 || game.getPlayerScore() < 3) {
            game.play();
        }
    }
}