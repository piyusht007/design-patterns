package com.piyush.creational.singleton;

/**
 * This is a Lazily initialized singleton and creates object only when it is requested
 * and not before.
 */
public class MySingletonLazilyInitialized {
    private static MySingletonLazilyInitialized instance;

    private MySingletonLazilyInitialized() {
    }

    public static MySingletonLazilyInitialized getInstance() {
        if (instance == null) {
            instance = new MySingletonLazilyInitialized();
        }

        return instance;
    }
}
