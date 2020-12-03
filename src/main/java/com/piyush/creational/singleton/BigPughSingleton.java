package com.piyush.creational.singleton;

/**
 * This is a Big Pugh Singleton variant that uses static nested class
 * and DOES NOT require Synchronization.
 */
public class BigPughSingleton {
    private static class SingletonHolder {
        private static final BigPughSingleton INSTANCE = new BigPughSingleton();
    }

    private BigPughSingleton() {
    }

    public static BigPughSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
