package com.kuznietsov.design.patterns.creational.builder;

class PizzaBuilderWithStaticInstance {

    static Builder builder = new Builder();

    private String type;
    private String dough;
    private String sauce;
    private String topping;

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

        private static PizzaBuilderWithStaticInstance pizzaBuilderWithStaticInstance;

        private Builder() {
            pizzaBuilderWithStaticInstance = new PizzaBuilderWithStaticInstance();
        }

        Builder type(String type) {
            pizzaBuilderWithStaticInstance.type = type;
            return this;
        }

        Builder dough(String dough) {
            pizzaBuilderWithStaticInstance.dough = dough;
            return this;
        }

        Builder sauce(String sauce) {
            pizzaBuilderWithStaticInstance.sauce = sauce;
            return this;
        }

        Builder topping(String topping) {
            pizzaBuilderWithStaticInstance.topping = topping;
            return this;
        }

        PizzaBuilderWithStaticInstance build() {
            return pizzaBuilderWithStaticInstance;
        }
    }
}
