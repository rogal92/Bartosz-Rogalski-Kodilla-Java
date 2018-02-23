package com.kodilla.patterns.builder.bigmac;

import java.util.ArrayList;
import java.util.List;

public class Bigmac {
    private final String roll;
    private final int burgers;
    private final String sauce;
    private final List<Ingredients> ingredients;

    private Bigmac(String roll, int burgers, String sauce, List<Ingredients> ingredients) {
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

    public enum Ingredients {
        SALATA("Salad"),
        CEBULA("Onion"),
        BEKON("Becon"),
        CHILLI("Chilli"),
        OGOREK("Cucumber"),
        PIECZARKI("Mushrooms"),
        SER("Cheese"),
        KREWETKI("Shrimps");

        private String name;

        Ingredients(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    @Override
    public String toString() {
        return "Bigmac{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", sauce='" + sauce + '\'' +
                ", ingredients=" + ingredients +
                '}';
    }

    public static class BigmacBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<Ingredients> ingredients = new ArrayList<>();

        public Bigmac build() {
            return new Bigmac(roll, burgers, sauce,ingredients);
        }

        public BigmacBuilder roll(String roll) {
            this.roll = roll;
            return this;
        }

        public BigmacBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public BigmacBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BigmacBuilder ingredient(List<Ingredients> ingredients) {
            this.ingredients = ingredients;
            return this;

        }
        public BigmacBuilder ingredient( Ingredients ingredient) {
            this.ingredients.add(ingredient);
            return this;

        }
    }
}