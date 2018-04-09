package com.nice.piyush.strategy;

public class SlowFlyingStrategy implements FlyingStrategy {
    @Override
    public String fly() {
        return "This duck's flying speed is slow....";
    }
}
