package com.piyush.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MySingletonEagerlyInitializedTest {

    @Test
    void getInstance() {
        // Validate if each call to getInstance yields in the same object
        final MySingletonEagerlyInitialized firstInstance = MySingletonEagerlyInitialized.getInstance();
        final MySingletonEagerlyInitialized secondInstance = MySingletonEagerlyInitialized.getInstance();

        Assertions.assertTrue(firstInstance == secondInstance);
        Assertions.assertTrue(firstInstance.hashCode() == secondInstance.hashCode());
    }
}