package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.util.HashSet;
import java.util.Set;

public class Supplier {

    private String name;
    private String adress;
    private int nip;
    Set<Product> products = new HashSet<>();

    public Supplier(String name, String adress, int nip, Set<Product> products) {
        this.name = name;
        this.adress = adress;
        this.nip = nip;
        this.products = products;
    }
}

