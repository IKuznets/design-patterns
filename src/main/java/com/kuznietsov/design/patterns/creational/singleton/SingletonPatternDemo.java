package com.kuznietsov.design.patterns.creational.singleton;

import static org.assertj.core.api.Assertions.assertThat;

public class SingletonPatternDemo {

    public static void main(String[] args) {
        assertThat(Singleton.getInstance().getClass())
                .isEqualTo(Singleton.getInstance().getClass());
        assertThat(LazyInitSingleton.getInstance().getClass())
                .isEqualTo(LazyInitSingleton.getInstance().getClass());
        assertThat(DoubleCheckedLocking.getInstance().getClass())
                .isEqualTo(DoubleCheckedLocking.getInstance().getClass());
    }
}
