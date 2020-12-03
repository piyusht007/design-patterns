package com.piyush.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MySingletonLazilyInitializedTest {
    @Test
    void getInstance() {
        // Validate if each call to getInstance yields in the same object
        final MySingletonLazilyInitialized firstInstance = MySingletonLazilyInitialized.getInstance();
        final MySingletonLazilyInitialized secondInstance = MySingletonLazilyInitialized.getInstance();

        Assertions.assertTrue(firstInstance == secondInstance);
        Assertions.assertTrue(firstInstance.hashCode() == secondInstance.hashCode());
    }
}