package com.piyush.creational.factory;

import org.junit.jupiter.api.Test;

public class FactoryTest {
    @Test
    public void testFactory(){
        final ProductFactory productFactory = ConcreteProductFactory.INSTANCE;

        productFactory.createProduct("A").description();
        productFactory.createProduct("B").description();
    }
}
