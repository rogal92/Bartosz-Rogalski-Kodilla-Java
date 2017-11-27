package com.kodilla.stream.array;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ArrayOperationTestSuite implements ArrayOperations {

    @Test
    public void testGetAverage() {

        //given
        int[] number = new int[20];
        number[0] = 1;
        number[1] = 2;
        number[2] = 4;
        number[3] = 1;
        number[4] = 1;
        number[5] = 16;
        number[6] = 7;
        number[7] = 2;
        number[8] = 11;
        number[9] = 1;
        number[10] = 5;
        number[11] = 51;
        number[12] = 17;
        number[13] = 16;
        number[14] = 1;
        number[15] = 21;
        number[16] = 11;
        number[17] = 51;
        number[18] = 71;
        number[19] = 51;

        //when
        Double average = ArrayOperations.getAverage(number);

        //then
        assertEquals(new Double(11.0), average);
    }
}