package com.kodilla.testing.forum.statistics;

public class StatisticsCount {

    public int userQ;
    public int postsQ;
    public int commentQ;
    public double averageO;
    public double averageT;
    public double averageTh;

    public int getUserQ() {
        return userQ;
    }

    public int getPostsQ() {
        return postsQ;
    }

    public int getCommentQ() {
        return commentQ;
    }

    public double getAverageO() {
        return averageO;
    }

    public double getAverageT() {
        return averageT;
    }

    public double getAverageTh() {
        return averageTh;
    }

    public double calculateAdvStatistics(Statistics statistics) {

        userQ = statistics.userNames().size();
        postsQ = statistics.postsCount();
        commentQ = statistics.commentsCount();

        averageO = postsQ/userQ;
        averageT = commentQ/userQ;
        averageTh = commentQ/postsQ;
        return averageO + averageT + averageTh;
    }
}