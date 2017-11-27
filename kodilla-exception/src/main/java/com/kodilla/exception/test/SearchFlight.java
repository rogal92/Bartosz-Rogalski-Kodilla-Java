package com.kodilla.exception.test;

import java.util.HashMap;

public class SearchFlight {

    HashMap<String, Boolean> airportsAvailibility = new HashMap<>();

    public SearchFlight(HashMap<String, Boolean> airportsAvailibility) {
        this.airportsAvailibility = airportsAvailibility;

        airportsAvailibility.put("AirportOne",true);
        airportsAvailibility.put("AirportTwo", false);
        airportsAvailibility.put("AirportThree", true);
        airportsAvailibility.put("AirportFour", false);
        airportsAvailibility.put("AirportFive", true);
        airportsAvailibility.put("AirportSix", true);
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        Boolean contains = airportsAvailibility.containsKey("AirportSeven");

        if (contains == false) {
            throw new RouteNotFoundException();
        }
    }
    public static void main(String[] args) {

        try {

        } catch (Exception e) {
            System.out.println("This airport is not available");
        } finally {
            System.out.println("Thank you for using our airlines");
        }
    }
}