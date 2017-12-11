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

    public List<MyMovie> getMovies() {
        movies.stream()
                .map(m -> m.getTitle())
                .collect(Collectors.joining("!"));
        return movies;
    }

    public void addMovie(MyMovie myMovie) {
        movies.add(myMovie);
    }

    @Override
    public String toString() {
        return "MovieStore{" +
                "movies=" + movies +
                '}';
    }
}
