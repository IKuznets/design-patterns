package com.kuznietsov.design.patterns.creational.singleton;

final class DoubleCheckedLocking {

    private DoubleCheckedLocking() {}

    private static volatile DoubleCheckedLocking doubleCheckedLocking = null;

    static DoubleCheckedLocking getInstance() {
        if (doubleCheckedLocking == null) {
            synchronized(DoubleCheckedLocking.class) {
                if(doubleCheckedLocking == null) {
                    doubleCheckedLocking = new DoubleCheckedLocking();
                }
            }
        }
        return doubleCheckedLocking;
    }
}
