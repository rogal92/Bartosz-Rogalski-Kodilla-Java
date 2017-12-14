package com.kodilla.good.patterns.challenges.challengesTwo.flights;

import java.util.HashMap;

public class SearchFlight {
    private HashMap<String, String> flights = new HashMap<>();
    private Airports airports = new Airports();

    public SearchFlight(HashMap<String, String> flights, Airports airports) {
        this.flights = flights;
        this.airports = airports;
    }
    public HashMap Flights() {
      String flightOne = flights.put(airports.getKrakow(),airports.getWroclaw());
      String flightTwo =  flights.put(airports.getKrakow(),airports.getWarszawa());
      String flightThree = flights.put(airports.getKrakow(),airports.getKatowice());
      String flightFour =  flights.put(airports.getKrakow(),airports.getGdansk());
      String flightFive =  flights.put(airports.getWarszawa(),airports.getKrakow());
      String flightSix =  flights.put(airports.getWarszawa(),airports.getGdansk());
      String flightSeven =  flights.put(airports.getWarszawa(),airports.getKatowice());
      String flightEight =  flights.put(airports.getWarszawa(),airports.getWroclaw());
      String flightNine = flights.put(airports.getGdansk(),airports.getKrakow());
      String flightTen =  flights.put(airports.getGdansk(),airports.getWarszawa());
      String flightEleven =  flights.put(airports.getGdansk(),airports.getWroclaw());
      String flightTwelve =  flights.put(airports.getGdansk(),airports.getKatowice());
      String flightThirteen =  flights.put(airports.getKatowice(),airports.getWarszawa());
      String flightFourteen =  flights.put(airports.getKatowice(),airports.getGdansk());
      String flightFifteen =  flights.put(airports.getKatowice(),airports.getKrakow());
      String flightSixteen =  flights.put(airports.getWroclaw(),airports.getKrakow());
      String flightSeventeen = flights.put(airports.getWroclaw(),airports.getWarszawa());
      String flightEighteen = flights.put(airports.getWroclaw(),airports.getGdansk());
      String notDirectFlights;

        if(flights.containsKey(airports.getKrakow())) {
            System.out.println(flightOne + flightTwo + flightThree + flightFour);
        } else if (flights.containsKey((airports.getWarszawa()))) {
            System.out.println(flightFive + flightSix + flightSeven + flightEight);
        } else if (flights.containsKey(airports.getGdansk())) {
            System.out.println(flightNine + flightTen + flightEleven + flightTwelve);
        } else if (flights.containsKey(airports.getKatowice())) {
            System.out.println(flightThirteen + flightFourteen + flightFifteen);
        } else if (flights.containsKey(airports.getWroclaw())) {
            System.out.println(flightSixteen + flightSeventeen + flightEighteen);
        } else if (notDirectFlights) {
            System.out.println(flightSeventeen + flightSeven );
            System.out.println(flightThirteen + flightEight);
        }

        return Flights();
    }

    public Airports getAirports() {
        return airports;
    }
}