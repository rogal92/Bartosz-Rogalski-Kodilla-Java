package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

import java.time.LocalDateTime;
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
        suppliers.put("SupplierOne", new SupplierImpl("Extra food shop","Czerwienne", 445665432,1));
        suppliers.put("SupplierTwo", new SupplierImpl("Healthy shop", "Ząb",342345342, 2));
        suppliers.put("SupplierThree", new SupplierImpl("Gluten free shop", "Kościelisko", 23452345,3));

        if(isOrdered) {
            informationServiceTwo.inform(orderApproach.getUser());
            orderRepositoryTwo.generateOrder(orderApproach.getUser(),orderApproach.getOrderDate());
            return new OrderDtoTwo(orderApproach.getUser(),true);
        } else {
            return new OrderDtoTwo(orderApproach.getUser(), false);
        }
    }
}

