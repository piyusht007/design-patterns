package com.nice.piyush.factory;

public class App {
    public static void main(String[] args) {
        ProductFactory productFactory = ConcreteProductFactory.INSTANCE;

        productFactory.createProduct("A").description();
        productFactory.createProduct("B").description();
    }
}
