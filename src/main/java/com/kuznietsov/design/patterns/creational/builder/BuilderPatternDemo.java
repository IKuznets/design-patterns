package com.kuznietsov.design.patterns.creational.builder;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        PizzaBuilder hawaiian = new PizzaBuilder.Builder()
                        .type("Hawaiian Pizza")
                        .dough("cross")
                        .sauce("mild")
                        .topping("pineapple")
                        .build();

        PizzaBuilderWithStaticInstance spicy = PizzaBuilderWithStaticInstance.builder
                .type("Spicy Pizza")
                .dough("cross")
                .sauce("mild")
                .topping("pineapple")
                .build();
    }
}
