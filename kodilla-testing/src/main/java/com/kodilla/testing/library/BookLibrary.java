package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {

    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }
    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookListTwo = new ArrayList<>();
        if(bookListTwo.size() == 0) return bookListTwo;
        List<Book> resultListTwo = libraryDatabase.listBooksInHandsOf(libraryUser);
        if (resultListTwo.size() == 1) return bookListTwo;
        if(resultListTwo.size() == 5) return  bookListTwo;
        bookListTwo = resultListTwo;
        return bookListTwo;
    }
}
