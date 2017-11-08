package com.kodilla.stream.world;

import java.util.ArrayList;
import java.util.List;

public final class Continent {
    private final String continentName;
    private List<Country> countries = new ArrayList<>();

    public Continent(String continentName, List<Country> country) {
        this.continentName = continentName;
        this.countries = country;
    }
    public String getContinentName() {
        return continentName;
    }

    public List<Country> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Continent continent = (Continent) o;

        if (!continentName.equals(continent.continentName)) return false;
        return countries.equals(continent.countries);
    }

    @Override
    public int hashCode() {
        int result = continentName.hashCode();
        result = 31 * result + countries.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Continent{" +
                "continentName='" + continentName + '\'' +
                ", countries=" + countries +
                '}';
    }
}