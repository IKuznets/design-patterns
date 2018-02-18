package com.kuznietsov.design.patterns.creational.builder;

class PizzaBuilderWithStaticInstance {

    static Builder builder = new Builder();

    private String type;
    private String dough;
    private String sauce;
    private String topping;

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
            pizzaBuilderWithStaticInstance.type = dough;
            return this;
        }

        Builder sauce(String sauce) {
            pizzaBuilderWithStaticInstance.type = sauce;
            return this;
        }

        Builder topping(String topping) {
            pizzaBuilderWithStaticInstance.type = topping;
            return this;
        }

        PizzaBuilderWithStaticInstance build() {
            return pizzaBuilderWithStaticInstance;
        }
    }
}
