//package com.kodilla.good.patterns.challenges.challengesTwo.flights;
//
//import java.util.HashMap;
//
//public class SearchFlight {
//    private HashMap<String, String> flights = new HashMap<>();
//    private Airports airports = new Airports();
//
//    public SearchFlight(HashMap<String, String> flights, Airports airports) {
//        this.flights = flights;
//        this.airports = airports;
//    }
//    public void Flights() {
//        flights.put(airports.getKrakow(),airports.getWroclaw());
//        flights.put(airports.getKrakow(),airports.getWarszawa());
//        flights.put(airports.getKrakow(),airports.getKatowice());
//        flights.put(airports.getKrakow(),airports.getGdansk());
//        flights.put(airports.getWarszawa(),airports.getKrakow());
//        flights.put(airports.getWarszawa(),airports.getGdansk());
//        flights.put(airports.getWarszawa(),airports.getKatowice());
//        flights.put(airports.getWarszawa(),airports.getWroclaw());
//        flights.put(airports.getGdansk(),airports.getKrakow());
//        flights.put(airports.getGdansk(),airports.getWarszawa());
//        flights.put(airports.getGdansk(),airports.getWroclaw());
//        flights.put(airports.getGdansk(),airports.getKatowice());
//        flights.put(airports.getKatowice(),airports.getWarszawa());
//        flights.put(airports.getKatowice(),airports.getGdansk());
//        flights.put(airports.getKatowice(),airports.getKrakow());
//        flights.put(airports.getWroclaw(),airports.getKrakow());
//        flights.put(airports.getWroclaw(),airports.getWarszawa());
//        flights.put(airports.getWroclaw(),airports.getGdansk());
//    }
//
//    public HashMap<String, String> getFlights() {
//        return flights;
//    }
//
//    public Airports getAirports() {
//        return airports;
//    }
//}