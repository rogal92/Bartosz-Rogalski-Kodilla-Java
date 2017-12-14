package com.kodilla.good.patterns.challenges.challengesTwo.flights;

public class Airports {

    private final String krakow;
    private final String wroclaw;
    private final String warszawa;
    private final String katowice;
    private final String gdansk;

    public Airports(String krakow, String wroclaw, String warszawa, String katowice, String gdansk) {
        this.krakow = krakow;
        this.wroclaw = wroclaw;
        this.warszawa = warszawa;
        this.katowice = katowice;
        this.gdansk = gdansk;
    }

    public Airports() {}

    public String getKrakow() {
        return krakow;
    }

    public String getWroclaw() {
        return wroclaw;
    }

    public String getWarszawa() {
        return warszawa;
    }

    public String getKatowice() {
        return katowice;
    }

    public String getGdansk() {
        return gdansk;
    }
}
