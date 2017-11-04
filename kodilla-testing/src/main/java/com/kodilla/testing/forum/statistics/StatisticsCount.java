package com.kodilla.testing.forum.statistics;

public class StatisticsCount {

    Statistics statistics;
    private int userQuantity = statistics.userNames().size();
    private int postsQuantity;
    private int commentsQuantity;

    public StatisticsCount(Statistics statistics, int userQuantity, int postsQuantity, int commentsQuantity) {
        this.statistics = statistics;
        this.userQuantity = userQuantity;
        this.postsQuantity = postsQuantity;
        this.commentsQuantity = commentsQuantity;
    }

    public Statistics getStatistics() {
        return statistics;
    }

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double calculateAdvStatistics(Statistics statistics){
        double postsAveragePerUser = getPostsQuantity()/getUserQuantity();
        double commentsAveragePerUser = getCommentsQuantity()/getUserQuantity();
        double commentsAveragePerPost = getCommentsQuantity()/getPostsQuantity();
        return postsAveragePerUser + commentsAveragePerUser + commentsAveragePerPost;
    }
}
