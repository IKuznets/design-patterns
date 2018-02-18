package com.kuznietsov.design.patterns.creational.singleton;

final class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    static Singleton getInstance() {
        return singleton;
    }
}
