package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("LibraryOne");

        Book bookOne = new Book("First book", "first author",LocalDate.of(2000,10,20));
        Book bookTwo = new Book("Second book", "second author",LocalDate.of(2010,11,13));
        Book bookThree = new Book("Third book", "third author",LocalDate.of(1992,10,15));
        Book bookFour = new Book("Fourth book", "fourth author",LocalDate.of(2002,2,23));

        library.getBooks().add(bookOne);
        library.getBooks().add(bookTwo);
        library.getBooks().add(bookThree);
        library.getBooks().add(bookFour);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("LibraryTwo");
        } catch(CloneNotSupportedException e){
            System.out.println(e);
        }
        System.out.println(library);
        System.out.println(clonedLibrary);

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("LibraryThree");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        //When

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(true,clonedLibrary.getBooks().remove(bookOne));
        Assert.assertEquals(3, library.getBooks().size());
        Assert.assertEquals(4,deepClonedLibrary.getBooks().size());
    }
}
