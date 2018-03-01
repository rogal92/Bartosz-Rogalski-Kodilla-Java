package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import com.kodilla.good.patterns.challenges.challengesTwo.door2Door.suppliers.SupplierImpl;

import java.util.HashMap;

public class ProductOrderServiceTwo {

    private InformationServiceTwo informationServiceTwo;
    private OrderServiceTwo orderServiceTwo;
    private OrderRepositoryTwo orderRepositoryTwo;

    public ProductOrderServiceTwo(InformationServiceTwo informationServiceTwo, OrderServiceTwo orderServiceTwo, OrderRepositoryTwo orderRepositoryTwo) {
        this.informationServiceTwo = informationServiceTwo;
        this.orderServiceTwo = orderServiceTwo;
        this.orderRepositoryTwo = orderRepositoryTwo;
    }

    public OrderDtoTwo process(final OrderApproach orderApproach) {
        boolean isOrdered = orderServiceTwo.order(orderApproach);
        HashMap<String, SupplierImpl> suppliers = new HashMap<>();
        suppliers.put("SupplierOne", new SupplierImpl());
        suppliers.put("SupplierTwo", new SupplierImpl());
        suppliers.put("SupplierThree", new SupplierImpl());

        if(isOrdered) {
            informationServiceTwo.inform(orderApproach.getUser());
            orderRepositoryTwo.generateOrder(orderApproach.getUser(),orderApproach.getOrderDate());
            return new OrderDtoTwo(orderApproach.getUser(),true);
        } else {
            return new OrderDtoTwo(orderApproach.getUser(), false);
        }
    }
}

