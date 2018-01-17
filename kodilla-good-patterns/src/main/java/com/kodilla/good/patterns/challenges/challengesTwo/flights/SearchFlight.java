package com.kodilla.good.patterns.challenges.challengesTwo.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SearchFlight {

    private List<Flight> flights = new ArrayList<Flight>();
    private String departureFrom;
    private String departureTo;

    public SearchFlight(List<Flight> flights, String departureFrom, String departureTo) {
        this.flights = flights;
        this.departureFrom = departureFrom;
        this.departureTo = departureTo;
    }

    public List<Flight> getFlights() {
        return flights;
    }

    public String getDepartureFrom() {
        return departureFrom;
    }

    public String getDepartureTo() {
        return departureTo;
    }

    public SearchFlight() {

        Flight waw_krk = new Flight("Warszawa", "Kraków");
        Flight waw_gda = new Flight("Warszawa", "Gdańsk");
        Flight waw_wro = new Flight("Warszawa", "Wrocław");

        Flight gda_wro = new Flight("Gdańsk", "Wrocław");
        Flight gda_waw = new Flight("Gdańsk", "Warszawa");

        Flight krk_wro = new Flight("Kraków", "Wrocław");
        Flight krk_waw = new Flight("Kraków", "Warszawa");

        Flight wro_krk = new Flight("Wrocław", "Kraków");
        Flight wro_waw = new Flight("Wrocław", "Warszawa");
        Flight wro_gda = new Flight("Wrocław", "Gdańsk");

        flights.add(waw_gda);
        flights.add(waw_krk);
        flights.add(waw_wro);

        flights.add(wro_gda);
        flights.add(wro_krk);
        flights.add(wro_waw);

        flights.add(krk_waw);
        flights.add(krk_wro);

        flights.add(gda_waw);
        flights.add(gda_wro);
    }

    public List<Flight> searchFlightsFrom(String departureFrom) {

       List<Flight> from =  flights.stream()
                .filter(f -> f.getDepartureAirport().startsWith(departureFrom))
                .collect(Collectors.toList());
        return from;
    }


    public List<Flight> searchFlightsTo(String departureTo) {

        List<Flight> to = flights.stream()
                    .filter(f -> f.getArrivalAirport().startsWith(departureTo))
                    .collect(Collectors.toList());
            return to;
        }
    }