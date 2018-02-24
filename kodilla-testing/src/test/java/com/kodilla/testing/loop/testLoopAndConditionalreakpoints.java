package com.kodilla.testing.loop;

import org.junit.Test;
import org.junit.Assert;

public class testLoopAndConditionalreakpoints {
    @Test
    public void testLoop() {
        //given
        long sum = 0;
        //when
        for (int n = 0; n < 1000; n++) {
            sum += n;
            System.out.println("[" + n + "] sum equals: " + sum);
        }
        //then
        Assert.assertEquals(499500, sum);
    }
}
