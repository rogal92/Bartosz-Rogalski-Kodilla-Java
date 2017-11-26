package com.kodilla.exception.Index;

import java.util.List;

public class IndexExceptionRunner {

    public static void main(String[] args) {
        VideoCollector videoCollector = new VideoCollector();
        List<String> collection = videoCollector.getCollection();


        if (collection.size() <= 2) {
            String movie = collection.get(0);
            System.out.println(movie);

            String otherMovie = collection.get(1);
            System.out.println(otherMovie);
        }
    }
}