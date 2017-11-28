package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        List<Country> countriesInEurope = new ArrayList<>();
        List<Country> countriesInAsia = new ArrayList<>();

        countriesInEurope.add(new Country("Poland", new BigDecimal("38000000")));
        countriesInEurope.add(new Country("England", new BigDecimal("53100000")));
        countriesInEurope.add(new Country("Spain", new BigDecimal("46560000")));
        countriesInEurope.add(new Country("Switzerland", new BigDecimal("8360000")));
        countriesInEurope.add(new Country("Italy", new BigDecimal("60600000")));
        countriesInEurope.add(new Country("Portugal", new BigDecimal("10320000")));
        countriesInEurope.add(new Country("Holland", new BigDecimal("17200000")));

        countriesInAsia.add(new Country("Qatar", new BigDecimal("2570000")));
        countriesInAsia.add(new Country("Japan", new BigDecimal("127000000")));
        countriesInAsia.add(new Country("China", new BigDecimal("1379000000")));
        countriesInAsia.add(new Country("Tailand", new BigDecimal("68860000")));

        List<Continent> continents = new ArrayList<>();
        continents.add(new Continent("Europe",countriesInEurope));
        continents.add(new Continent("Asia",countriesInAsia));

        //When
        World world = new World();
        world.addContinent(new Continent("Europe",countriesInEurope));
        world.addContinent(new Continent("Asia",countriesInAsia));

        BigDecimal total = world.getPeopleQuantity();

        //Then
        BigDecimal expectedPeopleQuantity = new BigDecimal("1811570000");
        Assert.assertEquals(expectedPeopleQuantity, total);
    }
}
