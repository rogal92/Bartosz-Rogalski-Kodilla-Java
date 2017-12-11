package com.kodilla.good.patterns.challenges.challengesTwo.flights;

import java.util.List;

public class FlightsTo {
//    @Override
//    public void search(AllFlights allFlights) {
//
//        allFlights.katowice().getArrivalAirport().stream()
//                .filter(s -> s.contains("Gdańsk"))
//                .forEach(System.out::println);
//    }
//

    AllFlights allFlights = new AllFlights();

    public static List<String> flightsToKatowice;

    public FlightsTo() {
        if (allFlights.krakow().getArrivalAirport().contains("Katowice") == true) {
            flightsToKatowice.add("Kraków");
        }
        if (allFlights.wroclaw().getArrivalAirport().contains("Katowice") == true) {
            flightsToKatowice.add("Wrocław");
        }
        if (allFlights.warszawa().getArrivalAirport().contains("Katowice") == true) {
            flightsToKatowice.add("Warszawa");
        }
        if (allFlights.gdansk().getArrivalAirport().contains("Katowice") == true) {
            flightsToKatowice.add("Gdańsk");
        }
        flightsToKatowice.stream()
                .forEach(System.out::println);
    }
}
