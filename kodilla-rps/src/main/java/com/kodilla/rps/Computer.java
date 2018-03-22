package com.kodilla.rps;

import java.util.Random;

public class Computer implements RpsItems {
    private Random rand;

    public Computer(final Random rand) {
        this.rand = rand;
    }

    public Computer() {

        rand = new Random();
    }

    public CHOICES getChoice() {

        int choice = 1 + rand.nextInt(3);

        if (choice == 1) {
            return CHOICES.ROCK;
        } else if (choice == 2) {
            return CHOICES.PAPER;
        } else {
            return CHOICES.SCISSORS;
        }
    }
}