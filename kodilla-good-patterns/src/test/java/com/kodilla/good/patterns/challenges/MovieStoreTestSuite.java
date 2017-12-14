package com.kodilla.good.patterns.challenges;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class MovieStoreTestSuite {

    @Test
    public void testAddList() {
        //Given
        List<String> ironManTranslations = Arrays.asList("Irona Man", "Żelazny Człowiek");
        List<String> avengerTranslations = Arrays.asList("Avengers", "Mściciele");
        List<String> flashTranslations = Arrays.asList("Flash", "Błyskawica");

        MovieStore movieStore = new MovieStore();
        MyMovie myMovieOne = new MyMovie(ironManTranslations, "IM");
        MyMovie myMovieTwo = new MyMovie(avengerTranslations,"AV");
        MyMovie myMovieThree = new MyMovie(flashTranslations,"FL");
        //When
        movieStore.addMovie(myMovieOne);
        movieStore.addMovie(myMovieTwo);
        movieStore.addMovie(myMovieThree);
        //Then
        Assert.assertEquals("!Irona Man!Żelazny Człowiek!Avengers!Mściciele!Flash!Błyskawica!",movieStore.getMovies());

    }
}
