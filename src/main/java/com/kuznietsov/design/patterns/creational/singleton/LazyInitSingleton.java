package com.kuznietsov.design.patterns.creational.singleton;

public final class LazyInitSingleton {

    private static LazyInitSingleton lazyInitSingleton = null;

    private LazyInitSingleton() {}

    public static LazyInitSingleton getInstance() {
        if (lazyInitSingleton == null) {
            lazyInitSingleton = new LazyInitSingleton();
        }
        return lazyInitSingleton;
    }
}
