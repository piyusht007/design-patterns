package com.piyush.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MySingletonStaticBlockInitializationTest {

    @Test
    void getInstance() {
        // Validate if each call to getInstance yields in the same object
        final MySingletonStaticBlockInitialization firstInstance = MySingletonStaticBlockInitialization.getInstance();
        final MySingletonStaticBlockInitialization secondInstance = MySingletonStaticBlockInitialization.getInstance();

        Assertions.assertTrue(firstInstance == secondInstance);
        Assertions.assertTrue(firstInstance.hashCode() == secondInstance.hashCode());
    }
}