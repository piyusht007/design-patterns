package com.piyush.decorator;

public class Margherita implements Pizza {
    @Override
    public String getDescription() {
        return "Margherita";
    }

    @Override
    public Double cost() {
        return Double.valueOf(320);
    }
}
