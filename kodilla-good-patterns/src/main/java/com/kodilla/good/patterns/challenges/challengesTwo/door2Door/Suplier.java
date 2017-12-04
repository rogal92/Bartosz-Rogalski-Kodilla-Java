package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

public class Suplier {

    private String name;
    private String adress;
    private int nip;

    public Suplier(String name, String adress, int nip) {
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

    @Override
    public String toString() {
        return "Suplier{" +
                "name='" + name + '\'' +
                ", adress='" + adress + '\'' +
                ", nip=" + nip +
                '}';
    }
}

