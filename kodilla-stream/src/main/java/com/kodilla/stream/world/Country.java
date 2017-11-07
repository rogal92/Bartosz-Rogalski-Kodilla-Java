package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;

    public Country(String countryName) {
        this.countryName = countryName;
    }

    public Country() {
    }

    public String getCountryName() {
        return countryName;
    }

    public BigDecimal getPeopleQuantity(){
        BigDecimal peopleAmount = new BigDecimal("2323232");
        return peopleAmount;
    }
}
