package com.kodilla.good.patterns.challenges.challengesTwo.flights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchFlight {

    private List<Flight> flights = new ArrayList<Flight>();

    public SearchFlight() {

        Flight waw_krk = new Flight("Warszawa","Kraków");
        Flight waw_gda = new Flight("Warszawa","Gdańsk");
        Flight waw_wro = new Flight("Warszawa","Wrocław");

        Flight gda_wro = new Flight("Gdańsk","Wrocław");
        Flight gda_waw = new Flight("Gdańsk","Warszawa");

        Flight krk_wro = new Flight("Kraków", "Wrocław");
        Flight krk_waw = new Flight("Kraków","Warszawa");

        Flight wro_krk = new Flight("Wrocław","Kraków");
        Flight wro_waw = new Flight("Wrocław","Warszawa");
        Flight wro_gda = new Flight("Wrocław","Gdańsk");

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
    public void searchFlightsFrom() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for flight from: ");
        String departureFrom = scanner.nextLine();

        if (departureFrom.equals("Warszawa") || departureFrom.equals("Kraków") || departureFrom.equals("Gdańsk") || departureFrom.equals("Wrocław")) {
            flights.stream()
                    .filter(f -> f.getDepartureAirport().contains(departureFrom))
                    .forEach(System.out::println);
        } else {
            System.out.println("wrong input");
            searchFlightsFrom();
        }
    }

    public void searchFlightsTo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for flight to: ");
        String arrivalTo = scanner.nextLine();

        if (arrivalTo.equals("Warszawa") || arrivalTo.equals("Kraków") || arrivalTo.equals("Gdańsk") || arrivalTo.equals("Wrocław")) {
            flights.stream()
                    .filter(f -> f.getArrivalAirport().contains(arrivalTo))
                    .forEach(System.out::println);
        } else {
            System.out.println("wrong input");
            searchFlightsTo();
        }
    }
}