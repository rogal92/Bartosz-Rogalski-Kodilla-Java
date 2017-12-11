//package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;
//
//public class ProductOrderServiceTwo {
//
//    private InformationServiceTwo informationServiceTwo;
//    private OrderServiceTwo orderServiceTwo;
//    private OrderRepositoryTwo orderRepositoryTwo;
//
//    public ProductOrderServiceTwo(InformationServiceTwo informationServiceTwo, OrderServiceTwo orderServiceTwo, OrderRepositoryTwo orderRepositoryTwo) {
//        this.informationServiceTwo = informationServiceTwo;
//        this.orderServiceTwo = orderServiceTwo;
//        this.orderRepositoryTwo = orderRepositoryTwo;
//    }
//
//    public OrderDtoTwo process(final OrderApproach orderApproach) {
//        boolean isOrdered = orderServiceTwo.order(orderApproach);
//
//        if(isOrdered) {
//            informationServiceTwo.inform(orderApproach.());
//            orderRepositoryTwo.generateOrder(orderApproach.(),orderApproach.getOrderDate());
//            return new OrderDtoTwo(orderApproach.getSuplier(),true);
//        } else {
//            return new OrderDtoTwo(orderApproach.getSuplier(), false);
//        }
//    }
//}
