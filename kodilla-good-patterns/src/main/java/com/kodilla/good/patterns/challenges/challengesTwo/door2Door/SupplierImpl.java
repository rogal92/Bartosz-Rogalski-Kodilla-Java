package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.util.HashSet;
import java.util.Set;

public class SupplierImpl {

    private String name;
    private String adress;
    private int nip;

    public SupplierImpl(String name, String adress, int nip) {
        this.name = name;
        this.adress = adress;
        this.nip = nip;
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
}

