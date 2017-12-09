package com.kodilla.good.patterns.challenges.challengesTwo.flights;

import java.util.HashMap;

public class flights {

    private HashMap<Integer, Cities> directFlights = new HashMap<>();
    private HashMap<Integer, Cities> notDirectFlights = new HashMap<>();

    public flights(HashMap<Integer, Cities> directFlights, HashMap<Integer, Cities> notDirectFlights) {
        this.directFlights = directFlights;
        this.notDirectFlights = notDirectFlights;
    }

    public HashMap<Integer, Cities> getDirectFlights() {
        return directFlights;
    }

    public HashMap<Integer, Cities> getNotDirectFlights() {
        return notDirectFlights;
    }
}


