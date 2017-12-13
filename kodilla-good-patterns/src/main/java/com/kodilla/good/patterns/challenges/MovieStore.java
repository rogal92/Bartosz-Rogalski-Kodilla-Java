package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MovieStore {

    private List<MyMovie> movies = new ArrayList<>();

    public MovieStore(List<MyMovie> movies) {
        this.movies = movies;
    }

    public MovieStore() {
    }

    public String getMovies() {
     String moviess = movies.stream()
                .map(m -> m.getTitle())
                .collect(Collectors.joining("!","!","!"));
        return moviess;
    }

    public void addMovie(MyMovie myMovie) {
        movies.add(myMovie);
    }
}
