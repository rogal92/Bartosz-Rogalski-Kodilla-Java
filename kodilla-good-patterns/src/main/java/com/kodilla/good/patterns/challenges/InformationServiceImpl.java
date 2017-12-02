package com.kodilla.good.patterns.challenges;

public class InformationServiceImpl implements InformationService {
    @Override
    public void inform(User user) {
        System.out.println("I am here to inform the user about the order");
    }

    public InformationServiceImpl() {}
}
