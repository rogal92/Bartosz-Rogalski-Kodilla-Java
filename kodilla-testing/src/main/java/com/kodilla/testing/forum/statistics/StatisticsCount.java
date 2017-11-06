package com.kodilla.testing.forum.statistics;

public class StatisticsCount {

    private int userQuantity;
    private int postsQuantity;
    private int commentQuantity;
    private double averagePostsPerUser;
    private double averageCommetsPerUser;
    private double averageCommentsPerPost;

    public int getUserQuantity() {
        return userQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentQuantity() {
        return commentQuantity;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommetsPerUser() {
        return averageCommetsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        userQuantity = statistics.userNames().size();
        postsQuantity = statistics.postsCount();
        commentQuantity = statistics.commentsCount();

        averagePostsPerUser = postsQuantity / userQuantity;
        averageCommetsPerUser = commentQuantity / userQuantity;
        averageCommentsPerPost = commentQuantity / postsQuantity;
    }
}