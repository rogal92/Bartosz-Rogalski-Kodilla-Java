package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

public class SupplierOne implements Supplier {
    @Override
    public void process(SupplierImpl supplier) {
        supplier.getName();
        supplier.getAdress();
        supplier.getNip();
        supplier.getId();
    }
}
