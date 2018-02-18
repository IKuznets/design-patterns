package com.kuznietsov.design.patterns.creational.singleton;

public final class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return singleton;
    }
}
