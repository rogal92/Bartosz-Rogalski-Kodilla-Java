package com.kodilla.patterns2.adapter.bookclasifier;

import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Classifier;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class MedianAdapterTestSuite {

    @Test
    public void testPublicationYearMedianTest() {
        //Given
        Set<Book> bookSet = new HashSet<>();
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println(publicationYearMedian);
        assertEquals(publicationYearMedian,1992,0);
    }
}