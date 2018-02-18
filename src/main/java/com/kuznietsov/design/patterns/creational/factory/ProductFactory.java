package com.kuznietsov.design.patterns.creational.factory;

final class ProductFactory {

    private ProductFactory() {}

    static Product factoryMethod(String type) {
        Product product;
        switch (type) {
            case "ProductA": product = new ConcreteProductA();
                break;
            case "ProductB": product = new ConcreteProductB();
                break;
            default: throw new IllegalStateException("Unknown type: " + type);
        }
        return product;
    }
}
