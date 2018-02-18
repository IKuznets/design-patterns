package com.kuznietsov.design.patterns.creational.singleton;

final class LazyInitSingleton {

    private static LazyInitSingleton lazyInitSingleton = null;

    private LazyInitSingleton() {}

    static LazyInitSingleton getInstance() {
        if (lazyInitSingleton == null) {
            lazyInitSingleton = new LazyInitSingleton();
        }
        return lazyInitSingleton;
    }
}
