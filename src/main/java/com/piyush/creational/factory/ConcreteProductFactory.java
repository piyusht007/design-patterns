package com.piyush.creational.factory;

/**
 * Factory implemented as enum singleton
 */
public enum ConcreteProductFactory implements ProductFactory {
    INSTANCE;

    @Override
    public Product createProduct(String type) {
        switch (type) {
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
            default:
                throw new IllegalArgumentException("Invalid product type");
        }
    }
}
