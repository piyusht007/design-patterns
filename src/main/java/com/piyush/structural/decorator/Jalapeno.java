package com.piyush.structural.decorator;

public class Jalapeno implements ToppingDecorator {
    private final Pizza pizza;

    public Jalapeno(final Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Jalapeno";
    }

    @Override
    public Double cost() {
        return pizza.cost() + Double.valueOf(25);
    }
}
