package com.kodilla.rps;

public class RpsRunner {
    public static void main(String[] args) {
        Game game = new Game();
        game.introduction();

        while (game.stats.getComputerScore() < 3 || game.stats.getPlayerScore() < 3) {
            game.play();
        }
    }
}