package com.piyush.factory;

public class ConcreteProductA implements Product {
    @Override
    public void description() {
        System.out.println("This is a concrete product A.");
    }
}
