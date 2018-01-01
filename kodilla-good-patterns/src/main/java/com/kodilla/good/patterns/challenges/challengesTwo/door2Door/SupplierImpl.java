package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.util.HashSet;
import java.util.Set;

public class SupplierImpl {

    private String name;
    private String adress;
    private int nip;
    private int id;

    public SupplierImpl(String name, String adress, int nip, int id) {
        this.name = name;
        this.adress = adress;
        this.nip = nip;
        this.id = id;
    }

    public SupplierImpl(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    public int getNip() {
        return nip;
    }

    public int getId() {return id; }
}