package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.introduction();

        while (game.statisticsClass.getComputerScore() < 3 || game.statisticsClass.getPlayerScore() < 3) {
            game.play();
        }
    }
}