//package com.kodilla.good.patterns.challenges.challengesTwo.flights;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class SearchFlight {
//
//    private List<Flight> flights = new ArrayList<Flight>() {
//    };
//    private Airports airports = new Airports();
//    Flight krk_waw = new Flight();
//    Flight krk_wro = new Flight();
//
//    Flight waw_krk = new Flight();
//    Flight waw_gda = new Flight();
//    Flight waw_wro = new Flight();
//
//    Flight gda_wro = new Flight();
//    Flight gda_waw = new Flight();
//
//    Flight wro_krk = new Flight();
//    Flight wro_waw = new Flight();
//    Flight wro_gda = new Flight();
//
//    public SearchFlight(List<Flight> flights, Airports airports) {
//        this.flights = flights;
//        this.airports = airports;
//    }
//    public List Flights() {
//
//        flights.add(krk_waw);
//        flights.add(krk_wro);
//
//        flights.add(waw_gda);
//        flights.add(waw_krk);
//        flights.add(waw_wro);
//
//        flights.add(wro_gda);
//        flights.add(wro_krk);
//        flights.add(wro_waw);
//
//        flights.add(gda_waw);
//        flights.add(gda_wro);
//
//        return Flights();
//    }
//
//    public void searchFlights() {
//        flights.stream()
//    }
//
//    public Airports getAirports() {
//        return airports;
//    }
//}