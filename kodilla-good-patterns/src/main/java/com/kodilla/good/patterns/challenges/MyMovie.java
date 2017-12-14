
package com.kodilla.good.patterns.challenges;

import java.util.List;

public final class MyMovie {
    private List<String> translation;
    private String id;

    public MyMovie(List<String> translation, String id) {
        this.translation = translation;
        this.id = id;
    }

    public List<String> getTranslation() {
        return translation;
    }
}

