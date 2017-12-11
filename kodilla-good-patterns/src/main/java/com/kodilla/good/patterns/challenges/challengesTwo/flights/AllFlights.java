package com.kodilla.good.patterns.challenges.challengesTwo.flights;

public class AllFlights {

    public Airports krakow() {
        krakow().getDepartureAirport().add("Kraków");
        krakow().getArrivalAirport().add("Warszawa");
        krakow().getArrivalAirport().add("Gdańsk");
        krakow().getArrivalAirport().add("Wrocław");
        krakow().getArrivalAirport().add("Katowice");
        return krakow();
    }
    public Airports wroclaw() {
        wroclaw().getDepartureAirport().add("Wrocław");
        wroclaw().getArrivalAirport().add("Kraków");
        wroclaw().getArrivalAirport().add("Warszawa");
        wroclaw().getArrivalAirport().add("Gdańsk");
        return wroclaw();
    }
    public Airports warszawa() {
        warszawa().getDepartureAirport().add("Warszawa");
        warszawa().getArrivalAirport().add("Kraków");
        warszawa().getArrivalAirport().add("Gdańsk");
        warszawa().getArrivalAirport().add("Katowice");
        warszawa().getArrivalAirport().add("Wrocław");
        return warszawa();
    }
    public Airports gdansk() {
        gdansk().getDepartureAirport().add("Gdańsk");
        gdansk().getArrivalAirport().add("Warszawa");
        gdansk().getArrivalAirport().add("Wrocław");
        gdansk().getArrivalAirport().add("Katowice");
        gdansk().getArrivalAirport().add("Kraków");
        return gdansk();
    }
    public Airports katowice() {
        katowice().getDepartureAirport().add("Katowice");
        katowice().getArrivalAirport().add("Warszawa");
        katowice().getArrivalAirport().add("Gdańsk");
        katowice().getArrivalAirport().add("Kraków");
        return katowice();
    }
}
