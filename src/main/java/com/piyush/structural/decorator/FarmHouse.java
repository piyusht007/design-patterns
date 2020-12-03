package com.piyush.structural.decorator;

public class FarmHouse implements Pizza {
    @Override
    public String getDescription() {
        return "FarmHouse";
    }

    @Override
    public Double cost() {
        return Double.valueOf(350);
    }
}
