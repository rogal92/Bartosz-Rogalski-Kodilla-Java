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

        boolean hasAirport = airportsAvailibility.containsKey(flight.getArrivalAirport());

        if (hasAirport) {
            return airportsAvailibility.containsKey("AirportSeven");
        }
        throw new RouteNotFoundException("\nPlease choose one of our available airports from the schedule");
    }
    public static void main(String[] args) {

        try {
            SearchFlight searchFlight = new SearchFlight();
            searchFlight.findFlight(new Flight("AirportOne","AirportSeven"));
        } catch (Exception e) {
            System.out.println("This airport is not available" + "\n"+ e);
        } finally {
            System.out.println("Thank you for using our airlines");
        }
    }
}