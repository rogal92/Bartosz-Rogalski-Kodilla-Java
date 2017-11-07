package com.kodilla.stream.world;

import org.junit.Test;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        World world = new World();
        //When
        world.addContinent(new Continent(new Country("Poland")));
        //Then
    }
}