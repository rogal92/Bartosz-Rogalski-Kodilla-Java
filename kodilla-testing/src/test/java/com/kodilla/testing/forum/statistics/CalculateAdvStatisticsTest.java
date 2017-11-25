package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTest {
    @Test
    public void testWhenPostsEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(11);
        when(statisticsMock.userNames()).thenReturn(new ArrayList<>());
        //when
        StatisticsCount statisticCount = new StatisticsCount();
        statisticCount.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(0, statisticCount.getPostsQuantity());
    }

    @Test
    public void testWhenPostsEqualsThousand() {
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(22);
        when(statisticsMock.userNames()).thenReturn(new ArrayList<>());
        //When
        StatisticsCount statisticsCount = new StatisticsCount();
        statisticsCount.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(1000, statisticsCount.getPostsQuantity());
    }

    @Test
    public void testWhenCommentsEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.userNames()).thenReturn(new ArrayList<>());
        //when
        StatisticsCount statisticsCount = new StatisticsCount();
        statisticsCount.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(0, statisticsCount.getCommentQuantity());
    }

    @Test
    public void testWhenThereAreLessCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(50);
        when(statisticsMock.commentsCount()).thenReturn(3);
        when(statisticsMock.userNames()).thenReturn(new ArrayList<>());
        //When
        StatisticsCount statisticsCount = new StatisticsCount();
        statisticsCount.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(3, statisticsCount.getCommentQuantity());
    }

    @Test
    public void testWhenThereAreMoreCommentsThanPosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(5);
        when(statisticsMock.commentsCount()).thenReturn(30);
        when(statisticsMock.userNames()).thenReturn(new ArrayList<>());
        //When
        StatisticsCount statisticsCount = new StatisticsCount();
        statisticsCount.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(30, statisticsCount.getCommentQuantity());
    }

    @Test
    public void testWhenUserAmountEqualsZero() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(550);
        when(statisticsMock.commentsCount()).thenReturn(3);
        when(statisticsMock.userNames()).thenReturn(new ArrayList<>(0));
        //When
        StatisticsCount statisticsCount = new StatisticsCount();
        statisticsCount.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, statisticsCount.getUserQuantity());
    }

    @Test
    public void testWhenUserAmountEqualsHoundred() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(3);
        ArrayList<String> uNumber = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            uNumber.add(String.valueOf(i));
        }
        when(statisticsMock.userNames()).thenReturn(uNumber);
        //When
        StatisticsCount statisticsCount = new StatisticsCount();
        statisticsCount.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(100, statisticsCount.getUserQuantity());
    }
}