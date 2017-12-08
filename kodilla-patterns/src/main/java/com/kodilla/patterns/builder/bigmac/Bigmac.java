package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final String ingredient;

    public enum Ingredient {
        SALATA("sałata"),
        CEBULA("cebula"),
        BEKON("bekon"),
        CHILLI("chilli"),
        OGOREK("ogórek"),
        PIECZARKI("pieczarki"),
        SER("ser"),
        KREWETKI("krewetki")
    }

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private String ingredient;

        public BigmacBuilder(String roll, int burgers, String sauce, String ingredient) {
            this.roll = roll;
            this.burgers = burgers;
            this.sauce = sauce;
            this.ingredient = ingredient;
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

        public String getIngredient() {
            return ingredient;
        }

        @Override
        public String toString() {
            return "BigmacBuilder{" +
                    "roll='" + roll + '\'' +
                    ", burgers=" + burgers +
                    ", sauce='" + sauce + '\'' +
                    ", ingredient='" + ingredient + '\'' +
                    '}';
        }
    }
}