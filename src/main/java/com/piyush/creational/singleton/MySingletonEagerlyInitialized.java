package com.piyush.creational.singleton;

/**
 * This is an eagerly initialized singleton
 */
public class MySingletonEagerlyInitialized {
    private static final MySingletonEagerlyInitialized INSTANCE = new MySingletonEagerlyInitialized();

    private MySingletonEagerlyInitialized(){}

    public static MySingletonEagerlyInitialized getInstance(){
        return INSTANCE;
    }
}
