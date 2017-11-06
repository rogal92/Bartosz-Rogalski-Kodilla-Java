package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculateAdvStatisticsTest {
    @Test
    public void testAverageOne(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(11);
        when(statisticsMock.userNames()).thenReturn(new ArrayList<>());
        //when
        StatisticsCount statisticCount = new StatisticsCount();
        statisticCount.calculateAdvStatistics(statisticsMock);
        //then
        Assert.assertEquals(0,statisticCount.getPostsQuantity());

    }
}
