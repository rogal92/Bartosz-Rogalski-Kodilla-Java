package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

        import java.time.LocalDateTime;
        import java.util.HashMap;
        import java.util.List;

public class OrderApproachRetriever {

    public OrderApproach retrieve() {
        User user = new User("Piotr", "Piotrzewski", 25);
        Product productOne = new Product("Extra food product", 500,"Extra food shop");
        LocalDateTime orderDate = LocalDateTime.of(2017,12,16,15,22);

        OrderApproach productList = new OrderApproach();
        productList.getRetriever().add(productOne);

        return new OrderApproach(productList.getRetriever(),orderDate,user);
    }
}