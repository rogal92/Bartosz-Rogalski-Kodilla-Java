package com.kodilla.testing.forum.statistics;

public class StatisticsCount {

    public int userQuantity;
    public int postsQuantity;
    public int commentQuantity;
    public double averageOne;
    public double averageTwo;
    public double averageThree;

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentQuantity() {
        return commentQuantity;
    }

    public double getAverageOne() {
        return averageOne;
    }

    public double getAverageTwo() {
        return averageTwo;
    }

    public double getAverageThree() {
        return averageThree;
    }

    public double calculateAdvStatistics(Statistics statistics) {

        userQuantity = statistics.userNames().size();
        postsQuantity = statistics.postsCount();
        commentQuantity = statistics.commentsCount();

        averageOne = postsQuantity / userQuantity;
        averageTwo = commentQuantity / userQuantity;
        averageThree = commentQuantity / postsQuantity;
        return averageOne + averageTwo + averageThree;
    }
}