package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> listOfContinents = new ArrayList<>();
    public void addContinent(Continent continent){
        listOfContinents.add(continent);
    }

    public List<Continent> getListOfContinents() {
        return listOfContinents;
    }

    public String getPopulation(){
        return listOfContinents.stream()
                .flatMap(people -> people.addCountry().stream());
    }
}
