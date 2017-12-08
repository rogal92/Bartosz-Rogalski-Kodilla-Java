package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<Ingredients> ingredients;

    public enum Ingredients {
        SALATA("sałata"),
        CEBULA("cebula"),
        BEKON("bekon"),
        CHILLI("chilli"),
        OGOREK("ogórek"),
        PIECZARKI("pieczarki"),
        SER("ser"),
        KREWETKI("krewetki")
    }

    public class Enum {
        Ingredients ingredients;

        public Enum(Ingredients ingredients) {
            this.ingredients = ingredients;
        }
    }
    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<Ingredients> ingredients = new ArrayList<>();

        public BigmacBuilder(String roll, int burgers, String sauce, List<Ingredients> ingredients) {
            this.roll = roll;
            this.burgers = burgers;
            this.sauce = sauce;
            this.ingredients = ingredients;
        }

        public String getRoll() {
            return roll;
        }

        public int getBurgers() {
            return burgers;
        }

        public String getSauce() {
            return sauce;
        }

        public List<Ingredients> getIngredients() {
            return ingredients;
        }

        @Override
        public String toString() {
            return "BigmacBuilder{" +
                    "roll='" + roll + '\'' +
                    ", burgers=" + burgers +
                    ", sauce='" + sauce + '\'' +
                    ", ingredients=" + ingredients +
                    '}';
        }
    }
}