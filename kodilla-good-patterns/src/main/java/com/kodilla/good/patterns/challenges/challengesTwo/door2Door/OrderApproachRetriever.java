package com.kodilla.good.patterns.challenges.challengesTwo.door2Door;

        import java.time.LocalDateTime;
        import java.util.ArrayList;
        import java.util.List;

public class OrderApproachRetriever {
    public OrderApproach retrieve() {
        User user = new User("Piotr", "Piotrzewski", 25);
        Product productOne = new Product("Extra Food Product", 500,"Extra Food Shop");
        LocalDateTime orderDate = LocalDateTime.of(2017,12,16,15,22);
        List<Product> products = new ArrayList<>();
        products.add(productOne);
        String id = new OrderApproach().getSupplierId();

        return new OrderApproach(products,orderDate,user,id);
    }
}