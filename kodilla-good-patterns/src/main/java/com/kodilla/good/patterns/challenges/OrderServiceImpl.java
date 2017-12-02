package com.kodilla.good.patterns.challenges;

public class OrderServiceImpl implements OrderService{
    @Override
    public boolean order(OrderRequest orderRequest) {
        System.out.println("OrderRequest orderRequest");
        return true;
    }
}
