package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

public class SupplierTwo implements Supplier {
    @Override
    public void process(SupplierImpl supplier) {
        supplier.getName();
        supplier.getAdress();
        supplier.getNip();
        supplier.getId();
    }

    @Override
    public void getId(String id) {
        id = "Healthy shop";
    }
}
