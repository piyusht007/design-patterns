package com.nice.piyush.strategy;

public class NoFlyingStrategy implements FlyingStrategy {
    @Override
    public String fly() {
        return "This duck can't fly - probably a toy duck.";
    }
}
