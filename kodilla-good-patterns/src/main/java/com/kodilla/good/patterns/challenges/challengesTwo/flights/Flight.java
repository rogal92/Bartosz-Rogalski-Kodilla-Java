package com.kodilla.good.patterns.challenges.challengesTwo.flights;

import java.util.ArrayList;
import java.util.List;

public class Flight {

    private final String departureAirport;
    private final String arrivalAirport;

    public Flight(String departureAirport, String arrivalAirport) {
        this.departureAirport = departureAirport;
        this.arrivalAirport = arrivalAirport;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }
}
