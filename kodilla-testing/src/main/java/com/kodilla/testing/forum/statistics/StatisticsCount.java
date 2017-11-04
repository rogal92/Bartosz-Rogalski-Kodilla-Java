package com.kodilla.testing.forum.statistics;

public class StatisticsCount {

    public double calculateAdvStatistics(Statistics statistics) {

        int userQuantity = statistics.userNames().size();
        int postsQuantity = statistics.postsCount();
        int commentQuantity = statistics.commentsCount();

        double averageOne = statistics.postsCount() / statistics.userNames().size();
        double averageTwo = statistics.commentsCount() / statistics.userNames().size();
        double averageThree = statistics.commentsCount() / statistics.postsCount();
        return averageOne + averageTwo + averageThree;
    }
}