package com.kodilla.exception.test;

import java.util.HashMap;

public class SearchFlight {

    HashMap<String, Boolean> airportsAvailibility = new HashMap<>();

    public SearchFlight() {

        airportsAvailibility.put("AirportOne",true);
        airportsAvailibility.put("AirportTwo", false);
        airportsAvailibility.put("AirportThree", true);
        airportsAvailibility.put("AirportFour", false);
        airportsAvailibility.put("AirportFive", true);
        airportsAvailibility.put("AirportSix", true);
    }

    public boolean findFlight(Flight flight) throws RouteNotFoundException {

        boolean contains = flight.getArrivalAirport().equals(airportsAvailibility);

        if (contains) {
            return airportsAvailibility.containsKey("AirportSeven");
        }
        throw new RouteNotFoundException();
    }
    public static void main(String[] args) {

        try {
            Flight flight = new Flight("AirportOne","AirportSeven");
            flight.getArrivalAirport();
        } catch (Exception e) {
            System.out.println("This airport is not available");
        } finally {
            System.out.println("Thank you for using our airlines");
        }
    }
}