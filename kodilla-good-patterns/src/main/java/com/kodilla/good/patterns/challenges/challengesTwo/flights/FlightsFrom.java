package com.kodilla.good.patterns.challenges.challengesTwo.flights;

public class FlightsFrom implements Search {
    @Override
    public void search(AllFlights allFlights) {

      allFlights.katowice().getArrivalAirport().stream()
              .map(s -> s.toString())
              .forEach(System.out::println);

      allFlights.gdansk().getArrivalAirport().stream()
              .map(s -> s.toString())
              .forEach(System.out::println);

      allFlights.warszawa().getArrivalAirport().stream()
              .map(s -> s.toString())
              .forEach(System.out::println);

      allFlights.wroclaw().getArrivalAirport().stream()
              .map(s -> s.toString())
              .forEach(System.out::println);

      allFlights.krakow().getArrivalAirport().stream()
              .map(s -> s.toString())
              .forEach(System.out::println);
    }
}
