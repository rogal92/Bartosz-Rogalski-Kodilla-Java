//package com.kodilla.good.patterns.challenges;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class MovieStore {
//    public Map<String, List<String>> getMovies() {
//
//        Map<String, List<String>> booksTitlesWithTranslations = new HashMap<>();
//    }
//}
//




//        List<String> ironManTranslations = new ArrayList<>();
//        List<String> avengersTranslations = new ArrayList<>();
//        List<String> flashTranslations = new ArrayList<>();



//        String text = getMovies().values().stream()
//                .flatMap(List::stream)
//                .collect(Collectors.joining("!", "!", "!"));
//        System.out.println(text);

//        return booksTitlesWithTranslations;
//    }
//    public static void main(String [] args) {
//        MovieStore movieStore = new MovieStore();
//        System.out.println();
//        Wykorzystując poznane już Streamy wykonaj iterację po poniższej mapie tytułów i wyświetl wszystkie tytuły w jednym ciągu separując
//        je wykrzyknikiem
// MovieStore powinien posiadac pole z odpowiednia kolekcja ktora umozliwi przechowywanie tytulow oraz tlumaczeń

// ironManTranslations.add("Żelazny Człowiek");
// ironManTranslations.add("Iron Man");

// avengersTranslations.add("Mściciele");
// avengersTranslations.add("Avengers");

//  flashTranslations.add("Błyskawica");
//  flashTranslations.add("Flash");

//        booksTitlesWithTranslations.put("IM", ironManTranslations);
//        booksTitlesWithTranslations.put("AV", avengersTranslations);
//        booksTitlesWithTranslations.put("FL", flashTranslations);