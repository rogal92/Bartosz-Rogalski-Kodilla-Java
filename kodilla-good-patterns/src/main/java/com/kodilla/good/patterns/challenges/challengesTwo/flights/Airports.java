package com.kodilla.good.patterns.challenges.challengesTwo.flights;

import java.util.ArrayList;
import java.util.List;

public class Airports {

    private List<String> departureCities = new ArrayList<>();
    private List<String> arrivalCities = new ArrayList<>();

    public Airports() {

    }
    public List<String> getDepartureAirport() {
        return departureCities;
    }

    public List<String> getArrivalAirport() {
        return arrivalCities;
    }
}

