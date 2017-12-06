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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public int getNip() {
        return nip;
    }

    public void setNip(int nip) {
        this.nip = nip;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}


