package com.kodilla.good.patterns.challenges.challengesTwo.flights;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private List<String> departureAirport = new ArrayList<>();
    private List<String> arrivalAirport = new ArrayList<>();

    public Flight(List<String> departureAirport, List<String> arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public Flight() {
    }

    public List<String> getDepartureAirport() {
        return departureAirport;
    }

    public List<String> getArrivalAirport() {
        return arrivalAirport;
    }
}

