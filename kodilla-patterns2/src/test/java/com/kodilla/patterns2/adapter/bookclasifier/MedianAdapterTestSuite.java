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
        bookSet.add(new Book("authorOne","titleOne",1992,"sOne"));
        bookSet.add(new Book("authorTwo","titleTwo",2000,"sTwo"));
        bookSet.add(new Book("authorThree","titleThree",2005,"sThree"));

        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(bookSet);

        //Then
        System.out.println(publicationYearMedian);
        assertEquals(publicationYearMedian,2000.0,0);
    }
}