package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.util.HashSet;
import java.util.Set;

public class SupplierList {
    Set<Object> supplierList = new HashSet<>();

    public SupplierList(Set<Object> supplierList) {
        this.supplierList = supplierList;
    }

    public Set<Object> getSupplierList() {
        return supplierList;
    }
}
