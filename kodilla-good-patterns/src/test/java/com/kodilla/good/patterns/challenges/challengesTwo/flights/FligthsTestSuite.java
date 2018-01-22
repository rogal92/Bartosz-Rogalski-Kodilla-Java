package com.kodilla.good.patterns.challenges.challengesTwo.flights;

import org.junit.Assert;
import org.junit.Test;

public class FligthsTestSuite {

    @Test
    public void testFlightsFrom() {
        //Given
        SearchFlight searchFlight = new SearchFlight();

        //When

        //Then
        Assert.assertEquals(3, searchFlight.searchFlightsFrom("Warszawa").size());
    }

    @Test
    public void testFlightsTo() {
        //Given
        SearchFlight searchFlight = new SearchFlight();

        //When

        //Then
        Assert.assertEquals(2,searchFlight.searchFlightsTo("Gdańsk").size());
    }

    @Test
    public void testFlightsThrough() {
        //Given
        SearchFlight searchFlight = new SearchFlight();

        //When

        //Then
        Assert.assertEquals(2,searchFlight.searchNotDirectFlights("Kraków","Gdańsk","Warszawa").size());
    }
}
