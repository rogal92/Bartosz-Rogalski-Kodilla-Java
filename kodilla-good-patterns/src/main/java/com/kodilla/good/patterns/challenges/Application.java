package com.kodilla.good.patterns.challenges;

public class Application {
    public static void main(String [] args){

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve();

        ProductOrderService productOrderService = new ProductOrderService(new InformationServiceImpl(),new OrderServiceImpl(),new OrderRepositoryImpl());
        productOrderService.process(orderRequest);
    }
}
