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
        Book book = new Book();
        MedianAdapter medianAdapter = new MedianAdapter();

        //When
        int publicationYearMedian = medianAdapter.publicationYearMedian(book.getSignature())

        //Then
        System.out.println(publicationYearMedian);
        assertEquals(publicationYearMedian,1992,0);
    }
}



//public class SalaryAdapterTestSuite {
//    @Test
//    public void testTotalSalary() {
//        //Given
//        Workers workers = new Workers();
//        SalaryAdapter salaryAdapter = new SalaryAdapter();
//
//        //When
//        double totalSalary = salaryAdapter.TotalSalary(workers.getWorkers(), workers.getSalaries());
//
//        //Then
//        System.out.println(totalSalary);
//        assertEquals(totalSalary, 27750, 0);
//    }
//}
