package com.kodilla.good.patterns.challenges;

import org.springframework.core.annotation.Order;

import java.time.LocalDateTime;

public class Application {
    public static void main(String [] args){

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(
                new OrderService(),new OrderRepository());
        productOrderService.process(orderRequest);
    }
}
