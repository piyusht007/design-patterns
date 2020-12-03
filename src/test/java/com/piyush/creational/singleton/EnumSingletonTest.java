package com.piyush.creational.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumSingletonTest {

    @Test
    void method() {
        EnumSingleton.INSTANCE.method();

        Assertions.assertTrue(EnumSingleton.INSTANCE == EnumSingleton.INSTANCE);
        Assertions.assertTrue(EnumSingleton.INSTANCE.hashCode() == EnumSingleton.INSTANCE.hashCode());
    }
}