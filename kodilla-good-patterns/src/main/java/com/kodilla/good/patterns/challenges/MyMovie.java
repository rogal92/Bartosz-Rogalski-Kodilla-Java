package com.kodilla.good.patterns.challenges;

public class MyMovie {
    private String title;
    private String translation;

    public MyMovie(String title, String translation) {
        this.title = title;
        this.translation = translation;
    }

    public String getTitle() {
        return title;
    }

    public String getTranslation() {
        return translation;
    }
}
