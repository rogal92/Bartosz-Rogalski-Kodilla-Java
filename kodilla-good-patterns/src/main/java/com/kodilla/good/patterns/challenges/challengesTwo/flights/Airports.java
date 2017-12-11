package com.kodilla.good.patterns.challenges.challengesTwo.flights;

import java.util.ArrayList;
import java.util.List;

public class Airports {

    private List<String> departureAirport = new ArrayList<>();
    private List<String> arrivalAirport = new ArrayList<>();

    public Airports() { }

    public List<String> getDepartureAirport() {
        return departureAirport;
    }

    public List<String> getArrivalAirport() {
        return arrivalAirport;
    }
}

