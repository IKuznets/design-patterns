package com.kuznietsov.design.patterns.creational.singleton;

public final class DoubleCheckedLocking {

    private DoubleCheckedLocking() {}

    private static volatile DoubleCheckedLocking doubleCheckedLocking = null;

    public static DoubleCheckedLocking getInstance() {
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
