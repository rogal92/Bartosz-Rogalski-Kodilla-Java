package com.kodilla.good.patterns.challenges;

import org.junit.Assert;
import org.junit.Test;

public class MovieStoreTestSuite {

    @Test
    public void testAddList() {
        //Given
        MovieStore movieStore = new MovieStore();
        MyMovie myMovieOne = new MyMovie("Iron Man", "Żelazny Człowiek");
        MyMovie myMovieTwo = new MyMovie("Avengers","Mściciele");
        MyMovie myMovieThree = new MyMovie("Flash", "Błyskawica");
        //When
        movieStore.addMovie(myMovieOne);
        movieStore.addMovie(myMovieTwo);
        movieStore.addMovie(myMovieThree);
        //Then
        Assert.assertEquals("!Iron Man!Avengers!Flash!",movieStore.getMovies());

    }
}
