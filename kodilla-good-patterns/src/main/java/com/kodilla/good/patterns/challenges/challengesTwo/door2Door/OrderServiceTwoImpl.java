package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import com.kodilla.good.patterns.challenges.challengesTwo.door2Door.suppliers.Supplier;

import java.util.HashMap;
import java.util.List;

public class OrderServiceTwoImpl implements OrderServiceTwo{

    private HashMap<String, Supplier> orderMap = new HashMap<>();

    public OrderServiceTwoImpl(List<Supplier> supplierList) {

        supplierList.forEach(supplier -> orderMap.put(supplier.getId(),supplier));
    }
    @Override
    public boolean order(OrderApproach orderApproach) {
        System.out.println("Thank you for using our services! We have received your order approach!");
        String id = orderApproach.getSupplierId();
        orderMap.get(id).process(orderApproach);

        return true;
    }
}