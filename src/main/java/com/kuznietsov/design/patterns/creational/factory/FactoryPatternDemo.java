package com.kuznietsov.design.patterns.creational.factory;

public class FactoryPatternDemo {

    public static void main(String[] args) {
        System.out.println(ProductFactory.factoryMethod("ProductA"));
        System.out.println(ProductFactory.factoryMethod("ProductB"));
        System.out.println(ProductFactory.factoryMethod("ProductC"));
    }
}