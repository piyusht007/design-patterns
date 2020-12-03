package com.piyush.behavioral.strategy;

public class SlowFlyingStrategy implements FlyingStrategy {
    @Override
    public String fly() {
        return "This duck's flying speed is slow....";
    }
}
