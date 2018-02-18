package com.kuznietsov.design.patterns.creational.builder;

class PizzaBuilder {

    private final String type;
    private final String dough;
    private final String sauce;
    private final String topping;

    public String getType() {
        return type;
    }

    public String getDough() {
        return dough;
    }

    public String getSauce() {
        return sauce;
    }

    public String getTopping() {
        return topping;
    }

    static class Builder {

        private String type;
        private String dough;
        private String sauce;
        private String topping;

        Builder() {}

        Builder type(String type) {
            this.type = type;
            return this;
        }

        Builder dough(String dough) {
            this.dough = dough;
            return this;
        }

        Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        Builder topping(String topping) {
            this.topping = topping;
            return this;
        }

        PizzaBuilder build() {
            return new PizzaBuilder(this);
        }
    }

    private PizzaBuilder(Builder builder) {
        this.type = builder.type;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping = builder.topping;
    }
}
