package com.kodilla.exception.test;

import java.util.HashMap;

public class SearchFlight {

    public void findFlight(Flight flight) throws RouteNotFoundException {

        HashMap<String, Boolean> AirportsAvailibility = new HashMap<>();

        AirportsAvailibility.put("AirportOne", true);
        AirportsAvailibility.put("AirportTwo", false);
        AirportsAvailibility.put("AirportThree", true);
        AirportsAvailibility.put("AirportFour", false);
        AirportsAvailibility.put("AirportFive", true);
        AirportsAvailibility.put("AirportSix", true);


    }
}